package com.kamisakyy.noxchat;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyProperties;
import android.util.Base64;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Compact room-scoped history stored on-device, not in Firebase. */
final class MessageStore {
    private static final String PREFS = "local_chat_history";
    private static final int MAX_MESSAGES = 250;

    private final SharedPreferences preferences;
    private final String key;
    private final String legacyKey;
    private final AtRestCipher cipher;
    private final ArrayList<ChatMessage> messages = new ArrayList<>();

    MessageStore(Context context, String roomCode) {
        preferences = context.getApplicationContext().getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        key = "room_" + roomCode + "_encrypted_v1";
        legacyKey = "room_" + roomCode;
        try {
            cipher = new AtRestCipher(context.getApplicationContext());
            migrateLegacyHistories();
        } catch (Exception ex) {
            throw new IllegalStateException("Local history encryption is unavailable", ex);
        }
        load();
    }

    synchronized List<ChatMessage> all() {
        return Collections.unmodifiableList(new ArrayList<>(messages));
    }

    synchronized void add(ChatMessage message) {
        for (int i = 0; i < messages.size(); i++) {
            if (messages.get(i).id.equals(message.id)) {
                messages.set(i, message);
                persist();
                return;
            }
        }
        messages.add(message);
        while (messages.size() > MAX_MESSAGES) messages.remove(0);
        persist();
    }

    synchronized void update(ChatMessage message) {
        for (int i = 0; i < messages.size(); i++) {
            if (messages.get(i).id.equals(message.id)) {
                messages.set(i, message);
                persist();
                return;
            }
        }
        add(message);
    }

    private void migrateLegacyHistories() throws Exception {
        SharedPreferences.Editor editor = preferences.edit();
        boolean changed = false;
        for (java.util.Map.Entry<String, ?> entry : preferences.getAll().entrySet()) {
            String legacy = entry.getKey();
            if (!legacy.startsWith("room_") || legacy.endsWith("_encrypted_v1")
                    || !(entry.getValue() instanceof String)) continue;
            String encryptedKey = legacy + "_encrypted_v1";
            if (!preferences.contains(encryptedKey)) {
                editor.putString(encryptedKey, cipher.encrypt(encryptedKey, (String) entry.getValue()));
            }
            editor.remove(legacy);
            changed = true;
        }
        if (changed && !editor.commit()) throw new IllegalStateException("Could not migrate legacy local histories");
    }

    private void load() {
        String raw;
        boolean migratingLegacy = false;
        boolean normalizeState = false;
        try {
            String encrypted = preferences.getString(key, null);
            if (encrypted != null) {
                raw = cipher.decrypt(key, encrypted);
            } else {
                raw = preferences.getString(legacyKey, "[]");
                migratingLegacy = preferences.contains(legacyKey);
            }
            JSONArray array = new JSONArray(raw);
            int start = Math.max(0, array.length() - MAX_MESSAGES);
            for (int i = start; i < array.length(); i++) {
                JSONObject item = array.optJSONObject(i);
                if (item != null) {
                    ChatMessage message = ChatMessage.fromJson(item);
                    if (message.status == ChatMessage.SENDING || message.status == ChatMessage.RECEIVING) {
                        boolean resumableAttachment = message.isAttachment()
                                && message.attachmentUri.startsWith("/")
                                && new File(message.attachmentUri).isFile();
                        message.status = resumableAttachment ? ChatMessage.PAUSED : ChatMessage.FAILED;
                        normalizeState = true;
                    }
                    if (message.isAttachment() && message.status == ChatMessage.READY
                            && message.attachmentUri.startsWith("/")
                            && !new File(message.attachmentUri).exists()) {
                        message.status = ChatMessage.FAILED;
                        normalizeState = true;
                    }
                    messages.add(message);
                }
            }
            if (migratingLegacy) {
                String encoded = cipher.encrypt(key, toJson().toString());
                if (!preferences.edit().putString(key, encoded).remove(legacyKey).commit()) {
                    throw new IllegalStateException("Could not migrate local chat history to encrypted storage");
                }
            } else if (normalizeState) {
                persist();
            }
        } catch (Exception ignored) {
            messages.clear();
        }
    }

    private void persist() {
        try {
            String encrypted = cipher.encrypt(key, toJson().toString());
            if (!preferences.edit().putString(key, encrypted).commit()) {
                throw new IllegalStateException("Could not persist encrypted chat history");
            }
        } catch (Exception ex) {
            throw new IllegalStateException("Could not encrypt local chat history", ex);
        }
    }

    private JSONArray toJson() {
        JSONArray array = new JSONArray();
        for (ChatMessage message : messages) array.put(message.toJson());
        return array;
    }


    private static final class AtRestCipher {
        private static final int IV_BYTES = 12;
        private static final int TAG_BITS = 128;
        private final SecretKey key;
        private final SecureRandom random = new SecureRandom();

        AtRestCipher(Context context) throws Exception {
            String alias = context.getPackageName() + ".chat-history.v1";
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            java.security.Key existing = keyStore.getKey(alias, null);
            if (existing instanceof SecretKey) {
                key = (SecretKey) existing;
                return;
            }
            KeyGenerator generator = KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES, "AndroidKeyStore");
            generator.init(new KeyGenParameterSpec.Builder(alias,
                    KeyProperties.PURPOSE_ENCRYPT | KeyProperties.PURPOSE_DECRYPT)
                    .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
                    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                    .setRandomizedEncryptionRequired(true)
                    .build());
            key = generator.generateKey();
        }

        String encrypt(String preferenceKey, String plaintext) throws Exception {
            byte[] iv = new byte[IV_BYTES];
            random.nextBytes(iv);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.ENCRYPT_MODE, key, new GCMParameterSpec(TAG_BITS, iv));
            cipher.updateAAD(preferenceKey.getBytes(StandardCharsets.UTF_8));
            byte[] ciphertext = cipher.doFinal(plaintext.getBytes(StandardCharsets.UTF_8));
            ByteBuffer encoded = ByteBuffer.allocate(iv.length + ciphertext.length);
            encoded.put(iv).put(ciphertext);
            return Base64.encodeToString(encoded.array(), Base64.NO_WRAP);
        }

        String decrypt(String preferenceKey, String encoded) throws Exception {
            byte[] combined = Base64.decode(encoded, Base64.NO_WRAP);
            if (combined.length <= IV_BYTES) throw new IllegalStateException("Encrypted history record is truncated");
            byte[] iv = new byte[IV_BYTES];
            byte[] ciphertext = new byte[combined.length - IV_BYTES];
            System.arraycopy(combined, 0, iv, 0, iv.length);
            System.arraycopy(combined, IV_BYTES, ciphertext, 0, ciphertext.length);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE, key, new GCMParameterSpec(TAG_BITS, iv));
            cipher.updateAAD(preferenceKey.getBytes(StandardCharsets.UTF_8));
            return new String(cipher.doFinal(ciphertext), StandardCharsets.UTF_8);
        }
    }
}
