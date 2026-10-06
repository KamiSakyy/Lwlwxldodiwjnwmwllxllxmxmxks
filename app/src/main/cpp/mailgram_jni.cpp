// JNI-мост: com.mailgram.app.crypto.NativeCrypto  ->  C++ ядро (mailgram_crypto.cpp)
#include <jni.h>
#include <string.h>
#include <stdio.h>
#include <stdlib.h>

#include "mailgram_crypto.h"

#ifdef __ANDROID__
#include <android/log.h>
#define MGLOG(...) __android_log_print(ANDROID_LOG_INFO, "MailGramNative", __VA_ARGS__)
#else
#define MGLOG(...) ((void)0)
#endif

namespace {

const char *kHex = "0123456789abcdef";

struct Bytes {
    uint8_t *data;
    jsize len;
};

bool getBytes(JNIEnv *env, jbyteArray arr, Bytes *out) {
    out->data = NULL;
    out->len = 0;
    if (arr == NULL) return false;
    out->len = env->GetArrayLength(arr);
    if (out->len > 0) {
        out->data = (uint8_t *)malloc((size_t)out->len);
        if (!out->data) return false;
        env->GetByteArrayRegion(arr, 0, out->len, (jbyte *)out->data);
    }
    return true;
}

void freeBytes(Bytes *b) {
    if (b->data) {
        mg_wipe(b->data, (size_t)b->len);
        free(b->data);
        b->data = NULL;
        b->len = 0;
    }
}

bool getRaw(JNIEnv *env, jbyteArray arr, const uint8_t **ptr, jsize *len, uint8_t **owned) {
    *ptr = NULL;
    *len = 0;
    *owned = NULL;
    if (arr == NULL) return false;
    *len = env->GetArrayLength(arr);
    if (*len == 0) return true;
    *owned = (uint8_t *)malloc((size_t)*len);
    if (!*owned) return false;
    env->GetByteArrayRegion(arr, 0, *len, (jbyte *)*owned);
    *ptr = *owned;
    return true;
}

void throwIllegal(JNIEnv *env, const char *msg) {
    jclass cls = env->FindClass("java/lang/IllegalStateException");
    if (cls) env->ThrowNew(cls, msg);
}

jbyteArray toByteArray(JNIEnv *env, const uint8_t *data, size_t len) {
    jbyteArray out = env->NewByteArray((jsize)len);
    if (!out) return NULL;
    if (len > 0) env->SetByteArrayRegion(out, 0, (jsize)len, (const jbyte *)data);
    return out;
}

} // namespace

