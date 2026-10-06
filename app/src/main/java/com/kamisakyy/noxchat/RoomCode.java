package com.kamisakyy.noxchat;

import java.security.SecureRandom;
import java.util.Locale;

final class RoomCode {
    private static final char[] ALPHABET = "23456789ABCDEFGHJKLMNPQRSTUVWXYZ".toCharArray();
    private static final SecureRandom RANDOM = new SecureRandom();
    static final int LENGTH = 16;

    private RoomCode() { }

    static String create() {
        StringBuilder result = new StringBuilder(LENGTH);
        for (int i = 0; i < LENGTH; i++) result.append(ALPHABET[RANDOM.nextInt(ALPHABET.length)]);
        return result.toString();
    }

    static String normalize(String input) {
        if (input == null) return "";
        String value = input.trim().toUpperCase(Locale.ROOT).replaceAll("[^A-Z0-9]", "");
        if (value.length() != LENGTH) return "";
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            boolean valid = false;
            for (char allowed : ALPHABET) {
                if (allowed == c) { valid = true; break; }
            }
            if (!valid) return "";
        }
        return value;
    }
}
