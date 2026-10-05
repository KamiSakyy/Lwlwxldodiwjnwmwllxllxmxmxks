cmake_minimum_required(VERSION 3.22.1)
project(webapk_runtime LANGUAGES CXX)

# One app-owned JNI binary, named libc++_shared.so, with the NDK static C++ runtime
# linked into it. ANDROID_STL=c++_static is set by both Gradle modules.
add_library(cxx_shared SHARED opaque_runtime.cpp)
set_target_properties(cxx_shared PROPERTIES OUTPUT_NAME "c++_shared")
target_compile_features(cxx_shared PRIVATE cxx_std_17)
target_compile_options(cxx_shared PRIVATE
        -O2
        -DNDEBUG
        -fvisibility=hidden
        -fstack-protector-strong
        -fno-exceptions
        -fno-rtti
        -ffunction-sections
        -fdata-sections)
target_link_options(cxx_shared PRIVATE
        -Wl,--gc-sections
        -Wl,--strip-all
        -Wl,--exclude-libs,ALL
        -Wl,-z,relro
        -Wl,-z,now)
