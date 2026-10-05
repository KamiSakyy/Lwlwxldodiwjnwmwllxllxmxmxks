package com.github.rudroid.utilities;

import androidx.compose.runtime.i3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m1 {
    /* JADX WARN: Removed duplicated region for block: B:112:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(com.github.rudroid.utilities.ui.g1 g1Var, w1.r rVar, j71.f fVar, j71.e eVar, j71.e eVar2, r1.d dVar, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        w1.r rVar2;
        int i4;
        j71.f fVar2;
        int i5;
        int i6;
        j71.e eVar3;
        j71.e eVar4;
        j71.e eVar5;
        androidx.compose.runtime.b2 t;
        k71.k.g(g1Var, "state");
        sVar.e0(1770968333);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? sVar.f(g1Var) : sVar.h(g1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            rVar2 = rVar;
            i3 |= sVar.f(rVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                fVar2 = fVar;
                i3 |= sVar.h(fVar2) ? 256 : 128;
                i5 = i3 | 3072;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i5 = i3 | 27648;
                } else if ((i & 24576) == 0) {
                    eVar3 = eVar2;
                    i5 |= sVar.h(eVar3) ? 16384 : 8192;
                    if ((196608 & i) == 0) {
                        i5 |= sVar.h(dVar) ? 131072 : 65536;
                    }
                    if (sVar.S(i5 & 1, (74899 & i5) == 74898)) {
                        sVar.V();
                        eVar4 = eVar3;
                        eVar5 = eVar;
                    } else {
                        if (i7 != 0) {
                            rVar2 = w1.o.a;
                        }
                        if (i4 != 0) {
                            fVar2 = p.a;
                        }
                        if (i6 != 0) {
                            eVar3 = p.c;
                        }
                        boolean z = (i5 & 896) == 256;
                        Object N = sVar.N();
                        androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
                        if (z || N == iVar) {
                            N = androidx.compose.runtime.t.z(new r1.d(new j1(fVar2, 0), true, 1170933639));
                            sVar.n0(N);
                        }
                        j71.f fVar3 = (j71.f) N;
                        boolean z2 = (458752 & i5) == 131072;
                        Object N2 = sVar.N();
                        if (z2 || N2 == iVar) {
                            N2 = androidx.compose.runtime.t.z(new r1.d(new androidx.compose.runtime.z0(dVar, 8), true, 1983602014));
                            sVar.n0(N2);
                        }
                        j71.f fVar4 = (j71.f) N2;
                        boolean z3 = (i5 & 7168) == 2048;
                        Object N3 = sVar.N();
                        if (z3 || N3 == iVar) {
                            N3 = androidx.compose.runtime.t.y(new r1.d(new com.github.rudroid.uitoolkit.banner.o(21), true, -72907149));
                            sVar.n0(N3);
                        }
                        j71.e eVar6 = (j71.e) N3;
                        boolean z4 = (57344 & i5) == 16384;
                        Object N4 = sVar.N();
                        if (z4 || N4 == iVar) {
                            N4 = androidx.compose.runtime.t.y(new r1.d(new k1(0, eVar3), true, -1497996252));
                            sVar.n0(N4);
                        }
                        j71.e eVar7 = (j71.e) N4;
                        androidx.compose.ui.layout.v0 d = androidx.compose.foundation.layout.t.d(w1.c.r, false);
                        int hashCode = Long.hashCode(sVar.T);
                        androidx.compose.runtime.v1 l = sVar.l();
                        w1.r c = w1.a.c(sVar, rVar2);
                        v2.h.o.getClass();
                        v2.f fVar5 = v2.g.b;
                        sVar.g0();
                        j71.e eVar8 = eVar3;
                        if (sVar.S) {
                            sVar.k(fVar5);
                        } else {
                            sVar.q0();
                        }
                        androidx.compose.runtime.t.I(sVar, v2.g.f, d);
                        androidx.compose.runtime.t.I(sVar, v2.g.e, l);
                        androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                        androidx.compose.runtime.t.E(sVar, v2.g.h);
                        androidx.compose.runtime.t.I(sVar, v2.g.d, c);
                        if (g1Var instanceof com.github.rudroid.utilities.ui.h0) {
                            sVar.c0(414905347);
                            eVar6.s(sVar, 0);
                            sVar.q(false);
                        } else if (g1Var instanceof com.github.rudroid.utilities.ui.n0) {
                            sVar.c0(414906871);
                            fVar3.f(((com.github.rudroid.utilities.ui.n0) g1Var).b, sVar, 0);
                            sVar.q(false);
                        } else if (g1Var instanceof com.github.rudroid.utilities.ui.u1) {
                            sVar.c0(414908900);
                            fVar3.f(((com.github.rudroid.utilities.ui.u1) g1Var).b.a(), sVar, 0);
                            sVar.q(false);
                        } else if ((g1Var instanceof com.github.rudroid.utilities.ui.t0) || (g1Var instanceof com.github.rudroid.utilities.ui.u0) || (g1Var instanceof com.github.rudroid.utilities.ui.x0)) {
                            sVar.c0(414913477);
                            eVar7.s(sVar, 0);
                            sVar.q(false);
                        } else if (g1Var instanceof com.github.rudroid.utilities.ui.y0) {
                            sVar.c0(414915151);
                            fVar4.f(((com.github.rudroid.utilities.ui.y0) g1Var).a, sVar, 0);
                            sVar.q(false);
                        } else if (g1Var instanceof com.github.rudroid.utilities.ui.r0) {
                            sVar.c0(414917135);
                            fVar4.f(((com.github.rudroid.utilities.ui.r0) g1Var).a, sVar, 0);
                            sVar.q(false);
                        } else {
                            if (!(g1Var instanceof com.github.rudroid.utilities.ui.t1)) {
                                throw f1.e.r(414904583, sVar, false);
                            }
                            sVar.c0(414918895);
                            fVar4.f(((com.github.rudroid.utilities.ui.t1) g1Var).a, sVar, 0);
                            sVar.q(false);
                        }
                        sVar.q(true);
                        eVar5 = p.b;
                        eVar4 = eVar8;
                    }
                    w1.r rVar3 = rVar2;
                    j71.f fVar6 = fVar2;
                    t = sVar.t();
                    if (t == null) {
                        t.d = new ab.g(g1Var, rVar3, fVar6, eVar5, eVar4, dVar, i, i2);
                        return;
                    }
                    return;
                }
                eVar3 = eVar2;
                if ((196608 & i) == 0) {
                }
                if (sVar.S(i5 & 1, (74899 & i5) == 74898)) {
                }
                w1.r rVar32 = rVar2;
                j71.f fVar62 = fVar2;
                t = sVar.t();
                if (t == null) {
                }
            }
            fVar2 = fVar;
            i5 = i3 | 3072;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            eVar3 = eVar2;
            if ((196608 & i) == 0) {
            }
            if (sVar.S(i5 & 1, (74899 & i5) == 74898)) {
            }
            w1.r rVar322 = rVar2;
            j71.f fVar622 = fVar2;
            t = sVar.t();
            if (t == null) {
            }
        }
        rVar2 = rVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        fVar2 = fVar;
        i5 = i3 | 3072;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        eVar3 = eVar2;
        if ((196608 & i) == 0) {
        }
        if (sVar.S(i5 & 1, (74899 & i5) == 74898)) {
        }
        w1.r rVar3222 = rVar2;
        j71.f fVar6222 = fVar2;
        t = sVar.t();
        if (t == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(w1.r rVar, i3 i3Var, boolean z, r1.d dVar, r1.d dVar2, j71.e eVar, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        j71.e eVar2;
        r1.d dVar3;
        r1.d dVar4;
        w1.r rVar2;
        androidx.compose.runtime.b2 t;
        k71.k.g(i3Var, "state");
        sVar.e0(-1018719530);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (sVar.f(rVar) ? 4 : 2);
        }
        int i5 = i3 | (sVar.f(i3Var) ? 32 : 16) | (sVar.g(z) ? 256 : 128);
        int i6 = i2 & 32;
        if (i6 != 0) {
            i5 |= 196608;
        } else if ((i & 196608) == 0) {
            eVar2 = eVar;
            i5 |= sVar.h(eVar2) ? 131072 : 65536;
            if (sVar.S(i5 & 1, (74899 & i5) == 74898)) {
                dVar3 = dVar;
                dVar4 = dVar2;
                sVar.V();
                rVar2 = rVar;
            } else {
                w1.r rVar3 = i4 != 0 ? w1.o.a : rVar;
                j71.e d = i6 != 0 ? r1.i.d(375557067, new androidx.compose.foundation.layout.r(rVar3), sVar) : eVar2;
                dVar3 = dVar;
                dVar4 = dVar2;
                z.x.h(i3Var, (w1.r) null, a0.f.s(500, 6, (a0.a0) null), (String) null, r1.i.d(-1385488530, new com.github.rudroid.agents.j(z, d, dVar3, dVar4), sVar), sVar, ((i5 >> 3) & 14) | 24960, 10);
                rVar2 = rVar3;
                eVar2 = d;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new l1(rVar2, i3Var, z, dVar3, dVar4, eVar2, i, i2, 0);
                return;
            }
            return;
        }
        eVar2 = eVar;
        if (sVar.S(i5 & 1, (74899 & i5) == 74898)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
