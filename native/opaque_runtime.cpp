#include <jni.h>
#include <cstddef>
#include <cstdint>
#include <vector>

namespace {

// XOR-obfuscated 256-bit material. This is obfuscation, not unextractable storage.
const volatile std::uint8_t x[32] = {
        0xdb, 0xc0, 0x2b, 0x17, 0x8b, 0xd9, 0x90, 0x71,
        0x1e, 0xf7, 0x1a, 0x5b, 0xf4, 0x34, 0x9d, 0xfa,
        0xd6, 0x71, 0xe3, 0x2e, 0xdb, 0x09, 0x66, 0x4d,
        0x06, 0x46, 0xd7, 0x10, 0xef, 0xf2, 0xe9, 0x1d
};

std::uint8_t mask(std::size_t n) {
    const std::uint32_t i = static_cast<std::uint32_t>(n);
    return static_cast<std::uint8_t>(0x6dU + i * 0x3bU + ((i * i) >> 1U));
}

void wipe(volatile std::uint8_t* bytes, std::size_t size) {
    for (std::size_t i = 0; i < size; ++i) bytes[i] = 0;
}

jbyteArray material(JNIEnv* env, jclass) {
    std::vector<std::uint8_t> value(32);
    for (std::size_t i = 0; i < value.size(); ++i) {
        value[i] = static_cast<std::uint8_t>(x[i] ^ mask(i));
    }
    jbyteArray result = env->NewByteArray(static_cast<jsize>(value.size()));
    if (result != nullptr) {
        env->SetByteArrayRegion(result, 0, static_cast<jsize>(value.size()),
                                reinterpret_cast<const jbyte*>(value.data()));
    }
    wipe(value.data(), value.size());
    return result;
}

}  // namespace

// Register the short bridge name dynamically; no descriptive Java_* export is kept.
JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM* vm, void*) {
    JNIEnv* env = nullptr;
    if (vm->GetEnv(reinterpret_cast<void**>(&env), JNI_VERSION_1_6) != JNI_OK || env == nullptr) {
        return JNI_ERR;
    }
    jclass bridge = env->FindClass("com/webapk/security/N");
    if (bridge == nullptr) return JNI_ERR;
    JNINativeMethod methods[] = {
            {const_cast<char*>("n"), const_cast<char*>("()[B"), reinterpret_cast<void*>(material)}
    };
    const jint status = env->RegisterNatives(bridge, methods, 1);
    env->DeleteLocalRef(bridge);
    return status == JNI_OK ? JNI_VERSION_1_6 : JNI_ERR;
}
