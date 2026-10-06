package zg;

import a0.d2Shadow;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static final void a(j71.a aVar, j71.a aVar2, w1.r rVar, final u uVar, b bVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        w1.r rVar2;
        final b bVar2 = bVar;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(aVar, "onFilesChangedItemClick");
        k71.k.g(aVar2, "onCommitsItemClick");
        sVar2.e0(1171199372);
        if ((i & 6) == 0) {
            i2 = i | (sVar2.h(aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar2.h(aVar2) ? 32 : 16;
        }
        int i3 = i2 | 384 | (sVar2.f(uVar) ? 2048 : 1024) | (sVar2.f(bVar2) ? 16384 : 8192);
        if (sVar2.S(i3 & 1, (i3 & 9363) != 9362)) {
            String p0 = i4.p0(2131953785, sVar2);
            String p02 = i4.p0(2131953786, sVar2);
            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r rVar3 = w1.o.a;
            w1.r c = w1.a.c(sVar2, rVar3);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
            float f = ih.a.n;
            e.a(48, 0, sVar2, i4.p0(2131954350, sVar2), androidx.compose.foundation.layout.b.z(rVar3, f, 0.0f, 2));
            float f2 = 56;
            w1.r b = p2.b(rVar3, 0.0f, f2, 1);
            d3.k kVar = new d3.k(0);
            boolean z = (i3 & 14) == 4;
            Object N = sVar2.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            Object obj = N;
            if (z || N == iVar) {
                qd.g gVar = new qd.g(19, aVar);
                sVar2.n0(gVar);
                obj = gVar;
            }
            w1.r z2 = androidx.compose.foundation.layout.b.z(f0.o.m(b, false, p0, kVar, (j71.a) obj, 9), f, 0.0f, 2);
            Object N2 = sVar2.N();
            if (N2 == iVar) {
                N2 = new ze.a(2);
                sVar2.n0(N2);
            }
            w1.r b2 = d3.q.b(z2, true, (j71.c) N2);
            float f3 = ih.a.k;
            w1.r B = androidx.compose.foundation.layout.b.B(rVar3, 0.0f, f3, 0.0f, 0.0f, 13);
            final int i4 = 0;
            final int i5 = 1;
            z.a(b2, 2131231265, 0L, B, null, false, r1.i.d(1284400406, new j71.e() { // from class: zg.f
                public final Object s(Object obj2, Object obj3) {
                    switch (i4) {
                        case 0:
                            androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if (sVar3.S(intValue & 1, (intValue & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    l0.a.a("invalid weight; must be greater than zero");
                                }
                                w1 w1Var = new w1(1.0f, true);
                                l2 a2 = j2.a(androidx.compose.foundation.layout.l.a, w1.c.A, sVar3, 0);
                                int hashCode2 = Long.hashCode(sVar3.T);
                                v1 l2 = sVar3.l();
                                w1.r c2 = w1.a.c(sVar3, w1Var);
                                v2.h.o.getClass();
                                v2.f fVar2 = v2.g.b;
                                sVar3.g0();
                                if (sVar3.S) {
                                    sVar3.k(fVar2);
                                } else {
                                    sVar3.q0();
                                }
                                androidx.compose.runtime.t.I(sVar3, v2.g.f, a2);
                                androidx.compose.runtime.t.I(sVar3, v2.g.e, l2);
                                androidx.compose.runtime.t.w(sVar3, Integer.valueOf(hashCode2), v2.g.g);
                                androidx.compose.runtime.t.E(sVar3, v2.g.h);
                                androidx.compose.runtime.t.I(sVar3, v2.g.d, c2);
                                u uVar2 = uVar;
                                ub.b(i4.q0(2131953431, new Object[]{Integer.valueOf(uVar2.b)}, sVar3), (w1.r) null, ih.d.a(sVar3).z, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar3, 0, 0, 262138);
                                androidx.compose.foundation.layout.b.g(sVar3, p2.s(w1.o.a, ih.a.k));
                                ub.b(i4.q0(2131952601, new Object[]{Integer.valueOf(uVar2.c)}, sVar3), (w1.r) null, ih.d.a(sVar3).d, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar3, 0, 0, 262138);
                                sVar3.q(true);
                            } else {
                                sVar3.V();
                            }
                            break;
                        default:
                            androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                int i6 = uVar.a;
                                ub.b(i4.n0(2131820583, i6, new Object[]{Integer.valueOf(i6)}, sVar4), (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar4).l, sVar4, 0, 0, 131070);
                            } else {
                                sVar4.V();
                            }
                            break;
                    }
                    return w61.a0.a;
                }
            }, sVar2), r1.i.d(-1181360553, new j71.e() { // from class: zg.f
                public final Object s(Object obj2, Object obj3) {
                    switch (i5) {
                        case 0:
                            androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if (sVar3.S(intValue & 1, (intValue & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    l0.a.a("invalid weight; must be greater than zero");
                                }
                                w1 w1Var = new w1(1.0f, true);
                                l2 a2 = j2.a(androidx.compose.foundation.layout.l.a, w1.c.A, sVar3, 0);
                                int hashCode2 = Long.hashCode(sVar3.T);
                                v1 l2 = sVar3.l();
                                w1.r c2 = w1.a.c(sVar3, w1Var);
                                v2.h.o.getClass();
                                v2.f fVar2 = v2.g.b;
                                sVar3.g0();
                                if (sVar3.S) {
                                    sVar3.k(fVar2);
                                } else {
                                    sVar3.q0();
                                }
                                androidx.compose.runtime.t.I(sVar3, v2.g.f, a2);
                                androidx.compose.runtime.t.I(sVar3, v2.g.e, l2);
                                androidx.compose.runtime.t.w(sVar3, Integer.valueOf(hashCode2), v2.g.g);
                                androidx.compose.runtime.t.E(sVar3, v2.g.h);
                                androidx.compose.runtime.t.I(sVar3, v2.g.d, c2);
                                u uVar2 = uVar;
                                ub.b(i4.q0(2131953431, new Object[]{Integer.valueOf(uVar2.b)}, sVar3), (w1.r) null, ih.d.a(sVar3).z, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar3, 0, 0, 262138);
                                androidx.compose.foundation.layout.b.g(sVar3, p2.s(w1.o.a, ih.a.k));
                                ub.b(i4.q0(2131952601, new Object[]{Integer.valueOf(uVar2.c)}, sVar3), (w1.r) null, ih.d.a(sVar3).d, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar3, 0, 0, 262138);
                                sVar3.q(true);
                            } else {
                                sVar3.V();
                            }
                            break;
                        default:
                            androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                int i6 = uVar.a;
                                ub.b(i4.n0(2131820583, i6, new Object[]{Integer.valueOf(i6)}, sVar4), (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar4).l, sVar4, 0, 0, 131070);
                            } else {
                                sVar4.V();
                            }
                            break;
                    }
                    return w61.a0.a;
                }
            }, sVar2), null, sVar2, 14158848, 308);
            w1.r b3 = p2.b(rVar3, 0.0f, f2, 1);
            d3.k kVar2 = new d3.k(0);
            boolean z3 = (i3 & 112) == 32;
            Object N3 = sVar2.N();
            Object obj2 = N3;
            if (z3 || N3 == iVar) {
                qd.g gVar2 = new qd.g(20, aVar2);
                sVar2.n0(gVar2);
                obj2 = gVar2;
            }
            w1.r z4 = androidx.compose.foundation.layout.b.z(f0.o.m(b3, false, p02, kVar2, (j71.a) obj2, 9), f, 0.0f, 2);
            Object N4 = sVar2.N();
            if (N4 == iVar) {
                N4 = new ze.a(3);
                sVar2.n0(N4);
            }
            w1.r b4 = d3.q.b(z4, true, (j71.c) N4);
            w1.r B2 = androidx.compose.foundation.layout.b.B(rVar3, 0.0f, f3, 0.0f, 0.0f, 13);
            final int i6 = 0;
            bVar2 = bVar;
            r1.d d = r1.i.d(955282637, new j71.e() { // from class: zg.g
                public final Object s(Object obj3, Object obj4) {
                    switch (i6) {
                        case 0:
                            androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            if (sVar3.S(intValue & 1, (intValue & 3) != 2)) {
                                ub.b(bVar2.b, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar3).v, sVar3, 0, 0, 131070);
                            } else {
                                sVar3.V();
                            }
                            break;
                        default:
                            androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                int i7 = bVar2.a;
                                ub.b(i4.n0(2131820587, i7, new Object[]{Integer.valueOf(i7)}, sVar4), (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar4).l, sVar4, 0, 0, 131070);
                            } else {
                                sVar4.V();
                            }
                            break;
                    }
                    return w61.a0.a;
                }
            }, sVar2);
            final int i7 = 1;
            z.a(b4, 2131231283, 0L, B2, null, false, d, r1.i.d(-2114018866, new j71.e() { // from class: zg.g
                public final Object s(Object obj3, Object obj4) {
                    switch (i7) {
                        case 0:
                            androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            if (sVar3.S(intValue & 1, (intValue & 3) != 2)) {
                                ub.b(bVar2.b, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar3).v, sVar3, 0, 0, 131070);
                            } else {
                                sVar3.V();
                            }
                            break;
                        default:
                            androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                int i72 = bVar2.a;
                                ub.b(i4.n0(2131820587, i72, new Object[]{Integer.valueOf(i72)}, sVar4), (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar4).l, sVar4, 0, 0, 131070);
                            } else {
                                sVar4.V();
                            }
                            break;
                    }
                    return w61.a0.a;
                }
            }, sVar2), null, sVar2, 14158848, 308);
            sVar2 = sVar2;
            sVar2.q(true);
            rVar2 = rVar3;
        } else {
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new d2(aVar, aVar2, rVar2, uVar, bVar2, i, 13);
        }
    }
    public static final Object o = null;
}
