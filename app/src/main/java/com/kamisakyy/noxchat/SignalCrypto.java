package com.kamisakyy.noxchat;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyProperties;
import android.util.Base64;

import org.json.JSONObject;
import org.signal.libsignal.protocol.IdentityKey;
import org.signal.libsignal.protocol.IdentityKeyPair;
import org.signal.libsignal.protocol.InvalidKeyException;
import org.signal.libsignal.protocol.InvalidKeyIdException;
import org.signal.libsignal.protocol.InvalidMessageException;
import org.signal.libsignal.protocol.NoSessionException;
import org.signal.libsignal.protocol.ReusedBaseKeyException;
import org.signal.libsignal.protocol.SessionBuilder;
import org.signal.libsignal.protocol.SessionCipher;
import org.signal.libsignal.protocol.SignalProtocolAddress;
import org.signal.libsignal.protocol.UntrustedIdentityException;
import org.signal.libsignal.protocol.ecc.ECKeyPair;
import org.signal.libsignal.protocol.ecc.ECPublicKey;
import org.signal.libsignal.protocol.groups.state.InMemorySenderKeyStore;
import org.signal.libsignal.protocol.groups.state.SenderKeyRecord;
import org.signal.libsignal.protocol.groups.state.SenderKeyStore;
import org.signal.libsignal.protocol.kem.KEMKeyPair;
import org.signal.libsignal.protocol.kem.KEMKeyType;
import org.signal.libsignal.protocol.kem.KEMPublicKey;
import org.signal.libsignal.protocol.message.CiphertextMessage;
import org.signal.libsignal.protocol.message.PreKeySignalMessage;
import org.signal.libsignal.protocol.message.SignalMessage;
import org.signal.libsignal.protocol.state.IdentityKeyStore;
import org.signal.libsignal.protocol.state.KyberPreKeyRecord;
import org.signal.libsignal.protocol.state.KyberPreKeyStore;
import org.signal.libsignal.protocol.state.PreKeyBundle;
import org.signal.libsignal.protocol.state.PreKeyRecord;
import org.signal.libsignal.protocol.state.PreKeyStore;
import org.signal.libsignal.protocol.state.SessionRecord;
import org.signal.libsignal.protocol.state.SessionStore;
import org.signal.libsignal.protocol.state.SignalProtocolStore;
import org.signal.libsignal.protocol.state.SignedPreKeyRecord;
import org.signal.libsignal.protocol.state.SignedPreKeyStore;
import org.signal.libsignal.protocol.util.KeyHelper;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/** Signal PQXDH + Double Ratchet, with all private protocol state encrypted by Android Keystore. */
final class SignalCrypto {
    private static final int DEVICE_ID = 1;
    private static final int AES_GCM_IV_BYTES = 12;
    private static final int AES_GCM_TAG_BITS = 128;
    private static final String KEY_ALIAS = "com.kamisakyy.noxchat.signal-storage.v1";
    private static final String PREFS_NAME = "signal_protocol_encrypted_v1";

    private final PersistentSignalProtocolStore store;
    private final JSONObject localBundle;
    private final SecureRandom random = new SecureRandom();
    private final Object operationLock = new Object();

    SignalCrypto(Context context) {
        try {
            store = new PersistentSignalProtocolStore(context.getApplicationContext());
            localBundle = createOrLoadLocalBundle();
        } catch (Exception ex) {
            throw new IllegalStateException("Unable to initialize Signal Protocol storage", ex);
        }
    }

    JSONObject publicBundle() {
        try { return new JSONObject(localBundle.toString()); }
        catch (Exception ex) { throw new IllegalStateException("Invalid local Signal bundle", ex); }
    }

    String localFingerprint() {
        return store.getIdentityKeyPair().getPublicKey().getFingerprint();
    }

    String trustedRemoteFingerprint(String localUid, String remoteUid) {
        if (localUid == null || remoteUid == null) return "";
        try {
            IdentityKey key = store.getIdentity(new SignalProtocolAddress(remoteUid, DEVICE_ID));
            return key == null ? "" : key.getFingerprint();
        } catch (Exception ignored) {
            return "";
        }
    }

