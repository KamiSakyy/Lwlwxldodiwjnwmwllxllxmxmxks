package g21;

import android.os.StrictMode;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
