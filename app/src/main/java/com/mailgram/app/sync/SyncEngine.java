package com.mailgram.app.sync;

import android.content.Context;
import android.util.Log;

import com.mailgram.app.App;
import com.mailgram.app.crypto.B64;
import com.mailgram.app.crypto.Identity;
import com.mailgram.app.crypto.MailCrypto;
import com.mailgram.app.crypto.NativeCrypto;
import com.mailgram.app.net.Auth;
import com.mailgram.app.net.GmailApi;
import com.mailgram.app.net.Mime;
import com.mailgram.app.store.Chat;
import com.mailgram.app.store.Msg;
import com.mailgram.app.store.Prefs;
import com.mailgram.app.store.Store;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ядро обмена: читает письма MailGram из ящика, расшифровывает их и складывает в
 * локальную базу; шифрует и отправляет исходящие. Серверам MailGram здесь места нет —
 * транспортом служит сама почта Google.
 */
public final class SyncEngine {

    private static final String TAG = "MailGramSync";
    private static final String QUERY = "subject:MailGram -in:draft newer_than:120d";
    private static final int MAX_MESSAGES = 400;
    public static final String SUBJECT_INVITE_MARKER = "X-MailGram-PublicKey:";
    private static final Pattern KEY_LINE = Pattern.compile("X-MailGram-PublicKey:\\s*([A-Za-z0-9_\\-+/=]{80,140})");

    private static volatile SyncEngine instance;

    private final Context app;
    private final ExecutorService pool = Executors.newFixedThreadPool(4);
    private final CopyOnWriteArrayList<Listener> listeners = new CopyOnWriteArrayList<>();
    private final AtomicBoolean running = new AtomicBoolean(false);

    public interface Listener {
        void onSyncDone(Result result);
    }

    public static final class Result {
        public boolean ok = true;
        public String error = "";
        /** Исходная ошибка — по ней приложение показывает точный ответ Google. */
        public Throwable cause;
        public int scanned;
        public int added;
        public int undecryptable;
        public final List<Msg> incoming = new ArrayList<>();
        public long finishedAt;
    }

    private SyncEngine(Context ctx) {
        this.app = ctx.getApplicationContext();
    }

    public static SyncEngine get(Context ctx) {
        SyncEngine local = instance;
        if (local == null) {
            synchronized (SyncEngine.class) {
                local = instance;
                if (local == null) {
                    local = new SyncEngine(ctx.getApplicationContext());
                    instance = local;
                }
            }
        }
        return local;
    }

    public void addListener(Listener l) {
        if (!listeners.contains(l)) listeners.add(l);
    }

    public void removeListener(Listener l) {
        listeners.remove(l);
    }

    public boolean isSyncing() {
        return running.get();
    }

    /** Запускает синхронизацию, если она ещё не идёт. */
    public void syncNow() {
        if (!Auth.isSignedIn(app)) return;
        if (!running.compareAndSet(false, true)) {
            Log.d(TAG, "синхронизация уже идёт");
            return;
        }
        pool.execute(() -> {
            Result r = new Result();
            try {
                doSync(r);
            } catch (Exception e) {
                Log.w(TAG, "синхронизация не удалась: " + e);
                r.ok = false;
                r.error = describe(e);
                r.cause = e;
            } finally {
                r.finishedAt = System.currentTimeMillis();
                Prefs.setLastSyncAt(app, r.finishedAt);
                running.set(false);
                for (Listener l : listeners) {
                    try {
                        l.onSyncDone(r);
                    } catch (Exception ignored) {
                    }
                }
                if (!r.incoming.isEmpty() && !App.isForeground()) {
                    for (Msg m : r.incoming) {
                        Chat chat = Store.get(app).chat(m.chat);
                        Notifier.showMessage(app, chat, m);
                    }
                }
            }
        });
    }

    // ---------------- синхронизация ----------------

