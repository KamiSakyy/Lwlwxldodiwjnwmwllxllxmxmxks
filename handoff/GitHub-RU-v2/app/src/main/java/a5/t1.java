package a5;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* loaded from: /home/user/work/p/classes.dex */
public abstract /* synthetic */ class t1 {
    public static /* synthetic */ WindowInsetsAnimation.Bounds a(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation b(int i, Interpolator interpolator, long j10) {
        return new WindowInsetsAnimation(i, interpolator, j10);
    }

    public static /* synthetic */ void c() {
    }
}
