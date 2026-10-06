package com.github.rudroid.starredreposandlists;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.v1;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class t implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;

    public /* synthetic */ t(boolean z, int i) {
        this.r = i;
        this.s = z;
    }

    public final Object s(Object obj, Object obj2) {
        boolean z;
        switch (this.r) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    w1.o oVar = w1.o.a;
                    w1.r B = androidx.compose.foundation.layout.b.B(p2.d(oVar, 1.0f), 0.0f, ih.a.p, 0.0f, 0.0f, 13);
                    androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.e, w1.c.E, sVar, 54);
                    int hashCode = Long.hashCode(sVar.T);
                    v1 l = sVar.l();
                    w1.r c = w1.a.c(sVar, B);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar.g0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.q0();
                    }
                    androidx.compose.runtime.t.I(sVar, v2.g.f, a);
                    androidx.compose.runtime.t.I(sVar, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar, v2.g.h);
                    androidx.compose.runtime.t.I(sVar, v2.g.d, c);
                    float f = ih.a.n;
                    ub.b(i4.p0(2131953017, sVar), androidx.compose.foundation.layout.b.z(oVar, f, 0.0f, 2), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).a, sVar, 0, 0, 131068);
                    androidx.compose.runtime.s sVar2 = sVar;
                    if (this.s) {
                        sVar2.c0(-1618930243);
                        ub.b(i4.p0(2131953016, sVar2), androidx.compose.foundation.layout.b.y(oVar, f, ih.a.l), 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).q, sVar2, 0, 0, 130044);
                        sVar2 = sVar2;
                        z = false;
                    } else {
                        z = false;
                        sVar2.c0(-1620352306);
                    }
                    sVar2.q(z);
                    sVar2.q(true);
                } else {
                    sVar.V();
                }
                break;
            default:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar3.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    p5.a(z3.C(2131231498, 0, sVar3), i4.p0(2131953673, sVar3), (w1.r) null, 0L, sVar3, 8, 12);
                    z.x.e(this.s, (w1.r) null, z.n0.e((a0.d0) null, 3), z.n0.f((a0.d0) null, 3), (String) null, fh.a.a, sVar3, 200064, 18);
                } else {
                    sVar3.V();
                }
                break;
        }
        return w61.a0.a;
    }
    public static Object B(Object p1) { return null; }
    public static Object L(Object p1) { return null; }
    public static Object f(Object p1, Object p2, Object p3) { return null; }
}