    private void doSync(Result result) throws Exception {
        Store store = Store.get(app);
        String token = Auth.accessTokenFresh(app);
        String me = Auth.account(app);
        if (me == null || me.isEmpty()) {
            me = GmailApi.profileEmail(token);
            if (!me.isEmpty()) Auth.setAccount(app, me);
        }

        List<String> ids = GmailApi.listMessageIds(token, QUERY, MAX_MESSAGES);
        List<String> unknown = new ArrayList<>();
        for (String id : ids) {
            if (!store.hasGmailId(id)) unknown.add(id);
        }
        result.scanned = ids.size();
        Log.i(TAG, "писем найдено: " + ids.size() + ", новых: " + unknown.size());
        if (unknown.isEmpty()) return;

        List<Future<?>> futures = new ArrayList<>();
        for (String id : unknown) {
            final String messageId = id;
            final String myEmail = me;
            futures.add(pool.submit(() -> {
                try {
                    GmailApi.Mail mail = GmailApi.get(Auth.accessTokenFresh(app), messageId);
                    Msg parsed = parseMail(store, mail, myEmail);
                    if (parsed == null) return;
                    boolean isNew = store.byMid(parsed.chat, parsed.mid) == null;
                    store.put(parsed.chat, parsed);
                    if (isNew) {
                        synchronized (result) {
                            result.added++;
                            if (!parsed.outgoing) result.incoming.add(parsed);
                        }
                    }
                } catch (SecurityException se) {
                    Log.w(TAG, "не удалось расшифровать письмо " + messageId + ": " + se.getMessage());
                    synchronized (result) {
                        result.undecryptable++;
                    }
                } catch (Exception e) {
                    Log.w(TAG, "ошибка обработки письма " + messageId + ": " + e);
                }
            }));
        }
        for (Future<?> f : futures) {
            try {
                f.get(120, TimeUnit.SECONDS);
            } catch (Exception e) {
                Log.w(TAG, "задача обработки письма не завершилась: " + e);
            }
        }
    }

    /**
     * Тело письма приходит как base64(текст). Возвращаем исходный текст и, если он
     * действительно base64, ещё и расшифрованный — искать нужно по обоим.
     */
    private static String bodyWithDecoded(String body) {
        if (body == null) return "";
        String joined = body.replaceAll("\\s+", "");
        if (joined.length() >= 24 && joined.matches("[A-Za-z0-9_\\-+/=]+")) {
            try {
                String text = B64.fromUtf8(B64.bytes(joined));
                if (!text.isEmpty()) return body + "\n" + text;
            } catch (Exception ignored) {
                // не base64 — оставляем как есть
            }
        }
        return body;
    }

