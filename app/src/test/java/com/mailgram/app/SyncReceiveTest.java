package com.mailgram.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;

import com.mailgram.app.crypto.B64;
import com.mailgram.app.crypto.Identity;
import com.mailgram.app.crypto.MailCrypto;
import com.mailgram.app.crypto.NativeCrypto;
import com.mailgram.app.crypto.Ratchet;
import com.mailgram.app.crypto.RatchetStore;
import com.mailgram.app.net.Auth;
import com.mailgram.app.net.Http;
import com.mailgram.app.store.Msg;
import com.mailgram.app.store.Store;
import com.mailgram.app.sync.SyncEngine;
import com.mailgram.app.util.CrashLog;

import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.util.UUID;

import javax.crypto.KeyAgreement;

/**
 * Сквозной тест приёма: «собеседник» (внешняя пара ключей) шифрует конверты v1 и v2
 * точно как реальное устройство и кладёт их в поддельный Gmail. Приложение должно
 * найти письмо, расшифровать и показать сообщение. Ловит регресс «письмо в почте
 * есть, а в мессенджере нет».
 */
@RunWith(RobolectricTestRunner.class)
@Config(sdk = 34)
public class SyncReceiveTest {

    private static final String ME = "me@example.com";
    private static final String PEER = "peer@example.com";

    private Context ctx;
    private String chatUid;
    private volatile String servedId;
    private volatile String servedBody;

    @Before
    public void setUp() throws Exception {
        ctx = ApplicationProvider.getApplicationContext();
        SyncEngine.disabled = false;
        clearStatic("com.mailgram.app.store.Store", "instance");
        clearStatic("com.mailgram.app.sync.SyncEngine", "instance");
        clearStatic("com.mailgram.app.crypto.Identity", "cachedPublic");
        clearStatic("com.mailgram.app.crypto.Identity", "cachedMode");
        RatchetStore.wipeAll(ctx);
        CrashLog.clear(ctx);
        ctx.getSharedPreferences("mailgram_settings", Context.MODE_PRIVATE).edit()
                .putBoolean("background_sync", false)
                .putBoolean("notifications", false)
                .commit();
        ctx.getSharedPreferences("mailgram_auth", Context.MODE_PRIVATE).edit()
                .putString("account", ME)
                .putString("refresh_sealed", "testplain:" + B64.str(B64.utf8("refresh-token")))
                .putString("access_sealed", "testplain:" + B64.str(B64.utf8("access-token")))
                .putLong("expires_at", System.currentTimeMillis() + 3_600_000L)
                .commit();
        chatUid = NativeCrypto.chatUid(ME, PEER);

        Http.testTransport = (method, url, bearer, body) -> {
            if (url.contains("/messages?")) {
                return new Http.Response(200,
                        "{\"messages\":[{\"id\":\"" + servedId + "\",\"threadId\":\"t1\"}]}");
            }
            if (url.contains("/messages/" + servedId)) {
                String data = b64url(servedBody.getBytes(StandardCharsets.UTF_8));
                return new Http.Response(200, "{\"id\":\"" + servedId + "\",\"internalDate\":"
                        + System.currentTimeMillis() + ",\"labelIds\":[\"INBOX\",\"UNREAD\"],"
                        + "\"payload\":{\"mimeType\":\"text/plain\","
                        + "\"headers\":[{\"name\":\"Subject\",\"value\":\"MailGram " + chatUid + "\"},"
                        + "{\"name\":\"From\",\"value\":\"" + PEER + "\"},"
                        + "{\"name\":\"To\",\"value\":\"" + ME + "\"}],"
                        + "\"body\":{\"data\":\"" + data + "\"}}}");
            }
            return new Http.Response(200, "{}");
        };
    }

    @After
    public void tearDown() {
        Http.testTransport = null;
        SyncEngine.disabled = true;
        String last = CrashLog.last(ctx);
        if (!last.isEmpty()) {
            fail("Приём поймал ошибку:\n" + last);
        }
    }

    private static void clearStatic(String cls, String field) throws Exception {
        Field f = Class.forName(cls).getDeclaredField(field);
        f.setAccessible(true);
        f.set(null, null);
    }

    private static String b64url(byte[] data) {
        return android.util.Base64.encodeToString(data,
                android.util.Base64.URL_SAFE | android.util.Base64.NO_WRAP | android.util.Base64.NO_PADDING);
    }

    private static byte[] ecdh(PrivateKey priv, byte[] peerRaw) throws Exception {
        KeyAgreement ka = KeyAgreement.getInstance("ECDH");
        ka.init(priv);
        ka.doPhase(Identity.publicKeyFromRaw(peerRaw), true);
        return ka.generateSecret();
    }

    private static byte[] concat(byte[] a, byte[] b) {
        byte[] out = new byte[a.length + b.length];
        System.arraycopy(a, 0, out, 0, a.length);
        System.arraycopy(b, 0, out, a.length, b.length);
        return out;
    }

    /** Ждём, пока фоновая синхронизация положит сообщение в хранилище. */
    private Msg awaitMessage(String mid) throws Exception {
        SyncEngine.get(ctx).syncNow();
        long deadline = System.currentTimeMillis() + 15_000L;
        while (System.currentTimeMillis() < deadline) {
            Msg m = Store.get(ctx).byMid(chatUid, mid);
            if (m != null) return m;
            Thread.sleep(200);
        }
        return null;
    }

