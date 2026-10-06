package com.mailgram.app.store;

import android.content.Context;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * Локальное хранилище: диалоги и сообщения (уже расшифрованные — приложение
 * хранит их в приватном каталоге, недоступном другим приложениям).
 * Ничего не уходит на внешние серверы.
 */
public final class Store {

    private static final String TAG = "MailGramStore";
    private static volatile Store instance;

    private final File dir;
    private final File chatsFile;
    private final Map<String, Chat> chats = new LinkedHashMap<>();
    private final Map<String, LinkedHashMap<String, Msg>> messages = new LinkedHashMap<>();
    private final Set<String> gmailIds = new HashSet<>();

    private Store(Context ctx) {
        dir = new File(ctx.getFilesDir(), "store");
        if (!dir.exists() && !dir.mkdirs()) {
            Log.w(TAG, "не удалось создать каталог хранилища");
        }
        chatsFile = new File(dir, "chats.json");
        load();
    }

    public static Store get(Context ctx) {
        Store local = instance;
        if (local == null) {
            synchronized (Store.class) {
                local = instance;
                if (local == null) {
                    local = new Store(ctx.getApplicationContext());
                    instance = local;
                }
            }
        }
        return local;
    }

    // ---------------- чтение/запись ----------------

    private synchronized void load() {
        chats.clear();
        messages.clear();
        gmailIds.clear();
        if (chatsFile.exists()) {
            try (BufferedReader r = new BufferedReader(new FileReader(chatsFile))) {
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = r.readLine()) != null) sb.append(line);
                JSONObject root = new JSONObject(sb.toString());
                JSONArray arr = root.optJSONArray("chats");
                if (arr != null) {
                    for (int i = 0; i < arr.length(); i++) {
                        Chat c = Chat.fromJson(arr.getJSONObject(i));
                        if (c.uid != null && !c.uid.isEmpty()) chats.put(c.uid, c);
                    }
                }
            } catch (Exception e) {
                Log.w(TAG, "не удалось прочитать список диалогов: " + e);
            }
        }
        for (String uid : new ArrayList<>(chats.keySet())) {
            LinkedHashMap<String, Msg> list = new LinkedHashMap<>();
            File f = new File(dir, uid + ".jsonl");
            if (f.exists()) {
                try (BufferedReader r = new BufferedReader(new FileReader(f))) {
                    String line;
                    while ((line = r.readLine()) != null) {
                        if (line.trim().isEmpty()) continue;
                        try {
                            Msg m = Msg.fromJson(new JSONObject(line));
                            list.put(m.mid, m);
                            if (m.gmailId != null && !m.gmailId.isEmpty()) gmailIds.add(m.gmailId);
                        } catch (Exception ignored) {
                        }
                    }
                } catch (IOException e) {
                    Log.w(TAG, "не удалось прочитать историю " + uid + ": " + e);
                }
            }
            messages.put(uid, list);
        }
    }

    private void writeChatsLocked() {
        JSONArray arr = new JSONArray();
        for (Chat c : chats.values()) arr.put(c.toJson());
        JSONObject root = new JSONObject();
        try {
            root.put("chats", arr);
        } catch (Exception ignored) {
        }
        writeAtomic(chatsFile, root.toString());
    }

    private synchronized void persistChat(String uid) {
        LinkedHashMap<String, Msg> list = messages.get(uid);
        if (list == null) return;
        StringBuilder sb = new StringBuilder();
        for (Msg m : list.values()) {
            sb.append(m.toJson().toString()).append('\n');
        }
        writeAtomic(new File(dir, uid + ".jsonl"), sb.toString());
    }

    private void writeAtomic(File file, String content) {
        File tmp = new File(file.getParentFile(), file.getName() + ".tmp");
        try (FileOutputStream fos = new FileOutputStream(tmp)) {
            fos.write(content.getBytes(StandardCharsets.UTF_8));
            fos.getFD().sync();
        } catch (Exception e) {
            Log.w(TAG, "ошибка записи " + file.getName() + ": " + e);
            return;
        }
        if (!tmp.renameTo(file)) {
            Log.w(TAG, "не удалось заменить " + file.getName());
        }
    }

    // ---------------- диалоги ----------------

    public synchronized List<Chat> chats() {
        List<Chat> list = new ArrayList<>(chats.values());
        Collections.sort(list, (a, b) -> Long.compare(b.lastTs, a.lastTs));
        return list;
    }

    public synchronized Chat chat(String uid) {
        return chats.get(uid);
    }

    public synchronized Chat ensureChat(String uid, String peer, String peerPublicB64) {
        Chat c = chats.get(uid);
        if (c == null) {
            c = new Chat();
            c.uid = uid;
            c.peer = peer;
            chats.put(uid, c);
            messages.put(uid, new LinkedHashMap<>());
        }
        if (peer != null && !peer.isEmpty()) c.peer = peer;
        if (peerPublicB64 != null && !peerPublicB64.isEmpty()) c.peerPublic = peerPublicB64;
        c.sanitize();
        writeChatsLocked();
        return c;
    }

    public synchronized void setPeerPublic(String uid, String peerPublicB64) {
        Chat c = chats.get(uid);
        if (c != null && peerPublicB64 != null && !peerPublicB64.isEmpty()) {
            c.peerPublic = peerPublicB64;
            writeChatsLocked();
        }
    }

    public synchronized void renameChat(String uid, String name) {
        Chat c = chats.get(uid);
        if (c != null) {
            c.name = name == null ? "" : name;
            writeChatsLocked();
        }
    }

    public synchronized void markDamaged(String uid) {
        Chat c = chats.get(uid);
        if (c != null) {
            c.damaged = true;
            writeChatsLocked();
        }
    }

    public synchronized void removeChat(String uid) {
        chats.remove(uid);
        messages.remove(uid);
        File f = new File(dir, uid + ".jsonl");
        if (f.exists() && !f.delete()) Log.w(TAG, "не удалось удалить " + f.getName());
        writeChatsLocked();
    }

    public synchronized void markRead(String uid) {
        Chat c = chats.get(uid);
        LinkedHashMap<String, Msg> list = messages.get(uid);
        if (c == null || list == null) return;
        for (Msg m : list.values()) m.unread = false;
        c.unread = 0;
        c.damaged = false;
        writeChatsLocked();
        persistChat(uid);
    }

    public synchronized void clearHistory(String uid) {
        LinkedHashMap<String, Msg> list = messages.get(uid);
        if (list != null) {
            for (Msg m : list.values()) {
                if (m.gmailId != null) gmailIds.remove(m.gmailId);
            }
            list.clear();
        }
        Chat c = chats.get(uid);
        if (c != null) {
            c.preview = "";
            c.unread = 0;
            c.total = 0;
            c.damaged = false;
            writeChatsLocked();
        }
        persistChat(uid);
    }

    public synchronized int totalUnread() {
        int n = 0;
        for (Chat c : chats.values()) n += c.unread;
        return n;
    }

    // ---------------- сообщения ----------------

    /** Запомнить письмо, не создавая сообщение (служебные конверты). */
    public synchronized void markGmailId(String gmailId) {
        if (gmailId != null && !gmailId.isEmpty()) gmailIds.add(gmailId);
    }

    /** Закрепить/открепить сообщение — показывается в шапке чата. */
    public synchronized void setMsgPinned(String uid, String mid, boolean pinned) {
        LinkedHashMap<String, Msg> list = messages.get(uid);
        if (list == null) return;
        for (Msg m : list.values()) {
            m.pinned = pinned && mid.equals(m.mid);
        }
        persistChat(uid);
    }

    /** Реакция собеседника: +1 к счётчику эмодзи у указанного сообщения. */
    /** Реакция собеседника: добавить или (remove) снять. */
    public synchronized void applyReaction(String uid, String mid, String emoji, boolean remove) {
        Msg target = byMid(uid, mid);
        if (target == null || emoji == null || emoji.isEmpty()) return;
        if (remove) {
            Integer current = target.reactions.get(emoji);
            if (current == null || current <= 1) {
                target.reactions.remove(emoji);
            } else {
                target.reactions.put(emoji, current - 1);
            }
        } else {
            Integer current = target.reactions.get(emoji);
            target.reactions.put(emoji, current == null ? 1 : current + 1);
        }
        persistChat(uid);
    }

    /** Своя реакция: повторное нажатие тем же эмодзи снимает её (как в Telegram). */
    public synchronized void addOwnReaction(String uid, String mid, String emoji) {
        Msg target = byMid(uid, mid);
        if (target == null || emoji == null || emoji.isEmpty()) return;
        if (emoji.equals(target.myReaction)) {
            removeOwnReaction(uid, mid, emoji);
            return;
        }
        if (target.myReaction != null && !target.myReaction.isEmpty()) {
            applyReaction(uid, mid, target.myReaction, true);
        }
        target.myReaction = emoji;
        applyReaction(uid, mid, emoji, false);
    }

    /** Снять свою реакцию с сообщения. */
    public synchronized void removeOwnReaction(String uid, String mid, String emoji) {
        Msg target = byMid(uid, mid);
        if (target == null || emoji == null || emoji.isEmpty()) return;
        applyReaction(uid, mid, emoji, true);
        if (emoji.equals(target.myReaction)) target.myReaction = "";
        persistChat(uid);
    }

    public synchronized void applyEdit(String uid, String mid, String newText) {
        Msg target = byMid(uid, mid);
        if (target == null) return;
        target.text = newText == null ? "" : newText;
        target.edited = true;
        refreshPreview(uid);
        persistChat(uid);
    }

    public synchronized void applyDelete(String uid, String mid) {
        Msg target = byMid(uid, mid);
        if (target == null) return;
        target.deleted = true;
        target.text = "";
        target.mediaB64 = "";
        refreshPreview(uid);
        persistChat(uid);
    }

    private void refreshPreview(String uid) {
        LinkedHashMap<String, Msg> list = messages.get(uid);
        Chat c = chats.get(uid);
        if (list == null || c == null || list.isEmpty()) return;
        Msg last = null;
        for (Msg m : list.values()) {
            if (m.isControl()) continue;
            if (last == null || m.ts >= last.ts) last = m;
        }
        if (last != null) {
            c.preview = preview(last);
            c.lastTs = last.ts;
            c.lastOutgoing = last.outgoing;
        }
        writeChatsLocked();
    }

    /** Закреплённые чаты — выше остальных, дальше по времени последнего сообщения. */
    public synchronized List<Chat> sortedChats() {
        List<Chat> out = chats();
        Collections.sort(out, (a, b) -> {
            if (a.pinned != b.pinned) return a.pinned ? -1 : 1;
            if (a.lastTs != b.lastTs) return Long.compare(b.lastTs, a.lastTs);
            return 0;
        });
        return out;
    }

    public synchronized void setPinned(String uid, boolean pinned) {
        Chat c = chats.get(uid);
        if (c != null) {
            c.pinned = pinned;
            writeChatsLocked();
        }
    }

    public synchronized void setMuted(String uid, boolean muted) {
        Chat c = chats.get(uid);
        if (c != null) {
            c.muted = muted;
            writeChatsLocked();
        }
    }

    public synchronized void setVerified(String uid, boolean verified) {
        Chat c = chats.get(uid);
        if (c != null) {
            c.verified = verified;
            writeChatsLocked();
        }
    }

    /** Черновик сообщения для чата (чтобы текст не терялся при выходе). */
    public String draft(String uid) {
        File f = new File(dir, uid + ".draft");
        if (!f.exists()) return "";
        try {
            StringBuilder sb = new StringBuilder();
            try (java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader(
                    new java.io.FileInputStream(f), java.nio.charset.StandardCharsets.UTF_8))) {
                String line;
                while ((line = r.readLine()) != null) sb.append(line).append('\n');
            }
            return sb.toString();
        } catch (Exception e) {
            return "";
        }
    }

    public void setDraft(String uid, String text) {
        File f = new File(dir, uid + ".draft");
        try {
            if (text == null || text.trim().isEmpty()) {
                if (f.exists()) f.delete();
                return;
            }
            try (java.io.FileOutputStream out = new java.io.FileOutputStream(f)) {
                out.write(text.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            }
        } catch (Exception ignored) {
        }
    }

    /** Сводка по вложению: количество фото, видео и голосовых в чате. */
    public synchronized int[] mediaCounts(String uid) {
        int[] counts = new int[3];
        for (Msg m : messages(uid)) {
            if (m.isImage()) counts[0]++;
            else if (m.isVideo()) counts[1]++;
            else if (m.isVoice()) counts[2]++;
        }
        return counts;
    }

    public synchronized List<Msg> messages(String uid) {
        LinkedHashMap<String, Msg> list = messages.get(uid);
        if (list == null) return new ArrayList<>();
        List<Msg> out = new ArrayList<>(list.values());
        Collections.sort(out, (a, b) -> Long.compare(a.ts, b.ts));
        return out;
    }

    /** Найденное сообщение вместе с чатом, в котором оно лежит. */
    public static final class Hit {
        public final String uid;
        public final Msg msg;

        public Hit(String uid, Msg msg) {
            this.uid = uid;
            this.msg = msg;
        }
    }

    /** Поиск по тексту сообщений во всех чатах: свежие находки первыми. */
    public synchronized List<Hit> searchMessages(String query, int limit) {
        List<Hit> hits = new ArrayList<>();
        String needle = query == null ? "" : query.trim().toLowerCase(java.util.Locale.US);
        if (needle.isEmpty()) return hits;
        for (Map.Entry<String, LinkedHashMap<String, Msg>> entry : messages.entrySet()) {
            for (Msg m : entry.getValue().values()) {
                if (m.deleted || m.isControl()) continue;
                String text = m.text == null ? "" : m.text;
                if (text.toLowerCase(java.util.Locale.US).contains(needle)) {
                    hits.add(new Hit(entry.getKey(), m));
                }
            }
        }
        Collections.sort(hits, (a, b) -> Long.compare(b.msg.ts, a.msg.ts));
        if (hits.size() > limit) return new ArrayList<>(hits.subList(0, limit));
        return hits;
    }

    public synchronized int messageCount(String uid) {
        LinkedHashMap<String, Msg> list = messages.get(uid);
        return list == null ? 0 : list.size();
    }

    public synchronized boolean hasGmailId(String gmailId) {
        return gmailIds != null && gmailIds.contains(gmailId);
    }

    public synchronized Msg byMid(String uid, String mid) {
        LinkedHashMap<String, Msg> list = messages.get(uid);
        return list == null ? null : list.get(mid);
    }

    /** Добавляет сообщение или обновляет существующее (по mid). */
    public synchronized Msg put(String uid, Msg m) {
        if (m == null) return null;
        m.sanitize();
        LinkedHashMap<String, Msg> list = messages.get(uid);
        if (list == null) {
            list = new LinkedHashMap<>();
            messages.put(uid, list);
        }
        Msg existing = list.get(m.mid);
        if (existing != null) {
            existing.gmailId = m.gmailId != null && !m.gmailId.isEmpty() ? m.gmailId : existing.gmailId;
            if (m.state != 0) existing.state = m.state;
            if (m.error != null && !m.error.isEmpty()) existing.error = m.error;
            list.put(m.mid, existing);
            persistChat(uid);
            return existing;
        }
        list.put(m.mid, m);
        if (m.gmailId != null && !m.gmailId.isEmpty()) gmailIds.add(m.gmailId);

        Chat c = chats.get(uid);
        if (c != null) {
            c.total = list.size();
            if (m.ts >= c.lastTs) {
                c.lastTs = m.ts;
                c.preview = preview(m);
                c.lastOutgoing = m.outgoing;
            }
            if (!m.outgoing && m.unread) c.unread++;
            writeChatsLocked();
        }
        persistChat(uid);
        return m;
    }

    public synchronized void updateState(String uid, String mid, int state, String gmailId, String error) {
        LinkedHashMap<String, Msg> list = messages.get(uid);
        if (list == null) return;
        Msg m = list.get(mid);
        if (m == null) return;
        m.state = state;
        if (gmailId != null && !gmailId.isEmpty()) {
            m.gmailId = gmailId;
            gmailIds.add(gmailId);
        }
        if (error != null) m.error = error;
        list.put(mid, m);
        persistChat(uid);
    }

    public synchronized void deleteMessage(String uid, String mid) {
        LinkedHashMap<String, Msg> list = messages.get(uid);
        if (list == null) return;
        Msg removed = list.remove(mid);
        if (removed != null && removed.gmailId != null) gmailIds.remove(removed.gmailId);
        Chat c = chats.get(uid);
        if (c != null) {
            c.total = list.size();
            Msg last = lastOf(list);
            c.lastTs = last == null ? 0 : last.ts;
            c.preview = last == null ? "" : preview(last);
            writeChatsLocked();
        }
        persistChat(uid);
    }

    private Msg lastOf(LinkedHashMap<String, Msg> list) {
        Msg last = null;
        for (Msg m : list.values()) {
            if (last == null || m.ts >= last.ts) last = m;
        }
        return last;
    }

    public static String preview(Msg m) {
        if (m == null) return "";
        if (m.type != null && m.type.equals("invite")) return "✉ Приглашение в MailGram";
        String t = m.previewText().replace('\n', ' ');
        return t.length() > 160 ? t.substring(0, 160) + "…" : t;
    }

    /** Имя для отображения: локальная подпись, иначе часть адреса до @. */
    public static String displayName(Context ctx, String email) {
        String custom = Prefs.contactName(ctx, email);
        if (custom != null && !custom.trim().isEmpty()) return custom.trim();
        return displayName(email);
    }

    public static String displayName(String email) {
        if (email == null || email.isEmpty()) return "Неизвестный";
        int at = email.indexOf('@');
        String local = at > 0 ? email.substring(0, at) : email;
        return local.isEmpty() ? email : local;
    }

    public static String normalizeEmail(String raw) {
        if (raw == null) return "";
        String s = raw.trim().toLowerCase(Locale.US);
        int lt = s.indexOf('<');
        if (lt >= 0) {
            int gt = s.indexOf('>', lt);
            if (gt > lt) s = s.substring(lt + 1, gt);
        }
        return s.trim();
    }
}
