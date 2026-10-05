package t;

import android.hardware.biometrics.BiometricPrompt;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class l {
    public static void a(BiometricPrompt.Builder builder, boolean z10) {
        builder.setConfirmationRequired(z10);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z10) {
        builder.setDeviceCredentialAllowed(z10);
    }
}
