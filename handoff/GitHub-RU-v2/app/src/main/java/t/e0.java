package t;

import android.app.KeyguardManager;
import android.content.Context;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class e0 {
    public static KeyguardManager a(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean b(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
