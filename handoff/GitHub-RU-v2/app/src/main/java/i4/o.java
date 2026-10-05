package i4;

import android.view.animation.Interpolator;

/* loaded from: /home/user/work/p/classes.dex */
public final class o implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.e f25949b;

    public /* synthetic */ o(b4.e eVar, int i) {
        this.f25948a = i;
        this.f25949b = eVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        double a10;
        switch (this.f25948a) {
            case k5.f.J:
                a10 = this.f25949b.a(f6);
                break;
            case 1:
                a10 = this.f25949b.a(f6);
                break;
            default:
                a10 = this.f25949b.a(f6);
                break;
        }
        return (float) a10;
    }
}
