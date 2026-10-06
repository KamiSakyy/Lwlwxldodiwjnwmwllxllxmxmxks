package com.kamisakyy.noxchat;

/** Public Firebase client configuration; authorization is enforced by Firebase Auth + RTDB rules. */
final class FirebaseConfig {
    static final String API_KEY = BuildConfig.FIREBASE_API_KEY;
    static final String DATABASE_URL = BuildConfig.FIREBASE_DATABASE_URL;
    static final String PROJECT_ID = "meow-874ce";

    private FirebaseConfig() { }
}