extern "C" {

JNIEXPORT jbyteArray JNICALL
Java_com_mailgram_app_crypto_NativeCrypto_random(JNIEnv *env, jclass, jint n) {
    if (n <= 0 || n > (1 << 20)) {
        throwIllegal(env, "random: неверный размер");
        return NULL;
    }
    uint8_t *buf = (uint8_t *)malloc((size_t)n);
    if (!buf) {
        throwIllegal(env, "random: нет памяти");
        return NULL;
    }
    if (!mg_random(buf, (size_t)n)) {
        free(buf);
        throwIllegal(env, "random: не удалось получить энтропию");
        return NULL;
    }
    jbyteArray out = toByteArray(env, buf, (size_t)n);
    mg_wipe(buf, (size_t)n);
    free(buf);
    return out;
}

JNIEXPORT jbyteArray JNICALL
Java_com_mailgram_app_crypto_NativeCrypto_sha256(JNIEnv *env, jclass, jbyteArray data) {
    const uint8_t *ptr;
    jsize len;
    uint8_t *owned;
    if (!getRaw(env, data, &ptr, &len, &owned)) {
        const uint8_t empty = 0;
        ptr = &empty;
        len = 0;
    }
    uint8_t out[32];
    mg_sha256(ptr, (size_t)len, out);
    if (owned) { mg_wipe(owned, (size_t)len); free(owned); }
    return toByteArray(env, out, 32);
}

JNIEXPORT jbyteArray JNICALL
Java_com_mailgram_app_crypto_NativeCrypto_hkdfSha256(JNIEnv *env, jclass,
                                                     jbyteArray ikm, jbyteArray salt,
                                                     jbyteArray info, jint outLen) {
    if (outLen <= 0 || outLen > 4096) {
        throwIllegal(env, "hkdf: неверная длина вывода");
        return NULL;
    }
    Bytes bIkm, bSalt, bInfo;
    if (!getBytes(env, ikm, &bIkm) || !getBytes(env, salt, &bSalt) || !getBytes(env, info, &bInfo)) {
        throwIllegal(env, "hkdf: нет памяти");
        freeBytes(&bIkm); freeBytes(&bSalt); freeBytes(&bInfo);
        return NULL;
    }
    uint8_t *out = (uint8_t *)malloc((size_t)outLen);
    if (!out) {
        throwIllegal(env, "hkdf: нет памяти");
        freeBytes(&bIkm); freeBytes(&bSalt); freeBytes(&bInfo);
        return NULL;
    }
    mg_hkdf_sha256(bIkm.data, (size_t)bIkm.len, bSalt.data, (size_t)bSalt.len,
                   bInfo.data, (size_t)bInfo.len, out, (size_t)outLen);
    jbyteArray res = toByteArray(env, out, (size_t)outLen);
    mg_wipe(out, (size_t)outLen);
    free(out);
    freeBytes(&bIkm); freeBytes(&bSalt); freeBytes(&bInfo);
    return res;
}

JNIEXPORT jbyteArray JNICALL
Java_com_mailgram_app_crypto_NativeCrypto_aeadEncrypt(JNIEnv *env, jclass,
                                                      jbyteArray key, jbyteArray nonce,
                                                      jbyteArray aad, jbyteArray plaintext) {
    Bytes bKey, bNonce, bAad, bPt;
    if (!getBytes(env, key, &bKey)) {
        throwIllegal(env, "aead: нет ключа");
        return NULL;
    }
    if (!getBytes(env, nonce, &bNonce) || !getBytes(env, aad, &bAad) || !getBytes(env, plaintext, &bPt)) {
        throwIllegal(env, "aead: нет памяти");
        freeBytes(&bKey); freeBytes(&bNonce); freeBytes(&bAad); freeBytes(&bPt);
        return NULL;
    }
    if (bKey.len != MG_KEY_LEN || bNonce.len != MG_NONCE_LEN) {
        throwIllegal(env, "aead: ключ должен быть 32 байта, nonce — 12 байт");
        freeBytes(&bKey); freeBytes(&bNonce); freeBytes(&bAad); freeBytes(&bPt);
        return NULL;
    }
    size_t outLen = (size_t)bPt.len + MG_TAG_LEN;
    uint8_t *out = (uint8_t *)malloc(outLen);
    if (!out) {
        throwIllegal(env, "aead: нет памяти");
        freeBytes(&bKey); freeBytes(&bNonce); freeBytes(&bAad); freeBytes(&bPt);
        return NULL;
    }
    int ok = mg_aead_encrypt(bKey.data, bNonce.data, bAad.data, (size_t)bAad.len,
                            bPt.data, (size_t)bPt.len, out);
    if (!ok) {
        free(out);
        freeBytes(&bKey); freeBytes(&bNonce); freeBytes(&bAad); freeBytes(&bPt);
        throwIllegal(env, "aead: ошибка шифрования");
        return NULL;
    }
    jbyteArray res = toByteArray(env, out, outLen);
    mg_wipe(out, outLen);
    free(out);
    freeBytes(&bKey); freeBytes(&bNonce); freeBytes(&bAad); freeBytes(&bPt);
    return res;
}

JNIEXPORT jbyteArray JNICALL
Java_com_mailgram_app_crypto_NativeCrypto_aeadDecrypt(JNIEnv *env, jclass,
                                                      jbyteArray key, jbyteArray nonce,
                                                      jbyteArray aad, jbyteArray ciphertext) {
    Bytes bKey, bNonce, bAad, bCt;
    if (!getBytes(env, key, &bKey) || !getBytes(env, nonce, &bNonce) ||
        !getBytes(env, aad, &bAad) || !getBytes(env, ciphertext, &bCt)) {
        throwIllegal(env, "aead: нет памяти");
        freeBytes(&bKey); freeBytes(&bNonce); freeBytes(&bAad); freeBytes(&bCt);
        return NULL;
    }
    if (bKey.len != MG_KEY_LEN || bNonce.len != MG_NONCE_LEN) {
        freeBytes(&bKey); freeBytes(&bNonce); freeBytes(&bAad); freeBytes(&bCt);
        throwIllegal(env, "aead: ключ должен быть 32 байта, nonce — 12 байт");
        return NULL;
    }
    if (bCt.len < MG_TAG_LEN) {
        freeBytes(&bKey); freeBytes(&bNonce); freeBytes(&bAad); freeBytes(&bCt);
        return NULL; // слишком короткое — считаем подделкой
    }
    size_t ptLen = (size_t)bCt.len - MG_TAG_LEN;
    uint8_t *out = (uint8_t *)malloc(ptLen > 0 ? ptLen : 1);
    if (!out) {
        freeBytes(&bKey); freeBytes(&bNonce); freeBytes(&bAad); freeBytes(&bCt);
        throwIllegal(env, "aead: нет памяти");
        return NULL;
    }
    int ok = mg_aead_decrypt(bKey.data, bNonce.data, bAad.data, (size_t)bAad.len,
                             bCt.data, (size_t)bCt.len, out);
    jbyteArray res = NULL;
    if (ok) res = toByteArray(env, out, ptLen);
    mg_wipe(out, ptLen);
    free(out);
    freeBytes(&bKey); freeBytes(&bNonce); freeBytes(&bAad); freeBytes(&bCt);
    return res; // NULL = тег не сошёлся (сообщение подделано или чужая пара ключей)
}

JNIEXPORT jbyteArray JNICALL
Java_com_mailgram_app_crypto_NativeCrypto_sha256Utf8(JNIEnv *env, jclass, jstring text) {
    if (text == NULL) {
        uint8_t out[32];
        mg_sha256(NULL, 0, out);
        return toByteArray(env, out, 32);
    }
    const char *utf = env->GetStringUTFChars(text, NULL);
    if (!utf) return NULL;
    uint8_t out[32];
    mg_sha256((const uint8_t *)utf, strlen(utf), out);
    env->ReleaseStringUTFChars(text, utf);
    return toByteArray(env, out, 32);
}

// Идентификатор чата: SHA-256(min(emailA,emailB) "\n" max(...)) -> 8 hex-символов.
// Одинаков у обоих участников и не зависит от порядка.
JNIEXPORT jstring JNICALL
Java_com_mailgram_app_crypto_NativeCrypto_chatUid(JNIEnv *env, jclass, jstring emailA, jstring emailB) {
    if (emailA == NULL || emailB == NULL) {
        throwIllegal(env, "chatUid: пустой адрес");
        return NULL;
    }
    const char *a = env->GetStringUTFChars(emailA, NULL);
    const char *b = env->GetStringUTFChars(emailB, NULL);
    if (!a || !b) {
        if (a) env->ReleaseStringUTFChars(emailA, a);
        if (b) env->ReleaseStringUTFChars(emailB, b);
        return NULL;
    }
    char ca[320], cb[320];
    size_t la = strlen(a), lb = strlen(b);
    if (la >= sizeof(ca)) la = sizeof(ca) - 1;
    if (lb >= sizeof(cb)) lb = sizeof(cb) - 1;
    for (size_t i = 0; i < la; i++) ca[i] = (char)((a[i] >= 'A' && a[i] <= 'Z') ? a[i] + 32 : a[i]);
    ca[la] = 0;
    for (size_t i = 0; i < lb; i++) cb[i] = (char)((b[i] >= 'A' && b[i] <= 'Z') ? b[i] + 32 : b[i]);
    cb[lb] = 0;

    char canon[700];
    int n = (strcmp(ca, cb) <= 0) ? snprintf(canon, sizeof(canon), "%s\n%s", ca, cb)
                                   : snprintf(canon, sizeof(canon), "%s\n%s", cb, ca);
    uint8_t digest[32];
    mg_sha256((const uint8_t *)canon, (size_t)n, digest);

    char hex[9];
    for (int i = 0; i < 4; i++) {
        hex[2 * i] = kHex[digest[i] >> 4];
        hex[2 * i + 1] = kHex[digest[i] & 0xf];
    }
    hex[8] = 0;

    env->ReleaseStringUTFChars(emailA, a);
    env->ReleaseStringUTFChars(emailB, b);
    return env->NewStringUTF(hex);
}

// «Отпечаток безопасности» — 12 групп по 5 цифр из SHA-256 над парой открытых ключей.
JNIEXPORT jstring JNICALL
Java_com_mailgram_app_crypto_NativeCrypto_safetyNumber(JNIEnv *env, jclass, jbyteArray pubA, jbyteArray pubB) {
    Bytes bA, bB;
    if (!getBytes(env, pubA, &bA) || !getBytes(env, pubB, &bB)) {
        throwIllegal(env, "safetyNumber: нет памяти");
        freeBytes(&bA); freeBytes(&bB);
        return NULL;
    }
    uint8_t label[] = {'M', 'a', 'i', 'l', 'G', 'r', 'a', 'm', '/', 'v', '1', '/', 's', 'a', 'f', 'e', 't', 'y'};
    // упорядочиваем ключи, чтобы число было одинаковым у обоих
    int aFirst = 1;
    size_t minLen = (size_t)(bA.len < bB.len ? bA.len : bB.len);
    int cmp = memcmp(bA.data, bB.data, minLen);
    if (cmp > 0) aFirst = 0;
    else if (cmp == 0 && bA.len > bB.len) aFirst = 0;

    uint8_t buf[18 + 2 * 200];
    size_t off = 0;
    memcpy(buf, label, sizeof(label));
    off += sizeof(label);
    const uint8_t *first = aFirst ? bA.data : bB.data;
    size_t firstLen = (size_t)(aFirst ? bA.len : bB.len);
    const uint8_t *second = aFirst ? bB.data : bA.data;
    size_t secondLen = (size_t)(aFirst ? bB.len : bA.len);
    if (firstLen > 200) firstLen = 200;
    if (secondLen > 200) secondLen = 200;
    memcpy(buf + off, first, firstLen); off += firstLen;
    memcpy(buf + off, second, secondLen); off += secondLen;

    uint8_t digest[32];
    mg_sha256(buf, off, digest);

    char out[12 * 6 + 1];
    size_t pos = 0;
    for (int i = 0; i < 12; i++) {
        uint32_t v = ((uint32_t)digest[2 * i] << 8 | (uint32_t)digest[2 * i + 1]) % 100000u;
        pos += (size_t)snprintf(out + pos, sizeof(out) - pos, i == 0 ? "%05u" : " %05u", v);
    }
    out[pos] = 0;
    freeBytes(&bA); freeBytes(&bB);
    return env->NewStringUTF(out);
}

JNIEXPORT jstring JNICALL
Java_com_mailgram_app_crypto_NativeCrypto_selfTest(JNIEnv *env, jclass) {
    char report[4096];
    int failures = mg_selftest(report, sizeof(report));
    char head[128];
    snprintf(head, sizeof(head), "%s|%d|", mg_version(), failures);
    size_t hl = strlen(head);
    char *full = (char *)malloc(hl + strlen(report) + 1);
    if (!full) return env->NewStringUTF("нет памяти");
    memcpy(full, head, hl);
    strcpy(full + hl, report);
    jstring res = env->NewStringUTF(full);
    free(full);
    return res;
}

JNIEXPORT jstring JNICALL
Java_com_mailgram_app_crypto_NativeCrypto_version(JNIEnv *env, jclass) {
    return env->NewStringUTF(mg_version());
}

} // extern "C"
