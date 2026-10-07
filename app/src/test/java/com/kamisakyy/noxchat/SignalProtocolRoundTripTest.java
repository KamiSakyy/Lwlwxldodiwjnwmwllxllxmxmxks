package com.kamisakyy.noxchat;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.signal.libsignal.protocol.message.CiphertextMessage;
import org.signal.libsignal.protocol.IdentityKeyPair;
import org.signal.libsignal.protocol.SessionBuilder;
import org.signal.libsignal.protocol.SessionCipher;
import org.signal.libsignal.protocol.SignalProtocolAddress;
import org.signal.libsignal.protocol.ecc.ECKeyPair;
import org.signal.libsignal.protocol.kem.KEMKeyPair;
import org.signal.libsignal.protocol.kem.KEMKeyType;
import org.signal.libsignal.protocol.message.PreKeySignalMessage;
import org.signal.libsignal.protocol.message.SignalMessage;
import org.signal.libsignal.protocol.state.impl.InMemorySignalProtocolStore;
import org.signal.libsignal.protocol.state.KyberPreKeyRecord;
import org.signal.libsignal.protocol.state.PreKeyBundle;
import org.signal.libsignal.protocol.state.SignedPreKeyRecord;
import org.signal.libsignal.protocol.util.KeyHelper;

import java.nio.charset.StandardCharsets;

public final class SignalProtocolRoundTripTest {
    private static final int DEVICE_ID = 1;
    private static final int SIGNED_PREKEY_ID = 17;
    private static final int KYBER_PREKEY_ID = 29;

    @Test
    public void pqxdhAndDoubleRatchetRoundTrip() throws Exception {
        InMemorySignalProtocolStore aliceStore = newStore();
        InMemorySignalProtocolStore bobStore = newStore();
        SignalProtocolAddress aliceAddress = new SignalProtocolAddress("alice-test", DEVICE_ID);
        SignalProtocolAddress bobAddress = new SignalProtocolAddress("bob-test", DEVICE_ID);

        ECKeyPair bobSignedPreKey = ECKeyPair.generate();
        byte[] signedSignature = bobStore.getIdentityKeyPair().getPrivateKey()
                .calculateSignature(bobSignedPreKey.getPublicKey().serialize());
        bobStore.storeSignedPreKey(SIGNED_PREKEY_ID, new SignedPreKeyRecord(
                SIGNED_PREKEY_ID, System.currentTimeMillis(), bobSignedPreKey, signedSignature));

        KEMKeyPair bobKyberPreKey = KEMKeyPair.generate(KEMKeyType.KYBER_1024);
        byte[] kyberSignature = bobStore.getIdentityKeyPair().getPrivateKey()
                .calculateSignature(bobKyberPreKey.getPublicKey().serialize());
        bobStore.storeKyberPreKey(KYBER_PREKEY_ID, new KyberPreKeyRecord(
                KYBER_PREKEY_ID, System.currentTimeMillis(), bobKyberPreKey, kyberSignature));

        PreKeyBundle bobBundle = new PreKeyBundle(
                bobStore.getLocalRegistrationId(),
                DEVICE_ID,
                PreKeyBundle.NULL_PRE_KEY_ID,
                null,
                SIGNED_PREKEY_ID,
                bobSignedPreKey.getPublicKey(),
                signedSignature,
                bobStore.getIdentityKeyPair().getPublicKey(),
                KYBER_PREKEY_ID,
                bobKyberPreKey.getPublicKey(),
                kyberSignature);

        new SessionBuilder(aliceStore, bobAddress, aliceAddress).process(bobBundle);
        SessionCipher aliceCipher = new SessionCipher(aliceStore, aliceAddress, bobAddress);
        SessionCipher bobCipher = new SessionCipher(bobStore, bobAddress, aliceAddress);

        byte[] firstMessage = "first authenticated message".getBytes(StandardCharsets.UTF_8);
        CiphertextMessage preKeyMessage = aliceCipher.encrypt(firstMessage);
        assertEquals(CiphertextMessage.PREKEY_TYPE, preKeyMessage.getType());
        assertArrayEquals(firstMessage, bobCipher.decrypt(new PreKeySignalMessage(preKeyMessage.serialize())));

        byte[] ratchetMessage = "reply under the Double Ratchet".getBytes(StandardCharsets.UTF_8);
        CiphertextMessage signalMessage = bobCipher.encrypt(ratchetMessage);
        assertEquals(CiphertextMessage.WHISPER_TYPE, signalMessage.getType());
        assertArrayEquals(ratchetMessage, aliceCipher.decrypt(new SignalMessage(signalMessage.serialize())));
    }

    private static InMemorySignalProtocolStore newStore() {
        IdentityKeyPair identity = IdentityKeyPair.generate();
        return new InMemorySignalProtocolStore(identity, KeyHelper.generateRegistrationId(false));
    }
}
