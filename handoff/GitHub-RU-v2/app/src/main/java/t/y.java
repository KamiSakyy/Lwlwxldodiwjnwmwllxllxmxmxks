package t;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class y {
    public static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    public static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }
}
