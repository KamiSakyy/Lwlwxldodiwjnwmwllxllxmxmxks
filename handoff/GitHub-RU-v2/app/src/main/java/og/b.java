package og;

import d2.e0;
import d2.t;
import f2.d;
import f2.e;
import k71.k;
import v2.i0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final void a(i0 i0Var, boolean z, boolean z2, float f, long j) {
        k.g(i0Var, "$this$drawFadingEdges");
        if (z || z2) {
            f2.b bVar = i0Var.r;
            float i0 = bVar.i0(f);
            if (z) {
                e0 a = rb0.b.a(l.r(new t[]{new t(j), new t(t.j)}), 0.0f, i0, 8);
                float intBitsToFloat = Float.intBitsToFloat((int) (bVar.a() & 4294967295L));
                d.u(i0Var, a, 0L, (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(i0) << 32), 0.0f, (e) null, 0, 122);
            }
            if (z2) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.a() & 4294967295L));
                d.u(i0Var, rb0.b.a(l.r(new t[]{new t(t.j), new t(j)}), Float.intBitsToFloat((int) (bVar.a() >> 32)) - i0, Float.intBitsToFloat((int) (bVar.a() >> 32)), 8), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.a() >> 32)) - i0) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(i0) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), 0.0f, (e) null, 0, 120);
            }
        }
    }
}
