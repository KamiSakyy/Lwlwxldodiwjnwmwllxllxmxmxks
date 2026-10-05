package androidx.viewpager.widget;

import android.view.animation.Interpolator;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3157a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        switch (this.f3157a) {
            case k5.f.J /* 0 */:
            case 1:
            case 3:
            default:
                float f10 = f6 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            case 2:
                return f6 * f6 * f6 * f6 * f6;
        }
    }
}