    private Msg parseMail(Store store, GmailApi.Mail mail, String me) throws Exception {
        String subject = mail.subject == null ? "" : mail.subject.trim();
        MailCrypto.Envelope env = null;
        String chatUid = null;

        if (subject.startsWith(MailCrypto.SUBJECT_PREFIX)) {
            chatUid = subject.substring(MailCrypto.SUBJECT_PREFIX.length()).trim();
            chatUid = chatUid.split("\\s+")[0];
            String fromHeader = Store.normalizeEmail(mail.from);
            boolean headerOutgoing = (me != null && me.equalsIgnoreCase(fromHeader)) || fromHeader.isEmpty();
            byte[] peerKeyForOwnMessage = null;
            if (headerOutgoing) {
                Chat known = store.chat(chatUid);
                if (known != null && known.peerPublic != null && !known.peerPublic.isEmpty()) {
                    byte[] candidate = B64.bytes(known.peerPublic);
                    if (candidate.length == 65) peerKeyForOwnMessage = candidate;
                }
            }
            try {
                env = MailCrypto.open(app, mail.body, me, peerKeyForOwnMessage);
            } catch (SecurityException se) {
                if (headerOutgoing) {
                    // своё письмо, но ключа собеседника нет (например, отправлено с другого
                    // устройства или чат очищен) — просто пропускаем, ничего не помечаем
                    Log.i(TAG, "пропускаю собственное письмо без известного ключа: " + mail.id);
                    return null;
                }
                // письмо с нашей темой, но не для нас / повреждено — отмечаем, но не падаем
                String peer = Store.normalizeEmail(mail.from);
                if (peer.isEmpty() || peer.equalsIgnoreCase(me)) peer = Store.normalizeEmail(mail.to);
                Chat chat = store.ensureChat(chatUid, peer, null);
                store.markDamaged(chat.uid);
                throw se;
            }
        } else {
            return null;
        }

        if (env == null) {
            // возможно это приглашение (открытый ключ без шифротекста).
            // Тело письма у нас завёрнуто в base64, поэтому смотрим оба варианта.
            Matcher m = KEY_LINE.matcher(bodyWithDecoded(mail.body));
            if (m.find()) {
                String keyB64 = m.group(1);
                byte[] key = B64.bytes(keyB64);
                if (key.length != 65) return null;
                String from = Store.normalizeEmail(mail.from);
                boolean outgoing = me.equalsIgnoreCase(from);
                String peer = outgoing ? Store.normalizeEmail(mail.to) : from;
                Chat chat = store.ensureChat(chatUid, peer, outgoing ? null : keyB64);
                if (!outgoing) {
                    store.setPeerPublic(chat.uid, keyB64);
                }
                Msg invite = new Msg();
                invite.mid = mail.id; // письмо-приглашение: id = gmail id
                invite.chat = chat.uid;
                invite.peer = peer;
                invite.from = from;
                invite.to = Store.normalizeEmail(mail.to);
                invite.ts = mail.internalDate > 0 ? mail.internalDate : System.currentTimeMillis();
                invite.outgoing = outgoing;
                invite.type = "invite";
                invite.text = outgoing
                        ? "Приглашение отправлено. Ключ собеседника появится после его ответа."
                        : "Собеседник установил MailGram. Можно отвечать — сообщения будут зашифрованы.";
                invite.gmailId = mail.id;
                invite.state = Msg.STATE_SENT;
                invite.unread = mail.unread && !outgoing;
                return invite;
            }
            return null;
        }

        String from = Store.normalizeEmail(mail.from);
        if (from.isEmpty()) from = Store.normalizeEmail(env.from);
        String to = Store.normalizeEmail(mail.to);
        if (to.isEmpty()) to = Store.normalizeEmail(env.to);
        boolean outgoing = me != null && (me.equalsIgnoreCase(from) || me.equalsIgnoreCase(Store.normalizeEmail(env.from)));
        String peer = outgoing ? Store.normalizeEmail(env.to) : Store.normalizeEmail(env.from);
        if (peer.isEmpty()) peer = outgoing ? to : from;

        Chat chat = store.ensureChat(env.chatUid, peer, null);
        if (!outgoing) {
            // открытый ключ собеседника обновляем из каждого его письма
            store.setPeerPublic(chat.uid, B64.str(env.senderPublicRaw));
        }

        Msg msg = new Msg();
        msg.mid = env.id;
        msg.chat = env.chatUid;
        msg.peer = peer;
        msg.from = Store.normalizeEmail(env.from);
        msg.to = Store.normalizeEmail(env.to);
        msg.ts = env.ts > 0 ? env.ts : mail.internalDate;
        msg.outgoing = outgoing;
        msg.gmailId = mail.id;
        msg.state = Msg.STATE_SENT;
        msg.unread = mail.unread && !outgoing;

        try {
            JSONObject payload = new JSONObject(env.payload);
            String type = payload.optString("t", "text");
            msg.type = type;
            if ("image".equals(type)) {
                msg.imageB64 = payload.optString("b", "");
                String caption = payload.optString("c", "");
                if (!caption.isEmpty()) msg.text = caption;
            } else {
                msg.text = payload.optString("b", "");
            }
        } catch (Exception e) {
            msg.text = env.payload;
        }
        return msg;
    }

    // ---------------- отправка ----------------

    /** Отправляет текст. Требует известного открытого ключа собеседника. */
    public void sendText(final Chat chat, final String text, final SendCallback callback) {
        JSONObject payload = new JSONObject();
        try {
            payload.put("t", "text");
            payload.put("b", text);
        } catch (Exception ignored) {
        }
        sendPayload(chat, payload.toString(), "text", text, null, callback);
    }

