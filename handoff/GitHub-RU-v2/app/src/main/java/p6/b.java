package p6;

import android.view.animation.Interpolator;
import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public float[] f30407a;

    /* renamed from: b, reason: collision with root package name */
    public float f30408b;

    public b(float[] fArr) {
        this.f30407a = fArr;
        this.f30408b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f30407a;
        int min = Math.min((int) ((fArr.length - 1) * f6), fArr.length - 2);
        float f10 = this.f30408b;
        float f11 = (f6 - (min * f10)) / f10;
        float f12 = fArr[min];
        return i.a(fArr[min + 1], f12, f11, f12);
    }
}
