// Хостовый самотест крипто-ядра MailGram (собирается на CI обычным g++ и запускается).
// Доказывает, что реализация C++ соответствует тест-векторам RFC 8439 / RFC 5869 / RFC 4231 / FIPS 180-4.
// Сборка: g++ -std=c++17 -O2 -o crypto_selftest tools/crypto_selftest.cpp app/src/main/cpp/mailgram_crypto.cpp
#include "../app/src/main/cpp/mailgram_crypto.h"

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

static void hex(const uint8_t *p, size_t n, char *out) {
    static const char *d = "0123456789abcdef";
    for (size_t i = 0; i < n; i++) {
        out[2 * i] = d[p[i] >> 4];
        out[2 * i + 1] = d[p[i] & 0xf];
    }
    out[2 * n] = 0;
}

int main(void) {
    char report[4096];
    int failures = mg_selftest(report, sizeof(report));

    printf("MailGram crypto core: %s\n", mg_version());
    printf("----------------------------------------\n");
    printf("%s", report);
    printf("----------------------------------------\n");

    // Дополнительно: end-to-end сценарий как в приложении
    // (ECDH-секрет приходит из Android Keystore; здесь эмулируем фиксированным значением)
    uint8_t shared[32];
    for (int i = 0; i < 32; i++) shared[i] = (uint8_t)(0xA0 + i);
    const char *salt = "MailGram/v1/salt";
    const char *info = "MailGram/v1|chat=9f2c1ab4";

    uint8_t key[32];
    mg_hkdf_sha256(shared, 32, (const uint8_t *)salt, strlen(salt),
                   (const uint8_t *)info, strlen(info), key, 32);
    char kh[65];
    hex(key, 32, kh);
    printf("session key (HKDF) = %s\n", kh);

    const char *plaintext = "{\"t\":\"text\",\"b\":\"Привет, мир! 🌍\"}";
    uint8_t nonce[12];
    if (!mg_random(nonce, sizeof(nonce))) { printf("FAIL: нет энтропии\n"); return 1; }
    const char *aad = "MailGram|1|3f8a1c02-6b1e-4b1a-9a11-0d0c7a51f9e2|1760000000000|me@gmail.com|friend@gmail.com|9f2c1ab4";

    uint8_t ct[512];
    int ok = mg_aead_encrypt(key, nonce, (const uint8_t *)aad, strlen(aad),
                             (const uint8_t *)plaintext, strlen(plaintext), ct);
    if (!ok) { printf("FAIL: encrypt\n"); return 1; }

    uint8_t back[512];
    ok = mg_aead_decrypt(key, nonce, (const uint8_t *)aad, strlen(aad),
                         ct, strlen(plaintext) + MG_TAG_LEN, back);
    back[strlen(plaintext)] = 0;
    printf("round-trip (utf-8) = %s\n", (char *)back);
    if (!ok || memcmp(back, plaintext, strlen(plaintext)) != 0) {
        printf("FAIL: round-trip\n");
        failures++;
    }

    // Другая пара ключей не должна расшифровать
    uint8_t otherKey[32];
    memset(otherKey, 0x5a, 32);
    if (mg_aead_decrypt(otherKey, nonce, (const uint8_t *)aad, strlen(aad),
                        ct, strlen(plaintext) + MG_TAG_LEN, back) == 0) {
        printf("OK: чужой ключ отвергнут\n");
    } else {
        printf("FAIL: чужой ключ принят!\n");
        failures++;
    }

    // Большой блок (10 МБ не нужен, но проверим 1 МБ — потоковая обработка ChaCha20)
    size_t big = 1u << 20;
    uint8_t *buf = (uint8_t *)malloc(big);
    uint8_t *enc = (uint8_t *)malloc(big + MG_TAG_LEN);
    uint8_t *dec = (uint8_t *)malloc(big);
    if (!buf || !enc || !dec) { printf("FAIL: нет памяти\n"); return 1; }
    mg_random(buf, big);
    uint8_t n2[12];
    mg_random(n2, sizeof(n2));
    if (mg_aead_encrypt(key, n2, NULL, 0, buf, big, enc) &&
        mg_aead_decrypt(key, n2, NULL, 0, enc, big + MG_TAG_LEN, dec) &&
        memcmp(buf, dec, big) == 0) {
        printf("OK: 1 МБ AEAD (произвольные данные)\n");
    } else {
        printf("FAIL: 1 МБ AEAD\n");
        failures++;
    }
    free(buf); free(enc); free(dec);

    printf("----------------------------------------\n");
    if (failures == 0) {
        printf("ИТОГ: все проверки пройдены ✅\n");
        return 0;
    }
    printf("ИТОГ: ошибок — %d ❌\n", failures);
    return 1;
}