    boolean isRemoteFingerprintVerified(String localUid, String remoteUid) {
        if (localUid == null || remoteUid == null) return false;
        synchronized (operationLock) {
            SignalProtocolAddress address = new SignalProtocolAddress(remoteUid, DEVICE_ID);
            IdentityKey trusted = store.getIdentity(address);
            byte[] verified = store.get(verificationKey("local", address));
            return trusted != null && verified != null && Arrays.equals(trusted.serialize(), verified);
        }
    }

    boolean markRemoteFingerprintVerified(String localUid, String remoteUid, String expectedFingerprint) {
        if (localUid == null || remoteUid == null || expectedFingerprint == null || expectedFingerprint.isEmpty()) return false;
        synchronized (operationLock) {
            SignalProtocolAddress address = new SignalProtocolAddress(remoteUid, DEVICE_ID);
            IdentityKey trusted = store.getIdentity(address);
            if (trusted == null || !expectedFingerprint.equals(trusted.getFingerprint())) return false;
            store.put(verificationKey("local", address), trusted.serialize());
            return true;
        }
    }

    boolean hasRemoteVerifiedLocalFingerprint(String localUid, String remoteUid) {
        if (localUid == null || remoteUid == null) return false;
        synchronized (operationLock) {
            SignalProtocolAddress address = new SignalProtocolAddress(remoteUid, DEVICE_ID);
            IdentityKey trusted = store.getIdentity(address);
            byte[] verification = store.get(verificationKey("remote", address));
            return trusted != null && verification != null && Arrays.equals(trusted.serialize(), verification);
        }
    }

    boolean recordRemoteFingerprintVerification(String localUid, String remoteUid, String localFingerprint) {
        if (localUid == null || remoteUid == null || localFingerprint == null
                || !localFingerprint.equals(localFingerprint())) return false;
        synchronized (operationLock) {
            SignalProtocolAddress address = new SignalProtocolAddress(remoteUid, DEVICE_ID);
            IdentityKey trusted = store.getIdentity(address);
            if (trusted == null) return false;
            store.put(verificationKey("remote", address), trusted.serialize());
            return true;
        }
    }

    private static String verificationKey(String direction, SignalProtocolAddress address) {
        return "verified." + direction + "." + PersistentSignalProtocolStore.addressKey(address);
    }

    String advertisedFingerprint(JSONObject bundle) {
        if (bundle == null) return "";
        try {
            byte[] bytes = decode(bundle.getString("identity"));
            return new IdentityKey(bytes).getFingerprint();
        } catch (Exception ignored) {
            return "";
        }
    }

    boolean hasSession(String localUid, String remoteUid) {
        if (localUid == null || localUid.isEmpty() || remoteUid == null || remoteUid.isEmpty()) return false;
        try {
            return store.containsSession(new SignalProtocolAddress(remoteUid, DEVICE_ID));
        } catch (Exception ignored) {
            return false;
        }
    }

    void establishOutbound(String localUid, String remoteUid, JSONObject bundleJson)
            throws Exception {
        if (localUid == null || localUid.isEmpty() || remoteUid == null || remoteUid.isEmpty()
                || localUid.equals(remoteUid)) throw new SecurityException("Invalid Signal peer address");
        if (bundleJson == null) throw new SecurityException("Peer has no Signal prekey bundle");
        synchronized (operationLock) {
            SignalProtocolAddress localAddress = new SignalProtocolAddress(localUid, DEVICE_ID);
            SignalProtocolAddress remoteAddress = new SignalProtocolAddress(remoteUid, DEVICE_ID);
            IdentityKey advertisedIdentity = new IdentityKey(decode(bundleJson.getString("identity")));
            IdentityKey trustedIdentity = store.getIdentity(remoteAddress);
            if (trustedIdentity != null && !trustedIdentity.equals(advertisedIdentity)) {
                throw new SecurityException("Peer Signal identity changed; verify the new fingerprint out of band");
            }
            if (store.containsSession(remoteAddress)) return;

            int registrationId = requiredInt(bundleJson, "registrationId");
            int signedPreKeyId = requiredInt(bundleJson, "signedPreKeyId");
            int kyberPreKeyId = requiredInt(bundleJson, "kyberPreKeyId");
            byte[] signedSignature = decode(bundleJson.getString("signedPreKeySignature"));
            byte[] kyberSignature = decode(bundleJson.getString("kyberPreKeySignature"));
            ECPublicKey signedPublic = new ECPublicKey(decode(bundleJson.getString("signedPreKey")));
            KEMPublicKey kyberPublic = new KEMPublicKey(decode(bundleJson.getString("kyberPreKey")));
            PreKeyBundle bundle = new PreKeyBundle(
                    registrationId,
                    DEVICE_ID,
                    PreKeyBundle.NULL_PRE_KEY_ID,
                    null,
                    signedPreKeyId,
                    signedPublic,
                    signedSignature,
                    advertisedIdentity,
                    kyberPreKeyId,
                    kyberPublic,
                    kyberSignature);
            new SessionBuilder(store, remoteAddress, localAddress).process(bundle);
        }
    }

