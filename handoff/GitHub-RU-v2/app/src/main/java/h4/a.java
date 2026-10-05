package h4;

import i4.q;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends q {

    /* renamed from: a, reason: collision with root package name */
    public b4.n f25488a;

    /* renamed from: b, reason: collision with root package name */
    public b4.k f25489b;

    /* renamed from: c, reason: collision with root package name */
    public b4.m f25490c;

    @Override // i4.q
    public final float a() {
        return this.f25490c.b();
    }

    public final void b(float f6, float f10, float f11, float f12, float f13, float f14) {
        b4.n nVar = this.f25488a;
        this.f25490c = nVar;
        nVar.l = f6;
        boolean z10 = f6 > f10;
        nVar.f3454k = z10;
        if (z10) {
            nVar.d(-f11, f6 - f10, f13, f14, f12);
        } else {
            nVar.d(f11, f10 - f6, f13, f14, f12);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        return this.f25490c.getInterpolation(f6);
    }
}
