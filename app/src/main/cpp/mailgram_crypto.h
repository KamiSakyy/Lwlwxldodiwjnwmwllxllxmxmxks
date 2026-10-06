// MailGram — C++ core: SHA-256, HMAC, HKDF, ChaCha20-Poly1305 (RFC 8439), CSPRNG.
// Всё написано вручную, без внешних зависимостей: одна .so ~ на 100% "своя" крипто-логика.
// Проверяется тест-векторами RFC на хосте (tools/crypto_selftest.cpp) и внутри приложения (selfTest()).
#ifndef MAILGRAM_CRYPTO_H
#define MAILGRAM_CRYPTO_H

#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

#define MG_KEY_LEN   32
#define MG_NONCE_LEN 12
#define MG_TAG_LEN   16

/* SHA-256 (FIPS 180-4) */
void mg_sha256(const uint8_t *data, size_t len, uint8_t out[32]);

/* HMAC-SHA256 (RFC 2104) */
void mg_hmac_sha256(const uint8_t *key, size_t keylen,
                    const uint8_t *msg, size_t msglen,
                    uint8_t out[32]);

/* HKDF-SHA256 (RFC 5869) */
void mg_hkdf_sha256(const uint8_t *ikm, size_t ikmlen,
                    const uint8_t *salt, size_t saltlen,
                    const uint8_t *info, size_t infolen,
                    uint8_t *out, size_t outlen);

/* ChaCha20-Poly1305 AEAD (RFC 8439 §2.8).
   Шифрует pt (ptlen байт) в ct (ptlen + 16 байт: шифротекст || тег).
   Возвращает 1 при успехе, 0 при ошибке аргументов. */
int mg_aead_encrypt(const uint8_t key[MG_KEY_LEN], const uint8_t nonce[MG_NONCE_LEN],
                    const uint8_t *aad, size_t aadlen,
                    const uint8_t *pt, size_t ptlen,
                    uint8_t *ct);

/* Расшифровка + проверка тега. ctlen = ptlen + 16.
   Возвращает 1 при успехе, 0 если тег не сошёлся (данные подделаны/повреждены). */
int mg_aead_decrypt(const uint8_t key[MG_KEY_LEN], const uint8_t nonce[MG_NONCE_LEN],
                    const uint8_t *aad, size_t aadlen,
                    const uint8_t *ct, size_t ctlen,
                    uint8_t *pt);

/* Крипто-стойкий генератор случайных чисел (getrandom / /dev/urandom).
   Возвращает 1 при успехе, 0 если энтропию получить не удалось. */
int mg_random(uint8_t *buf, size_t len);

/* Самопроверка на тест-векторах RFC. Пишет отчёт в report (UTF-8),
   возвращает 0 если всё сошлось, иначе 1. */
int mg_selftest(char *report, size_t reportlen);

/* Версия ядра, напр. "mailgram-core/1.0.0" */
const char *mg_version(void);

/* Затирание секретов в памяти */
void mg_wipe(void *p, size_t len);

#ifdef __cplusplus
}
#endif

#endif /* MAILGRAM_CRYPTO_H */
