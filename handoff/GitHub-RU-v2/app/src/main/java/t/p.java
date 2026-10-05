package t;

import android.hardware.biometrics.BiometricManager;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class p {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