    SealedMessage encrypt(String localUid, String remoteUid, byte[] plaintext)
            throws Exception {
        synchronized (operationLock) {
            SignalProtocolAddress remoteAddress = new SignalProtocolAddress(remoteUid, DEVICE_ID);
            if (!store.containsSession(remoteAddress)) throw new NoSessionException(remoteAddress, "Signal session is not established");
            SessionCipher cipher = new SessionCipher(store,
                    new SignalProtocolAddress(localUid, DEVICE_ID), remoteAddress);
            CiphertextMessage ciphertext = cipher.encrypt(plaintext);
            return new SealedMessage(ciphertext.getType(), ciphertext.serialize());
        }
    }

    byte[] decrypt(String localUid, String remoteUid, int messageType, byte[] ciphertext)
            throws Exception {
        synchronized (operationLock) {
            SignalProtocolAddress remoteAddress = new SignalProtocolAddress(remoteUid, DEVICE_ID);
            SessionCipher cipher = new SessionCipher(store,
                    new SignalProtocolAddress(localUid, DEVICE_ID), remoteAddress);
            if (messageType == CiphertextMessage.PREKEY_TYPE) {
                return cipher.decrypt(new PreKeySignalMessage(ciphertext));
            }
            if (messageType == CiphertextMessage.WHISPER_TYPE) {
                return cipher.decrypt(new SignalMessage(ciphertext));
            }
            throw new SecurityException("Unsupported Signal ciphertext type: " + messageType);
        }
    }

    byte[] newTransferKey(String id) {
        byte[] key = new byte[32];
        random.nextBytes(key);
        storeTransferKey(id, key);
        return key;
    }

    void storeTransferKey(String id, byte[] key) {
        if (id == null || id.isEmpty() || key == null || key.length != 32) {
            throw new IllegalArgumentException("Invalid file transfer key");
        }
        store.put("transfer." + id, key);
    }

    byte[] loadTransferKey(String id) {
        if (id == null || id.isEmpty()) return null;
        byte[] key = store.get("transfer." + id);
        return key != null && key.length == 32 ? key : null;
    }

    void removeTransferKey(String id) {
        if (id != null && !id.isEmpty()) store.remove("transfer." + id);
    }

    ChunkCiphertext encryptFileChunk(byte[] key, String transferId, int index, byte[] plaintext)
            throws GeneralSecurityException {
        byte[] iv = new byte[AES_GCM_IV_BYTES];
        random.nextBytes(iv);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(Cipher.ENCRYPT_MODE, new javax.crypto.spec.SecretKeySpec(key, "AES"),
                new GCMParameterSpec(AES_GCM_TAG_BITS, iv));
        cipher.updateAAD(chunkAad(transferId, index));
        return new ChunkCiphertext(iv, cipher.doFinal(plaintext));
    }

    byte[] decryptFileChunk(byte[] key, String transferId, int index, byte[] iv, byte[] ciphertext)
            throws GeneralSecurityException {
        if (iv == null || iv.length != AES_GCM_IV_BYTES) throw new GeneralSecurityException("Invalid chunk nonce");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(Cipher.DECRYPT_MODE, new javax.crypto.spec.SecretKeySpec(key, "AES"),
                new GCMParameterSpec(AES_GCM_TAG_BITS, iv));
        cipher.updateAAD(chunkAad(transferId, index));
        return cipher.doFinal(ciphertext);
    }

    private byte[] chunkAad(String transferId, int index) {
        return (transferId + ":" + index).getBytes(StandardCharsets.UTF_8);
    }

