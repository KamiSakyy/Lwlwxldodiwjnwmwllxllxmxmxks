package w;

import android.graphics.drawable.Drawable;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f32917a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f6, float f10, boolean z10) {
        if (!z10) {
            return f6;
        }
        return (float) (((1.0d - f32917a) * f10) + f6);
    }

    public static float b(float f6, float f10, boolean z10) {
        if (!z10) {
            return f6 * 1.5f;
        }
        return (float) (((1.0d - f32917a) * f10) + (f6 * 1.5f));
    }
}