    /** Отправляет изображение (уже сжатый JPEG). */
    public void sendImage(final Chat chat, final byte[] jpeg, final String caption, final SendCallback callback) {
        JSONObject payload = new JSONObject();
        try {
            payload.put("t", "image");
            payload.put("b", android.util.Base64.encodeToString(jpeg, android.util.Base64.NO_WRAP));
            payload.put("c", caption == null ? "" : caption);
        } catch (Exception ignored) {
        }
        sendPayload(chat, payload.toString(), "image", caption == null ? "" : caption, jpeg, callback);
    }

    public interface SendCallback {
        void onSent(Msg message);

        void onError(String error);
    }

    private void sendPayload(final Chat chat, final String payloadJson, final String type,
                             final String localPreview, final byte[] imageBytes, final SendCallback callback) {
        if (!NativeCrypto.isLoaded()) {
            fail(callback, "нативная библиотека не загружена: " + NativeCrypto.loadError());
            return;
        }
        if (chat.peerPublic == null || chat.peerPublic.isEmpty()) {
            fail(callback, "нет открытого ключа собеседника — отправьте приглашение или дождитесь его письма");
            return;
        }
        final Store store = Store.get(app);
        final String me = Auth.account(app);
        final String mid = UUID.randomUUID().toString();
        final long ts = System.currentTimeMillis();

        final Msg local = new Msg();
        local.mid = mid;
        local.chat = chat.uid;
        local.peer = chat.peer;
        local.from = me;
        local.to = chat.peer;
        local.ts = ts;
        local.outgoing = true;
        local.type = type;
        local.text = localPreview;
        local.imageB64 = imageBytes == null ? "" : android.util.Base64.encodeToString(imageBytes, android.util.Base64.NO_WRAP);
        local.state = Msg.STATE_SENDING;
        store.put(chat.uid, local);
        if (callback != null) callback.onSent(local);

        pool.execute(() -> {
            try {
                byte[] peerKey = B64.bytes(chat.peerPublic);
                if (peerKey.length != 65) throw new IllegalStateException("ключ собеседника повреждён");
                String envelope = MailCrypto.seal(app, me, chat.peer, chat.uid, mid, ts, peerKey, payloadJson);
                String subject = MailCrypto.SUBJECT_PREFIX + chat.uid;
                String mime = Mime.build(me, chat.peer, subject,
                        MailCrypto.toMailBody(envelope), mid, null);
                String token = Auth.accessTokenFresh(app);
                String gmailId = GmailApi.send(token, Mime.toRaw(mime));
                store.updateState(chat.uid, mid, Msg.STATE_SENT, gmailId, null);
                notifyDirty();
            } catch (Exception e) {
                Log.w(TAG, "отправка не удалась: " + e);
                store.updateState(chat.uid, mid, Msg.STATE_FAILED, null, describe(e));
                if (callback != null) callback.onError(describe(e));
                notifyDirty();
            }
        });
    }

    /** Повторить отправку ранее неудавшегося сообщения. */
    public void retry(final Chat chat, final Msg msg, final SendCallback callback) {
        final Store store = Store.get(app);
        store.updateState(chat.uid, msg.mid, Msg.STATE_SENDING, null, null);
        pool.execute(() -> {
            try {
                String me = Auth.account(app);
                JSONObject payload = new JSONObject();
                if (msg.isImage()) {
                    payload.put("t", "image");
                    payload.put("b", msg.imageB64);
                    payload.put("c", msg.text == null ? "" : msg.text);
                } else {
                    payload.put("t", "text");
                    payload.put("b", msg.text == null ? "" : msg.text);
                }
                String envelope = MailCrypto.seal(app, me, chat.peer, chat.uid, msg.mid, msg.ts,
                        B64.bytes(chat.peerPublic), payload.toString());
                String mime = Mime.build(me, chat.peer, MailCrypto.SUBJECT_PREFIX + chat.uid,
                        MailCrypto.toMailBody(envelope), msg.mid, null);
                String gmailId = GmailApi.send(Auth.accessTokenFresh(app), Mime.toRaw(mime));
                store.updateState(chat.uid, msg.mid, Msg.STATE_SENT, gmailId, null);
                if (callback != null) callback.onSent(msg);
                notifyDirty();
            } catch (Exception e) {
                store.updateState(chat.uid, msg.mid, Msg.STATE_FAILED, null, describe(e));
                if (callback != null) callback.onError(describe(e));
                notifyDirty();
            }
        });
    }

