package t;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class o {
    public static int a(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    public static BiometricManager b(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }
}
