package t;

import android.content.pm.PackageManager;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class f0 {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