    @Test
    public void incomingV1Appears() throws Exception {
        KeyPair peerId = Ratchet.generateKeyPair();
        byte[] peerRaw = Identity.rawFromPublicKey(peerId.getPublic());
        byte[] ourPub = Identity.publicKeyRaw(ctx);

        String mid = UUID.randomUUID().toString();
        long ts = System.currentTimeMillis();
        JSONObject payload = new JSONObject();
        payload.put("t", "text");
        payload.put("b", "Привет от собеседника (v1)");

        byte[] shared = ecdh(peerId.getPrivate(), ourPub);
        byte[] key = NativeCrypto.hkdfSha256(shared, B64.utf8("MailGram/v1/salt"),
                B64.utf8("MailGram/v1|chat=" + chatUid), 32);
        byte[] nonce = NativeCrypto.random(12);
        byte[] aad = MailCrypto.aad(MailCrypto.VERSION, mid, ts, PEER, ME, chatUid);
        byte[] ct = NativeCrypto.aeadEncrypt(key, nonce, aad, B64.utf8(payload.toString()));

        JSONObject env = new JSONObject();
        env.put("v", MailCrypto.VERSION);
        env.put("alg", MailCrypto.ALG);
        env.put("id", mid);
        env.put("ts", ts);
        env.put("chat", chatUid);
        env.put("from", PEER);
        env.put("to", ME);
        env.put("pk", B64.str(peerRaw));
        env.put("n", B64.str(nonce));
        env.put("c", B64.str(ct));

        servedId = "gm-v1";
        servedBody = MailCrypto.toMailBody(env.toString());

        Msg m = awaitMessage(mid);
        assertNotNull("входящее v1 должно появиться в мессенджере", m);
        assertEquals("Привет от собеседника (v1)", m.text);
        assertTrue(!m.outgoing);
    }

    @Test
    public void incomingV2RatchetAppears() throws Exception {
        KeyPair peerId = Ratchet.generateKeyPair();
        byte[] peerRaw = Identity.rawFromPublicKey(peerId.getPublic());
        KeyPair peerPre = Ratchet.generateKeyPair();
        byte[] peerPreRaw = Identity.rawFromPublicKey(peerPre.getPublic());
        byte[] ourPub = Identity.publicKeyRaw(ctx);
        byte[] ourPre = RatchetStore.myPreKeyPublic(ctx);

        String mid = UUID.randomUUID().toString();
        long ts = System.currentTimeMillis();
        JSONObject payload = new JSONObject();
        payload.put("t", "text");
        payload.put("b", "Привет от собеседника (v2 ratchet)");

        // собеседник — инициатор Double Ratchet (зеркало Ratchet.initiator)
        KeyPair ek = Ratchet.generateKeyPair();
        byte[] ekRaw = Identity.rawFromPublicKey(ek.getPublic());
        byte[] dh1 = ecdh(peerId.getPrivate(), ourPub);
        byte[] dh2 = ecdh(ek.getPrivate(), ourPub);
        byte[] dh3 = ecdh(ek.getPrivate(), ourPre);
        byte[] sk = NativeCrypto.hkdfSha256(concat(concat(dh1, dh2), dh3),
                B64.utf8(chatUid), B64.utf8("MailGram/DR/x3dh"), 32);
        byte[] rkCk = NativeCrypto.hkdfSha256(dh3, sk, B64.utf8("MailGram/DR/root"), 64);
        byte[] root1 = new byte[32];
        byte[] ckSend = new byte[32];
        System.arraycopy(rkCk, 0, root1, 0, 32);
        System.arraycopy(rkCk, 32, ckSend, 0, 32);
        byte[] mk = NativeCrypto.hkdfSha256(ckSend, new byte[32], B64.utf8("MailGram/DR/message"), 32);

        String aadPrefix = "MailGram/DR|2|" + mid + "|" + ts + "|" + PEER + "|" + ME + "|" + chatUid;
        String header = B64.str(ekRaw) + "|0|0";
        byte[] aad = B64.utf8(aadPrefix + header);
        byte[] nonce = NativeCrypto.random(12);
        byte[] ct = NativeCrypto.aeadEncrypt(mk, nonce, aad, B64.utf8(payload.toString()));

        JSONObject env = new JSONObject();
        env.put("v", MailCrypto.VERSION_RATCHET);
        env.put("alg", MailCrypto.ALG_RATCHET);
        env.put("id", mid);
        env.put("ts", ts);
        env.put("chat", chatUid);
        env.put("from", PEER);
        env.put("to", ME);
        env.put("pk", B64.str(peerRaw));
        env.put("pre", B64.str(peerPreRaw));
        env.put("dh", B64.str(ekRaw));
        env.put("pn", 0L);
        env.put("n", 0L);
        env.put("nc", B64.str(nonce));
        env.put("c", B64.str(ct));

        servedId = "gm-v2";
        servedBody = MailCrypto.toMailBody(env.toString());

        Msg m = awaitMessage(mid);
        assertNotNull("входящее v2 (Double Ratchet) должно появиться в мессенджере", m);
        assertEquals("Привет от собеседника (v2 ratchet)", m.text);
        assertTrue(!m.outgoing);
    }
}