    private JSONObject createOrLoadLocalBundle() throws Exception {
        IdentityKeyPair identity = store.getIdentityKeyPair();
        int signedId = store.getMetaInt("active.signed.id", -1);
        if (signedId < 0 || !store.containsSignedPreKey(signedId)) {
            signedId = newKeyId();
            ECKeyPair signedKey = ECKeyPair.generate();
            byte[] signature = identity.getPrivateKey().calculateSignature(signedKey.getPublicKey().serialize());
            store.storeSignedPreKey(signedId,
                    new SignedPreKeyRecord(signedId, System.currentTimeMillis(), signedKey, signature));
            store.putMetaInt("active.signed.id", signedId);
        }
        SignedPreKeyRecord signedPreKey = store.loadSignedPreKey(signedId);
        ECKeyPair signedPair = signedPreKey.getKeyPair();

        int kyberId = store.getMetaInt("active.kyber.id", -1);
        if (kyberId < 0 || !store.containsKyberPreKey(kyberId)) {
            kyberId = newKeyId();
            KEMKeyPair kyberKey = KEMKeyPair.generate(KEMKeyType.KYBER_1024);
            byte[] signature = identity.getPrivateKey().calculateSignature(kyberKey.getPublicKey().serialize());
            store.storeKyberPreKey(kyberId,
                    new KyberPreKeyRecord(kyberId, System.currentTimeMillis(), kyberKey, signature));
            store.putMetaInt("active.kyber.id", kyberId);
        }
        KyberPreKeyRecord kyberPreKey = store.loadKyberPreKey(kyberId);
        KEMPublicKey kyberPublic = kyberPreKey.getKeyPair().getPublicKey();

        JSONObject bundle = new JSONObject();
        bundle.put("version", 1);
        bundle.put("deviceId", DEVICE_ID);
        bundle.put("registrationId", store.getLocalRegistrationId());
        bundle.put("identity", encode(identity.getPublicKey().serialize()));
        bundle.put("signedPreKeyId", signedId);
        bundle.put("signedPreKey", encode(signedPair.getPublicKey().serialize()));
        bundle.put("signedPreKeySignature", encode(signedPreKey.getSignature()));
        bundle.put("kyberPreKeyId", kyberId);
        bundle.put("kyberPreKey", encode(kyberPublic.serialize()));
        bundle.put("kyberPreKeySignature", encode(kyberPreKey.getSignature()));
        return bundle;
    }

    private static int requiredInt(JSONObject value, String key) {
        int result = value.optInt(key, -1);
        if (result < 0) throw new IllegalArgumentException("Invalid Signal bundle field " + key);
        return result;
    }

    private static int newKeyId() {
        return new SecureRandom().nextInt(16_777_214) + 1;
    }

    private static String encode(byte[] value) {
        return Base64.encodeToString(value, Base64.NO_WRAP);
    }

    private static byte[] decode(String value) {
        return Base64.decode(value, Base64.NO_WRAP);
    }

    static final class SealedMessage {
        final int type;
        final byte[] data;
        SealedMessage(int type, byte[] data) { this.type = type; this.data = data; }
    }

    static final class ChunkCiphertext {
        final byte[] nonce;
        final byte[] data;
        ChunkCiphertext(byte[] nonce, byte[] data) { this.nonce = nonce; this.data = data; }
    }

    /** Persistent Signal store. All serialized secrets are AES-GCM protected with a Keystore key. */
    private static final class PersistentSignalProtocolStore implements SignalProtocolStore {
        private static final String PREFIX_PREKEY = "pre.";
        private static final String PREFIX_SIGNED = "signed.";
        private static final String PREFIX_KYBER = "kyber.";
        private static final String PREFIX_SESSION = "session.";
        private static final String PREFIX_IDENTITY = "identity.";

        private final SharedPreferences preferences;
        private final SecretKey storageKey;
        private final SecureRandom random = new SecureRandom();
        private final SenderKeyStore senderKeys = new InMemorySenderKeyStore();
        private IdentityKeyPair identityKeyPair;
        private int registrationId;

        PersistentSignalProtocolStore(Context context) throws Exception {
            preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
            storageKey = loadOrCreateStorageKey();
            byte[] identity = get("local.identity");
            if (identity == null) {
                identityKeyPair = IdentityKeyPair.generate();
                put("local.identity", identityKeyPair.serialize());
            } else {
                identityKeyPair = new IdentityKeyPair(identity);
            }
            byte[] registration = get("local.registration");
            if (registration == null || registration.length != 4) {
                registrationId = KeyHelper.generateRegistrationId(false);
                put("local.registration", ByteBuffer.allocate(4).putInt(registrationId).array());
            } else {
                registrationId = ByteBuffer.wrap(registration).getInt();
                if (registrationId <= 0 || registrationId > 16_380) throw new IllegalStateException("Invalid Signal registration id");
            }
        }

