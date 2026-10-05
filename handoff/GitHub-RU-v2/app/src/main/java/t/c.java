package t;

import android.hardware.biometrics.BiometricPrompt;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c {
    public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getAuthenticationType();
    }
}