    /**
     * Приглашение: в письме открытый ключ и ссылка на приложение. Это единственное
     * письмо без шифрования — в нём нет переписки, только приглашение и публичный ключ.
     */
    public void sendInvite(final String email, final String peerName, final SendCallback callback) {
        final String me = Auth.account(app);
        final String peer = Store.normalizeEmail(email);
        final String chatUid = NativeCrypto.chatUid(me, peer);
        final String mid = UUID.randomUUID().toString();
        final long ts = System.currentTimeMillis();

        final Store store = Store.get(app);
        final Chat chat = store.ensureChat(chatUid, peer, null);
        final Msg local = new Msg();
        local.mid = mid;
        local.chat = chatUid;
        local.peer = peer;
        local.from = me;
        local.to = peer;
        local.ts = ts;
        local.outgoing = true;
        local.type = "invite";
        local.text = "Приглашение отправлено: " + peer;
        local.state = Msg.STATE_SENDING;
        store.put(chatUid, local);
        if (callback != null) callback.onSent(local);

        pool.execute(() -> {
            try {
                String myKey = B64.str(Identity.publicKeyRaw(app));
                StringBuilder body = new StringBuilder();
                body.append("MailGram — приглашение в зашифрованный чат\r\n\r\n");
                body.append("Привет").append(peerName == null || peerName.isEmpty() ? "" : ", " + peerName).append("!\r\n\r\n");
                body.append("Я пишу тебе через MailGram — мессенджер, который работает прямо на почте Google.\r\n");
                body.append("Переписка шифруется на устройстве (ChaCha20-Poly1305), почта видит только шифротекст.\r\n\r\n");
                body.append("Приложение: ").append(Prefs.inviteLink(app)).append("\r\n\r\n");
                body.append(SUBJECT_INVITE_MARKER).append(" ").append(myKey).append("\r\n");
                body.append("(это мой публичный ключ — его можно передавать открыто,\r\n");
                body.append(" он нужен, чтобы первый ответ пришёл уже зашифрованным)\r\n");
                String mime = Mime.build(me, peer, MailCrypto.SUBJECT_PREFIX + chatUid,
                        Mime.wrap(B64ToBody(body.toString())), mid, null);
                String gmailId = GmailApi.send(Auth.accessTokenFresh(app), Mime.toRaw(mime));
                store.updateState(chatUid, mid, Msg.STATE_SENT, gmailId, null);
                notifyDirty();
            } catch (Exception e) {
                store.updateState(chatUid, mid, Msg.STATE_FAILED, null, describe(e));
                if (callback != null) callback.onError(describe(e));
                notifyDirty();
            }
        });
    }

    /** Текст письма безопаснее унести в base64 (переносы по 76 символов). */
    private String B64ToBody(String text) {
        String b64 = android.util.Base64.encodeToString(
                text.getBytes(java.nio.charset.StandardCharsets.UTF_8), android.util.Base64.NO_WRAP);
        return Mime.wrap(b64);
    }

    /** Синхронизирует «прочитано» с Gmail (снимает метку UNREAD у входящих). */
    public void markReadOnServer(final List<Msg> unreadIncoming) {
        if (unreadIncoming == null || unreadIncoming.isEmpty()) return;
        pool.execute(() -> {
            try {
                String token = Auth.accessTokenFresh(app);
                for (Msg m : unreadIncoming) {
                    if (m.gmailId != null && !m.gmailId.isEmpty()) {
                        GmailApi.markRead(token, m.gmailId);
                    }
                }
            } catch (Exception e) {
                Log.w(TAG, "не удалось снять метку непрочитанного: " + e);
            }
        });
    }

    private void notifyDirty() {
        for (Listener l : listeners) {
            try {
                l.onSyncDone(new Result());
            } catch (Exception ignored) {
            }
        }
    }

    private void fail(SendCallback callback, String error) {
        if (callback != null) callback.onError(error);
    }

    private static String describe(Exception e) {
        return com.mailgram.app.net.ApiError.short(e);
    }
}
