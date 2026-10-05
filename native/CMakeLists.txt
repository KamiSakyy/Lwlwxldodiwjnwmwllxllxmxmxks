cmake_minimum_required(VERSION 3.22.1)
project(webapk_sitekey LANGUAGES CXX)

add_library(sitekey SHARED sitekey.cpp)
target_compile_features(sitekey PRIVATE cxx_std_17)
target_compile_options(sitekey PRIVATE
        -fvisibility=hidden
        -fstack-protector-strong
        -fno-exceptions
        -fno-rtti)
