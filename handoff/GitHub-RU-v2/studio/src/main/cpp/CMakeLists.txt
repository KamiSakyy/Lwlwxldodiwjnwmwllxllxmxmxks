cmake_minimum_required(VERSION 3.22)
project(nodestarter CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

find_library(log-lib log)

# libnode.so кладёт CI (workflow 06) в studio/src/main/jniLibs/<abi>/libnode.so.
# Если его нет (офлайн-сборка) — собираем заглушку: nativeStart вернёт 2,
# Java покажет понятный экран, НО APK СОБЕРЁТСЯ ВСЕГДА.
set(LIBNODE_SO "${CMAKE_CURRENT_SOURCE_DIR}/../jniLibs/${ANDROID_ABI}/libnode.so")

if(EXISTS "${LIBNODE_SO}")
    message(STATUS "nodestarter: libnode.so НАЙДЕН (${ANDROID_ABI}) — встраиваю настоящий Node.js")
    add_library(node SHARED IMPORTED)
    set_target_properties(node PROPERTIES IMPORTED_LOCATION "${LIBNODE_SO}")
    add_library(nodestarter SHARED nodestarter.cpp)
    target_compile_definitions(nodestarter PRIVATE HAVE_LIBNODE=1)
    target_link_libraries(nodestarter node ${log-lib})
else()
    message(STATUS "nodestarter: libnode.so НЕ найден — сборка заглушки (APK соберётся без Node.js)")
    add_library(nodestarter SHARED nodestarter.cpp)
    target_link_libraries(nodestarter ${log-lib})
endif()
