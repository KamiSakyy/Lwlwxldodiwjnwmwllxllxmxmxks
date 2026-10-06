package w51;

import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean a(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable);
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public e(Object... a) {
    }
    public Object h(Object p1, Object p2, Object p3) { return null; }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
    public Object c() { return null; }
    public Object k(Object, Object) { return null; }
}
