package e2;

import d2.t;

/* loaded from: /home/user/work/p/classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public c f21877a;

    /* renamed from: b, reason: collision with root package name */
    public c f21878b;

    /* renamed from: c, reason: collision with root package name */
    public c f21879c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f21880d;

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f21877a = cVar;
        this.f21878b = cVar2;
        this.f21879c = cVar3;
        this.f21880d = fArr;
    }

    public long a(long j10) {
        float h10 = t.h(j10);
        float g7 = t.g(j10);
        float e5 = t.e(j10);
        float d10 = t.d(j10);
        c cVar = this.f21878b;
        long d11 = cVar.d(h10, g7, e5);
        float intBitsToFloat = Float.intBitsToFloat((int) (d11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d11 & 4294967295L));
        float e10 = cVar.e(h10, g7, e5);
        float[] fArr = this.f21880d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e10 *= fArr[2];
        }
        float f6 = intBitsToFloat;
        float f10 = intBitsToFloat2;
        return this.f21879c.f(f6, f10, e10, d10, this.f21877a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(c cVar, c cVar2, int i) {
        this(cVar2, r0, r1, r3);
        float[] fArr;
        long j10 = cVar.f21850b;
        long j11 = b.f21844a;
        c a10 = b.a(j10, j11) ? j.a(cVar) : cVar;
        c a11 = b.a(cVar2.f21850b, j11) ? j.a(cVar2) : cVar2;
        if (i == 3) {
            boolean a12 = b.a(cVar.f21850b, j11);
            boolean a13 = b.a(cVar2.f21850b, j11);
            if ((!a12 || !a13) && (a12 || a13)) {
                s sVar = ((q) (a12 ? cVar : cVar2)).f21901d;
                float[] fArr2 = j.f21886e;
                float[] a14 = a12 ? sVar.a() : fArr2;
                fArr2 = a13 ? sVar.a() : fArr2;
                fArr = new float[]{a14[0] / fArr2[0], a14[1] / fArr2[1], a14[2] / fArr2[2]};
            }
        }
        fArr = null;
    }
}
