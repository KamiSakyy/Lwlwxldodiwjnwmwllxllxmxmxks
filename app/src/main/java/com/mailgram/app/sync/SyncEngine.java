package com.mailgram.app.sync;

import android.content.Context;
import android.util.Base64;
import android.util.Log;

import com.mailgram.app.App;
import com.mailgram.app.crypto.B64;
import com.mailgram.app.crypto.Identity;
import com.mailgram.app.crypto.MailCrypto;
import com.mailgram.app.crypto.RatchetStore;
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
    /**
     * Мы показываем ВЕСЬ почтовый ящик, а не только письма MailGram: тема не фильтруется,
     * метки не фильтруются (спам и корзина тоже видны), черновики исключаются только потому,
     * что у них нет содержимого для показа.
     */
    private static final String QUERY = "-in:draft newer_than:180d";
    private static final int MAX_MESSAGES = 500;
    /** Раздел, куда складываются обычные письма Gmail (см. {@code Store.GENERIC_UID}). */
    private static final String GENERIC_UID = com.mailgram.app.store.Store.GENERIC_UID;
    /** Сколько уведомлений максимум показываем за одну синхронизацию. */
    private static final int NOTIFY_PER_SYNC = 6;
    public static final String SUBJECT_INVITE_MARKER = "X-MailGram-PublicKey:";
    public static final String PREKEY_MARKER = "X-MailGram-PreKey:";
    private static final Pattern KEY_LINE = Pattern.compile("X-MailGram-PublicKey:\\s*([A-Za-z0-9_\\-+/=]{80,140})");
    private static final Pattern PREKEY_LINE = Pattern.compile("X-MailGram-PreKey:\\s*([A-Za-z0-9_\\-+/=]{80,140})");

    /**
     * Тема писем в режиме без шифрования: по ней письмо возвращается в нужный чат, а текст
     * остаётся читаемым в любом почтовом клиенте.
     */
    public static final String SUBJECT_PREFIX_PLAIN = "MailGram #";
    /** Вложение в открытом письме: [mailgram-attach b64:<данные>]. */
    private static final Pattern PLAIN_ATTACH = Pattern.compile(
            "\\n?\\[mailgram-attach b64:([A-Za-z0-9+/=\\s]+)\\]\\n?");
    /** Служебная строка в конце открытого письма: -- [MailGram #<uid> "..." ...]]. */
    private static final Pattern PLAIN_FOOTER = Pattern.compile(
            "\\n?--\\s*\\[MailGram #\\w+ \"[^\\]]*\\]\\s*\\n?$");

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
        /** Писем, которые пришли, но не расшифровались: они видны в чате отдельной строкой. */
        public int undecryptable;
        /** Писем, которые пока не удалось разобрать — они встанут в очередь повторных попыток. */
        public int failed;
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
            } catch (Throwable e) {
                // Ловим и ошибки: необработанный сбой в фоновом потоке закрывает всё приложение
                Log.w(TAG, "синхронизация не удалась: " + e);
                com.mailgram.app.util.CrashLog.record(app, e);
                r.ok = false;
                r.error = describe(e);
                r.cause = e;
            } finally {
                r.finishedAt = System.currentTimeMillis();
                Prefs.setLastSyncAt(app, r.finishedAt);
                Prefs.recordSyncStats(app, r.scanned, r.added);
                running.set(false);
                for (Listener l : listeners) {
                    try {
                        l.onSyncDone(r);
                    } catch (Throwable ignored) {
                        com.mailgram.app.util.CrashLog.record(app, ignored);
                    }
                }
                if (!r.incoming.isEmpty() && !App.isForeground()) {
                    // Обычная почта (реклама, рассылки, спам) не должна осыпать уведомлениями:
                    // звуковой сигнал получаем только на письма-переписку, максимум несколько.
                    int notified = 0;
                    for (Msg m : r.incoming) {
                        if (m.mail) continue;
                        if (notified >= NOTIFY_PER_SYNC) break;
                        try {
                            Chat chat = Store.get(app).chat(m.chat);
                            if (chat != null) {
                                Notifier.showMessage(app, chat, m);
                                notified++;
                            }
                        } catch (Throwable ignored) {
                            com.mailgram.app.util.CrashLog.record(app, ignored);
                        }
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
        // письма, которые в прошлый раз не удалось разобрать, пробуем ещё раз: «молча пропущено»
        // у нас больше не бывает — либо сообщение появляется в ленте, либо оно ждёт повторной попытки
        List<String> retry = Prefs.retryQueue(app);
        java.util.LinkedHashSet<String> wanted = new java.util.LinkedHashSet<>();
        for (String id : ids) {
            if (!store.hasGmailId(id)) wanted.add(id);
        }
        wanted.addAll(retry);
        List<String> unknown = new ArrayList<>(wanted);
        result.scanned = ids.size();
        Log.i(TAG, "писем найдено: " + ids.size() + ", новых или отложенных: " + unknown.size());
        if (unknown.isEmpty()) return;

        List<Future<?>> futures = new ArrayList<>();
        for (String id : unknown) {
            final String messageId = id;
            final String myEmail = me;
            futures.add(pool.submit(() -> {
                try {
                    GmailApi.Mail mail = GmailApi.get(Auth.accessTokenFresh(app), messageId);
                    Msg parsed = parseMail(store, mail, myEmail);
                    if (parsed != null) {
                        boolean isNew = store.byMid(parsed.chat, parsed.mid) == null;
                        store.put(parsed.chat, parsed);
                        if (isNew) {
                            synchronized (result) {
                                result.added++;
                                if (!parsed.outgoing) result.incoming.add(parsed);
                            }
                        }
                    }
                    Prefs.removeRetry(app, messageId);
                } catch (SecurityException se) {
                    Log.w(TAG, "не удалось расшифровать письмо " + messageId + ": " + se.getMessage());
                    synchronized (result) {
                        result.undecryptable++;
                    }
                    // письмо не выбрасываем: показываем его в чате и оставляем в очереди —
                    // после обновления ключей крысиного шага оно расшифруется само
                    try {
                        GmailApi.Mail mail = GmailApi.get(Auth.accessTokenFresh(app), messageId);
                        addUndecryptable(store, mail, me);
                    } catch (Throwable ignored) {
                        com.mailgram.app.util.CrashLog.record(app, ignored);
                    }
                    Prefs.addRetry(app, messageId);
                } catch (Throwable e) {
                    // и ошибки тоже: необработанная ошибка в потоке пула закрывала приложение
                    Log.w(TAG, "ошибка обработки письма " + messageId + ": " + e);
                    com.mailgram.app.util.CrashLog.record(app, e);
                    synchronized (result) {
                        result.failed++;
                    }
                    Prefs.addRetry(app, messageId);
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

    /**
     * Разбирает письмо. Порядок такой: сначала мы вообще не трогаем чужие письма (тема не наша —
     * выход молча), а если тема «наша», то любое неудачное завершение ОБЯЗАНО оставить след —
     * строку-заглушку или повторную попытку. Молчаливый возврат null здесь означал бы
     * «собеседник пишет, а у нас тишина», поэтому такие места собраны в failedIncoming().
     */
    private Msg parseMail(Store store, GmailApi.Mail mail, String me) throws Exception {
        String subject = mail.subject == null ? "" : mail.subject.trim();
        MailCrypto.Envelope env = null;
        String chatUid = null;
        boolean plainSubject = subject.startsWith(SUBJECT_PREFIX_PLAIN);
        boolean fromSubject = plainSubject || subject.startsWith(MailCrypto.SUBJECT_PREFIX);

        if (fromSubject) {
            chatUid = subject.substring((plainSubject ? SUBJECT_PREFIX_PLAIN
                    : MailCrypto.SUBJECT_PREFIX).length()).trim();
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
                if (!plainSubject) env = MailCrypto.open(app, mail.body, me, peerKeyForOwnMessage);
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
            // Тема «не наша» — но письмо всё равно разбираем: конверт мог прийти с Re:/Fwd:,
            // а может это просто обычное письмо из ящика (его показываем как есть).
            String json = MailCrypto.extractEnvelopeJson(mail.body);
            if (json != null) {
                try {
                    chatUid = new org.json.JSONObject(json).optString("chat", "");
                } catch (Exception ignored) {
                    chatUid = null;
                }
            } else {
                Matcher km = KEY_LINE.matcher(bodyWithDecoded(mail.body));
                if (km.find()) {
                    String from = Store.normalizeEmail(mail.from);
                    String peer = me != null && me.equalsIgnoreCase(from) ? Store.normalizeEmail(mail.to) : from;
                    if (!peer.isEmpty()) {
                        Chat c = store.chatByPeer(peer);
                        chatUid = c != null ? c.uid : NativeCrypto.chatUid(me == null ? "" : me, peer);
                    }
                }
            }
            if (chatUid == null || chatUid.isEmpty()) {
                // обычное письмо из почты — оно всё равно показывается, см. genericMail()
                return genericMail(store, mail, me);
            }
            try {
                env = MailCrypto.open(app, mail.body, me, null);
            } catch (SecurityException se) {
                throw new SecurityException(se.getMessage() == null ? "не удалось расшифровать" : se.getMessage());
            }
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
                boolean outgoing = me != null && me.equalsIgnoreCase(from);
                String peer = outgoing ? Store.normalizeEmail(mail.to) : from;
                Chat chat = store.ensureChat(chatUid, peer, outgoing ? null : keyB64);
                // предключ собеседника из приглашения — сразу можно вести сессию с крысиным шагом
                java.util.regex.Matcher preMatcher = PREKEY_LINE.matcher(bodyWithDecoded(mail.body));
                if (!outgoing && preMatcher.find()) {
                    try {
                        byte[] preRaw = B64.bytes(preMatcher.group(1));
                        if (preRaw.length == 65) RatchetStore.setPeerPre(app, chat.uid, preRaw);
                    } catch (Exception ignored) {
                    }
                }
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
                        ? app.getString(com.mailgram.app.R.string.invite_sent_note)
                        : app.getString(com.mailgram.app.R.string.invite_received_note);
                invite.gmailId = mail.id;
                invite.state = Msg.STATE_SENT;
                invite.unread = mail.unread && !outgoing;
                return invite;
            }
            if (plainSubject) return parsePlainLetter(store, mail, me, chatUid, subject);
            return null;
        }

        if (env.selfCopyOfRatchet) {
            // своё письмо: локальная копия уже отправлена, ключ звена израсходован
            store.markGmailId(mail.id);
            store.updateState(env.chatUid, env.id, Msg.STATE_SENT, mail.id, null);
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
            // «в сети» — не выдумка, а время последнего его письма
            Prefs.setLastSeen(app, peer, msgTsOf(mail, env));
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

            // Служебные конверты меняют уже существующее сообщение и в ленту не попадают.
            if ("react".equals(type) || "edit".equals(type) || "del".equals(type) || "pin".equals(type)) {
                if (!outgoing) {
                    String targetMid = payload.optString("mid", "");
                    if ("react".equals(type)) {
                        store.applyReaction(chat.uid, targetMid, payload.optString("e", ""),
                                payload.optBoolean("rm", false));
                    } else if ("edit".equals(type)) {
                        store.applyEdit(chat.uid, targetMid, payload.optString("b", ""));
                    } else if ("pin".equals(type)) {
                        store.setMsgPinned(chat.uid, targetMid, payload.optBoolean("v", true));
                    } else {
                        store.applyDelete(chat.uid, targetMid);
                    }
                }
                store.markGmailId(mail.id);
                return null;
            }

            msg.type = type;
            msg.mediaB64 = payload.optString("b", "");
            msg.mediaMime = payload.optString("m", "");
            msg.durationMs = payload.optLong("d", 0L);
            msg.fileName = payload.optString("n", "");
            msg.fileSize = payload.optLong("s", 0L);
            msg.round = payload.optBoolean("rnd", false);
            msg.replyMid = payload.optString("r", "");
            msg.replyPreview = payload.optString("rp", "");
            msg.forwarded = payload.optBoolean("fwd", false);
            org.json.JSONArray wave = payload.optJSONArray("w");
            if (wave != null) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < wave.length(); i++) {
                    if (i > 0) sb.append(',');
                    sb.append(wave.optInt(i, 0));
                }
                msg.wave = sb.toString();
            }
            if ("text".equals(type) || "invite".equals(type)) {
                msg.text = payload.optString("b", "");
            } else {
                msg.text = payload.optString("c", "");
            }
        } catch (Exception e) {
            msg.text = env.payload;
        }
        return msg;
    }

    // ---------------- отправка ----------------

    /** Отправляет текст. Требует известного открытого ключа собеседника. */
    public void sendText(final Chat chat, final String text, final SendCallback callback) {
        sendText(chat, text, null, null, callback);
    }

    /** Отправляет текст ответом на сообщение (reply на сообщение в ленте). */
    public void sendText(final Chat chat, final String text, final Msg replyTo, final SendCallback callback) {
        sendText(chat, text, replyTo == null ? null : replyTo.mid, replyQuote(replyTo), callback);
    }

    private void sendText(final Chat chat, final String text, final String replyMid,
                          final String replyPreview, final SendCallback callback) {
        JSONObject payload = new JSONObject();
        try {
            payload.put("t", "text");
            payload.put("b", text);
            putReply(payload, replyMid, replyPreview);
        } catch (Exception ignored) {
        }
        Msg local = newLocal(chat, "text", text, null, "", 0L, "", 0L, false, "", replyMid, replyPreview);
        sendPayload(chat, local, payload.toString(), callback);
    }

    /** Отправляет изображение (уже сжатый JPEG). */
    public void sendImage(final Chat chat, final byte[] jpeg, final String caption, final SendCallback callback) {
        sendImage(chat, jpeg, caption, null, callback);
    }

    public void sendImage(final Chat chat, final byte[] jpeg, final String caption, final Msg replyTo,
                          final SendCallback callback) {
        sendMedia(chat, "image", jpeg, "image/jpeg", 0L, "", caption,
                false, replyTo == null ? null : replyTo.mid, replyQuote(replyTo), callback);
    }

    /**
     * Отправляет вложение: фото, видео, кружок, голосовое или файл.
     * Всё шифруется тем же сессионным ключом — почта видит только base64-конверт.
     */
    public void sendMedia(final Chat chat, final String type, final byte[] data, final String mime,
                          final long durationMs, final String fileName, final String caption,
                          final boolean round, final String replyMid, final String replyPreview,
                          final SendCallback callback) {
        JSONObject payload = new JSONObject();
        try {
            payload.put("t", type);
            payload.put("b", android.util.Base64.encodeToString(data, android.util.Base64.NO_WRAP));
            if (mime != null && !mime.isEmpty()) payload.put("m", mime);
            if (durationMs > 0) payload.put("d", durationMs);
            if (fileName != null && !fileName.isEmpty()) {
                payload.put("n", fileName);
                payload.put("s", data.length);
            }
            if (caption != null && !caption.isEmpty()) payload.put("c", caption);
            if (round) payload.put("rnd", true);
            putReply(payload, replyMid, replyPreview);
        } catch (Exception ignored) {
        }
        String preview = caption == null ? "" : caption;
        Msg local = newLocal(chat, type, preview, data, mime, durationMs, fileName, data.length,
                round, "", replyMid, replyPreview);
        sendPayload(chat, local, payload.toString(), callback);
    }

    /**
     * Голосовое сообщение: аудио + список амплитуд для волны. Амплитуды уходят
     * в шифрованном конверте (поле w), чтобы собеседник видел ту же волну.
     */
    public void sendVoice(final Chat chat, final byte[] audio, final long durationMs, final int[] amplitudes,
                          final String replyMid, final String replyPreview, final SendCallback callback) {
        JSONObject payload = new JSONObject();
        String wave = joinWave(amplitudes);
        try {
            payload.put("t", "voice");
            payload.put("b", android.util.Base64.encodeToString(audio, android.util.Base64.NO_WRAP));
            payload.put("m", "audio/mp4");
            payload.put("d", durationMs);
            if (amplitudes != null && amplitudes.length > 0) {
                org.json.JSONArray arr = new org.json.JSONArray();
                for (int value : amplitudes) arr.put(value);
                payload.put("w", arr);
            }
            putReply(payload, replyMid, replyPreview);
        } catch (Exception ignored) {
        }
        Msg local = newLocal(chat, "voice", "", audio, "audio/mp4", durationMs,
                "", audio.length, false, wave, replyMid, replyPreview);
        sendPayload(chat, local, payload.toString(), callback);
    }

    /** Волна в виде строки "4,9,15,..." для хранения и повторной отправки. */
    public static String joinWave(int[] amplitudes) {
        if (amplitudes == null || amplitudes.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < amplitudes.length; i++) {
            if (i > 0) sb.append(',');
            sb.append(amplitudes[i]);
        }
        return sb.toString();
    }

    /**
     * Пересылка сообщения в другой чат: содержимое переносится как есть (медиа не перекодируется),
     * в конверт добавляется отметка fwd, чтобы в пузыре было видно «Переслано».
     */
    public void sendForward(final Chat chat, final Msg src, final SendCallback callback) {
        JSONObject payload = new JSONObject();
        String type = src.type == null || src.type.isEmpty() ? "text" : src.type;
        try {
            payload.put("t", type);
            payload.put("b", src.mediaB64 != null && !src.mediaB64.isEmpty() ? src.mediaB64
                    : (src.text == null ? "" : src.text));
            if (src.mediaMime != null && !src.mediaMime.isEmpty()) payload.put("m", src.mediaMime);
            if (src.durationMs > 0) payload.put("d", src.durationMs);
            if (src.fileName != null && !src.fileName.isEmpty()) {
                payload.put("n", src.fileName);
                payload.put("s", src.fileSize);
            }
            if (!"text".equals(type) && src.text != null && !src.text.isEmpty()) payload.put("c", src.text);
            if (src.round) payload.put("rnd", true);
            if (src.wave != null && !src.wave.isEmpty()) {
                org.json.JSONArray arr = new org.json.JSONArray();
                for (String piece : src.wave.split(",")) {
                    try {
                        arr.put(Integer.parseInt(piece.trim()));
                    } catch (Exception ignored) {
                    }
                }
                if (arr.length() > 0) payload.put("w", arr);
            }
            payload.put("fwd", true);
        } catch (Exception ignored) {
        }
        Msg local = newLocal(chat, type, src.text, null, src.mediaMime, src.durationMs,
                src.fileName, src.fileSize, src.round, src.wave, "", "");
        local.mediaB64 = src.mediaB64 == null ? "" : src.mediaB64;
        local.forwarded = true;
        sendPayload(chat, local, payload.toString(), callback);
    }

    /** Реакция на сообщение (уходит письмом-«реакцией», в ленте не отображается). */
    public void sendReaction(final Chat chat, final Msg target, final String emoji, final SendCallback callback) {
        final boolean remove = emoji != null && emoji.equals(target.myReaction);
        JSONObject payload = new JSONObject();
        try {
            payload.put("t", "react");
            payload.put("mid", target.mid);
            payload.put("e", emoji);
            if (remove) payload.put("rm", true);
        } catch (Exception ignored) {
        }
        if (remove) {
            Store.get(app).removeOwnReaction(chat.uid, target.mid, emoji);
        } else {
            Store.get(app).addOwnReaction(chat.uid, target.mid, emoji);
        }
        notifyDirty();
        sendControl(chat, payload, callback);
    }

    /** Правка своего сообщения. */
    public void sendEdit(final Chat chat, final Msg target, final String newText, final SendCallback callback) {
        JSONObject payload = new JSONObject();
        try {
            payload.put("t", "edit");
            payload.put("mid", target.mid);
            payload.put("b", newText);
        } catch (Exception ignored) {
        }
        Store.get(app).applyEdit(chat.uid, target.mid, newText);
        notifyDirty();
        sendControl(chat, payload, callback);
    }

    /** Удаление сообщения у себя и у собеседника. */
    public void sendDelete(final Chat chat, final Msg target, final SendCallback callback) {
        JSONObject payload = new JSONObject();
        try {
            payload.put("t", "del");
            payload.put("mid", target.mid);
        } catch (Exception ignored) {
        }
        Store.get(app).applyDelete(chat.uid, target.mid);
        notifyDirty();
        sendControl(chat, payload, callback);
    }

    /** Закрепление и открепление сообщения — общее для обоих участников переписки. */
    public void sendPin(final Chat chat, final Msg target, final boolean pinned, final SendCallback callback) {
        JSONObject payload = new JSONObject();
        try {
            payload.put("t", "pin");
            payload.put("mid", target.mid);
            payload.put("v", pinned);
        } catch (Exception ignored) {
        }
        Store.get(app).setMsgPinned(chat.uid, target.mid, pinned);
        notifyDirty();
        sendControl(chat, payload, callback);
    }

    private void sendControl(final Chat chat, final JSONObject payload, final SendCallback callback) {
        final String type = payload.optString("t", "control");
        pool.execute(() -> {
            try {
                String me = Auth.account(app);
                sendLetter(me, chat.peer, chat.uid, UUID.randomUUID().toString(), chat.peerPublic,
                        payload.toString(), payload.optString("note", ""), null, "control", null);
                notifyDirty();
                if (callback != null) callback.onSent(null);
            } catch (Throwable e) {
                Log.w(TAG, "служебное сообщение " + type + " не ушло: " + e);
                if (callback != null) callback.onError(describe(e));
            }
        });
    }

    private static void putReply(JSONObject payload, String replyMid, String replyPreview) throws Exception {
        if (replyMid != null && !replyMid.isEmpty()) {
            payload.put("r", replyMid);
            payload.put("rp", replyPreview == null ? "" : replyPreview);
        }
    }

    /** Короткая цитата сообщения для превью ответа. */
    public static String replyQuote(Msg msg) {
        if (msg == null) return "";
        String text = msg.previewText().replace('\n', ' ');
        return text.length() > 90 ? text.substring(0, 90) + "…" : text;
    }

    public interface SendCallback {
        void onSent(Msg message);

        void onError(String error);
    }

    /**
     * Общая отправка: готовим локальную копию сообщения (её сразу видно в ленте),
     * затем шифруем и отправляем письмом. Локальная копия уже содержит все поля медиа,
     * поэтому превью корректно до первой синхронизации.
     */
    private void sendPayload(final Chat chat, final Msg local, final String payloadJson,
                             final SendCallback callback) {
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
        local.chat = chat.uid;
        local.peer = chat.peer;
        local.from = me;
        local.to = chat.peer;
        local.outgoing = true;
        local.state = Msg.STATE_SENDING;
        store.put(chat.uid, local);
        if (callback != null) callback.onSent(local);

        pool.execute(() -> {
            try {
                String gmailId = sendLetter(me, chat.peer, chat.uid, local.mid, chat.peerPublic,
                        payloadJson, local.text, local.mediaB64, local.type, null);
                store.updateState(chat.uid, local.mid, Msg.STATE_SENT, gmailId, null);
                notifyDirty();
            } catch (Throwable e) {
                Log.w(TAG, "отправка не удалась: " + e);
                store.updateState(chat.uid, local.mid, Msg.STATE_FAILED, null, describe(e));
                if (callback != null) callback.onError(describe(e));
                notifyDirty();
            }
        });
    }

    /** Локальная копия исходящего сообщения до отправки. */
    private Msg newLocal(final Chat chat, final String type, final String preview, final byte[] media,
                         final String mime, final long durationMs, final String fileName, final long fileSize,
                         final boolean round, final String wave, final String replyMid, final String replyPreview) {
        Msg local = new Msg();
        local.mid = UUID.randomUUID().toString();
        local.ts = System.currentTimeMillis();
        local.type = type;
        local.text = preview == null ? "" : preview;
        if (media != null) local.mediaB64 = android.util.Base64.encodeToString(media, android.util.Base64.NO_WRAP);
        local.mediaMime = mime == null ? "" : mime;
        local.durationMs = durationMs;
        local.fileName = fileName == null ? "" : fileName;
        local.fileSize = fileSize;
        local.round = round;
        local.wave = wave == null ? "" : wave;
        local.replyMid = replyMid == null ? "" : replyMid;
        local.replyPreview = replyPreview == null ? "" : replyPreview;
        return local;
    }

    /** Повторить отправку ранее неудавшегося сообщения. */
    public void retry(final Chat chat, final Msg msg, final SendCallback callback) {
        final Store store = Store.get(app);
        store.updateState(chat.uid, msg.mid, Msg.STATE_SENDING, null, null);
        pool.execute(() -> {
            try {
                String me = Auth.account(app);
                JSONObject payload = retryPayload(msg);
                String gmailId = sendLetter(me, chat.peer, chat.uid, msg.mid, chat.peerPublic,
                        payload.toString(), msg.text, msg.mediaB64, msg.type, null);
                store.updateState(chat.uid, msg.mid, Msg.STATE_SENT, gmailId, null);
                if (callback != null) callback.onSent(msg);
                notifyDirty();
            } catch (Throwable e) {
                store.updateState(chat.uid, msg.mid, Msg.STATE_FAILED, null, describe(e));
                if (callback != null) callback.onError(describe(e));
                notifyDirty();
            }
        });
    }

    /** Собирает шифруемый payload для повторной отправки сообщения любого типа. */
    private JSONObject retryPayload(Msg msg) throws Exception {
        JSONObject payload = new JSONObject();
        String type = msg.type == null ? "text" : msg.type;
        payload.put("t", type);
        payload.put("b", msg.mediaB64 != null && !msg.mediaB64.isEmpty() ? msg.mediaB64
                : (msg.text == null ? "" : msg.text));
        if (msg.mediaMime != null && !msg.mediaMime.isEmpty()) payload.put("m", msg.mediaMime);
        if (msg.durationMs > 0) payload.put("d", msg.durationMs);
        if (msg.fileName != null && !msg.fileName.isEmpty()) {
            payload.put("n", msg.fileName);
            payload.put("s", msg.fileSize);
        }
        if (!"text".equals(type) && msg.text != null && !msg.text.isEmpty()) payload.put("c", msg.text);
        if (msg.round) payload.put("rnd", true);
        if (msg.wave != null && !msg.wave.isEmpty()) {
            org.json.JSONArray arr = new org.json.JSONArray();
            for (String piece : msg.wave.split(",")) {
                try {
                    arr.put(Integer.parseInt(piece.trim()));
                } catch (Exception ignored) {
                }
            }
            if (arr.length() > 0) payload.put("w", arr);
        }
        putReply(payload, msg.replyMid, msg.replyPreview);
        return payload;
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
                try {
                    byte[] pre = RatchetStore.myPreKeyPublic(app);
                    body.append(PREKEY_MARKER).append(" ").append(B64.str(pre)).append("\r\n");
                    body.append("(предключ для двойного крысиного шага — прямой секретности каждого сообщения)\r\n");
                } catch (Exception ignored) {
                }
                String mime = Mime.build(me, peer,
                        (Prefs.mailEncryption(app) ? MailCrypto.SUBJECT_PREFIX : SUBJECT_PREFIX_PLAIN)
                                + chatUid,
                        Mime.wrap(B64ToBody(body.toString())), mid, null);
                String gmailId = GmailApi.send(Auth.accessTokenFresh(app), Mime.toRaw(mime));
                store.updateState(chatUid, mid, Msg.STATE_SENT, gmailId, null);
                notifyDirty();
            } catch (Throwable e) {
                store.updateState(chatUid, mid, Msg.STATE_FAILED, null, describe(e));
                if (callback != null) callback.onError(describe(e));
                notifyDirty();
            }
        });
    }

    /**
     * Обычное письмо из почты (не конверт MailGram) тоже становится сообщением: приложение
     * показывает весь ящик, а не только переписку между двумя ключами. Темы-переписки
     * группируются по threadId Gmail, текст — то, что реально прислал почтовый клиент.
     */
    private Msg genericMail(Store store, GmailApi.Mail mail, String me) {
        String from = Store.normalizeEmail(mail.from);
        String to = Store.normalizeEmail(mail.to);
        boolean outgoing = me != null && me.equalsIgnoreCase(from);
        String peer = outgoing ? to : from;
        if (peer == null || peer.isEmpty()) peer = outgoing ? from : to;
        if (peer.isEmpty()) peer = "неизвестный адрес";
        // Все обычные письма собираются в один раздел «Вся почта»: ящик виден целиком, но
        // список чатов не превращается в лабиринт из сотен переписок. Внутренняя группировка —
        // по Gmail-цепочке (threadId), так что ветка переписки остаётся вместе.
        String uid = GENERIC_UID;
        Chat chat = store.ensureGenericChat(uid, peer);
        if (chat.name == null || chat.name.isEmpty()) {
            chat.name = str(com.mailgram.app.R.string.all_mail_title);
            store.renameChat(chat.uid, chat.name);
        }
        String senderName = headerName(mail.from, from);
        String body = plainBody(mail.body);
        Matcher gfm = PLAIN_FOOTER.matcher(body);
        if (gfm.find()) body = body.substring(0, gfm.start()).trim();
        Matcher gam = PLAIN_ATTACH.matcher(body);
        if (gam.find()) body = body.replace(gam.group(0), " ").trim();
        String subject = mail.subject == null ? "" : mail.subject.trim();

        Msg m = new Msg();
        m.mid = "mail:" + mail.id;
        m.chat = chat.uid;
        m.peer = peer;
        m.from = from;
        m.to = to;
        m.ts = mail.internalDate > 0 ? mail.internalDate : System.currentTimeMillis();
        m.outgoing = outgoing;
        m.type = "text";
        m.subject = subject.isEmpty() ? str(com.mailgram.app.R.string.mail_no_subject) : subject;
        m.text = (outgoing ? "" : senderName + " — ") + (body.isEmpty() ? str(com.mailgram.app.R.string.mail_empty_body) : body);
        m.gmailId = mail.id;
        m.state = Msg.STATE_SENT;
        m.unread = mail.unread;
        m.mail = true;
        store.put(chat.uid, m);
        return m;
    }


    /**
     * Письмо в открытом режиме (без шифрования): читаем текст, вытаскиваем вложение и
     * привязываем письмо к чату по теме. Текст остаётся обычным письмом — его видно в Gmail.
     */
    private Msg parsePlainLetter(Store store, GmailApi.Mail mail, String me, String chatUid,
                                 String subject) {
        String raw = bodyWithDecoded(mail.body);
        String text = raw == null ? "" : raw.trim();
        String media = null;
        Matcher am = PLAIN_ATTACH.matcher(text);
        if (am.find()) {
            media = am.group(1).replaceAll("\\s", "");
            text = text.replace(am.group(0), "");
        }
        Matcher fm = PLAIN_FOOTER.matcher(text);
        if (fm.find()) text = text.substring(0, fm.start()).trim();

        String from = Store.normalizeEmail(mail.from);
        boolean outgoing = me != null && me.equalsIgnoreCase(from);
        String peer = outgoing ? Store.normalizeEmail(mail.to) : from;
        if (peer.isEmpty()) peer = outgoing ? from : Store.normalizeEmail(mail.to);
        if (peer.isEmpty()) peer = "неизвестный адрес";
        Chat chat = store.ensureChat(chatUid, peer, null);

        Msg m = new Msg();
        m.mid = "plain:" + mail.id;
        m.chat = chat.uid;
        m.peer = peer;
        m.from = from;
        m.to = Store.normalizeEmail(mail.to);
        m.ts = mail.internalDate > 0 ? mail.internalDate : System.currentTimeMillis();
        m.outgoing = outgoing;
        m.type = "text";
        m.text = text.isEmpty() ? str(com.mailgram.app.R.string.mail_empty_body) : text;
        String cleanSubject = subject.startsWith(SUBJECT_PREFIX_PLAIN) ? "" : subject;
        m.subject = cleanSubject;
        m.gmailId = mail.id;
        m.state = Msg.STATE_SENT;
        m.unread = mail.unread && !outgoing;
        if (media != null && !media.isEmpty()) {
            m.mediaB64 = media;
            m.mediaMime = "image/jpeg";
            m.type = "image";
            m.fileName = "photo.jpg";
        }
        store.put(chat.uid, m);
        return m;
    }

    /** Шифрование включено? Снимок настройки на время разбора/отправки одного письма. */
    private boolean encryptionOn() {
        return Prefs.mailEncryption(app);
    }

    /** Тема письма: с конвертом — «MailGram », в открытом режиме — «MailGram #». */
    private String subjectFor(String chatUid) {
        return (encryptionOn() ? MailCrypto.SUBJECT_PREFIX : SUBJECT_PREFIX_PLAIN) + chatUid;
    }

    /**
     * Тело открытого письма: читаемый текст + (при необходимости) base64 вложения + служебная
     * строка, по которой письмо вернётся в тот же чат. Так письмо можно прочитать и ответить
     * на него из Gmail, Яндекс.Почты или Thunderbird — и оно не потеряется.
     */
    private static String plainMailBody(String text, String chatUid, String mid,
                                        String type, String mediaB64) {
        StringBuilder sb = new StringBuilder();
        sb.append(text == null ? "" : text);
        if (mediaB64 != null && !mediaB64.isEmpty()) {
            if (sb.length() > 0) sb.append("\r\n\r\n");
            sb.append("[mailgram-attach b64:").append(mediaB64.trim()).append("]");
        }
        if (sb.length() == 0) sb.append("(пустое сообщение)");
        sb.append("\r\n\r\n-- [MailGram #").append(chatUid).append("\" t: \"").append(type)
                .append("\" id: \"").append(mid).append("\"]");
        return sb.toString();
    }

    /**
     * Собирает письмо и отправляет его, возвращая Gmail-id. Два режима:
     *  • шифрование включено — обычный конверт MailCrypto (письмо нечитаемо для почты);
     *  • шифрование выключено — открытое читаемое письмо, привязанное к чату темой.
     */
    private String sendLetter(String me, String to, String chatUid, String mid, String peerPublicB64,
                              String payloadJson, String plainText, String mediaB64, String type,
                              String inReplyTo) throws Exception {
        if (encryptionOn()) {
            byte[] peerKey = peerPublicB64 == null ? new byte[0] : B64.bytes(peerPublicB64);
            if (peerKey.length != 65) {
                throw new IllegalStateException("нужен открытый ключ собеседника — включите его "
                        + "получение (приглашение) или отправляйте письмо без шифрования");
            }
            String envelope = MailCrypto.sealMessage(app, me, to, chatUid, mid,
                    System.currentTimeMillis(), peerKey, payloadJson);
            return GmailApi.send(Auth.accessTokenFresh(app), Mime.toRaw(Mime.build(
                    me, to, MailCrypto.SUBJECT_PREFIX + chatUid,
                    MailCrypto.toMailBody(envelope), mid, inReplyTo)));
        }
        String body = plainMailBody(plainText, chatUid, mid, type, mediaB64);
        return GmailApi.send(Auth.accessTokenFresh(app), Mime.toRaw(Mime.build(
                me, to, SUBJECT_PREFIX_PLAIN + chatUid, body, mid, inReplyTo)));
    }
    private String str(int resId) {
        try {
            String v = app.getString(resId);
            return v == null ? "" : v;
        } catch (Exception e) {
            return "";
        }
    }

    private static String valueOf(String s) {
        return s == null ? "" : s;
    }

    /** Имя отправителя из заголовка «Name <mail@box>» — показываем его, а не голый адрес. */
    private static String headerName(String raw, String fallback) {
        if (raw == null) return fallback;
        int lt = raw.indexOf('<');
        String name = (lt >= 0 ? raw.substring(0, lt) : raw).replace("\"", "").trim();
        if (name.isEmpty()) return Store.displayName(fallback);
        return name;
    }

    /** Из письма оставляем читаемый текст: HTML сворачиваем, переносы base64 — убираем. */
    private static String plainBody(String body) {
        if (body == null) return "";
        String text = body;
        if (text.contains("<") && text.contains(">")) {
            text = text.replaceAll("(?is)<(script|style)[^>]*>.*?</\\1>", " ")
                    .replaceAll("<br\\s*/?>", "\\n")
                    .replaceAll("(?i)</(p|div|tr|li|h[1-6])>", "\\n")
                    .replaceAll("<[^>]*>", " ");
        }
        text = text.replace("&nbsp;", " ").replace("&amp;", "&").replace("&quot;", "\"")
                .replace("&#39;", "'").replace("&lt;", "<").replace("&gt;", ">");
        text = text.replaceAll("\\r", "").replaceAll("[ \\t]+", " ").replaceAll("\\n{3,}", "\\n\\n");
        text = text.trim();
        if (text.length() > 4000) text = text.substring(0, 4000) + "…";
        return text;
    }

    /**
     * Строка для письма, которое мы не смогли расшифровать: пользователь обязан увидеть,
     * что сообщение пришло. Повторные синхронизации обновляют ту же строку (mid привязан к id
     * письма), а после того как ключи сойдутся, настоящее сообщение её перезапишет.
     */
    private void addUndecryptable(Store store, GmailApi.Mail mail, String me) {
        if (mail == null || mail.id == null || mail.id.isEmpty()) return;
        String from = Store.normalizeEmail(mail.from);
        if (me != null && me.equalsIgnoreCase(from)) return;   // своё письмо — заглушка не нужна
        String peer = from.isEmpty() ? Store.normalizeEmail(mail.to) : from;
        if (peer.isEmpty()) return;
        String subject = mail.subject == null ? "" : mail.subject.trim();
        boolean plain = subject.startsWith(SUBJECT_PREFIX_PLAIN);
        String uid = (plain || subject.startsWith(MailCrypto.SUBJECT_PREFIX))
                ? subject.substring((plain ? SUBJECT_PREFIX_PLAIN
                        : MailCrypto.SUBJECT_PREFIX).length()).trim().split("\\s+")[0]
                : null;
        Chat chat = uid != null ? store.chat(uid) : null;
        if (chat == null) chat = store.chatByPeer(peer);
        if (chat == null) {
            chat = store.ensureChat(NativeCrypto.chatUid(me == null ? "" : me, peer), peer, null);
        }
        Msg m = new Msg();
        m.mid = "und:" + mail.id;
        m.chat = chat.uid;
        m.peer = peer;
        m.from = from;
        m.to = Store.normalizeEmail(mail.to);
        m.ts = mail.internalDate > 0 ? mail.internalDate : System.currentTimeMillis();
        m.outgoing = false;
        m.type = "text";
        m.text = "";
        m.gmailId = mail.id;
        m.state = Msg.STATE_SENT;
        m.unread = true;
        m.error = "не расшифровано";
        store.put(chat.uid, m);
        store.markDamaged(chat.uid);
    }

    /**
     * Ответ обычным письмом (для чатов, которые пришли из почты). Шифрования здесь нет и
     * быть не может — получатель не обязан пользоваться MailGram, поэтому письмо уходит
     * открытым текстом ровно в том виде, в каком его пишут в почтовом клиенте.
     */
    public void sendPlainReply(final Chat chat, final Msg local, final String inReplyTo) {
        final Store store = Store.get(app);
        final String me = Auth.account(app);
        local.chat = chat.uid;
        local.peer = chat.peer;
        local.from = me;
        local.to = chat.peer;
        local.outgoing = true;
        local.mail = true;
        local.state = Msg.STATE_SENDING;
        store.put(chat.uid, local);
        pool.execute(() -> {
            try {
                String token = Auth.accessTokenFresh(app);
                StringBuilder body = new StringBuilder();
                if (local.text != null && !local.text.isEmpty()) body.append(local.text);
                if (local.replyMid != null && !local.replyMid.isEmpty()
                        && local.replyPreview != null && !local.replyPreview.isEmpty()) {
                    if (body.length() > 0) body.append("\r\n\r\n");
                    String quote = local.replyPreview.replaceAll("\\R+", " ");
                    if (quote.length() > 400) quote = quote.substring(0, 400) + "…";
                    body.append("> ").append(quote);
                }
                if (local.subject != null && !local.subject.isEmpty()) {
                    // тему оригинала держим в In-Reply-To-стиле: так письмо не «потеряется» в ветке
                    if (body.length() > 0) body.append("\r\n\r\n");
                    body.append("--\r\n").append("Ответ на письмо «").append(local.subject).append("»");
                }
                byte[] media = local.hasMedia()
                        ? android.util.Base64.decode(local.mediaB64, android.util.Base64.NO_WRAP) : null;
                if (media != null && media.length > 0) {
                    if (body.length() > 0) body.append("\r\n\r\n");
                    body.append("-- вложение: ").append(local.fileName == null || local.fileName.isEmpty()
                            ? local.mediaMime : local.fileName).append(" --\r\n");
                    body.append(android.util.Base64.encodeToString(media, android.util.Base64.NO_WRAP)
                            .replaceAll("\\s+$", ""));
                }
                String subject = local.subject == null || local.subject.isEmpty()
                        ? app.getString(com.mailgram.app.R.string.mail_reply_subject)
                        : (local.subject.startsWith("Re:") || local.subject.startsWith("Fwd:")
                                ? local.subject : "Re: " + local.subject);
                String mime = Mime.build(me, chat.peer, subject, Mime.wrap(body.toString()),
                        local.mid, inReplyTo);
                String gmailId = GmailApi.send(token, Mime.toRaw(mime));
                store.updateState(chat.uid, local.mid, Msg.STATE_SENT, gmailId, null);
                notifyDirty();
            } catch (Throwable e) {
                store.updateState(chat.uid, local.mid, Msg.STATE_FAILED, null, describe(e));
                notifyDirty();
            }
        });
    }

    /** Время письма: сначала конверт, потом Gmail. */
    private static long msgTsOf(GmailApi.Mail mail, MailCrypto.Envelope env) {
        if (env != null && env.ts > 0L) return env.ts;
        return mail != null ? mail.internalDate : 0L;
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
            } catch (Throwable e) {
                Log.w(TAG, "не удалось снять метку непрочитанного: " + e);
            }
        });
    }

    private void notifyDirty() {
        for (Listener l : listeners) {
            try {
                l.onSyncDone(new Result());
            } catch (Throwable ignored) {
                com.mailgram.app.util.CrashLog.record(app, ignored);
            }
        }
    }

    private void fail(SendCallback callback, String error) {
        if (callback != null) callback.onError(error);
    }

    private static String describe(Throwable e) {
        return com.mailgram.app.net.ApiError.shortText(e);
    }
}
