package q;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f30608a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f30609b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f30610c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f30608a);
        } else {
            drawable.setState(f30609b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets a10 = h1.a(drawable);
            return new Rect(m11.r.g(a10), m11.r.j(a10), m11.r.l(a10), m11.r.m(a10));
        }
        boolean z10 = drawable instanceof s4.a;
        Object obj = drawable;
        if (z10) {
            ((s4.b) ((s4.a) drawable)).getClass();
            obj = null;
        }
        if (i >= 29) {
            boolean z11 = g1.f30583a;
        } else if (g1.f30583a) {
            try {
                Object invoke = g1.f30584b.invoke(obj, null);
                if (invoke != null) {
                    return new Rect(g1.f30585c.getInt(invoke), g1.f30586d.getInt(invoke), g1.f30587e.getInt(invoke), g1.f30588f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f30610c;
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
