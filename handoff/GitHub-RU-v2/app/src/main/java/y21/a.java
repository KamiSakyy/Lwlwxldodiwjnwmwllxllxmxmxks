package y21;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final p6.a b = new p6.a(1);
    public static final p6.a c = new p6.a(0);
    public static final p6.a d = new p6.a(p6.a.e);
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return i.a(f2, f, f3, f);
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(int i, float f, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }

    public static Object c;

    public static Object c(Object... a) {
        return null;
    }
    public static final Object e = null;
}