        private SecretKey loadOrCreateStorageKey() throws Exception {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            java.security.Key existing = keyStore.getKey(KEY_ALIAS, null);
            if (existing instanceof SecretKey) return (SecretKey) existing;
            KeyGenerator generator = KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES, "AndroidKeyStore");
            generator.init(new KeyGenParameterSpec.Builder(KEY_ALIAS,
                    KeyProperties.PURPOSE_ENCRYPT | KeyProperties.PURPOSE_DECRYPT)
                    .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
                    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                    .setRandomizedEncryptionRequired(true)
                    .build());
            return generator.generateKey();
        }

        private synchronized byte[] get(String name) {
            String stored = preferences.getString(name, null);
            if (stored == null) return null;
            try {
                byte[] combined = Base64.decode(stored, Base64.NO_WRAP);
                if (combined.length <= AES_GCM_IV_BYTES) throw new GeneralSecurityException("Invalid encrypted store record");
                byte[] iv = Arrays.copyOfRange(combined, 0, AES_GCM_IV_BYTES);
                byte[] ciphertext = Arrays.copyOfRange(combined, AES_GCM_IV_BYTES, combined.length);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(Cipher.DECRYPT_MODE, storageKey, new GCMParameterSpec(AES_GCM_TAG_BITS, iv));
                cipher.updateAAD(name.getBytes(StandardCharsets.UTF_8));
                return cipher.doFinal(ciphertext);
            } catch (Exception ex) {
                throw new IllegalStateException("Signal encrypted store could not be authenticated", ex);
            }
        }

        private synchronized void put(String name, byte[] value) {
            try {
                byte[] iv = new byte[AES_GCM_IV_BYTES];
                random.nextBytes(iv);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(Cipher.ENCRYPT_MODE, storageKey, new GCMParameterSpec(AES_GCM_TAG_BITS, iv));
                cipher.updateAAD(name.getBytes(StandardCharsets.UTF_8));
                byte[] ciphertext = cipher.doFinal(value);
                ByteArrayOutputStream combined = new ByteArrayOutputStream(iv.length + ciphertext.length);
                combined.write(iv, 0, iv.length);
                combined.write(ciphertext, 0, ciphertext.length);
                boolean saved = preferences.edit().putString(name,
                        Base64.encodeToString(combined.toByteArray(), Base64.NO_WRAP)).commit();
                if (!saved) throw new IllegalStateException("Signal store could not be committed");
            } catch (GeneralSecurityException ex) {
                throw new IllegalStateException("Signal store encryption failed", ex);
            }
        }

        private synchronized void remove(String name) {
            if (!preferences.edit().remove(name).commit()) throw new IllegalStateException("Signal store could not be updated");
        }

        synchronized int getMetaInt(String name, int fallback) {
            byte[] value = get("meta." + name);
            return value == null || value.length != 4 ? fallback : ByteBuffer.wrap(value).getInt();
        }

        synchronized void putMetaInt(String name, int value) {
            put("meta." + name, ByteBuffer.allocate(4).putInt(value).array());
        }

        private synchronized List<String> keysWithPrefix(String prefix) {
            ArrayList<String> keys = new ArrayList<>();
            for (String key : preferences.getAll().keySet()) if (key.startsWith(prefix)) keys.add(key);
            Collections.sort(keys);
            return keys;
        }

        private static String addressKey(SignalProtocolAddress address) {
            String encodedName = Base64.encodeToString(address.getName().getBytes(StandardCharsets.UTF_8),
                    Base64.URL_SAFE | Base64.NO_WRAP | Base64.NO_PADDING);
            return encodedName + "." + address.getDeviceId();
        }

        private static String sessionKey(SignalProtocolAddress address) {
            return PREFIX_SESSION + addressKey(address);
        }

        @Override public synchronized IdentityKeyPair getIdentityKeyPair() { return identityKeyPair; }
        @Override public synchronized int getLocalRegistrationId() { return registrationId; }

