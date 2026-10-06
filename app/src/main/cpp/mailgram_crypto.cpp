// MailGram C++ core implementation.
// SHA-256 / HMAC-SHA256 / HKDF-SHA256 / ChaCha20 / Poly1305 / AEAD — без внешних библиотек.
#include "mailgram_crypto.h"

#include <string.h>
#include <stdio.h>
#include <errno.h>
#include <stdlib.h>
#include <time.h>

#if defined(__linux__) || defined(__ANDROID__)
#include <fcntl.h>
#include <unistd.h>
#include <sys/random.h>
#endif

namespace {

// ============================ утилиты ============================

inline uint32_t rotr32(uint32_t x, int n) { return (x >> n) | (x << (32 - n)); }
inline uint32_t rotl32(uint32_t x, int n) { return (x << n) | (x >> (32 - n)); }

inline uint32_t load32_le(const uint8_t *p) {
    return (uint32_t)p[0] | ((uint32_t)p[1] << 8) | ((uint32_t)p[2] << 16) | ((uint32_t)p[3] << 24);
}
inline void store32_le(uint8_t *p, uint32_t v) {
    p[0] = (uint8_t)(v);
    p[1] = (uint8_t)(v >> 8);
    p[2] = (uint8_t)(v >> 16);
    p[3] = (uint8_t)(v >> 24);
}
inline uint32_t load32_be(const uint8_t *p) {
    return ((uint32_t)p[0] << 24) | ((uint32_t)p[1] << 16) | ((uint32_t)p[2] << 8) | (uint32_t)p[3];
}
inline void store32_be(uint8_t *p, uint32_t v) {
    p[0] = (uint8_t)(v >> 24);
    p[1] = (uint8_t)(v >> 16);
    p[2] = (uint8_t)(v >> 8);
    p[3] = (uint8_t)(v);
}

void store64_be(uint8_t *p, uint64_t v) {
    for (int i = 0; i < 8; i++) p[i] = (uint8_t)(v >> (56 - 8 * i));
}

void store64_le(uint8_t *p, uint64_t v) {
    for (int i = 0; i < 8; i++) p[i] = (uint8_t)(v >> (8 * i));
}

// ============================ SHA-256 ============================

const uint32_t K256[64] = {
    0x428a2f98u, 0x71374491u, 0xb5c0fbcfu, 0xe9b5dba5u, 0x3956c25bu, 0x59f111f1u, 0x923f82a4u, 0xab1c5ed5u,
    0xd807aa98u, 0x12835b01u, 0x243185beu, 0x550c7dc3u, 0x72be5d74u, 0x80deb1feu, 0x9bdc06a7u, 0xc19bf174u,
    0xe49b69c1u, 0xefbe4786u, 0x0fc19dc6u, 0x240ca1ccu, 0x2de92c6fu, 0x4a7484aau, 0x5cb0a9dcu, 0x76f988dau,
    0x983e5152u, 0xa831c66du, 0xb00327c8u, 0xbf597fc7u, 0xc6e00bf3u, 0xd5a79147u, 0x06ca6351u, 0x14292967u,
    0x27b70a85u, 0x2e1b2138u, 0x4d2c6dfcu, 0x53380d13u, 0x650a7354u, 0x766a0abbu, 0x81c2c92eu, 0x92722c85u,
    0xa2bfe8a1u, 0xa81a664bu, 0xc24b8b70u, 0xc76c51a3u, 0xd192e819u, 0xd6990624u, 0xf40e3585u, 0x106aa070u,
    0x19a4c116u, 0x1e376c08u, 0x2748774cu, 0x34b0bcb5u, 0x391c0cb3u, 0x4ed8aa4au, 0x5b9cca4fu, 0x682e6ff3u,
    0x748f82eeu, 0x78a5636fu, 0x84c87814u, 0x8cc70208u, 0x90befffau, 0xa4506cebu, 0xbef9a3f7u, 0xc67178f2u};

void sha256_compress(uint32_t st[8], const uint8_t block[64]) {
    uint32_t w[64];
    for (int i = 0; i < 16; i++) w[i] = load32_be(block + 4 * i);
    for (int i = 16; i < 64; i++) {
        uint32_t s0 = rotr32(w[i - 15], 7) ^ rotr32(w[i - 15], 18) ^ (w[i - 15] >> 3);
        uint32_t s1 = rotr32(w[i - 2], 17) ^ rotr32(w[i - 2], 19) ^ (w[i - 2] >> 10);
        w[i] = w[i - 16] + s0 + w[i - 7] + s1;
    }
    uint32_t a = st[0], b = st[1], c = st[2], d = st[3], e = st[4], f = st[5], g = st[6], h = st[7];
    for (int i = 0; i < 64; i++) {
        uint32_t S1 = rotr32(e, 6) ^ rotr32(e, 11) ^ rotr32(e, 25);
        uint32_t ch = (e & f) ^ ((~e) & g);
        uint32_t t1 = h + S1 + ch + K256[i] + w[i];
        uint32_t S0 = rotr32(a, 2) ^ rotr32(a, 13) ^ rotr32(a, 22);
        uint32_t maj = (a & b) ^ (a & c) ^ (b & c);
        uint32_t t2 = S0 + maj;
        h = g; g = f; f = e; e = d + t1; d = c; c = b; b = a; a = t1 + t2;
    }
    st[0] += a; st[1] += b; st[2] += c; st[3] += d;
    st[4] += e; st[5] += f; st[6] += g; st[7] += h;
    mg_wipe(w, sizeof(w));
}

struct Sha256Ctx {
    uint32_t st[8];
    uint64_t bits;
    uint8_t buf[64];
    size_t buflen;
};

void sha256_init(Sha256Ctx *c) {
    c->st[0] = 0x6a09e667u; c->st[1] = 0xbb67ae85u; c->st[2] = 0x3c6ef372u; c->st[3] = 0xa54ff53au;
    c->st[4] = 0x510e527fu; c->st[5] = 0x9b05688cu; c->st[6] = 0x1f83d9abu; c->st[7] = 0x5be0cd19u;
    c->bits = 0; c->buflen = 0;
}

void sha256_update(Sha256Ctx *c, const uint8_t *data, size_t len) {
    c->bits += (uint64_t)len * 8u;
    while (len > 0) {
        size_t take = 64 - c->buflen;
        if (take > len) take = len;
        memcpy(c->buf + c->buflen, data, take);
        c->buflen += take; data += take; len -= take;
        if (c->buflen == 64) { sha256_compress(c->st, c->buf); c->buflen = 0; }
    }
}

void sha256_final(Sha256Ctx *c, uint8_t out[32]) {
    uint64_t bits = c->bits;
    uint8_t pad = 0x80;
    sha256_update(c, &pad, 1);
    c->bits = bits; // padding не должен попадать в счётчик длины
    uint8_t zero = 0x00;
    while (c->buflen != 56) { sha256_update(c, &zero, 1); c->bits = bits; }
    uint8_t lenbuf[8];
    store64_be(lenbuf, bits);
    memcpy(c->buf + 56, lenbuf, 8);
    c->buflen = 64;
    sha256_compress(c->st, c->buf);
    c->buflen = 0;
    for (int i = 0; i < 8; i++) store32_be(out + 4 * i, c->st[i]);
}

// ============================ HMAC-SHA256 ============================

void hmac_sha256(const uint8_t *key, size_t keylen,
                 const uint8_t *msg, size_t msglen, uint8_t out[32]) {
    uint8_t k[64];
    memset(k, 0, sizeof(k));
    if (keylen > 64) {
        mg_sha256(key, keylen, k);
    } else {
        memcpy(k, key, keylen);
    }
    uint8_t ipad[64], opad[64];
    for (int i = 0; i < 64; i++) { ipad[i] = k[i] ^ 0x36; opad[i] = k[i] ^ 0x5c; }

    Sha256Ctx c;
    sha256_init(&c);
    sha256_update(&c, ipad, 64);
    sha256_update(&c, msg, msglen);
    uint8_t inner[32];
    sha256_final(&c, inner);

    sha256_init(&c);
    sha256_update(&c, opad, 64);
    sha256_update(&c, inner, 32);
    sha256_final(&c, out);

    mg_wipe(k, sizeof(k));
    mg_wipe(ipad, sizeof(ipad));
    mg_wipe(opad, sizeof(opad));
    mg_wipe(inner, sizeof(inner));
    mg_wipe(&c, sizeof(c));
}

// ============================ HKDF-SHA256 ============================

void hkdf_sha256(const uint8_t *ikm, size_t ikmlen,
                 const uint8_t *salt, size_t saltlen,
                 const uint8_t *info, size_t infolen,
                 uint8_t *out, size_t outlen) {
    uint8_t zero[32];
    memset(zero, 0, sizeof(zero));
    uint8_t prk[32];
    if (salt == NULL || saltlen == 0) {
        hmac_sha256(zero, 32, ikm, ikmlen, prk);           // HKDF-Extract
    } else {
        hmac_sha256(salt, saltlen, ikm, ikmlen, prk);
    }

    uint8_t t[32];
    size_t tlen = 0, done = 0;
    uint8_t counter = 1;
    while (done < outlen) {
        Sha256Ctx c;
        // HMAC(prk, T(prev) || info || counter)
        uint8_t k[64];
        memset(k, 0, sizeof(k));
        memcpy(k, prk, 32);
        uint8_t ipad[64], opad[64];
        for (int i = 0; i < 64; i++) { ipad[i] = k[i] ^ 0x36; opad[i] = k[i] ^ 0x5c; }
        uint8_t inner[32];
        sha256_init(&c);
        sha256_update(&c, ipad, 64);
        sha256_update(&c, t, tlen);
        sha256_update(&c, info, infolen);
        sha256_update(&c, &counter, 1);
        sha256_final(&c, inner);
        sha256_init(&c);
        sha256_update(&c, opad, 64);
        sha256_update(&c, inner, 32);
        sha256_final(&c, t);
        tlen = 32;

        size_t take = (outlen - done < 32) ? (outlen - done) : 32;
        memcpy(out + done, t, take);
        done += take;
        counter++;
        mg_wipe(k, sizeof(k));
        mg_wipe(ipad, sizeof(ipad));
        mg_wipe(opad, sizeof(opad));
        mg_wipe(inner, sizeof(inner));
        if (counter == 0) break; // защита от переполнения (outlen <= 255*32)
    }
    mg_wipe(prk, sizeof(prk));
    mg_wipe(t, sizeof(t));
    mg_wipe(zero, sizeof(zero));
}

// ============================ ChaCha20 ============================

void chacha20_block(const uint32_t in[16], uint8_t out[64]) {
    uint32_t x[16];
    memcpy(x, in, sizeof(x));
#define QR(a, b, c, d)                     \
    x[a] += x[b]; x[d] = rotl32(x[d] ^ x[a], 16); \
    x[c] += x[d]; x[b] = rotl32(x[b] ^ x[c], 12); \
    x[a] += x[b]; x[d] = rotl32(x[d] ^ x[a], 8);  \
    x[c] += x[d]; x[b] = rotl32(x[b] ^ x[c], 7);
    for (int i = 0; i < 10; i++) {
        QR(0, 4, 8, 12) QR(1, 5, 9, 13) QR(2, 6, 10, 14) QR(3, 7, 11, 15)
        QR(0, 5, 10, 15) QR(1, 6, 11, 12) QR(2, 7, 8, 13) QR(3, 4, 9, 14)
    }
#undef QR
    for (int i = 0; i < 16; i++) store32_le(out + 4 * i, x[i] + in[i]);
    mg_wipe(x, sizeof(x));
}

void chacha20_init(uint32_t st[16], const uint8_t key[32], const uint8_t nonce[12], uint32_t counter) {
    st[0] = 0x61707865u; st[1] = 0x3320646eu; st[2] = 0x79622d32u; st[3] = 0x6b206574u;
    for (int i = 0; i < 8; i++) st[4 + i] = load32_le(key + 4 * i);
    st[12] = counter;
    st[13] = load32_le(nonce);
    st[14] = load32_le(nonce + 4);
    st[15] = load32_le(nonce + 8);
}

void chacha20_xor(uint32_t st[16], const uint8_t *in, uint8_t *out, size_t len) {
    uint8_t ks[64];
    size_t done = 0;
    while (done < len) {
        chacha20_block(st, ks);
        st[12]++;
        size_t take = (len - done < 64) ? (len - done) : 64;
        for (size_t i = 0; i < take; i++) {
            out[done + i] = (in ? in[done + i] : 0) ^ ks[i];
        }
        done += take;
    }
    mg_wipe(ks, sizeof(ks));
}

// ============================ Poly1305 (32-bit, donna-style) ============================

struct Poly1305Ctx {
    uint32_t r[5];
    uint32_t h[5];
    uint32_t pad[4];
    uint8_t buf[16];
    size_t leftover;
};

void poly1305_init(Poly1305Ctx *ctx, const uint8_t key[32]) {
    uint32_t t0 = load32_le(key + 0);
    uint32_t t1 = load32_le(key + 4);
    uint32_t t2 = load32_le(key + 8);
    uint32_t t3 = load32_le(key + 12);

    ctx->r[0] = (t0) & 0x3ffffff;
    ctx->r[1] = ((t0 >> 26) | (t1 << 6)) & 0x3ffff03;
    ctx->r[2] = ((t1 >> 20) | (t2 << 12)) & 0x3ffc0ff;
    ctx->r[3] = ((t2 >> 14) | (t3 << 18)) & 0x3f03fff;
    ctx->r[4] = ((t3 >> 8)) & 0x00fffff;

    ctx->h[0] = ctx->h[1] = ctx->h[2] = ctx->h[3] = ctx->h[4] = 0;

    ctx->pad[0] = load32_le(key + 16);
    ctx->pad[1] = load32_le(key + 20);
    ctx->pad[2] = load32_le(key + 24);
    ctx->pad[3] = load32_le(key + 28);
    ctx->leftover = 0;
}

void poly1305_blocks(Poly1305Ctx *ctx, const uint8_t *m, size_t bytes, uint32_t hibit) {
    uint32_t r0 = ctx->r[0], r1 = ctx->r[1], r2 = ctx->r[2], r3 = ctx->r[3], r4 = ctx->r[4];
    uint32_t h0 = ctx->h[0], h1 = ctx->h[1], h2 = ctx->h[2], h3 = ctx->h[3], h4 = ctx->h[4];
    const uint32_t s1 = r1 * 5, s2 = r2 * 5, s3 = r3 * 5, s4 = r4 * 5;

    while (bytes >= 16) {
        uint32_t t0 = load32_le(m + 0);
        uint32_t t1 = load32_le(m + 4);
        uint32_t t2 = load32_le(m + 8);
        uint32_t t3 = load32_le(m + 12);

        h0 += (t0) & 0x3ffffff;
        h1 += ((t0 >> 26) | (t1 << 6)) & 0x3ffffff;
        h2 += ((t1 >> 20) | (t2 << 12)) & 0x3ffffff;
        h3 += ((t2 >> 14) | (t3 << 18)) & 0x3ffffff;
        h4 += ((t3 >> 8) | hibit);

        uint64_t d0 = (uint64_t)h0 * r0 + (uint64_t)h1 * s4 + (uint64_t)h2 * s3 + (uint64_t)h3 * s2 + (uint64_t)h4 * s1;
        uint64_t d1 = (uint64_t)h0 * r1 + (uint64_t)h1 * r0 + (uint64_t)h2 * s4 + (uint64_t)h3 * s3 + (uint64_t)h4 * s2;
        uint64_t d2 = (uint64_t)h0 * r2 + (uint64_t)h1 * r1 + (uint64_t)h2 * r0 + (uint64_t)h3 * s4 + (uint64_t)h4 * s3;
        uint64_t d3 = (uint64_t)h0 * r3 + (uint64_t)h1 * r2 + (uint64_t)h2 * r1 + (uint64_t)h3 * r0 + (uint64_t)h4 * s4;
        uint64_t d4 = (uint64_t)h0 * r4 + (uint64_t)h1 * r3 + (uint64_t)h2 * r2 + (uint64_t)h3 * r1 + (uint64_t)h4 * r0;

        uint32_t c;
        c = (uint32_t)(d0 >> 26); h0 = (uint32_t)d0 & 0x3ffffff; d1 += c;
        c = (uint32_t)(d1 >> 26); h1 = (uint32_t)d1 & 0x3ffffff; d2 += c;
        c = (uint32_t)(d2 >> 26); h2 = (uint32_t)d2 & 0x3ffffff; d3 += c;
        c = (uint32_t)(d3 >> 26); h3 = (uint32_t)d3 & 0x3ffffff; d4 += c;
        c = (uint32_t)(d4 >> 26); h4 = (uint32_t)d4 & 0x3ffffff; h0 += c * 5;
        c = h0 >> 26; h0 &= 0x3ffffff; h1 += c;

        m += 16;
        bytes -= 16;
    }

    ctx->h[0] = h0; ctx->h[1] = h1; ctx->h[2] = h2; ctx->h[3] = h3; ctx->h[4] = h4;
}

void poly1305_update(Poly1305Ctx *ctx, const uint8_t *m, size_t bytes) {
    if (ctx->leftover) {
        size_t want = 16 - ctx->leftover;
        if (want > bytes) want = bytes;
        memcpy(ctx->buf + ctx->leftover, m, want);
        ctx->leftover += want; m += want; bytes -= want;
        if (ctx->leftover == 16) {
            poly1305_blocks(ctx, ctx->buf, 16, 1u << 24);
            ctx->leftover = 0;
        }
    }
    if (bytes >= 16) {
        size_t whole = bytes - (bytes % 16);
        poly1305_blocks(ctx, m, whole, 1u << 24);
        m += whole; bytes -= whole;
    }
    if (bytes > 0) {
        memcpy(ctx->buf, m, bytes);
        ctx->leftover = bytes;
    }
}

void poly1305_final(Poly1305Ctx *ctx, uint8_t tag[16]) {
    if (ctx->leftover) {
        size_t i = ctx->leftover;
        ctx->buf[i++] = 1;
        for (; i < 16; i++) ctx->buf[i] = 0;
        poly1305_blocks(ctx, ctx->buf, 16, 0);
        ctx->leftover = 0;
    }

    // полная редукция
    uint32_t h0 = ctx->h[0], h1 = ctx->h[1], h2 = ctx->h[2], h3 = ctx->h[3], h4 = ctx->h[4];
    uint32_t c;
    c = h1 >> 26; h1 &= 0x3ffffff; h2 += c;
    c = h2 >> 26; h2 &= 0x3ffffff; h3 += c;
    c = h3 >> 26; h3 &= 0x3ffffff; h4 += c;
    c = h4 >> 26; h4 &= 0x3ffffff; h0 += c * 5;
    c = h0 >> 26; h0 &= 0x3ffffff; h1 += c;

    // проверяем, не нужно ли вычесть p = 2^130-5
    uint32_t g0 = h0 + 5; c = g0 >> 26; g0 &= 0x3ffffff;
    uint32_t g1 = h1 + c; c = g1 >> 26; g1 &= 0x3ffffff;
    uint32_t g2 = h2 + c; c = g2 >> 26; g2 &= 0x3ffffff;
    uint32_t g3 = h3 + c; c = g3 >> 26; g3 &= 0x3ffffff;
    uint32_t g4 = h4 + c - (1u << 26);

    // выбираем g, если старший бит g4 сброшен (g < p)
    uint32_t mask = (g4 >> 31) - 1;
    g0 &= mask; g1 &= mask; g2 &= mask; g3 &= mask; g4 &= mask;
    uint32_t nmask = ~mask;
    h0 = (h0 & nmask) | g0;
    h1 = (h1 & nmask) | g1;
    h2 = (h2 & nmask) | g2;
    h3 = (h3 & nmask) | g3;
    h4 = (h4 & nmask) | g4;

    // h -> 4 x 32 бита (mod 2^128)
    uint32_t w0 = (h0 | (h1 << 26));
    uint32_t w1 = ((h1 >> 6) | (h2 << 20));
    uint32_t w2 = ((h2 >> 12) | (h3 << 14));
    uint32_t w3 = ((h3 >> 18) | (h4 << 8));

    // tag = (h + pad) mod 2^128
    uint64_t f;
    f = (uint64_t)w0 + (uint64_t)ctx->pad[0];                 store32_le(tag + 0, (uint32_t)f);
    f = (uint64_t)w1 + (uint64_t)ctx->pad[1] + (f >> 32);     store32_le(tag + 4, (uint32_t)f);
    f = (uint64_t)w2 + (uint64_t)ctx->pad[2] + (f >> 32);     store32_le(tag + 8, (uint32_t)f);
    f = (uint64_t)w3 + (uint64_t)ctx->pad[3] + (f >> 32);     store32_le(tag + 12, (uint32_t)f);

    mg_wipe(ctx->buf, sizeof(ctx->buf));
    mg_wipe(ctx, sizeof(*ctx));
}

// ============================ AEAD ============================

void poly1305_key_gen(const uint8_t key[32], const uint8_t nonce[12], uint8_t out[32]) {
    uint32_t st[16];
    chacha20_init(st, key, nonce, 0);
    uint8_t block[64];
    chacha20_block(st, block);
    memcpy(out, block, 32);
    mg_wipe(block, sizeof(block));
    mg_wipe(st, sizeof(st));
}

void poly1305_pad16(Poly1305Ctx *ctx, size_t current, uint8_t *zeros16) {
    size_t rem = current % 16;
    if (rem != 0) poly1305_update(ctx, zeros16, 16 - rem);
}

int aead_encrypt_impl(const uint8_t key[32], const uint8_t nonce[12],
                      const uint8_t *aad, size_t aadlen,
                      const uint8_t *pt, size_t ptlen, uint8_t *ct) {
    if (key == NULL || nonce == NULL || ct == NULL) return 0;
    if (pt == NULL && ptlen > 0) return 0;

    uint32_t st[16];
    chacha20_init(st, key, nonce, 1);
    if (ptlen > 0) chacha20_xor(st, pt, ct, ptlen);

    uint8_t polykey[32];
    poly1305_key_gen(key, nonce, polykey);

    Poly1305Ctx pctx;
    poly1305_init(&pctx, polykey);
    uint8_t zeros16[16];
    memset(zeros16, 0, sizeof(zeros16));

    if (aadlen > 0) poly1305_update(&pctx, aad, aadlen);
    poly1305_pad16(&pctx, aadlen, zeros16);
    if (ptlen > 0) poly1305_update(&pctx, ct, ptlen);
    poly1305_pad16(&pctx, ptlen, zeros16);

    uint8_t lens[16];
    memset(lens, 0, sizeof(lens));
    store64_le(lens + 0, (uint64_t)aadlen);
    store64_le(lens + 8, (uint64_t)ptlen);
    poly1305_update(&pctx, lens, 16);

    poly1305_final(&pctx, ct + ptlen);
    mg_wipe(polykey, sizeof(polykey));
    mg_wipe(st, sizeof(st));
    return 1;
}

int aead_decrypt_impl(const uint8_t key[32], const uint8_t nonce[12],
                      const uint8_t *aad, size_t aadlen,
                      const uint8_t *ct, size_t ctlen, uint8_t *pt) {
    if (key == NULL || nonce == NULL || ct == NULL || pt == NULL) return 0;
    if (ctlen < MG_TAG_LEN) return 0;
    size_t ptlen = ctlen - MG_TAG_LEN;

    uint8_t polykey[32];
    poly1305_key_gen(key, nonce, polykey);

    Poly1305Ctx pctx;
    poly1305_init(&pctx, polykey);
    uint8_t zeros16[16];
    memset(zeros16, 0, sizeof(zeros16));

    if (aadlen > 0) poly1305_update(&pctx, aad, aadlen);
    poly1305_pad16(&pctx, aadlen, zeros16);
    if (ptlen > 0) poly1305_update(&pctx, ct, ptlen);
    poly1305_pad16(&pctx, ptlen, zeros16);
    uint8_t lens[16];
    memset(lens, 0, sizeof(lens));
    store64_le(lens + 0, (uint64_t)aadlen);
    store64_le(lens + 8, (uint64_t)ptlen);
    poly1305_update(&pctx, lens, 16);

    uint8_t tag[16];
    poly1305_final(&pctx, tag);

    uint8_t diff = 0;
    for (int i = 0; i < 16; i++) diff |= (uint8_t)(tag[i] ^ ct[ptlen + i]);
    mg_wipe(polykey, sizeof(polykey));
    mg_wipe(tag, sizeof(tag));

    if (diff != 0) return 0; // подделка/повреждение — ничего не расшифровываем

    uint32_t st[16];
    chacha20_init(st, key, nonce, 1);
    if (ptlen > 0) chacha20_xor(st, ct, pt, ptlen);
    mg_wipe(st, sizeof(st));
    return 1;
}

// ============================ CSPRNG ============================

int fill_random(uint8_t *buf, size_t len) {
    if (buf == NULL) return 0;
#if defined(__linux__) || defined(__ANDROID__)
    size_t done = 0;
    while (done < len) {
        ssize_t r = getrandom(buf + done, len - done, 0);
        if (r > 0) { done += (size_t)r; continue; }
        if (r < 0 && (errno == EINTR)) continue;
        break;
    }
    if (done == len) return 1;
    int fd = open("/dev/urandom", O_RDONLY | O_CLOEXEC);
    if (fd >= 0) {
        size_t got = 0;
        while (got < len) {
            ssize_t r = read(fd, buf + got, len - got);
            if (r <= 0) break;
            got += (size_t)r;
        }
        close(fd);
        if (got == len) return 1;
    }
    return 0;
#else
    return 0;
#endif
}

} // namespace

