#!/usr/bin/env python3
"""
Симуляция двойного крысиного шага MailGram.

Скрипт повторяет арифметику crypto/Ratchet.java один в один:
    SK       = HKDF-SHA256(DH1‖DH2‖DH3, salt = chatUid, info = "MailGram/DR/x3dh", 32)
    KDF_RK   = HKDF-SHA256(ikm = DH, salt = RK, info = "MailGram/DR/root", 64) → RK′ ‖ CK
    KDF_CK   = CK′ = HKDF(CK, salt = 0…0, info = "MailGram/DR/chain",   32)
               MK  = HKDF(CK, salt = 0…0, info = "MailGram/DR/message", 32)
    AD       = aadPrefix ‖ B64(dh) | pn | n
    AEAD     = ChaCha20-Poly1305 (nonce 12 байт, MK 32 байта)
DH — P-256 (как в Identity.java), MAX_SKIP = 500.

Запуск:   python3 tools/simulate_ratchet.py
Нужен пакет: pip install cryptography
"""

import base64
import hashlib
import hmac
import os
import sys

try:
    from cryptography.hazmat.primitives import serialization
    from cryptography.hazmat.primitives.asymmetric import ec
    from cryptography.hazmat.primitives.ciphers.aead import ChaCha20Poly1305
except ImportError:  # pragma: no cover
    print("нужен пакет cryptography: pip install cryptography")
    sys.exit(2)

INFO_X3DH = b"MailGram/DR/x3dh"
INFO_ROOT = b"MailGram/DR/root"
INFO_CHAIN = b"MailGram/DR/chain"
INFO_MESSAGE = b"MailGram/DR/message"
ZERO_SALT = bytes(32)
MAX_SKIP = 500


# ---------------------------------------------------------------- примитивы

def hkdf(ikm: bytes, salt: bytes, info: bytes, length: int) -> bytes:
    """HKDF-SHA256 (extract + expand) — как hkdfSha256 в нативном ядре."""
    prk = hmac.new(salt if salt else ZERO_SALT, ikm, hashlib.sha256).digest()
    out = b""
    block = b""
    counter = 1
    while len(out) < length:
        block = hmac.new(prk, block + info + bytes([counter]), hashlib.sha256).digest()
        out += block
        counter += 1
    return out[:length]


def gen_pair():
    return ec.generate_private_key(ec.SECP256R1())


def raw_public(priv) -> bytes:
    """Несжатая точка P-256 (65 байт) — тот же формат, что в Identity.java."""
    return priv.public_key().public_bytes(
        serialization.Encoding.X962, serialization.PublicFormat.UncompressedPoint)


def raw_from(priv) -> bytes:
    return raw_public(priv)


def dh(priv, peer_raw: bytes) -> bytes:
    """ECDH: X-координата общего секрета (32 байта)."""
    peer = ec.EllipticCurvePublicKey.from_encoded_point(ec.SECP256R1(), peer_raw)
    return priv.exchange(ec.ECDH(), peer)


def b64(data: bytes) -> str:
    return base64.urlsafe_b64encode(data).decode().rstrip("=")


def kdf_root(rk: bytes, dh_out: bytes):
    out = hkdf(dh_out, rk, INFO_ROOT, 64)
    return out[:32], out[32:64]


def kdf_chain(ck: bytes):
    return hkdf(ck, ZERO_SALT, INFO_CHAIN, 32), hkdf(ck, ZERO_SALT, INFO_MESSAGE, 32)


def header(dh_pub: bytes, pn: int, n: int) -> bytes:
    return ("%s|%d|%d" % (b64(dh_pub), pn, n)).encode()


class Identity:
    """Постоянная пара ключей устройства плюс предключ для рукопожатия."""

    def __init__(self, chat_uid: str, peer_identity_raw: bytes = None, peer_pre_raw: bytes = None):
        self.priv = gen_pair()
        self.raw = raw_from(self.priv)
        self.pre_priv = gen_pair()
        self.pre_raw = raw_from(self.pre_priv)


