package com.mailgram.app.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Хранилище сессий Double Ratchet и предключей устройства.
 *
 * <p>Файлы сессий лежат в приватной папке приложения и запечатаны ключом Android Keystore
 * ({@link KeystoreBox}, AES-256-GCM): даже с root-доступом к файлам прочитать состояние
 * крысиного шага нельзя. Предключ устройства (пара для X3DH-старта) хранится там же.
 *
 * <p>Все операции над сессией одного чата синхронизированы — письма обрабатываются
 * параллельно, а состояние крысиного шага менять одновременно нельзя.
 */
public final class RatchetStore {

    private static final String TAG = "MailGramRatchet";
    private static final String PREFS = "mailgram_ratchet";

    private static final ConcurrentHashMap<String, Object> LOCKS = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Ratchet> CACHE = new ConcurrentHashMap<>();

    private RatchetStore() {
    }

    private static Object lock(String chatUid) {
        return LOCKS.computeIfAbsent(chatUid, k -> new Object());
    }

    private static File dir(Context ctx) {
        File d = new File(ctx.getFilesDir(), "sessions");
        if (!d.exists() && !d.mkdirs()) {
            Log.w(TAG, "не удалось создать папку сессий");
        }
        return d;
    }

    private static File file(Context ctx, String chatUid) {
        return new File(dir(ctx), "dr-" + chatUid + ".json");
    }

    private static SharedPreferences prefs(Context ctx) {
        return ctx.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
    }

    // ---------------- предключ устройства ----------------

    /** Открытый предключ устройства (65 байт) — публикуется в письмах полем {@code pre}. */
    public static synchronized byte[] myPreKeyPublic(Context ctx) throws Exception {
        KeyPair kp = myPreKeyPair(ctx);
        return Identity.rawFromPublicKey(kp.getPublic());
    }

    private static synchronized KeyPair myPreKeyPair(Context ctx) throws Exception {
        SharedPreferences p = prefs(ctx);
        String sealed = p.getString("prekey_priv", null);
        String pubRaw = p.getString("prekey_pub", null);
        if (sealed != null && pubRaw != null) {
            try {
                byte[] pkcs8 = KeystoreBox.open(ctx, sealed);
                java.security.PrivateKey priv = java.security.KeyFactory.getInstance("EC")
                        .generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(pkcs8));
                java.security.PublicKey pub = Identity.publicKeyFromRaw(B64.bytes(pubRaw));
                return new KeyPair(pub, priv);
            } catch (Exception e) {
                Log.w(TAG, "предключ не прочитался, создаём новый: " + e);
            }
        }
        KeyPair kp = Ratchet.generateKeyPair();
        p.edit()
                .putString("prekey_priv", KeystoreBox.seal(ctx, kp.getPrivate().getEncoded()))
                .putString("prekey_pub", B64.str(Identity.rawFromPublicKey(kp.getPublic())))
                .apply();
        return kp;
    }

    private static byte[] myPreKeyPrivate(Context ctx) throws Exception {
        return myPreKeyPair(ctx).getPrivate().getEncoded();
    }

    // ---------------- предключ собеседника ----------------

    public static void setPeerPre(Context ctx, String chatUid, byte[] peerPreRaw) {
        if (peerPreRaw == null || peerPreRaw.length != 65) return;
        prefs(ctx).edit().putString("peer_pre_" + chatUid, B64.str(peerPreRaw)).apply();
    }

    public static byte[] peerPre(Context ctx, String chatUid) {
        String s = prefs(ctx).getString("peer_pre_" + chatUid, null);
        if (s == null || s.isEmpty()) {
            // могло остаться в самой сессии
            try {
                Ratchet r = load(ctx, chatUid, false);
                if (r != null && r.peerPre != null && !r.peerPre.isEmpty()) {
                    return B64.bytes(r.peerPre);
                }
            } catch (Exception ignored) {
            }
            return null;
        }
        try {
            return B64.bytes(s);
        } catch (Exception e) {
            return null;
        }
    }

    // ---------------- сессии ----------------

    /** Есть ли рабочая сессия (крысиный шаг установлен). */
    public static boolean hasSession(Context ctx, String chatUid) {
        Ratchet r = CACHE.get(chatUid);
        if (r != null && r.ready) return true;
        try {
            Ratchet loaded = load(ctx, chatUid, false);
            return loaded != null && loaded.ready;
        } catch (Exception e) {
            return false;
        }
    }

    public static Ratchet load(Context ctx, String chatUid, boolean create) throws Exception {
        Ratchet cached = CACHE.get(chatUid);
        if (cached != null) return cached;
        synchronized (lock(chatUid)) {
            cached = CACHE.get(chatUid);
            if (cached != null) return cached;
            File f = file(ctx, chatUid);
            if (!f.exists()) return null;
            String sealed = read(f);
            if (sealed == null) return null;
            JSONObject o = new JSONObject(KeystoreBox.open(ctx, sealed));
            Ratchet r = Ratchet.fromJson(o);
            CACHE.put(chatUid, r);
            return r;
        }
    }

    public static void save(Context ctx, String chatUid, Ratchet r) {
        synchronized (lock(chatUid)) {
            CACHE.put(chatUid, r);
            try {
                String sealed = KeystoreBox.seal(ctx, r.toJson().toString().getBytes(StandardCharsets.UTF_8));
                write(file(ctx, chatUid), sealed);
            } catch (Exception e) {
                Log.w(TAG, "сессию не удалось сохранить: " + e);
            }
        }
    }

    public static void wipe(Context ctx, String chatUid) {
        synchronized (lock(chatUid)) {
            CACHE.remove(chatUid);
            prefs(ctx).edit().remove("peer_pre_" + chatUid).apply();
            File f = file(ctx, chatUid);
            if (f.exists() && !f.delete()) Log.w(TAG, "файл сессии не удалён");
        }
    }

    /** Полный сброс: удаление всех сессий и предключей (выход с очисткой). */
    public static synchronized void wipeAll(Context ctx) {
        CACHE.clear();
        prefs(ctx).edit().clear().apply();
        File[] files = dir(ctx).listFiles();
        if (files != null) {
            for (File f : files) {
                if (!f.delete()) Log.w(TAG, "файл " + f.getName() + " не удалён");
            }
        }
    }

    /** Блокировка чата для составных операций (например, «создать сессию и зашифровать»). */
    public static Object chatLock(String chatUid) {
        return lock(chatUid);
    }

    private static String read(File f) {
        try (InputStream in = new FileInputStream(f)) {
            byte[] buf = new byte[(int) f.length()];
            int read = in.read(buf);
            return read > 0 ? new String(buf, 0, read, StandardCharsets.UTF_8) : null;
        } catch (Exception e) {
            return null;
        }
    }

    private static void write(File f, String text) {
        try (FileOutputStream out = new FileOutputStream(f)) {
            out.write(text.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            Log.w(TAG, "запись не удалась: " + e);
        }
    }

    /** Приватный предключ для роли ответчика (используется при первом входящем сообщении). */
    public static byte[] myPreKeyPrivateForResponder(Context ctx) throws Exception {
        return myPreKeyPrivate(ctx);
    }
}
