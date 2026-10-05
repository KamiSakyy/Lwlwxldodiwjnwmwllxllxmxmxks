package z11;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
    public static boolean b = false;
    public static boolean c = false;
    public static final /* synthetic */ int e = 0;
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        if (!c) {
            try {
                PackageInfo f = i21.b.a(context).f("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                h.a(context);
                if (f == null || h.c(f, false) || !h.c(f, true)) {
                    b = false;
                } else {
                    b = true;
                }
                c = true;
            } catch (PackageManager.NameNotFoundException unused) {
                c = true;
            } catch (Throwable th) {
                c = true;
                throw th;
            }
        }
        return b || !"user".equals(Build.TYPE);
    }
}
