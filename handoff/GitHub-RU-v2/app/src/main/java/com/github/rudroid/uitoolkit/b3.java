package com.github.rudroid.uitoolkit;

import com.google.android.gms.internal.measurement.i4;
import f1.e8;
import f1.gb;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b3 {
    public static final void a(w1.r rVar, j71.e eVar, j71.f fVar, j71.f fVar2, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.e0(1461817591);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(fVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.h(fVar2) ? 2048 : 1024;
        }
        if (sVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.e, w1.c.D, sVar, 54);
            int hashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, rVar);
            v2.h.o.getClass();
            v2.f fVar3 = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar3);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, v2.g.f, a);
            androidx.compose.runtime.t.I(sVar, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar, v2.g.h);
            androidx.compose.runtime.t.I(sVar, v2.g.d, c);
            w1.o oVar = w1.o.a;
            if (eVar == null) {
                sVar.c0(1279029147);
                sVar.q(false);
            } else {
                sVar.c0(1279029148);
                eVar.s(sVar, Integer.valueOf((i2 >> 3) & 14));
                com.github.rudroid.m0.C(oVar, 24, sVar, false);
            }
            androidx.compose.foundation.layout.f0 f0Var = androidx.compose.foundation.layout.f0.a;
            if (fVar == null) {
                sVar.c0(1279136376);
                sVar.q(false);
            } else {
                sVar.c0(1279136377);
                fVar.f(f0Var, sVar, Integer.valueOf(((i2 >> 3) & 112) | 6));
                com.github.rudroid.m0.C(oVar, 24, sVar, false);
            }
            if (fVar2 == null) {
                sVar.c0(1279244814);
            } else {
                sVar.c0(1279244815);
                fVar2.f(f0Var, sVar, Integer.valueOf(((i2 >> 6) & 112) | 6));
            }
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.V();
        }
        androidx.compose.runtime.b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.shared.ui.a(rVar, eVar, fVar, fVar2, i, 9);
        }
    }

    public static final void b(w1.r rVar, j71.e eVar, j71.f fVar, l0 l0Var, androidx.compose.runtime.s sVar, int i) {
        w1.r rVar2;
        r1.d d;
        sVar.e0(1150475348);
        int i2 = i | 6 | (sVar.h(eVar) ? 32 : 16) | (sVar.h(fVar) ? 256 : 128) | (sVar.f(l0Var) ? 2048 : 1024);
        if (sVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            if (l0Var.c == null) {
                sVar.c0(-27580813);
                sVar.q(false);
                d = null;
            } else {
                sVar.c0(-27580812);
                d = r1.i.d(-2081369307, new androidx.compose.runtime.b1(28, l0Var), sVar);
                sVar.q(false);
            }
            r1.d dVar = d;
            w1.r rVar3 = w1.o.a;
            a(rVar3, eVar, fVar, dVar, sVar, i2 & 1022);
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        androidx.compose.runtime.b2 t = sVar.t();
        if (t != null) {
            t.d = new bd.d(rVar2, eVar, fVar, l0Var, i, 29);
        }
    }

    public static final void c(w1.r rVar, j71.e eVar, j71.f fVar, v0 v0Var, androidx.compose.runtime.s sVar, int i) {
        j71.f fVar2;
        androidx.compose.runtime.s sVar2;
        j71.e eVar2;
        w1.r rVar2;
        r1.d d;
        sVar.e0(738077458);
        int i2 = i | 6 | (sVar.h(eVar) ? 32 : 16) | (sVar.h(fVar) ? 256 : 128) | (sVar.f(v0Var) ? 2048 : 1024);
        if (sVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            if (v0Var.c == null) {
                sVar.c0(2128314068);
                sVar.q(false);
                d = null;
            } else {
                sVar.c0(2128314069);
                d = r1.i.d(1135834785, new androidx.compose.runtime.b1(29, v0Var), sVar);
                sVar.q(false);
            }
            r1.d dVar = d;
            w1.r rVar3 = w1.o.a;
            fVar2 = fVar;
            sVar2 = sVar;
            a(rVar3, eVar, fVar2, dVar, sVar2, i2 & 1022);
            eVar2 = eVar;
            rVar2 = rVar3;
        } else {
            fVar2 = fVar;
            sVar2 = sVar;
            eVar2 = eVar;
            sVar2.V();
            rVar2 = rVar;
        }
        androidx.compose.runtime.b2 t = sVar2.t();
        if (t != null) {
            t.d = new y2(rVar2, eVar2, fVar2, v0Var, i);
        }
    }

    public static final void d(j71.e eVar, j71.f fVar, final String str, final String str2, final s0.m0 m0Var, final s0.l0 l0Var, final j71.c cVar, final j71.a aVar, androidx.compose.runtime.s sVar, int i) {
        sVar.e0(1981522172);
        int i2 = i | (sVar.h(eVar) ? 32 : 16) | (sVar.h(fVar) ? 256 : 128) | (sVar.f(str) ? 2048 : 1024) | (sVar.f((Object) null) ? 16384 : 8192) | (sVar.f(str2) ? 131072 : 65536) | (sVar.f(m0Var) ? 1048576 : 524288) | (sVar.f(l0Var) ? 8388608 : 4194304) | (sVar.h(cVar) ? 67108864 : 33554432) | (sVar.h(aVar) ? 536870912 : 268435456);
        if (sVar.S(i2 & 1, (306783379 & i2) != 306783378)) {
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            if (N == iVar) {
                N = no.a.f(sVar);
            }
            final b2.a0 a0Var = (b2.a0) N;
            a(androidx.compose.foundation.layout.b.B(w1.o.a, 0.0f, ih.a.l, 0.0f, 0.0f, 13), eVar, fVar, r1.i.d(498510457, new j71.f() { // from class: com.github.rudroid.uitoolkit.v2
                public final Object f(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    k71.k.g((androidx.compose.foundation.layout.f0) obj, "$this$GenericDialogBody");
                    if (sVar2.S(intValue & 1, (intValue & 17) != 16)) {
                        w1.r e = androidx.compose.foundation.layout.p2.e(w1.o.a, 1.0f);
                        j71.a aVar2 = aVar;
                        boolean f = sVar2.f(aVar2);
                        Object N2 = sVar2.N();
                        Object obj4 = androidx.compose.runtime.n.a;
                        if (f || N2 == obj4) {
                            N2 = new z2(aVar2);
                            sVar2.n0(N2);
                        }
                        w1.r k = b2.d.k(o2.c.d(e, (j71.c) N2), a0Var);
                        gb a = com.github.rudroid.uitoolkit.text.q.a(d2.t.j, 0L, ih.d.b(sVar2).p, 0L, 0L, sVar2, 100663302, 250);
                        j71.c cVar2 = cVar;
                        boolean f2 = sVar2.f(cVar2);
                        Object N3 = sVar2.N();
                        if (f2 || N3 == obj4) {
                            N3 = new a0.n1(10, cVar2);
                            sVar2.n0(N3);
                        }
                        com.github.rudroid.uitoolkit.text.y.b(k, str2, m0Var, l0Var, (j71.c) N3, true, null, str, null, false, null, 0L, a, 0, null, false, sVar2, 196608, 0, 60992);
                    } else {
                        sVar2.V();
                    }
                    return w61.a0.a;
                }
            }, sVar), sVar, (i2 & 112) | 3072 | (i2 & 896));
            Object N2 = sVar.N();
            if (N2 == iVar) {
                N2 = new a3(a0Var, null);
                sVar.n0(N2);
            }
            androidx.compose.runtime.t.f(sVar, (j71.e) N2, w61.a0.a);
        } else {
            sVar.V();
        }
        androidx.compose.runtime.b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.feed.awesometopics.n(eVar, fVar, str, str2, m0Var, l0Var, cVar, aVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(w1.r rVar, final r1.d dVar, final j71.f fVar, String str, j71.c cVar, j71.a aVar, final h0 h0Var, w3.t tVar, s0.m0 m0Var, s0.l0 l0Var, j71.a aVar2, androidx.compose.runtime.s sVar, int i) {
        w3.t tVar2;
        boolean z;
        boolean z2;
        final h0 h0Var2;
        r1.d d;
        r1.d dVar2;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(cVar, "onValueChange");
        k71.k.g(aVar, "onDismiss");
        sVar2.e0(1015605856);
        int i2 = (sVar2.f(l0Var) ? 536870912 : 268435456) | i | (sVar2.f(rVar) ? 4 : 2) | (sVar2.f(str) ? 2048 : 1024) | (sVar2.h(cVar) ? 16384 : 8192) | (sVar2.h(aVar) ? 131072 : 65536) | (sVar2.f(h0Var) ? 1048576 : 524288) | 12582912 | (sVar2.f(m0Var) ? 67108864 : 33554432);
        if (sVar2.S(i2 & 1, ((306783379 & i2) == 306783378 && ((sVar2.h(aVar2) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            w3.t tVar3 = new w3.t(1);
            if (h0Var instanceof u0) {
                sVar2.c0(-2129877691);
                d = r1.i.d(1049410364, new com.github.rudroid.settings.copilot.debug.q((Object) dVar, (Object) fVar, false, 8), sVar2);
                z = false;
                sVar2.q(false);
            } else {
                z = false;
                if (h0Var instanceof l0) {
                    sVar2.c0(-2129759271);
                    final int i3 = 0;
                    d = r1.i.d(1644836517, new j71.e() { // from class: com.github.rudroid.uitoolkit.w2
                        public final Object s(Object obj, Object obj2) {
                            switch (i3) {
                                case 0:
                                    androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    if (sVar3.S(intValue & 1, (intValue & 3) != 2)) {
                                        b3.b(null, dVar, fVar, (l0) h0Var, sVar3, 0);
                                    } else {
                                        sVar3.V();
                                    }
                                    break;
                                default:
                                    androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        b3.c(null, dVar, fVar, (v0) h0Var, sVar4, 0);
                                    } else {
                                        sVar4.V();
                                    }
                                    break;
                            }
                            return w61.a0.a;
                        }
                    }, sVar2);
                    sVar2.q(false);
                } else if (h0Var instanceof v0) {
                    sVar2.c0(-2129627304);
                    final int i4 = 1;
                    d = r1.i.d(-1991747900, new j71.e() { // from class: com.github.rudroid.uitoolkit.w2
                        public final Object s(Object obj, Object obj2) {
                            switch (i4) {
                                case 0:
                                    androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    if (sVar3.S(intValue & 1, (intValue & 3) != 2)) {
                                        b3.b(null, dVar, fVar, (l0) h0Var, sVar3, 0);
                                    } else {
                                        sVar3.V();
                                    }
                                    break;
                                default:
                                    androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        b3.c(null, dVar, fVar, (v0) h0Var, sVar4, 0);
                                    } else {
                                        sVar4.V();
                                    }
                                    break;
                            }
                            return w61.a0.a;
                        }
                    }, sVar2);
                    sVar2.q(false);
                } else {
                    if (!(h0Var instanceof t0)) {
                        throw f1.e.r(1039672483, sVar2, false);
                    }
                    sVar2.c0(-2129482193);
                    z2 = false;
                    h0Var2 = h0Var;
                    d = r1.i.d(-1333365021, new com.github.rudroid.feed.awesometopics.n(h0Var, dVar, fVar, str, m0Var, l0Var, cVar, aVar2), sVar2);
                    sVar2.q(false);
                    r1.d dVar3 = d;
                    final int i5 = 0;
                    r1.d d2 = r1.i.d(-870373114, new j71.e() { // from class: com.github.rudroid.uitoolkit.x2
                        public final Object s(Object obj, Object obj2) {
                            switch (i5) {
                                case 0:
                                    androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    if (sVar3.S(intValue & 1, (intValue & 3) != 2)) {
                                        final h0 h0Var3 = h0Var2;
                                        c cVar2 = h0Var3.a;
                                        final int i6 = 0;
                                        d1.a(null, cVar2.b, cVar2.c, cVar2.d, r1.i.d(1972200321, new j71.f() { // from class: com.github.rudroid.uitoolkit.u2
                                            public final Object f(Object obj3, Object obj4, Object obj5) {
                                                switch (i6) {
                                                    case 0:
                                                        androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj4;
                                                        int intValue2 = ((Integer) obj5).intValue();
                                                        k71.k.g((androidx.compose.foundation.layout.m2) obj3, "$this$PrimaryDialogButton");
                                                        if (sVar4.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                            com.github.rudroid.uitoolkit.text.n0.a(i4.p0(h0Var3.a.a, sVar4), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar4, 0, 0, 65534);
                                                        } else {
                                                            sVar4.V();
                                                        }
                                                        break;
                                                    default:
                                                        androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj4;
                                                        int intValue3 = ((Integer) obj5).intValue();
                                                        k71.k.g((androidx.compose.foundation.layout.m2) obj3, "$this$PrimaryDialogButton");
                                                        if (sVar5.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                            com.github.rudroid.uitoolkit.text.n0.a(i4.p0(h0Var3.b.a, sVar5), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar5, 0, 0, 65534);
                                                        } else {
                                                            sVar5.V();
                                                        }
                                                        break;
                                                }
                                                return w61.a0.a;
                                            }
                                        }, sVar3), sVar3, 24576, 1);
                                    } else {
                                        sVar3.V();
                                    }
                                    break;
                                default:
                                    androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        final h0 h0Var4 = h0Var2;
                                        c cVar3 = h0Var4.b;
                                        final int i7 = 1;
                                        d1.a(null, cVar3.b, cVar3.c, cVar3.d, r1.i.d(-636580526, new j71.f() { // from class: com.github.rudroid.uitoolkit.u2
                                            public final Object f(Object obj3, Object obj4, Object obj5) {
                                                switch (i7) {
                                                    case 0:
                                                        androidx.compose.runtime.s sVar42 = (androidx.compose.runtime.s) obj4;
                                                        int intValue22 = ((Integer) obj5).intValue();
                                                        k71.k.g((androidx.compose.foundation.layout.m2) obj3, "$this$PrimaryDialogButton");
                                                        if (sVar42.S(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                            com.github.rudroid.uitoolkit.text.n0.a(i4.p0(h0Var4.a.a, sVar42), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar42, 0, 0, 65534);
                                                        } else {
                                                            sVar42.V();
                                                        }
                                                        break;
                                                    default:
                                                        androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj4;
                                                        int intValue3 = ((Integer) obj5).intValue();
                                                        k71.k.g((androidx.compose.foundation.layout.m2) obj3, "$this$PrimaryDialogButton");
                                                        if (sVar5.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                            com.github.rudroid.uitoolkit.text.n0.a(i4.p0(h0Var4.b.a, sVar5), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar5, 0, 0, 65534);
                                                        } else {
                                                            sVar5.V();
                                                        }
                                                        break;
                                                }
                                                return w61.a0.a;
                                            }
                                        }, sVar4), sVar4, 24576, 1);
                                    } else {
                                        sVar4.V();
                                    }
                                    break;
                            }
                            return w61.a0.a;
                        }
                    }, sVar2);
                    if (h0Var2.b == null) {
                        sVar2.c0(-2128523921);
                        final int i6 = 1;
                        dVar2 = r1.i.d(-1657588905, new j71.e() { // from class: com.github.rudroid.uitoolkit.x2
                            public final Object s(Object obj, Object obj2) {
                                switch (i6) {
                                    case 0:
                                        androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        if (sVar3.S(intValue & 1, (intValue & 3) != 2)) {
                                            final h0 h0Var3 = h0Var2;
                                            c cVar2 = h0Var3.a;
                                            final int i62 = 0;
                                            d1.a(null, cVar2.b, cVar2.c, cVar2.d, r1.i.d(1972200321, new j71.f() { // from class: com.github.rudroid.uitoolkit.u2
                                                public final Object f(Object obj3, Object obj4, Object obj5) {
                                                    switch (i62) {
                                                        case 0:
                                                            androidx.compose.runtime.s sVar42 = (androidx.compose.runtime.s) obj4;
                                                            int intValue22 = ((Integer) obj5).intValue();
                                                            k71.k.g((androidx.compose.foundation.layout.m2) obj3, "$this$PrimaryDialogButton");
                                                            if (sVar42.S(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                                com.github.rudroid.uitoolkit.text.n0.a(i4.p0(h0Var3.a.a, sVar42), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar42, 0, 0, 65534);
                                                            } else {
                                                                sVar42.V();
                                                            }
                                                            break;
                                                        default:
                                                            androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj4;
                                                            int intValue3 = ((Integer) obj5).intValue();
                                                            k71.k.g((androidx.compose.foundation.layout.m2) obj3, "$this$PrimaryDialogButton");
                                                            if (sVar5.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                                com.github.rudroid.uitoolkit.text.n0.a(i4.p0(h0Var3.b.a, sVar5), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar5, 0, 0, 65534);
                                                            } else {
                                                                sVar5.V();
                                                            }
                                                            break;
                                                    }
                                                    return w61.a0.a;
                                                }
                                            }, sVar3), sVar3, 24576, 1);
                                        } else {
                                            sVar3.V();
                                        }
                                        break;
                                    default:
                                        androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                                        int intValue2 = ((Integer) obj2).intValue();
                                        if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            final h0 h0Var4 = h0Var2;
                                            c cVar3 = h0Var4.b;
                                            final int i7 = 1;
                                            d1.a(null, cVar3.b, cVar3.c, cVar3.d, r1.i.d(-636580526, new j71.f() { // from class: com.github.rudroid.uitoolkit.u2
                                                public final Object f(Object obj3, Object obj4, Object obj5) {
                                                    switch (i7) {
                                                        case 0:
                                                            androidx.compose.runtime.s sVar42 = (androidx.compose.runtime.s) obj4;
                                                            int intValue22 = ((Integer) obj5).intValue();
                                                            k71.k.g((androidx.compose.foundation.layout.m2) obj3, "$this$PrimaryDialogButton");
                                                            if (sVar42.S(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                                com.github.rudroid.uitoolkit.text.n0.a(i4.p0(h0Var4.a.a, sVar42), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar42, 0, 0, 65534);
                                                            } else {
                                                                sVar42.V();
                                                            }
                                                            break;
                                                        default:
                                                            androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj4;
                                                            int intValue3 = ((Integer) obj5).intValue();
                                                            k71.k.g((androidx.compose.foundation.layout.m2) obj3, "$this$PrimaryDialogButton");
                                                            if (sVar5.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                                com.github.rudroid.uitoolkit.text.n0.a(i4.p0(h0Var4.b.a, sVar5), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar5, 0, 0, 65534);
                                                            } else {
                                                                sVar5.V();
                                                            }
                                                            break;
                                                    }
                                                    return w61.a0.a;
                                                }
                                            }, sVar4), sVar4, 24576, 1);
                                        } else {
                                            sVar4.V();
                                        }
                                        break;
                                }
                                return w61.a0.a;
                            }
                        }, sVar2);
                        sVar2.q(z2);
                    } else {
                        sVar2.c0(-2128160818);
                        sVar2.q(z2);
                        dVar2 = null;
                    }
                    e8.a(aVar, d2, com.github.rudroid.uitoolkit.utils.x.b(androidx.compose.foundation.layout.p2.e(rVar, 0.85f)), dVar2, (j71.e) null, dVar3, (d2.p0) null, ih.d.b(sVar2).d, 0L, 0L, 0L, 0.0f, tVar3, sVar, ((i2 >> 15) & 14) | 196656, 3072, 7824);
                    sVar2 = sVar;
                    tVar2 = tVar3;
                }
            }
            h0Var2 = h0Var;
            z2 = z;
            r1.d dVar32 = d;
            final int i52 = 0;
            r1.d d22 = r1.i.d(-870373114, new j71.e() { // from class: com.github.rudroid.uitoolkit.x2
                public final Object s(Object obj, Object obj2) {
                    switch (i52) {
                        case 0:
                            androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (sVar3.S(intValue & 1, (intValue & 3) != 2)) {
                                final h0 h0Var3 = h0Var2;
                                c cVar2 = h0Var3.a;
                                final int i62 = 0;
                                d1.a(null, cVar2.b, cVar2.c, cVar2.d, r1.i.d(1972200321, new j71.f() { // from class: com.github.rudroid.uitoolkit.u2
                                    public final Object f(Object obj3, Object obj4, Object obj5) {
                                        switch (i62) {
                                            case 0:
                                                androidx.compose.runtime.s sVar42 = (androidx.compose.runtime.s) obj4;
                                                int intValue22 = ((Integer) obj5).intValue();
                                                k71.k.g((androidx.compose.foundation.layout.m2) obj3, "$this$PrimaryDialogButton");
                                                if (sVar42.S(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                    com.github.rudroid.uitoolkit.text.n0.a(i4.p0(h0Var3.a.a, sVar42), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar42, 0, 0, 65534);
                                                } else {
                                                    sVar42.V();
                                                }
                                                break;
                                            default:
                                                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj4;
                                                int intValue3 = ((Integer) obj5).intValue();
                                                k71.k.g((androidx.compose.foundation.layout.m2) obj3, "$this$PrimaryDialogButton");
                                                if (sVar5.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    com.github.rudroid.uitoolkit.text.n0.a(i4.p0(h0Var3.b.a, sVar5), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar5, 0, 0, 65534);
                                                } else {
                                                    sVar5.V();
                                                }
                                                break;
                                        }
                                        return w61.a0.a;
                                    }
                                }, sVar3), sVar3, 24576, 1);
                            } else {
                                sVar3.V();
                            }
                            break;
                        default:
                            androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                final h0 h0Var4 = h0Var2;
                                c cVar3 = h0Var4.b;
                                final int i7 = 1;
                                d1.a(null, cVar3.b, cVar3.c, cVar3.d, r1.i.d(-636580526, new j71.f() { // from class: com.github.rudroid.uitoolkit.u2
                                    public final Object f(Object obj3, Object obj4, Object obj5) {
                                        switch (i7) {
                                            case 0:
                                                androidx.compose.runtime.s sVar42 = (androidx.compose.runtime.s) obj4;
                                                int intValue22 = ((Integer) obj5).intValue();
                                                k71.k.g((androidx.compose.foundation.layout.m2) obj3, "$this$PrimaryDialogButton");
                                                if (sVar42.S(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                    com.github.rudroid.uitoolkit.text.n0.a(i4.p0(h0Var4.a.a, sVar42), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar42, 0, 0, 65534);
                                                } else {
                                                    sVar42.V();
                                                }
                                                break;
                                            default:
                                                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj4;
                                                int intValue3 = ((Integer) obj5).intValue();
                                                k71.k.g((androidx.compose.foundation.layout.m2) obj3, "$this$PrimaryDialogButton");
                                                if (sVar5.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    com.github.rudroid.uitoolkit.text.n0.a(i4.p0(h0Var4.b.a, sVar5), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar5, 0, 0, 65534);
                                                } else {
                                                    sVar5.V();
                                                }
                                                break;
                                        }
                                        return w61.a0.a;
                                    }
                                }, sVar4), sVar4, 24576, 1);
                            } else {
                                sVar4.V();
                            }
                            break;
                    }
                    return w61.a0.a;
                }
            }, sVar2);
            if (h0Var2.b == null) {
            }
            e8.a(aVar, d22, com.github.rudroid.uitoolkit.utils.x.b(androidx.compose.foundation.layout.p2.e(rVar, 0.85f)), dVar2, (j71.e) null, dVar32, (d2.p0) null, ih.d.b(sVar2).d, 0L, 0L, 0L, 0.0f, tVar3, sVar, ((i2 >> 15) & 14) | 196656, 3072, 7824);
            sVar2 = sVar;
            tVar2 = tVar3;
        } else {
            sVar2.V();
            tVar2 = tVar;
        }
        androidx.compose.runtime.b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.workflowsummary.ui.t(rVar, dVar, fVar, str, cVar, aVar, h0Var, tVar2, m0Var, l0Var, aVar2, i);
        }
    }

    public static final void f(w1.r rVar, j71.e eVar, j71.f fVar, androidx.compose.runtime.s sVar, int i) {
        w1.r rVar2;
        sVar.e0(1048033078);
        int i2 = i | 6 | (sVar.h(eVar) ? 32 : 16) | (sVar.h(fVar) ? 256 : 128);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            int i3 = (i2 & 112) | 3078 | (i2 & 896);
            w1.r rVar3 = w1.o.a;
            a(rVar3, eVar, fVar, b0.a, sVar, i3);
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        androidx.compose.runtime.b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.profile.status.ui.x(rVar2, eVar, fVar, i, 14);
        }
    }
}
