package com.github.rudroid.uitoolkit.listitems;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import w2.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, j71.f fVar, r1.d dVar, j71.f fVar2, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        j71.f fVar3;
        int i4;
        j71.f fVar4;
        w1.r rVar3;
        j71.f fVar5;
        j71.f fVar6;
        b2 t;
        sVar.e0(-156648352);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            fVar3 = fVar;
            i3 |= sVar.h(fVar3) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= sVar.h(dVar) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                fVar4 = fVar2;
                i3 |= sVar.h(fVar4) ? 2048 : 1024;
                if (sVar.S(i3 & 1, (i3 & 1171) != 1170)) {
                    w1.r rVar4 = w1.o.a;
                    if (i5 != 0) {
                        rVar2 = rVar4;
                    }
                    j71.f fVar7 = i6 != 0 ? null : fVar3;
                    j71.f fVar8 = i4 != 0 ? null : fVar4;
                    w1.r b = p2.b(rVar2, 0.0f, 52, 1);
                    v0 d = androidx.compose.foundation.layout.t.d(w1.c.r, false);
                    int hashCode = Long.hashCode(sVar.T);
                    v1 l = sVar.l();
                    w1.r c = w1.a.c(sVar, b);
                    v2.h.o.getClass();
                    v2.f fVar9 = v2.g.b;
                    sVar.g0();
                    if (sVar.S) {
                        sVar.k(fVar9);
                    } else {
                        sVar.q0();
                    }
                    androidx.compose.runtime.t.I(sVar, v2.g.f, d);
                    androidx.compose.runtime.t.I(sVar, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar, v2.g.h);
                    androidx.compose.runtime.t.I(sVar, v2.g.d, c);
                    w1.r a = androidx.compose.foundation.layout.y.a.a(p2.e(rVar4, 1.0f), w1.c.v);
                    sVar.c0(-1003410150);
                    sVar.c0(212064437);
                    sVar.q(false);
                    s3.c cVar = (s3.c) sVar.j(g1.h);
                    Object N = sVar.N();
                    Object obj = androidx.compose.runtime.n.a;
                    if (N == obj) {
                        N = new y3.o(cVar);
                        sVar.n0(N);
                    }
                    y3.o oVar = (y3.o) N;
                    Object N2 = sVar.N();
                    if (N2 == obj) {
                        N2 = new y3.k();
                        sVar.n0(N2);
                    }
                    y3.k kVar = (y3.k) N2;
                    Object N3 = sVar.N();
                    if (N3 == obj) {
                        N3 = androidx.compose.runtime.t.B(Boolean.FALSE);
                        sVar.n0(N3);
                    }
                    f1 f1Var = (f1) N3;
                    Object N4 = sVar.N();
                    if (N4 == obj) {
                        N4 = new y3.m(kVar);
                        sVar.n0(N4);
                    }
                    y3.m mVar = (y3.m) N4;
                    Object N5 = sVar.N();
                    if (N5 == obj) {
                        p1 p1Var = new p1(w61.a0.a, androidx.compose.runtime.i.u);
                        sVar.n0(p1Var);
                        N5 = p1Var;
                    }
                    f1 f1Var2 = (f1) N5;
                    boolean h = sVar.h(oVar) | sVar.d(257);
                    Object N6 = sVar.N();
                    if (h || N6 == obj) {
                        N6 = new u(f1Var2, oVar, mVar, f1Var);
                        sVar.n0(N6);
                    }
                    v0 v0Var = (v0) N6;
                    Object N7 = sVar.N();
                    if (N7 == obj) {
                        N7 = new v(f1Var, mVar);
                        sVar.n0(N7);
                    }
                    j71.a aVar = (j71.a) N7;
                    boolean h2 = sVar.h(oVar);
                    Object N8 = sVar.N();
                    if (h2 || N8 == obj) {
                        N8 = new w(oVar);
                        sVar.n0(N8);
                    }
                    androidx.compose.ui.layout.z.a(d3.q.b(a, false, (j71.c) N8), r1.i.d(1200550679, new x(f1Var2, kVar, aVar, fVar7, fVar8, dVar), sVar), v0Var, sVar, 48);
                    sVar.q(false);
                    sVar.q(true);
                    rVar3 = rVar2;
                    fVar5 = fVar7;
                    fVar6 = fVar8;
                } else {
                    sVar.V();
                    rVar3 = rVar2;
                    fVar5 = fVar3;
                    fVar6 = fVar4;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new com.github.rudroid.achievements.ui.b0(rVar3, fVar5, dVar, fVar6, i, i2, 19);
                    return;
                }
                return;
            }
            fVar4 = fVar2;
            if (sVar.S(i3 & 1, (i3 & 1171) != 1170)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        fVar3 = fVar;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        fVar4 = fVar2;
        if (sVar.S(i3 & 1, (i3 & 1171) != 1170)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }
}
