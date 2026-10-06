# Сборка нативного ядра MailGram (C++17, без внешних зависимостей).
cmake_minimum_required(VERSION 3.22.1)
project(mailgram CXX)

add_library(mailgram SHARED
        mailgram_crypto.cpp
        mailgram_jni.cpp)

target_compile_features(mailgram PRIVATE cxx_std_17)

target_compile_options(mailgram PRIVATE
        -O3
        -fvisibility=hidden
        -fno-exceptions
        -fno-rtti
        -Wall
        -Wextra
        -Wno-unused-parameter)

set_target_properties(mailgram PROPERTIES
        CXX_VISIBILITY_PRESET hidden
        VISIBILITY_INLINES_HIDDEN ON)

find_library(log-lib log)
if (log-lib)
    target_link_libraries(mailgram ${log-lib})
endif()