class Session:
    def __init__(self, root, dh_priv, dh_pub, dh_remote, ck_send=b"", ck_recv=b""):
        self.root = root
        self.dh_priv = dh_priv
        self.dh_pub = dh_pub
        self.dh_remote = dh_remote
        self.ck_send = ck_send
        self.ck_recv = ck_recv
        self.n_send = 0
        self.n_recv = 0
        self.pn = 0
        self.skipped = {}

    # ---------------------------------------------------------- рукопожатие

    @staticmethod
    def initiator(chat_uid: str, me: Identity, peer_identity_raw: bytes, peer_pre_raw: bytes):
        ek = gen_pair()
        dh1 = dh(me.priv, peer_identity_raw)
        dh2 = dh(ek, peer_identity_raw)
        dh3 = dh(ek, peer_pre_raw)
        sk = hkdf(dh1 + dh2 + dh3, chat_uid.encode(), INFO_X3DH, 32)
        rk, ck_send = kdf_root(sk, dh(ek, peer_pre_raw))
        return Session(rk, ek, raw_from(ek), peer_pre_raw, ck_send=ck_send)

    @staticmethod
    def responder(chat_uid: str, me: Identity, peer_identity_raw: bytes, peer_ratchet_raw: bytes,
                  peer_pre_raw: bytes):
        dh1 = dh(me.priv, peer_identity_raw)
        dh2 = dh(me.priv, peer_ratchet_raw)
        dh3 = dh(me.pre_priv, peer_ratchet_raw)
        sk = hkdf(dh1 + dh2 + dh3, chat_uid.encode(), INFO_X3DH, 32)
        rk, ck_recv = kdf_root(sk, dh3)
        fresh = gen_pair()
        rk2, ck_send = kdf_root(rk, dh(fresh, peer_ratchet_raw))
        return Session(rk2, fresh, raw_from(fresh), peer_ratchet_raw,
                       ck_send=ck_send, ck_recv=ck_recv)

    # ------------------------------------------------------- шифр и расшифр

    def encrypt(self, aad_prefix: bytes, plaintext: bytes):
        self.ck_send, mk = kdf_chain(self.ck_send)
        aad = aad_prefix + header(self.dh_pub, self.pn, self.n_send)
        nonce = os.urandom(12)
        ct = ChaCha20Poly1305(mk).encrypt(nonce, plaintext, aad)
        envelope = {"dh": self.dh_pub, "pn": self.pn, "n": self.n_send, "nc": nonce, "c": ct}
        self.n_send += 1
        return envelope

    def decrypt(self, aad_prefix: bytes, env: dict) -> bytes:
        if env["dh"] != self.dh_remote:
            self._skip(env["pn"])
            self._ratchet(env["dh"])
        self._skip(env["n"])
        key = (self.dh_remote, env["n"])
        mk = self.skipped.pop(key, None)
        if mk is None:
            self.ck_recv, mk = kdf_chain(self.ck_recv)
            self.n_recv += 1
        aad = aad_prefix + header(env["dh"], env["pn"], env["n"])
        return ChaCha20Poly1305(mk).decrypt(bytes(env["nc"]), bytes(env["c"]), aad)

    # ------------------------------------------------------------ механика

    def _skip(self, until: int):
        if self.n_recv + MAX_SKIP < until:
            raise ValueError("пропуск больше MAX_SKIP")
        while self.n_recv < until:
            self.ck_recv, mk = kdf_chain(self.ck_recv)
            self.skipped[(self.dh_remote, self.n_recv)] = mk
            self.n_recv += 1

    def _ratchet(self, new_remote: bytes):
        self.pn = self.n_send
        self.n_send = 0
        self.n_recv = 0
        self.dh_remote = new_remote
        self.root, self.ck_recv = kdf_root(self.root, dh(self.dh_priv, new_remote))
        fresh = gen_pair()
        self.root, self.ck_send = kdf_root(self.root, dh(fresh, new_remote))
        self.dh_priv, self.dh_pub = fresh, raw_from(fresh)