        @Override public synchronized IdentityKeyStore.IdentityChange saveIdentity(
                SignalProtocolAddress address, IdentityKey identityKey) {
            IdentityKey existing = getIdentity(address);
            if (existing != null && !existing.equals(identityKey)) return IdentityKeyStore.IdentityChange.REPLACED_EXISTING;
            put(PREFIX_IDENTITY + addressKey(address), identityKey.serialize());
            return IdentityKeyStore.IdentityChange.NEW_OR_UNCHANGED;
        }

        @Override public synchronized boolean isTrustedIdentity(SignalProtocolAddress address,
                IdentityKey identityKey, IdentityKeyStore.Direction direction) {
            IdentityKey existing = getIdentity(address);
            return existing == null || existing.equals(identityKey);
        }

        @Override public synchronized IdentityKey getIdentity(SignalProtocolAddress address) {
            byte[] stored = get(PREFIX_IDENTITY + addressKey(address));
            if (stored == null) return null;
            try { return new IdentityKey(stored); }
            catch (InvalidKeyException ex) { throw new IllegalStateException("Invalid stored Signal identity", ex); }
        }

        @Override public synchronized PreKeyRecord loadPreKey(int preKeyId) throws InvalidKeyIdException {
            byte[] stored = get(PREFIX_PREKEY + preKeyId);
            if (stored == null) throw new InvalidKeyIdException("No such prekey record: " + preKeyId);
            try { return new PreKeyRecord(stored); }
            catch (InvalidMessageException ex) { throw new IllegalStateException("Invalid stored prekey", ex); }
        }

        @Override public synchronized void storePreKey(int preKeyId, PreKeyRecord record) {
            put(PREFIX_PREKEY + preKeyId, record.serialize());
        }

        @Override public synchronized boolean containsPreKey(int preKeyId) {
            return preferences.contains(PREFIX_PREKEY + preKeyId);
        }

        @Override public synchronized void removePreKey(int preKeyId) { remove(PREFIX_PREKEY + preKeyId); }

        @Override public synchronized SessionRecord loadSession(SignalProtocolAddress address) {
            byte[] stored = get(sessionKey(address));
            if (stored == null) return null;
            try { return new SessionRecord(stored); }
            catch (InvalidMessageException ex) { throw new IllegalStateException("Invalid stored Signal session", ex); }
        }

        @Override public synchronized List<SessionRecord> loadExistingSessions(List<SignalProtocolAddress> addresses)
                throws NoSessionException {
            ArrayList<SessionRecord> result = new ArrayList<>();
            for (SignalProtocolAddress address : addresses) {
                SessionRecord record = loadSession(address);
                if (record == null) throw new NoSessionException(address, "No stored Signal session for " + address);
                result.add(record);
            }
            return result;
        }

        @Override public synchronized List<Integer> getSubDeviceSessions(String name) {
            ArrayList<Integer> devices = new ArrayList<>();
            for (String key : keysWithPrefix(PREFIX_SESSION)) {
                String address = key.substring(PREFIX_SESSION.length());
                int dot = address.lastIndexOf('.');
                if (dot < 0) continue;
                try {
                    String storedName = new String(Base64.decode(address.substring(0, dot),
                            Base64.URL_SAFE | Base64.NO_WRAP | Base64.NO_PADDING), StandardCharsets.UTF_8);
                    int device = Integer.parseInt(address.substring(dot + 1));
                    if (name.equals(storedName) && device != DEVICE_ID) devices.add(device);
                } catch (Exception ignored) { }
            }
            return devices;
        }

        @Override public synchronized void storeSession(SignalProtocolAddress address, SessionRecord record) {
            put(sessionKey(address), record.serialize());
        }

        @Override public synchronized boolean containsSession(SignalProtocolAddress address) {
            return preferences.contains(sessionKey(address));
        }

        @Override public synchronized void deleteSession(SignalProtocolAddress address) { remove(sessionKey(address)); }

        @Override public synchronized void deleteAllSessions(String name) {
            for (String key : keysWithPrefix(PREFIX_SESSION)) {
                String address = key.substring(PREFIX_SESSION.length());
                int dot = address.lastIndexOf('.');
                if (dot < 0) continue;
                try {
                    String storedName = new String(Base64.decode(address.substring(0, dot),
                            Base64.URL_SAFE | Base64.NO_WRAP | Base64.NO_PADDING), StandardCharsets.UTF_8);
                    if (name.equals(storedName)) remove(key);
                } catch (Exception ignored) { }
            }
        }

