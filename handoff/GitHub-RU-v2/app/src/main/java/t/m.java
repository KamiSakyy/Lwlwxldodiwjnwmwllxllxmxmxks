package t;

import android.hardware.biometrics.BiometricPrompt;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class m {
    public static void a(BiometricPrompt.Builder builder, int i) {
        builder.setAllowedAuthenticators(i);
    }
}
