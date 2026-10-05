#include <jni.h>
#include <cstddef>
#include <cstdint>
#include <vector>

namespace {

// XOR-obfuscated 256-bit master key. The key is decoded only when the JNI caller needs it.
constexpr std::uint8_t kObfuscatedKey[32] = {
        0xdb, 0xc0, 0x2b, 0x17, 0x8b, 0xd9, 0x90, 0x71,
        0x1e, 0xf7, 0x1a, 0x5b, 0xf4, 0x34, 0x9d, 0xfa,
        0xd6, 0x71, 0xe3, 0x2e, 0xdb, 0x09, 0x66, 0x4d,
        0x06, 0x46, 0xd7, 0x10, 0xef, 0xf2, 0xe9, 0x1d
};

std::uint8_t maskFor(std::size_t index) {
    const std::uint32_t i = static_cast<std::uint32_t>(index);
    return static_cast<std::uint8_t>(0x6dU + i * 0x3bU + ((i * i) >> 1U));
}

void wipe(volatile std::uint8_t* bytes, std::size_t size) {
    for (std::size_t i = 0; i < size; ++i) bytes[i] = 0;
}

}  // namespace

extern "C" JNIEXPORT jbyteArray JNICALL
Java_com_webapk_security_NativeKey_nativeMasterKey(JNIEnv* env, jclass) {
    std::vector<std::uint8_t> key(32);
    for (std::size_t i = 0; i < key.size(); ++i) {
        key[i] = static_cast<std::uint8_t>(kObfuscatedKey[i] ^ maskFor(i));
    }

    jbyteArray result = env->NewByteArray(static_cast<jsize>(key.size()));
    if (result != nullptr) {
        env->SetByteArrayRegion(result, 0, static_cast<jsize>(key.size()),
                                reinterpret_cast<const jbyte*>(key.data()));
    }
    wipe(key.data(), key.size());
    return result;
}