# ------------------------------------------------------------------- сцены

def handshake(chat="demo-chat-uid"):
    alice = Identity("alice")
    bob = Identity("bob")
    a = Session.initiator(chat, alice, bob.raw, bob.pre_raw)
    b = Session.responder(chat, bob, alice.raw, a.dh_pub, alice.pre_raw)
    return a, b


def check(name: str, ok: bool):
    print(("  ✓ " if ok else "  ✗ ") + name)
    if not ok:
        raise SystemExit("сценарий не пройден: " + name)


def main() -> int:
    chat = "demo-chat-uid"
    aad = ("MailGram/DR|2|id-%d|ts|from|to|" + chat).encode()

    print("1) Рукопожатие и обычный обмен")
    a, b = handshake(chat)
    for i in range(3):
        env = a.encrypt(aad, ("привет-%d" % i).encode())
        check("alice → bob #%d" % i, b.decrypt(aad, env) == ("привет-%d" % i).encode())
        env = b.encrypt(aad, ("ответ-%d" % i).encode())
        check("bob → alice #%d" % i, a.decrypt(aad, env) == ("ответ-%d" % i).encode())

    print("2) Шесть смен DH-ключей (полный двойной шаг)")
    a, b = handshake(chat)
    a_start, b_start = a.dh_pub, b.dh_pub
    root_start = a.root
    for i in range(6):
        env = a.encrypt(aad, b"ping")
        check("ping %d" % i, b.decrypt(aad, env) == b"ping")
        env = b.encrypt(aad, b"pong")
        check("pong %d" % i, a.decrypt(aad, env) == b"pong")
    check("Dh-ключи обеих сторон сменились", a.dh_pub != a_start and b.dh_pub != b_start)
    check("корневой ключ продвинулся", a.root != root_start)

    print("3) Доставка вне порядка (2, 0, 1)")
    a, b = handshake(chat)
    envs = [a.encrypt(aad, ("msg-%d" % i).encode()) for i in range(3)]
    check("второе сообщение", b.decrypt(aad, envs[2]) == b"msg-2")
    check("нулевое из отложенных", b.decrypt(aad, envs[0]) == b"msg-0")
    check("первое из отложенных", b.decrypt(aad, envs[1]) == b"msg-1")

    print("4) Подделка заголовка отвергается")
    a, b = handshake(chat)
    env = a.encrypt(aad, b"secret")
    broken = dict(env)
    broken["n"] = env["n"] + 1
    rejected = False
    try:
        b.decrypt(aad, broken)
    except Exception:
        rejected = True
    check("подменённый номер сообщения не расшифровывается", rejected)

    env = a.encrypt(aad, b"secret2")
    broken = dict(env)
    broken["c"] = bytes([env["c"][0] ^ 0x01]) + env["c"][1:]
    rejected = False
    try:
        b.decrypt(aad, broken)
    except Exception:
        rejected = True
    check("испорченный шифртекст не расшифровывается", rejected)

    print("5) Повторная доставка того же письма отвергается (анти-replay)")
    a, b = handshake(chat)
    env = a.encrypt(aad, "один раз".encode())
    check("первая доставка", b.decrypt(aad, env) == "один раз".encode())
    replay = False
    try:
        b.decrypt(aad, env)
    except Exception:
        replay = True
    check("повтор не проходит", replay)

    print("6) Пропуск больше MAX_SKIP отвергается")
    a, b = handshake(chat)
    skipped = None
    for i in range(MAX_SKIP + 5):
        env = a.encrypt(aad, b"x")
        if i == MAX_SKIP + 4:
            skipped = env
    too_far = False
    try:
        b.decrypt(aad, skipped)
    except Exception:
        too_far = True
    check("слишком далёкое сообщение не принимается", too_far)

    print("\nВСЕ СЦЕНАРИИ ПРОЙДЕНЫ ✓")
    return 0


if __name__ == "__main__":
    sys.exit(main())
