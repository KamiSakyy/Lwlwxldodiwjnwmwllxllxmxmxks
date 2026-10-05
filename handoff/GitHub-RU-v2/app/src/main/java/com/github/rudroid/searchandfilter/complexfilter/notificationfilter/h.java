package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import a0.r1;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import f0.z1;
import f1.p5;
import f1.ub;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static final void a(int i, androidx.compose.runtime.s sVar, String str, w1.r rVar) {
        w1.r rVar2;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(-1178640919);
        int i2 = i | 6 | (sVar.f(str) ? 32 : 16);
        if (sVar2.S(i2 & 1, (i2 & 19) != 18)) {
            float f = ih.a.n;
            float f2 = ih.a.l;
            w1.r rVar3 = w1.o.a;
            w1.r B = androidx.compose.foundation.layout.b.B(rVar3, f2, 0.0f, f2, f, 2);
            l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.A, sVar2, 0);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, B);
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
            ub.b("•", androidx.compose.foundation.layout.b.B(rVar3, 0.0f, 0.0f, f2, 0.0f, 11), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar2).n, 0L, t1.C(18), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777213), sVar, 6, 0, 131068);
            ub.b(str, androidx.compose.foundation.layout.b.B(rVar3, 0.0f, 2, 0.0f, 0.0f, 13), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).n, sVar, ((i2 >> 3) & 14) | 48, 0, 131068);
            sVar2 = sVar;
            sVar2.q(true);
            rVar2 = rVar3;
        } else {
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new bd.q(rVar2, str, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(j71.a aVar, z1 z1Var, androidx.compose.runtime.s sVar, int i, int i2) {
        j71.a aVar2;
        int i3;
        z1 z1Var2;
        int i4;
        int i5;
        z1 z1Var3;
        b2 t;
        j71.a aVar3;
        j71.a aVar4;
        z1 v;
        int i6;
        Object N;
        j71.a aVar5;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(-1750452876);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i3 = i | (sVar2.h(aVar2) ? 4 : 2);
        }
        if ((i2 & 2) == 0) {
            z1Var2 = z1Var;
            if (sVar2.f(z1Var2)) {
                i4 = 32;
                i5 = i3 | i4;
                if (sVar2.S(i5 & 1, (i5 & 19) == 18)) {
                    sVar2.V();
                    z1Var3 = z1Var2;
                } else {
                    sVar2.X();
                    int i8 = i & 1;
                    Object obj = androidx.compose.runtime.n.a;
                    if (i8 == 0 || sVar2.A()) {
                        if (i7 != 0) {
                            Object N2 = sVar2.N();
                            if (N2 == obj) {
                                N2 = new com.github.rudroid.widget.p(15);
                                sVar2.n0(N2);
                            }
                            aVar3 = (j71.a) N2;
                        } else {
                            aVar3 = aVar2;
                        }
                        if ((i2 & 2) != 0) {
                            aVar4 = aVar3;
                            v = f0.o.v(sVar2);
                            i6 = i5 & (-113);
                            sVar2.r();
                            float f = 72;
                            float f2 = ih.a.q;
                            long j = ih.d.b(sVar2).d;
                            w1.o oVar = w1.o.a;
                            d2.l0 l0Var = d2.a0.b;
                            w1.r c = p2.c(f0.o.f(oVar, j, l0Var), 1.0f);
                            w1.j jVar = w1.c.r;
                            androidx.compose.ui.layout.v0 d = androidx.compose.foundation.layout.t.d(jVar, false);
                            int hashCode = Long.hashCode(sVar2.T);
                            v1 l = sVar2.l();
                            w1.r c2 = w1.a.c(sVar2, c);
                            v2.h.o.getClass();
                            j71.a aVar6 = v2.g.b;
                            sVar2.g0();
                            if (sVar2.S) {
                                sVar2.q0();
                            } else {
                                sVar2.k(aVar6);
                            }
                            v2.e eVar = v2.g.f;
                            androidx.compose.runtime.t.I(sVar2, eVar, d);
                            v2.e eVar2 = v2.g.e;
                            androidx.compose.runtime.t.I(sVar2, eVar2, l);
                            Integer valueOf = Integer.valueOf(hashCode);
                            v2.e eVar3 = v2.g.g;
                            androidx.compose.runtime.t.w(sVar2, valueOf, eVar3);
                            v2.d dVar = v2.g.h;
                            androidx.compose.runtime.t.E(sVar2, dVar);
                            v2.e eVar4 = v2.g.d;
                            androidx.compose.runtime.t.I(sVar2, eVar4, c2);
                            w1.r B = androidx.compose.foundation.layout.b.B(f0.o.w(androidx.compose.foundation.layout.b.z(oVar, f2, 0.0f, 2), v, true), 0.0f, 0.0f, 0.0f, f, 7);
                            androidx.compose.foundation.layout.g gVar = androidx.compose.foundation.layout.l.c;
                            w1.h hVar = w1.c.D;
                            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(gVar, hVar, sVar2, 0);
                            z1 z1Var4 = v;
                            int hashCode2 = Long.hashCode(sVar2.T);
                            v1 l2 = sVar2.l();
                            w1.r c3 = w1.a.c(sVar2, B);
                            sVar2.g0();
                            if (sVar2.S) {
                                sVar2.q0();
                            } else {
                                sVar2.k(aVar6);
                            }
                            androidx.compose.runtime.t.I(sVar2, eVar, a);
                            androidx.compose.runtime.t.I(sVar2, eVar2, l2);
                            f1.e.t(hashCode2, sVar2, eVar3, sVar2, dVar);
                            androidx.compose.runtime.t.I(sVar2, eVar4, c3);
                            c(null, sVar2, 0);
                            float f3 = ih.a.n;
                            ub.b(i4.p0(2131952725, sVar2), androidx.compose.foundation.layout.b.B(oVar, 0.0f, 0.0f, 0.0f, f3, 7), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar2).a, 0L, t1.C(34), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777213), sVar, 0, 0, 131068);
                            ub.b(i4.p0(2131952635, sVar), androidx.compose.foundation.layout.b.B(oVar, 0.0f, 0.0f, 0.0f, f3, 7), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).u, sVar, 0, 0, 131068);
                            com.github.rudroid.uitoolkit.k0.a(androidx.compose.foundation.layout.b.B(oVar, 0.0f, 0.0f, 0.0f, f3, 7), 0L, 0L, 0.0f, false, sVar, 0, 30);
                            N = sVar.N();
                            if (N == obj) {
                                N = new com.github.rudroid.searchandfilter.complexfilter.explore.a0(3);
                                sVar.n0(N);
                            }
                            w1.r b = d3.q.b(oVar, true, (j71.c) N);
                            androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(gVar, hVar, sVar, 0);
                            int hashCode3 = Long.hashCode(sVar.T);
                            v1 l3 = sVar.l();
                            w1.r c4 = w1.a.c(sVar, b);
                            sVar.g0();
                            if (sVar.S) {
                                aVar5 = aVar6;
                                sVar.q0();
                            } else {
                                aVar5 = aVar6;
                                sVar.k(aVar5);
                            }
                            androidx.compose.runtime.t.I(sVar, eVar, a2);
                            androidx.compose.runtime.t.I(sVar, eVar2, l3);
                            f1.e.t(hashCode3, sVar, eVar3, sVar, dVar);
                            androidx.compose.runtime.t.I(sVar, eVar4, c4);
                            a(0, sVar, i4.p0(2131952634, sVar), null);
                            a(0, sVar, i4.p0(2131952631, sVar), null);
                            a(0, sVar, i4.p0(2131952633, sVar), null);
                            a(0, sVar, i4.p0(2131952630, sVar), null);
                            a(0, sVar, i4.p0(2131952632, sVar), null);
                            sVar.q(true);
                            sVar.q(true);
                            w1.r e = p2.e(f0.o.f(p2.f(oVar, f), ih.d.b(sVar).d, l0Var), 1.0f);
                            w1.j jVar2 = w1.c.y;
                            androidx.compose.foundation.layout.y yVar = androidx.compose.foundation.layout.y.a;
                            w1.r a3 = yVar.a(e, jVar2);
                            androidx.compose.ui.layout.v0 d2 = androidx.compose.foundation.layout.t.d(jVar, false);
                            int hashCode4 = Long.hashCode(sVar.T);
                            v1 l4 = sVar.l();
                            w1.r c5 = w1.a.c(sVar, a3);
                            sVar.g0();
                            if (sVar.S) {
                                sVar.q0();
                            } else {
                                sVar.k(aVar5);
                            }
                            androidx.compose.runtime.t.I(sVar, eVar, d2);
                            androidx.compose.runtime.t.I(sVar, eVar2, l4);
                            f1.e.t(hashCode4, sVar, eVar3, sVar, dVar);
                            androidx.compose.runtime.t.I(sVar, eVar4, c5);
                            com.github.rudroid.uitoolkit.k0.a(yVar.a(oVar, w1.c.s), 0L, 0L, 0.0f, false, sVar, 0, 30);
                            aVar2 = aVar4;
                            sg.k0.b(androidx.compose.foundation.layout.b.y(p2.e(oVar, 1.0f), f2, f3), false, aVar2, sg.v.d(0, sVar), i4.p0(2131952531, sVar), null, sVar, (i6 << 6) & 896, 34);
                            sVar2 = sVar;
                            sVar2.q(true);
                            sVar2.q(true);
                            z1Var3 = z1Var4;
                        } else {
                            aVar4 = aVar3;
                        }
                    } else {
                        sVar2.V();
                        if ((i2 & 2) != 0) {
                            i5 &= -113;
                        }
                        aVar4 = aVar2;
                    }
                    i6 = i5;
                    v = z1Var2;
                    sVar2.r();
                    float f4 = 72;
                    float f22 = ih.a.q;
                    long j2 = ih.d.b(sVar2).d;
                    w1.o oVar2 = w1.o.a;
                    d2.l0 l0Var2 = d2.a0.b;
                    w1.r c6 = p2.c(f0.o.f(oVar2, j2, l0Var2), 1.0f);
                    w1.j jVar3 = w1.c.r;
                    androidx.compose.ui.layout.v0 d3 = androidx.compose.foundation.layout.t.d(jVar3, false);
                    int hashCode5 = Long.hashCode(sVar2.T);
                    v1 l5 = sVar2.l();
                    w1.r c22 = w1.a.c(sVar2, c6);
                    v2.h.o.getClass();
                    j71.a aVar62 = v2.g.b;
                    sVar2.g0();
                    if (sVar2.S) {
                    }
                    v2.e eVar5 = v2.g.f;
                    androidx.compose.runtime.t.I(sVar2, eVar5, d3);
                    v2.e eVar22 = v2.g.e;
                    androidx.compose.runtime.t.I(sVar2, eVar22, l5);
                    Integer valueOf2 = Integer.valueOf(hashCode5);
                    v2.e eVar32 = v2.g.g;
                    androidx.compose.runtime.t.w(sVar2, valueOf2, eVar32);
                    v2.d dVar2 = v2.g.h;
                    androidx.compose.runtime.t.E(sVar2, dVar2);
                    v2.e eVar42 = v2.g.d;
                    androidx.compose.runtime.t.I(sVar2, eVar42, c22);
                    w1.r B2 = androidx.compose.foundation.layout.b.B(f0.o.w(androidx.compose.foundation.layout.b.z(oVar2, f22, 0.0f, 2), v, true), 0.0f, 0.0f, 0.0f, f4, 7);
                    androidx.compose.foundation.layout.g gVar2 = androidx.compose.foundation.layout.l.c;
                    w1.h hVar2 = w1.c.D;
                    androidx.compose.foundation.layout.e0 a4 = androidx.compose.foundation.layout.c0.a(gVar2, hVar2, sVar2, 0);
                    z1 z1Var42 = v;
                    int hashCode22 = Long.hashCode(sVar2.T);
                    v1 l22 = sVar2.l();
                    w1.r c32 = w1.a.c(sVar2, B2);
                    sVar2.g0();
                    if (sVar2.S) {
                    }
                    androidx.compose.runtime.t.I(sVar2, eVar5, a4);
                    androidx.compose.runtime.t.I(sVar2, eVar22, l22);
                    f1.e.t(hashCode22, sVar2, eVar32, sVar2, dVar2);
                    androidx.compose.runtime.t.I(sVar2, eVar42, c32);
                    c(null, sVar2, 0);
                    float f32 = ih.a.n;
                    ub.b(i4.p0(2131952725, sVar2), androidx.compose.foundation.layout.b.B(oVar2, 0.0f, 0.0f, 0.0f, f32, 7), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar2).a, 0L, t1.C(34), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777213), sVar, 0, 0, 131068);
                    ub.b(i4.p0(2131952635, sVar), androidx.compose.foundation.layout.b.B(oVar2, 0.0f, 0.0f, 0.0f, f32, 7), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).u, sVar, 0, 0, 131068);
                    com.github.rudroid.uitoolkit.k0.a(androidx.compose.foundation.layout.b.B(oVar2, 0.0f, 0.0f, 0.0f, f32, 7), 0L, 0L, 0.0f, false, sVar, 0, 30);
                    N = sVar.N();
                    if (N == obj) {
                    }
                    w1.r b2 = d3.q.b(oVar2, true, (j71.c) N);
                    androidx.compose.foundation.layout.e0 a22 = androidx.compose.foundation.layout.c0.a(gVar2, hVar2, sVar, 0);
                    int hashCode32 = Long.hashCode(sVar.T);
                    v1 l32 = sVar.l();
                    w1.r c42 = w1.a.c(sVar, b2);
                    sVar.g0();
                    if (sVar.S) {
                    }
                    androidx.compose.runtime.t.I(sVar, eVar5, a22);
                    androidx.compose.runtime.t.I(sVar, eVar22, l32);
                    f1.e.t(hashCode32, sVar, eVar32, sVar, dVar2);
                    androidx.compose.runtime.t.I(sVar, eVar42, c42);
                    a(0, sVar, i4.p0(2131952634, sVar), null);
                    a(0, sVar, i4.p0(2131952631, sVar), null);
                    a(0, sVar, i4.p0(2131952633, sVar), null);
                    a(0, sVar, i4.p0(2131952630, sVar), null);
                    a(0, sVar, i4.p0(2131952632, sVar), null);
                    sVar.q(true);
                    sVar.q(true);
                    w1.r e2 = p2.e(f0.o.f(p2.f(oVar2, f4), ih.d.b(sVar).d, l0Var2), 1.0f);
                    w1.j jVar22 = w1.c.y;
                    androidx.compose.foundation.layout.y yVar2 = androidx.compose.foundation.layout.y.a;
                    w1.r a32 = yVar2.a(e2, jVar22);
                    androidx.compose.ui.layout.v0 d22 = androidx.compose.foundation.layout.t.d(jVar3, false);
                    int hashCode42 = Long.hashCode(sVar.T);
                    v1 l42 = sVar.l();
                    w1.r c52 = w1.a.c(sVar, a32);
                    sVar.g0();
                    if (sVar.S) {
                    }
                    androidx.compose.runtime.t.I(sVar, eVar5, d22);
                    androidx.compose.runtime.t.I(sVar, eVar22, l42);
                    f1.e.t(hashCode42, sVar, eVar32, sVar, dVar2);
                    androidx.compose.runtime.t.I(sVar, eVar42, c52);
                    com.github.rudroid.uitoolkit.k0.a(yVar2.a(oVar2, w1.c.s), 0L, 0L, 0.0f, false, sVar, 0, 30);
                    aVar2 = aVar4;
                    sg.k0.b(androidx.compose.foundation.layout.b.y(p2.e(oVar2, 1.0f), f22, f32), false, aVar2, sg.v.d(0, sVar), i4.p0(2131952531, sVar), null, sVar, (i6 << 6) & 896, 34);
                    sVar2 = sVar;
                    sVar2.q(true);
                    sVar2.q(true);
                    z1Var3 = z1Var42;
                }
                j71.a aVar7 = aVar2;
                t = sVar2.t();
                if (t == null) {
                    t.d = new r1(aVar7, z1Var3, i, i2, 19);
                    return;
                }
                return;
            }
        } else {
            z1Var2 = z1Var;
        }
        i4 = 16;
        i5 = i3 | i4;
        if (sVar2.S(i5 & 1, (i5 & 19) == 18)) {
        }
        j71.a aVar72 = aVar2;
        t = sVar2.t();
        if (t == null) {
        }
    }

    public static final void c(w1.r rVar, androidx.compose.runtime.s sVar, int i) {
        w1.r rVar2;
        sVar.e0(-1163347464);
        int i2 = i | 6;
        if (sVar.S(i2 & 1, (i2 & 3) != 2)) {
            float f = ih.a.n;
            rVar2 = w1.o.a;
            w1.r e = p2.e(androidx.compose.foundation.layout.b.B(rVar2, 0.0f, f, 0.0f, f, 5), 1.0f);
            Object N = sVar.N();
            if (N == androidx.compose.runtime.n.a) {
                N = new com.github.rudroid.searchandfilter.complexfilter.explore.a0(4);
                sVar.n0(N);
            }
            w1.r a = d3.q.a(e, (j71.c) N);
            l2 a2 = j2.a(androidx.compose.foundation.layout.l.g, w1.c.B, sVar, 54);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, a);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            v2.e eVar = v2.g.f;
            androidx.compose.runtime.t.I(sVar, eVar, a2);
            v2.e eVar2 = v2.g.e;
            androidx.compose.runtime.t.I(sVar, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.e eVar3 = v2.g.g;
            androidx.compose.runtime.t.w(sVar, valueOf, eVar3);
            v2.d dVar = v2.g.h;
            androidx.compose.runtime.t.E(sVar, dVar);
            v2.e eVar4 = v2.g.d;
            androidx.compose.runtime.t.I(sVar, eVar4, c);
            w1.r f2 = f0.o.f(p2.o(rVar2, 48), ih.d.a(sVar).c, ih.d.e(sVar).h);
            androidx.compose.ui.layout.v0 d = androidx.compose.foundation.layout.t.d(w1.c.v, false);
            int hashCode2 = Long.hashCode(sVar.T);
            v1 l2 = sVar.l();
            w1.r c2 = w1.a.c(sVar, f2);
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, eVar, d);
            androidx.compose.runtime.t.I(sVar, eVar2, l2);
            f1.e.t(hashCode2, sVar, eVar3, sVar, dVar);
            androidx.compose.runtime.t.I(sVar, eVar4, c2);
            w1.r o = p2.o(rVar2, ih.a.N);
            i2.b C = z3.C(2131231302, 0, sVar);
            long j = d2.t.d;
            p5.a(C, (String) null, o, j, sVar, 3128, 0);
            sVar.q(true);
            float f3 = ih.a.M;
            p5.a(z3.C(2131231192, 0, sVar), (String) null, p2.o(rVar2, f3), d2.t.b(0.84f, ih.d.a(sVar).y), sVar, 56, 0);
            p5.a(z3.C(2131231391, 0, sVar), (String) null, p2.o(rVar2, f3), d2.t.b(0.68f, ih.d.a(sVar).H), sVar, 56, 0);
            p5.a(z3.C(2131231365, 0, sVar), (String) null, p2.o(rVar2, f3), d2.t.b(0.52f, ih.d.a(sVar).V), sVar, 56, 0);
            p5.a(z3.C(2131231397, 0, sVar), (String) null, p2.o(rVar2, f3), d2.t.b(0.36f, ih.d.a(sVar).S), sVar, 56, 0);
            p5.a(z3.C(2131231124, 0, sVar), (String) null, p2.o(rVar2, f3), d2.t.b(0.2f, ih.d.a(sVar).c), sVar, 56, 0);
            p5.a(z3.C(2131230995, 0, sVar), (String) null, p2.o(rVar2, f3), d2.t.b(0.0f, j), sVar, 3128, 0);
            sVar.q(true);
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new b(rVar2, i);
        }
    }

}
