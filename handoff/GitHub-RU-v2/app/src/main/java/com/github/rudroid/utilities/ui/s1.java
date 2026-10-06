package com.github.rudroid.utilities.ui;

import android.content.Context;
import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.f2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.i3;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s1 {
    public static final void a(final p0 p0Var, final w1.r rVar, final j71.e eVar, final r1.d dVar, final j71.f fVar, final j71.e eVar2, final j71.e eVar3, m0.s sVar, final d2 d2Var, final androidx.compose.foundation.layout.k kVar, final w1.d dVar2, final h0.h1 h1Var, final j71.f fVar2, androidx.compose.runtime.s sVar2, final int i, final int i2) {
        int i3;
        androidx.compose.foundation.layout.k kVar2;
        int i4;
        h0.h1 h1Var2;
        final m0.s sVar3;
        boolean z;
        Object obj;
        int i5;
        boolean z2;
        boolean z3;
        androidx.compose.runtime.s sVar4 = sVar2;
        sVar4.e0(639150007);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? sVar4.f(p0Var) : sVar4.h(p0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar4.f(rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar4.h(eVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar4.h(dVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar4.h(fVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar4.h(eVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= sVar4.h(eVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= sVar4.f(sVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= sVar4.f(d2Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= sVar4.g(false) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            kVar2 = kVar;
            i4 = i2 | (sVar4.f(kVar2) ? 4 : 2);
        } else {
            kVar2 = kVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar4.f(dVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            h1Var2 = h1Var;
            i4 |= sVar4.f(h1Var2) ? 256 : 128;
        } else {
            h1Var2 = h1Var;
        }
        if ((i2 & 3072) == 0) {
            i4 |= sVar4.h(fVar2) ? 2048 : 1024;
        }
        int i7 = i4;
        if (sVar4.S(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            Object N = sVar4.N();
            Object obj2 = androidx.compose.runtime.n.a;
            if (N == obj2) {
                z = true;
                N = androidx.compose.runtime.t.y(new r1.d(new com.github.rudroid.utilities.k1(1, eVar), true, -436585299));
                sVar4.n0(N);
            } else {
                z = true;
            }
            j71.e eVar4 = (j71.e) N;
            Object N2 = sVar4.N();
            if (N2 == obj2) {
                N2 = androidx.compose.runtime.t.B(Boolean.FALSE);
                sVar4.n0(N2);
            }
            androidx.compose.runtime.f1 f1Var = (androidx.compose.runtime.f1) N2;
            if (p0Var instanceof j0) {
                sVar4.c0(42862747);
                dVar.f(((j0) p0Var).a, sVar4, Integer.valueOf((i6 >> 6) & 112));
                sVar4.q(false);
                z2 = false;
                obj = obj2;
                z3 = z;
                i5 = 8388608;
                sVar3 = sVar;
            } else if (p0Var instanceof v1) {
                sVar4.c0(42864852);
                fVar.f(((v1) p0Var).a, sVar4, Integer.valueOf((i6 >> 9) & 112));
                sVar4.q(false);
                sVar3 = sVar;
                obj = obj2;
                z3 = z;
                z2 = false;
                i5 = 8388608;
            } else {
                if (p0Var instanceof i0) {
                    sVar4.c0(42866597);
                    f1.e.u((i6 >> 18) & 14, eVar3, sVar4, false);
                } else if (p0Var instanceof v0) {
                    sVar4.c0(42868167);
                    f1.e.u((i6 >> 15) & 14, eVar2, sVar4, false);
                } else {
                    if (!(p0Var instanceof q0)) {
                        throw f1.e.r(42862614, sVar4, false);
                    }
                    sVar4.c0(42871164);
                    Object N3 = sVar4.N();
                    if (N3 == obj2) {
                        N3 = new ab.e(f1Var, 13);
                        sVar4.n0(N3);
                    }
                    w1.r t = b2.d.t(rVar, (j71.c) N3);
                    boolean z4 = ((i6 & 14) == 4 || ((i6 & 8) != 0 && sVar4.h(p0Var))) | ((i7 & 7168) == 2048);
                    Object N4 = sVar4.N();
                    if (z4 || N4 == obj2) {
                        N4 = new k1(p0Var, fVar2, eVar4, 0);
                        sVar4.n0(N4);
                    }
                    int i8 = i7 << 12;
                    obj = obj2;
                    i5 = 8388608;
                    z2 = false;
                    z3 = true;
                    com.google.common.util.concurrent.a.b(t, sVar, d2Var, kVar2, dVar2, h1Var2, false, (f0.j) null, (j71.c) N4, sVar4, ((i6 >> 18) & 8176) | (57344 & i8) | (458752 & i8) | (i8 & 3670016), 384);
                    sVar3 = sVar;
                    sVar4 = sVar4;
                    sVar4.q(false);
                }
                sVar3 = sVar;
                obj = obj2;
                z2 = false;
                i5 = 8388608;
                z3 = true;
            }
            if ((p0Var instanceof b0) && sVar3.c() && ((Boolean) f1Var.getValue()).booleanValue()) {
                sVar4.c0(1330312488);
                boolean z5 = (i6 & 29360128) == i5 ? z3 : z2;
                Object N5 = sVar4.N();
                if (z5 || N5 == obj) {
                    N5 = new m1(sVar3, null);
                    sVar4.n0(N5);
                }
                androidx.compose.runtime.t.f(sVar4, (j71.e) N5, p0Var);
            } else {
                sVar4.c0(1321396299);
            }
            sVar4.q(z2);
        } else {
            sVar3 = sVar;
            sVar4.V();
        }
        b2 t2 = sVar4.t();
        if (t2 != null) {
            t2.d = new j71.e() { // from class: com.github.rudroid.utilities.ui.l1
                public final Object s(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int L = androidx.compose.runtime.t.L(i | 1);
                    int L2 = androidx.compose.runtime.t.L(i2);
                    s1.a(p0.this, rVar, eVar, dVar, fVar, eVar2, eVar3, sVar3, d2Var, kVar, dVar2, h1Var, fVar2, (androidx.compose.runtime.s) obj3, L, L2);
                    return w61.a0.a;
                }
            };
        }
    }

    public static final void b(m0.s sVar, g1 g1Var, i3 i3Var, androidx.compose.runtime.s sVar2, int i) {
        int i2;
        k71.k.g(sVar, "<this>");
        k71.k.g(g1Var, "stateEvent");
        k71.k.g(i3Var, "canScroll");
        sVar2.e0(587460199);
        if ((i & 6) == 0) {
            i2 = (sVar2.f(sVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? sVar2.f(g1Var) : sVar2.h(g1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar2.f(i3Var) ? 256 : 128;
        }
        if (sVar2.S(i2 & 1, (i2 & 147) != 146)) {
            if ((g1Var instanceof u0) && ((Boolean) i3Var.getValue()).booleanValue()) {
                sVar2.c0(-964767484);
                Object data = g1Var.getData();
                boolean z = (i2 & 14) == 4;
                Object N = sVar2.N();
                if (z || N == androidx.compose.runtime.n.a) {
                    N = new n1(sVar, null);
                    sVar2.n0(N);
                }
                androidx.compose.runtime.t.f(sVar2, (j71.e) N, data);
            } else {
                sVar2.c0(-977904261);
            }
            sVar2.q(false);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.uitoolkit.markdown.components.v(sVar, g1Var, i3Var, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0317  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(w1.r rVar, final g1 g1Var, j71.e eVar, j71.f fVar, rh.j jVar, j71.a aVar, j71.f fVar2, j71.e eVar2, j71.e eVar3, m0.s sVar, d2 d2Var, androidx.compose.foundation.layout.k kVar, w1.d dVar, h0.h1 h1Var, j71.c cVar, final j71.f fVar3, androidx.compose.runtime.s sVar2, final int i, final int i2, final int i3) {
        w1.r rVar2;
        int i4;
        j71.f fVar4;
        int i5;
        int i6;
        j71.a aVar2;
        int i7;
        final j71.f fVar5;
        int i8;
        j71.e eVar4;
        int i9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        final j71.e eVar5;
        final rh.j jVar2;
        final d2 d2Var2;
        final androidx.compose.foundation.layout.k kVar2;
        final h0.h1 h1Var2;
        final j71.c cVar2;
        final w1.r rVar3;
        final j71.f fVar6;
        final j71.a aVar3;
        final j71.e eVar6;
        final j71.e eVar7;
        final m0.s sVar3;
        final w1.d dVar2;
        b2 t;
        int i19;
        m0.s sVar4;
        d2 d2Var3;
        w1.d dVar3;
        j71.e eVar8;
        int i21;
        rh.j jVar3;
        j71.a aVar4;
        j71.c cVar3;
        j71.f fVar7;
        j71.f fVar8;
        Object obj;
        j71.f fVar9;
        boolean z;
        p0 d0Var;
        boolean z2;
        boolean z3;
        int i22;
        k71.k.g(g1Var, "stateEvent");
        k71.k.g(fVar3, "content");
        sVar2.e0(-1253014233);
        int i23 = i3 & 1;
        if (i23 != 0) {
            i4 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i4 = (sVar2.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? sVar2.f(g1Var) : sVar2.h(g1Var) ? 32 : 16;
        }
        int i24 = i4 | 384;
        int i25 = i3 & 8;
        if (i25 != 0) {
            i24 = i4 | 3456;
        } else if ((i & 3072) == 0) {
            fVar4 = fVar;
            i24 |= sVar2.h(fVar4) ? 2048 : 1024;
            i5 = i24 | 24576;
            i6 = i3 & 32;
            if (i6 == 0) {
                i5 = 221184 | i24;
            } else if ((i & 196608) == 0) {
                aVar2 = aVar;
                i5 |= sVar2.h(aVar2) ? 131072 : 65536;
                i7 = i3 & 64;
                if (i7 != 0) {
                    i5 |= 1572864;
                    fVar5 = fVar2;
                } else {
                    fVar5 = fVar2;
                    if ((i & 1572864) == 0) {
                        i5 |= sVar2.h(fVar5) ? 1048576 : 524288;
                    }
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                    eVar4 = eVar2;
                } else {
                    eVar4 = eVar2;
                    if ((i & 12582912) == 0) {
                        i5 |= sVar2.h(eVar4) ? 8388608 : 4194304;
                    }
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i5 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i5 |= sVar2.h(eVar3) ? 67108864 : 33554432;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0 && sVar2.f(sVar)) {
                        i22 = 536870912;
                        i5 |= i22;
                    }
                    i22 = 268435456;
                    i5 |= i22;
                }
                i11 = i3 & 1024;
                if (i11 != 0) {
                    i14 = i2 | 6;
                    i12 = i11;
                } else {
                    if ((i2 & 6) != 0) {
                        i12 = i11;
                        i13 = i2;
                        int i26 = (i2 & 384) != 0 ? i13 | 176 : i13 | 48;
                        i15 = i3 & 8192;
                        if (i15 == 0) {
                            i16 = i26 | 3072;
                        } else {
                            int i27 = i26;
                            if ((i2 & 3072) == 0) {
                                i27 |= sVar2.f(dVar) ? 2048 : 1024;
                            }
                            i16 = i27;
                        }
                        if ((i2 & 24576) == 0) {
                            i16 |= 8192;
                        }
                        i17 = 32768 & i3;
                        if (i17 == 0) {
                            i18 = i16 | 196608;
                        } else if ((i2 & 196608) == 0) {
                            i18 = i16 | (sVar2.h(cVar) ? 131072 : 65536);
                        } else {
                            i18 = i16;
                        }
                        if ((i2 & 1572864) == 0) {
                            i18 |= sVar2.h(fVar3) ? 1048576 : 524288;
                        }
                        if (sVar2.S(i5 & 1, (i5 & 306783379) == 306783378 || (i18 & 599187) != 599186)) {
                            sVar2.V();
                            eVar5 = eVar;
                            jVar2 = jVar;
                            d2Var2 = d2Var;
                            kVar2 = kVar;
                            h1Var2 = h1Var;
                            cVar2 = cVar;
                            rVar3 = rVar2;
                            fVar6 = fVar4;
                            aVar3 = aVar2;
                            eVar6 = eVar4;
                            eVar7 = eVar3;
                            sVar3 = sVar;
                            dVar2 = dVar;
                        } else {
                            sVar2.X();
                            int i28 = i & 1;
                            Object obj2 = androidx.compose.runtime.n.a;
                            if (i28 == 0 || sVar2.A()) {
                                w1.r rVar4 = i23 != 0 ? w1.o.a : rVar2;
                                j71.f fVar10 = i25 != 0 ? t.b : fVar4;
                                Object N = sVar2.N();
                                if (N == obj2) {
                                    N = new rh.j();
                                    sVar2.n0(N);
                                }
                                rh.j jVar4 = (rh.j) N;
                                if (i6 != 0) {
                                    Object N2 = sVar2.N();
                                    if (N2 == obj2) {
                                        N2 = new com.github.rudroid.widget.p(15);
                                        sVar2.n0(N2);
                                    }
                                    aVar2 = (j71.a) N2;
                                }
                                if (i7 != 0) {
                                    fVar5 = r1.i.d(-1351104782, new com.github.rudroid.agents.agenttasks.n0(jVar4, aVar2, 3), sVar2);
                                }
                                if (i8 != 0) {
                                    eVar4 = t.d;
                                }
                                j71.e eVar9 = i9 != 0 ? t.e : eVar3;
                                if ((i3 & 512) != 0) {
                                    i19 = 0;
                                    sVar4 = m0.u.a(0, 3, sVar2);
                                    i5 &= -1879048193;
                                } else {
                                    i19 = 0;
                                    sVar4 = sVar;
                                }
                                if (i12 != 0) {
                                    float f = i19;
                                    d2Var3 = new f2(f, f, f, f);
                                } else {
                                    d2Var3 = d2Var;
                                }
                                androidx.compose.foundation.layout.k kVar3 = androidx.compose.foundation.layout.l.c;
                                dVar3 = i15 != 0 ? w1.c.D : dVar;
                                w1.r rVar5 = rVar4;
                                a0.y a = z.f1.a(sVar2);
                                boolean f2 = sVar2.f(a);
                                Object N3 = sVar2.N();
                                if (f2 || N3 == obj2) {
                                    N3 = new h0.z(a);
                                    sVar2.n0(N3);
                                }
                                h0.h1 h1Var3 = (h0.z) N3;
                                int i29 = i18 & (-58241);
                                eVar8 = t.a;
                                i21 = i29;
                                if (i17 != 0) {
                                    jVar3 = jVar4;
                                    aVar4 = aVar2;
                                    eVar7 = eVar9;
                                    sVar3 = sVar4;
                                    d2Var2 = d2Var3;
                                    cVar3 = null;
                                    kVar2 = kVar3;
                                } else {
                                    jVar3 = jVar4;
                                    aVar4 = aVar2;
                                    eVar7 = eVar9;
                                    sVar3 = sVar4;
                                    d2Var2 = d2Var3;
                                    kVar2 = kVar3;
                                    cVar3 = cVar;
                                }
                                h1Var2 = h1Var3;
                                fVar7 = fVar10;
                                rVar2 = rVar5;
                            } else {
                                sVar2.V();
                                if ((i3 & 512) != 0) {
                                    i5 &= -1879048193;
                                }
                                int i31 = i18 & (-58241);
                                eVar8 = eVar;
                                jVar3 = jVar;
                                d2Var2 = d2Var;
                                kVar2 = kVar;
                                dVar3 = dVar;
                                h1Var2 = h1Var;
                                cVar3 = cVar;
                                i21 = i31;
                                fVar7 = fVar4;
                                aVar4 = aVar2;
                                eVar7 = eVar3;
                                sVar3 = sVar;
                            }
                            sVar2.r();
                            final j71.c cVar4 = cVar3;
                            boolean z4 = (i5 & 7168) == 2048;
                            Object N4 = sVar2.N();
                            if (z4 || N4 == obj2) {
                                fVar8 = fVar7;
                                obj = obj2;
                                N4 = androidx.compose.runtime.t.z(new r1.d(new com.github.rudroid.utilities.j1(fVar7, 1), true, 1609153051));
                                sVar2.n0(N4);
                            } else {
                                fVar8 = fVar7;
                                obj = obj2;
                            }
                            j71.f fVar11 = (j71.f) N4;
                            if (g1Var instanceof n0) {
                                n0 n0Var = (n0) g1Var;
                                fl.b bVar = n0Var.b;
                                Object obj3 = n0Var.a;
                                if (obj3 != null) {
                                    Collection collection = obj3 instanceof Collection ? (Collection) obj3 : null;
                                    if (collection != null) {
                                        fVar9 = fVar5;
                                        z = true;
                                        if (collection.isEmpty()) {
                                            z3 = true;
                                            if (!z3) {
                                                d0Var = new a0(bVar, obj3);
                                            }
                                        }
                                    } else {
                                        fVar9 = fVar5;
                                        z = true;
                                    }
                                    z3 = false;
                                    if (!z3) {
                                    }
                                } else {
                                    fVar9 = fVar5;
                                    z = true;
                                }
                                d0Var = new j0(bVar);
                            } else {
                                fVar9 = fVar5;
                                z = true;
                                if (g1Var instanceof u1) {
                                    u1 u1Var = (u1) g1Var;
                                    rh.f fVar12 = u1Var.b;
                                    Object obj4 = u1Var.a;
                                    d0Var = (!(fVar12 instanceof rh.cShadow) || ((rh.cShadow) fVar12).b() || obj4 == null) ? new v1(fVar12) : new d0(obj4);
                                } else if (g1Var instanceof u0) {
                                    d0Var = new v0();
                                } else if (g1Var instanceof h0) {
                                    d0Var = new i0();
                                } else if (g1Var instanceof t0) {
                                    d0Var = new b0(((t0) g1Var).a);
                                } else if (g1Var instanceof x0) {
                                    d0Var = new c0(((x0) g1Var).a);
                                } else if (g1Var instanceof y0) {
                                    d0Var = new d0(((y0) g1Var).a);
                                } else if (g1Var instanceof t1) {
                                    d0Var = new d0(((t1) g1Var).a);
                                } else {
                                    if (!(g1Var instanceof r0)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    d0Var = new d0(((r0) g1Var).a);
                                }
                            }
                            p0 p0Var = d0Var;
                            r1.d d = r1.i.d(289342366, new com.github.rudroid.utilities.j1(fVar11, 2), sVar2);
                            int i32 = i5 >> 6;
                            int i33 = ((i5 << 3) & 112) | 3072 | (i5 & 896) | (i32 & 57344) | (i32 & 458752) | (i32 & 3670016) | (i32 & 29360128);
                            int i34 = i21 << 24;
                            boolean z5 = z;
                            j71.e eVar10 = eVar8;
                            Object obj5 = obj;
                            fVar5 = fVar9;
                            w1.r rVar6 = rVar2;
                            eVar6 = eVar4;
                            dVar2 = dVar3;
                            int i35 = i5;
                            a(p0Var, rVar6, eVar10, d, fVar5, eVar6, eVar7, sVar3, d2Var2, kVar2, dVar2, h1Var2, fVar3, sVar2, i33 | (i34 & 234881024) | (i34 & 1879048192), ((i21 >> 6) & 1022) | ((i21 >> 9) & 7168));
                            if (g1Var instanceof u1) {
                                sVar2.c0(-982377306);
                                final Context context = (Context) sVar2.j(w2.j0.b);
                                boolean h = ((i21 & 458752) == 131072 ? z5 : false) | sVar2.h(context);
                                if ((i35 & 112) != 32 && ((i35 & 64) == 0 || !sVar2.h(g1Var))) {
                                    z5 = false;
                                }
                                boolean z6 = h | z5;
                                Object N5 = sVar2.N();
                                if (z6 || N5 == obj5) {
                                    N5 = new j71.a() { // from class: com.github.rudroid.utilities.ui.i1
                                        public final Object a() {
                                            j71.c cVar5 = cVar4;
                                            g1 g1Var2 = g1Var;
                                            if (cVar5 == null) {
                                                com.github.rudroid.activities.m0 m0Var = context;
                                                com.github.rudroid.activities.m0 m0Var2 = m0Var instanceof com.github.rudroid.activities.m0 ? m0Var : null;
                                                if (m0Var2 != null) {
                                                    m0Var2.k0(((u1) g1Var2).b);
                                                }
                                            } else {
                                                cVar5.k(((u1) g1Var2).b);
                                            }
                                            return w61.a0.a;
                                        }
                                    };
                                    sVar2.n0(N5);
                                }
                                androidx.compose.runtime.t.i((j71.a) N5, sVar2);
                                z2 = false;
                            } else {
                                z2 = false;
                                sVar2.c0(-988430149);
                            }
                            sVar2.q(z2);
                            cVar2 = cVar4;
                            rVar3 = rVar6;
                            eVar5 = eVar10;
                            fVar6 = fVar8;
                            jVar2 = jVar3;
                            aVar3 = aVar4;
                        }
                        t = sVar2.t();
                        if (t == null) {
                            t.d = new j71.e() { // from class: com.github.rudroid.utilities.ui.j1
                                public final Object s(Object obj6, Object obj7) {
                                    ((Integer) obj7).getClass();
                                    int L = androidx.compose.runtime.t.L(i | 1);
                                    int L2 = androidx.compose.runtime.t.L(i2);
                                    s1.c(rVar3, g1Var, eVar5, fVar6, jVar2, aVar3, fVar5, eVar6, eVar7, sVar3, d2Var2, kVar2, dVar2, h1Var2, cVar2, fVar3, (androidx.compose.runtime.s) obj6, L, L2, i3);
                                    return w61.a0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i12 = i11;
                    i14 = i2 | (sVar2.f(d2Var) ? 4 : 2);
                }
                i13 = i14;
                if ((i2 & 384) != 0) {
                }
                i15 = i3 & 8192;
                if (i15 == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                i17 = 32768 & i3;
                if (i17 == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if (sVar2.S(i5 & 1, (i5 & 306783379) == 306783378 || (i18 & 599187) != 599186)) {
                }
                t = sVar2.t();
                if (t == null) {
                }
            }
            aVar2 = aVar;
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i11 = i3 & 1024;
            if (i11 != 0) {
            }
            i13 = i14;
            if ((i2 & 384) != 0) {
            }
            i15 = i3 & 8192;
            if (i15 == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i17 = 32768 & i3;
            if (i17 == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if (sVar2.S(i5 & 1, (i5 & 306783379) == 306783378 || (i18 & 599187) != 599186)) {
            }
            t = sVar2.t();
            if (t == null) {
            }
        }
        fVar4 = fVar;
        i5 = i24 | 24576;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        aVar2 = aVar;
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i11 = i3 & 1024;
        if (i11 != 0) {
        }
        i13 = i14;
        if ((i2 & 384) != 0) {
        }
        i15 = i3 & 8192;
        if (i15 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i17 = 32768 & i3;
        if (i17 == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if (sVar2.S(i5 & 1, (i5 & 306783379) == 306783378 || (i18 & 599187) != 599186)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }
}
