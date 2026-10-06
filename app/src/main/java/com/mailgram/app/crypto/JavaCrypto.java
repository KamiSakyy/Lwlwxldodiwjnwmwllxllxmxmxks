package com.mailgram.app.crypto;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;

import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Чистый Java-фолбэк нативного ядра: те же алгоритмы и байт-в-байт те же форматы
 * (SHA-256, HKDF-SHA256 RFC 5869, ChaCha20-Poly1305, chatUid и safetyNumber как в C++).
 * Включается, когда libmailgram.so недоступна (JVM-тесты, редкие устройства).
 */
final class JavaCrypto {

    private JavaCrypto() {
    }

    static String version() {
        return "mailgram-java/1.0.0";
    }

    // ---------------- примитивы ----------------

    static byte[] random(int n) {
        if (n <= 0 || n > (1 << 20)) throw new IllegalStateException("random: неверный размер");
        byte[] out = new byte[n];
        new SecureRandom().nextBytes(out);
        return out;
    }

    static byte[] sha256(byte[] data) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(data == null ? new byte[0] : data);
        } catch (Exception e) {
            throw new IllegalStateException("sha256: " + e.getMessage(), e);
        }
    }

    static byte[] hmac(byte[] key, byte[] msg) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(key.length == 0 ? new byte[32] : key, "HmacSHA256"));
            return mac.doFinal(msg);
        } catch (Exception e) {
            throw new IllegalStateException("hmac: " + e.getMessage(), e);
        }
    }

    /** HKDF-SHA256 (RFC 5869) — как mg_hkdf_sha256. */
    static byte[] hkdf(byte[] ikm, byte[] salt, byte[] info, int outLen) {
        if (outLen <= 0 || outLen > 4096) throw new IllegalStateException("hkdf: неверная длина вывода");
        byte[] prk = hmac(salt == null || salt.length == 0 ? new byte[32] : salt, ikm);
        byte[] out = new byte[outLen];
        byte[] t = new byte[0];
        int off = 0;
        int block = 1;
        while (off < outLen) {
            byte[] material = new byte[t.length + (info == null ? 0 : info.length) + 1];
            System.arraycopy(t, 0, material, 0, t.length);
            if (info != null) System.arraycopy(info, 0, material, t.length, info.length);
            material[material.length - 1] = (byte) block;
            t = hmac(prk, material);
            int take = Math.min(t.length, outLen - off);
            System.arraycopy(t, 0, out, off, take);
            off += take;
            block++;
        }
        return out;
    }

    private static Cipher chacha(byte[] key, byte[] nonce, int mode, byte[] aad) throws Exception {
        Cipher cipher = null;
        Exception last = null;
        for (String name : new String[]{"ChaCha20-Poly1305", "ChaCha20/Poly1305", "AES_256/GCM"}) {
            // AES_256/GCM не входит в перечень, но оставляем лишь два первых имени:
            // формат тега ChaCha20-Poly1305 совпадает с нативным (ct||tag, 16 байт).
            if (name.startsWith("AES")) break;
            try {
                cipher = Cipher.getInstance(name);
                break;
            } catch (Exception e) {
                last = e;
            }
        }
        if (cipher == null) {
            throw new IllegalStateException("нет провайдера ChaCha20-Poly1305: " + last);
        }
        SecretKeySpec keySpec = new SecretKeySpec(key, "ChaCha20");
        cipher.init(mode, keySpec, new IvParameterSpec(nonce));
        if (aad != null && aad.length > 0) cipher.updateAAD(aad);
        return cipher;
    }

    static byte[] aeadEncrypt(byte[] key, byte[] nonce, byte[] aad, byte[] plaintext) {
        try {
            Cipher cipher = chacha(key, nonce, Cipher.ENCRYPT_MODE, aad);
            return cipher.doFinal(plaintext);
        } catch (Exception e) {
            throw new IllegalStateException("aeadEncrypt: " + e.getMessage(), e);
        }
    }

    static byte[] aeadDecrypt(byte[] key, byte[] nonce, byte[] aad, byte[] ciphertext) {
        try {
            Cipher cipher = chacha(key, nonce, Cipher.DECRYPT_MODE, aad);
            return cipher.doFinal(ciphertext);
        } catch (Exception e) {
            return null; // тег не сошёлся
        }
    }

    // ---------------- идентификаторы (зеркало C++) ----------------

    /** Как в C++: lower-case, сортировка, "\n", SHA-256, первые 4 байта hex. */
    static String chatUid(String emailA, String emailB) {
        if (emailA == null || emailB == null) throw new IllegalStateException("chatUid: пустой адрес");
        String a = lower(emailA);
        String b = lower(emailB);
        String canon = a.compareTo(b) <= 0 ? a + "\n" + b : b + "\n" + a;
        byte[] digest = sha256(canon.getBytes(StandardCharsets.UTF_8));
        StringBuilder hex = new StringBuilder(8);
        for (int i = 0; i < 4; i++) {
            hex.append(Character.forDigit((digest[i] >> 4) & 0xf, 16));
            hex.append(Character.forDigit(digest[i] & 0xf, 16));
        }
        return hex.toString();
    }

    private static String lower(String s) {
        StringBuilder sb = new StringBuilder(Math.min(s.length(), 319));
        for (int i = 0; i < s.length() && i < 319; i++) {
            char c = s.charAt(i);
            sb.append(c >= 'A' && c <= 'Z' ? (char) (c + 32) : c);
        }
        return sb.toString();
    }

    /** Как в C++: memcmp по беззнаковым байтам, метка MailGram/v1/safety, 12 групп по 5 цифр. */
    static String safetyNumber(byte[] pubA, byte[] pubB) {
        byte[] a = pubA == null ? new byte[0] : pubA;
        byte[] b = pubB == null ? new byte[0] : pubB;
        int min = Math.min(a.length, b.length);
        int cmp = 0;
        for (int i = 0; i < min; i++) {
            int ua = a[i] & 0xFF;
            int ub = b[i] & 0xFF;
            if (ua != ub) {
                cmp = ua < ub ? -1 : 1;
                break;
            }
        }
        if (cmp == 0 && a.length != b.length) cmp = a.length < b.length ? -1 : 1;
        byte[] first = cmp <= 0 ? a : b;
        byte[] second = cmp <= 0 ? b : a;
        byte[] label = "MailGram/v1/safety".getBytes(StandardCharsets.US_ASCII);
        int firstLen = Math.min(first.length, 200);
        int secondLen = Math.min(second.length, 200);
        byte[] buf = new byte[label.length + firstLen + secondLen];
        System.arraycopy(label, 0, buf, 0, label.length);
        System.arraycopy(first, 0, buf, label.length, firstLen);
        System.arraycopy(second, 0, buf, label.length + firstLen, secondLen);
        byte[] digest = sha256(buf);
        StringBuilder out = new StringBuilder(12 * 6);
        for (int i = 0; i < 12; i++) {
            int v = (((digest[2 * i] & 0xFF) << 8) | (digest[2 * i + 1] & 0xFF)) % 100000;
            if (i > 0) out.append(' ');
            out.append(String.format(Locale.US, "%05d", v));
        }
        return out.toString();
    }

    // ---------------- самотест ----------------

    static String selfTest() {
        int failures = 0;
        StringBuilder report = new StringBuilder();
        byte[] abc = sha256("abc".getBytes(StandardCharsets.US_ASCII));
        String abcHex = B64.hex(abc);
        boolean shaOk = abcHex.equals("ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad");
        report.append("sha256(abc): ").append(shaOk ? "OK" : "FAIL " + abcHex).append('\n');
        if (!shaOk) failures++;

        byte[] hk = hkdf(new byte[32], "salt".getBytes(StandardCharsets.US_ASCII),
                "info".getBytes(StandardCharsets.US_ASCII), 42);
        boolean hkOk = hk.length == 42;
        report.append("hkdf len: ").append(hkOk ? "OK" : "FAIL").append('\n');
        if (!hkOk) failures++;

        byte[] key = random(32);
        byte[] nonce = random(12);
        byte[] aad = "aad".getBytes(StandardCharsets.US_ASCII);
        byte[] ct = aeadEncrypt(key, nonce, aad, "привет".getBytes(StandardCharsets.UTF_8));
        byte[] pt = aeadDecrypt(key, nonce, aad, ct);
        boolean aeadOk = pt != null && new String(pt, StandardCharsets.UTF_8).equals("привет");
        report.append("aead roundtrip: ").append(aeadOk ? "OK" : "FAIL").append('\n');
        if (!aeadOk) failures++;
        byte[] bad = aeadDecrypt(key, nonce, aad, ct.clone());
        // клон с битым тегом
        if (ct.length > 0) {
            byte[] tampered = ct.clone();
            tampered[ct.length - 1] ^= 1;
            bad = aeadDecrypt(key, nonce, aad, tampered);
        }
        boolean tagOk = bad == null;
        report.append("aead tag reject: ").append(tagOk ? "OK" : "FAIL").append('\n');
        if (!tagOk) failures++;

        return version() + "|" + failures + "|" + report;
    }
}