// ============================ публичный C API ============================

extern "C" {

void mg_sha256(const uint8_t *data, size_t len, uint8_t out[32]) {
    Sha256Ctx c;
    sha256_init(&c);
    if (data && len) sha256_update(&c, data, len);
    sha256_final(&c, out);
    mg_wipe(&c, sizeof(c));
}

void mg_hmac_sha256(const uint8_t *key, size_t keylen,
                    const uint8_t *msg, size_t msglen, uint8_t out[32]) {
    hmac_sha256(key, keylen, msg, msglen, out);
}

void mg_hkdf_sha256(const uint8_t *ikm, size_t ikmlen,
                    const uint8_t *salt, size_t saltlen,
                    const uint8_t *info, size_t infolen,
                    uint8_t *out, size_t outlen) {
    hkdf_sha256(ikm, ikmlen, salt, saltlen, info, infolen, out, outlen);
}

int mg_aead_encrypt(const uint8_t key[MG_KEY_LEN], const uint8_t nonce[MG_NONCE_LEN],
                    const uint8_t *aad, size_t aadlen,
                    const uint8_t *pt, size_t ptlen, uint8_t *ct) {
    return aead_encrypt_impl(key, nonce, aad, aadlen, pt, ptlen, ct);
}

int mg_aead_decrypt(const uint8_t key[MG_KEY_LEN], const uint8_t nonce[MG_NONCE_LEN],
                    const uint8_t *aad, size_t aadlen,
                    const uint8_t *ct, size_t ctlen, uint8_t *pt) {
    return aead_decrypt_impl(key, nonce, aad, aadlen, ct, ctlen, pt);
}

int mg_random(uint8_t *buf, size_t len) {
    return fill_random(buf, len);
}

void mg_wipe(void *p, size_t len) {
    if (!p || !len) return;
    volatile uint8_t *v = (volatile uint8_t *)p;
    while (len--) *v++ = 0;
}

const char *mg_version(void) { return "mailgram-core/1.0.0"; }

// ---- самотест на тест-векторах RFC ----

int mg_selftest(char *report, size_t reportlen) {
    int failures = 0;
    char line[256];
    size_t used = 0;
    if (report && reportlen) report[0] = '\0';

#define REPORT(...)                                                    \
    do {                                                               \
        int n = snprintf(line, sizeof(line), __VA_ARGS__);             \
        if (n > 0 && report && used + (size_t)n + 2 < reportlen) {     \
            memcpy(report + used, line, (size_t)n);                    \
            used += (size_t)n;                                         \
            report[used++] = '\n';                                     \
            report[used] = '\0';                                       \
        }                                                              \
    } while (0)

    // 1. SHA-256 (FIPS 180-4)
    {
        const char *msg = "abc";
        uint8_t d[32];
        mg_sha256((const uint8_t *)msg, 3, d);
        const uint8_t exp[32] = {0xba, 0x78, 0x16, 0xbf, 0x8f, 0x01, 0xcf, 0xea,
                                 0x41, 0x41, 0x40, 0xde, 0x5d, 0xae, 0x22, 0x23,
                                 0xb0, 0x03, 0x61, 0xa3, 0x96, 0x17, 0x7a, 0x9c,
                                 0xb4, 0x10, 0xff, 0x61, 0xf2, 0x00, 0x15, 0xad};
        int ok = (memcmp(d, exp, 32) == 0);
        if (!ok) failures++;
        REPORT("[%s] SHA-256(\"abc\")", ok ? "ok" : "FAIL");
    }

    // 2. HMAC-SHA256 (RFC 4231, case 1)
    {
        uint8_t key[20];
        memset(key, 0x0b, sizeof(key));
        const char *msg = "Hi There";
        uint8_t d[32];
        mg_hmac_sha256(key, sizeof(key), (const uint8_t *)msg, strlen(msg), d);
        const uint8_t exp[32] = {0xb0, 0x34, 0x4c, 0x61, 0xd8, 0xdb, 0x38, 0x53,
                                 0x5c, 0xa8, 0xaf, 0xce, 0xaf, 0x0b, 0xf1, 0x2b,
                                 0x88, 0x1d, 0xc2, 0x00, 0xc9, 0x83, 0x3d, 0xa7,
                                 0x26, 0xe9, 0x37, 0x6c, 0x2e, 0x32, 0xcf, 0xf7};
        int ok = (memcmp(d, exp, 32) == 0);
        if (!ok) failures++;
        REPORT("[%s] HMAC-SHA256 (RFC 4231 #1)", ok ? "ok" : "FAIL");
    }

    // 3. HKDF-SHA256 (RFC 5869, test case 1)
    {
        uint8_t ikm[22], salt[13], info[10], okm[42];
        memset(ikm, 0x0b, sizeof(ikm));
        for (int i = 0; i < 13; i++) salt[i] = (uint8_t)i;
        for (int i = 0; i < 10; i++) info[i] = (uint8_t)(0xf0 + i);
        mg_hkdf_sha256(ikm, sizeof(ikm), salt, sizeof(salt), info, sizeof(info), okm, sizeof(okm));
        const uint8_t exp[42] = {0x3c, 0xb2, 0x5f, 0x25, 0xfa, 0xac, 0xd5, 0x7a, 0x90, 0x43, 0x4f,
                                 0x64, 0xd0, 0x36, 0x2f, 0x2a, 0x2d, 0x2d, 0x0a, 0x90, 0xcf, 0x1a,
                                 0x5a, 0x4c, 0x5d, 0xb0, 0x2d, 0x56, 0xec, 0xc4, 0xc5, 0xbf, 0x34,
                                 0x00, 0x72, 0x08, 0xd5, 0xb8, 0x87, 0x18, 0x58, 0x65};
        int ok = (memcmp(okm, exp, 42) == 0);
        if (!ok) failures++;
        REPORT("[%s] HKDF-SHA256 (RFC 5869 #1)", ok ? "ok" : "FAIL");
    }

    // 4. Poly1305 (RFC 8439 §2.5.2)
    {
        const uint8_t key[32] = {0x85, 0xd6, 0xbe, 0x78, 0x57, 0x55, 0x6d, 0x33,
                                 0x7f, 0x44, 0x52, 0xfe, 0x42, 0xd5, 0x06, 0xa8,
                                 0x01, 0x03, 0x80, 0x8a, 0xfb, 0x0d, 0xb2, 0xfd,
                                 0x4a, 0xbf, 0xf6, 0xaf, 0x41, 0x49, 0xf5, 0x1b};
        const char *msg = "Cryptographic Forum Research Group";
        Poly1305Ctx ctx;
        poly1305_init(&ctx, key);
        poly1305_update(&ctx, (const uint8_t *)msg, strlen(msg));
        uint8_t tag[16];
        poly1305_final(&ctx, tag);
        const uint8_t exp[16] = {0xa8, 0x06, 0x1d, 0xc1, 0x30, 0x51, 0x36, 0xc6,
                                 0xc2, 0x2b, 0x8b, 0xaf, 0x0c, 0x01, 0x27, 0xa9};
        int ok = (memcmp(tag, exp, 16) == 0);
        if (!ok) failures++;
        REPORT("[%s] Poly1305 (RFC 8439 2.5.2)", ok ? "ok" : "FAIL");
    }

    // 5. ChaCha20-Poly1305 AEAD (RFC 8439 §2.8.2) — полный тест-вектор
    {
        const uint8_t key[32] = {0x80, 0x81, 0x82, 0x83, 0x84, 0x85, 0x86, 0x87,
                                 0x88, 0x89, 0x8a, 0x8b, 0x8c, 0x8d, 0x8e, 0x8f,
                                 0x90, 0x91, 0x92, 0x93, 0x94, 0x95, 0x96, 0x97,
                                 0x98, 0x99, 0x9a, 0x9b, 0x9c, 0x9d, 0x9e, 0x9f};
        const uint8_t nonce[12] = {0x07, 0x00, 0x00, 0x00, 0x40, 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47};
        const uint8_t aad[12] = {0x50, 0x51, 0x52, 0x53, 0xc0, 0xc1, 0xc2, 0xc3, 0xc4, 0xc5, 0xc6, 0xc7};
        const char *pt = "Ladies and Gentlemen of the class of '99: If I could offer you only one tip "
                         "for the future, sunscreen would be it.";
        uint8_t ct[200];
        int ok = mg_aead_encrypt(key, nonce, aad, sizeof(aad), (const uint8_t *)pt, strlen(pt), ct);
        const uint8_t exp_cipher[114] = {
            0xd3, 0x1a, 0x8d, 0x34, 0x64, 0x8e, 0x60, 0xdb, 0x7b, 0x86, 0xaf, 0xbc, 0x53, 0xef, 0x7e, 0xc2,
            0xa4, 0xad, 0xed, 0x51, 0x29, 0x6e, 0x08, 0xfe, 0xa9, 0xe2, 0xb5, 0xa7, 0x36, 0xee, 0x62, 0xd6,
            0x3d, 0xbe, 0xa4, 0x5e, 0x8c, 0xa9, 0x67, 0x12, 0x82, 0xfa, 0xfb, 0x69, 0xda, 0x92, 0x72, 0x8b,
            0x1a, 0x71, 0xde, 0x0a, 0x9e, 0x06, 0x0b, 0x29, 0x05, 0xd6, 0xa5, 0xb6, 0x7e, 0xcd, 0x3b, 0x36,
            0x92, 0xdd, 0xbd, 0x7f, 0x2d, 0x77, 0x8b, 0x8c, 0x98, 0x03, 0xae, 0xe3, 0x28, 0x09, 0x1b, 0x58,
            0xfa, 0xb3, 0x24, 0xe4, 0xfa, 0xd6, 0x75, 0x94, 0x55, 0x85, 0x80, 0x8b, 0x48, 0x31, 0xd7, 0xbc,
            0x3f, 0xf4, 0xde, 0xf0, 0x8e, 0x4b, 0x7a, 0x9d, 0xe5, 0x76, 0xd2, 0x65, 0x86, 0xce, 0xc6, 0x4b,
            0x61, 0x16};
        const uint8_t exp_tag[16] = {0x1a, 0xe1, 0x0b, 0x59, 0x4f, 0x09, 0xe2, 0x6a,
                                     0x7e, 0x90, 0x2e, 0xcb, 0xd0, 0x60, 0x06, 0x91};
        if (ok && memcmp(ct, exp_cipher, sizeof(exp_cipher)) == 0 &&
            memcmp(ct + sizeof(exp_cipher), exp_tag, 16) == 0) {
            REPORT("[ok] ChaCha20-Poly1305 encrypt (RFC 8439 2.8.2)");
        } else {
            failures++;
            REPORT("[FAIL] ChaCha20-Poly1305 encrypt (RFC 8439 2.8.2)");
        }

        // расшифровка + проверка тега
        uint8_t back[200];
        int d = mg_aead_decrypt(key, nonce, aad, sizeof(aad), ct, strlen(pt) + 16, back);
        if (d && memcmp(back, pt, strlen(pt)) == 0) {
            REPORT("[ok] ChaCha20-Poly1305 decrypt round-trip");
        } else {
            failures++;
            REPORT("[FAIL] ChaCha20-Poly1305 decrypt round-trip");
        }

        // подделка шифротекста должна быть отвергнута
        uint8_t tampered[200];
        memcpy(tampered, ct, strlen(pt) + 16);
        tampered[5] ^= 0x01;
        if (mg_aead_decrypt(key, nonce, aad, sizeof(aad), tampered, strlen(pt) + 16, back) == 0) {
            REPORT("[ok] подделка шифротекста отвергнута");
        } else {
            failures++;
            REPORT("[FAIL] подделка шифротекста НЕ отвергнута");
        }

        // подделка AAD должна быть отвергнута
        uint8_t aad2[12];
        memcpy(aad2, aad, sizeof(aad));
        aad2[0] ^= 0x80;
        if (mg_aead_decrypt(key, nonce, aad2, sizeof(aad2), ct, strlen(pt) + 16, back) == 0) {
            REPORT("[ok] подделка AAD отвергнута");
        } else {
            failures++;
            REPORT("[FAIL] подделка AAD НЕ отвергнута");
        }
    }

    // 6. ChaCha20 keystream (RFC 8439 §2.3.2)
    {
        uint8_t key[32];
        for (int i = 0; i < 32; i++) key[i] = (uint8_t)i;
        const uint8_t nonce[12] = {0x00, 0x00, 0x00, 0x09, 0x00, 0x00, 0x00, 0x4a, 0x00, 0x00, 0x00, 0x00};
        uint32_t st[16];
        chacha20_init(st, key, nonce, 1);
        uint8_t ks[64];
        chacha20_block(st, ks);
        const uint8_t exp[16] = {0x10, 0xf1, 0xe7, 0xe4, 0xd1, 0x3b, 0x59, 0x15,
                                 0x50, 0x0f, 0xdd, 0x1f, 0xa3, 0x20, 0x71, 0xc4};
        int ok = (memcmp(ks, exp, 16) == 0);
        if (!ok) failures++;
        REPORT("[%s] ChaCha20 block (RFC 8439 2.3.2)", ok ? "ok" : "FAIL");
    }

    // 7. энтропия
    {
        uint8_t a[32], b[32];
        int ok = mg_random(a, sizeof(a)) && mg_random(b, sizeof(b)) && memcmp(a, b, 32) != 0;
        if (!ok) failures++;
        REPORT("[%s] CSPRNG (getrandom/urandom)", ok ? "ok" : "FAIL");
    }

#undef REPORT
    return failures;
}

} // extern "C"