        @Override public synchronized SignedPreKeyRecord loadSignedPreKey(int signedPreKeyId) throws InvalidKeyIdException {
            byte[] stored = get(PREFIX_SIGNED + signedPreKeyId);
            if (stored == null) throw new InvalidKeyIdException("No such signed prekey record: " + signedPreKeyId);
            try { return new SignedPreKeyRecord(stored); }
            catch (InvalidMessageException ex) { throw new IllegalStateException("Invalid stored signed prekey", ex); }
        }

        @Override public synchronized List<SignedPreKeyRecord> loadSignedPreKeys() {
            ArrayList<SignedPreKeyRecord> records = new ArrayList<>();
            for (String key : keysWithPrefix(PREFIX_SIGNED)) {
                try { records.add(new SignedPreKeyRecord(get(key))); }
                catch (InvalidMessageException ex) { throw new IllegalStateException("Invalid stored signed prekey", ex); }
            }
            return records;
        }

        @Override public synchronized void storeSignedPreKey(int signedPreKeyId, SignedPreKeyRecord record) {
            put(PREFIX_SIGNED + signedPreKeyId, record.serialize());
        }

        @Override public synchronized boolean containsSignedPreKey(int signedPreKeyId) {
            return preferences.contains(PREFIX_SIGNED + signedPreKeyId);
        }

        @Override public synchronized void removeSignedPreKey(int signedPreKeyId) { remove(PREFIX_SIGNED + signedPreKeyId); }

        @Override public void storeSenderKey(SignalProtocolAddress sender, UUID distributionId, SenderKeyRecord record) {
            senderKeys.storeSenderKey(sender, distributionId, record);
        }

        @Override public SenderKeyRecord loadSenderKey(SignalProtocolAddress sender, UUID distributionId) {
            return senderKeys.loadSenderKey(sender, distributionId);
        }

        @Override public synchronized KyberPreKeyRecord loadKyberPreKey(int kyberPreKeyId) throws InvalidKeyIdException {
            byte[] stored = get(PREFIX_KYBER + kyberPreKeyId);
            if (stored == null) throw new InvalidKeyIdException("No such Kyber prekey record: " + kyberPreKeyId);
            try { return new KyberPreKeyRecord(stored); }
            catch (InvalidMessageException ex) { throw new IllegalStateException("Invalid stored Kyber prekey", ex); }
        }

        @Override public synchronized List<KyberPreKeyRecord> loadKyberPreKeys() {
            ArrayList<KyberPreKeyRecord> records = new ArrayList<>();
            for (String key : keysWithPrefix(PREFIX_KYBER)) {
                try { records.add(new KyberPreKeyRecord(get(key))); }
                catch (InvalidMessageException ex) { throw new IllegalStateException("Invalid stored Kyber prekey", ex); }
            }
            return records;
        }

        @Override public synchronized void storeKyberPreKey(int kyberPreKeyId, KyberPreKeyRecord record) {
            put(PREFIX_KYBER + kyberPreKeyId, record.serialize());
        }

        @Override public synchronized boolean containsKyberPreKey(int kyberPreKeyId) {
            return preferences.contains(PREFIX_KYBER + kyberPreKeyId);
        }

        @Override public synchronized void markKyberPreKeyUsed(int kyberPreKeyId, int signedPreKeyId,
                ECPublicKey baseKey) throws ReusedBaseKeyException {
            String key = "kyber.used.base-keys";
            Set<String> used = new HashSet<>();
            byte[] bytes = get(key);
            if (bytes != null) {
                String values = new String(bytes, StandardCharsets.UTF_8);
                if (!values.isEmpty()) used.addAll(Arrays.asList(values.split("\\n")));
            }
            String token = kyberPreKeyId + ":" + signedPreKeyId + ":" + encode(baseKey.serialize());
            if (!used.add(token)) throw new ReusedBaseKeyException();
            StringBuilder serialized = new StringBuilder();
            for (String value : used) {
                if (serialized.length() > 0) serialized.append('\n');
                serialized.append(value);
            }
            put(key, serialized.toString().getBytes(StandardCharsets.UTF_8));
        }

        private static String encode(byte[] value) { return Base64.encodeToString(value, Base64.NO_WRAP); }
    }
}
