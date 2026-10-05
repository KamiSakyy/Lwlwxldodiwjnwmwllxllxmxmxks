package c6;

import android.os.StrictMode;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class e {
    public static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
