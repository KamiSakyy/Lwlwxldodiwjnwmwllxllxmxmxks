package com.github.rudroid.uitoolkit.listitems;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.n2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.v1;
import com.github.rudroid.starredreposandlists.u0;
import com.github.rudroid.uitoolkit.k0;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, final String str, int i, final boolean z, float f, boolean z2, final j71.a aVar, boolean z3, androidx.compose.runtime.s sVar, final int i2, final int i3) {
        Object z13 = null;
        w1.r rVar2;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        int i7;
        final float f2;
        final w1.r rVar3;
        final boolean z6;
        final boolean z7;
        int i8;
        float f3;
        boolean z8;
        w1.r rVar4;
        boolean z9;
        w61.k kVar;
        boolean z11;
        Object N;
        Object obj;
        boolean f4;
        Object N2;
        Object N3;
        Object N4;
        androidx.compose.runtime.s sVar2;
        boolean z12;
        Object N5;
        float f5;
        k71.k.g(str, "sectionTitle");
        k71.k.g(aVar, "onSectionClick");
        sVar.e0(1633144336);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            rVar2 = rVar;
        } else if ((i2 & 6) == 0) {
            rVar2 = rVar;
            i4 = (sVar.f(rVar2) ? 4 : 2) | i2;
        } else {
            rVar2 = rVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= sVar.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= sVar.g(z) ? 2048 : 1024;
        }
        int i11 = 204800 | i4;
        int i12 = i3 & 64;
        if (i12 != 0) {
            i5 = i4 | 1777664;
            z4 = z2;
        } else {
            z4 = z2;
            i5 = i11 | (sVar.g(z4) ? 1048576 : 524288);
        }
        if ((12582912 & i2) == 0) {
            i5 |= sVar.h(aVar) ? 8388608 : 4194304;
        }
        int i13 = i3 & 256;
        if (i13 != 0) {
            i6 = i5 | 100663296;
            z5 = z3;
        } else {
            z5 = z3;
            i6 = i5 | (sVar.g(z5) ? 67108864 : 33554432);
        }
        if (sVar.S(i6 & 1, (i6 & 38347923) != 38347922)) {
            sVar.X();
            int i14 = i2 & 1;
            w1.r rVar5 = w1.o.a;
            if (i14 == 0 || sVar.A()) {
                if (i9 != 0) {
                    rVar2 = rVar5;
                }
                int i15 = i6 & (-57345);
                if (i12 != 0) {
                    z4 = false;
                }
                if (i13 != 0) {
                    z8 = false;
                    i8 = i15;
                    f3 = -180.0f;
                    rVar4 = rVar2;
                    z9 = z4;
                    sVar.r();
                    if (z) {
                        sVar.c0(-386044569);
                        kVar = new w61.k(i4.p0(2131954034, sVar), i4.p0(2131953750, sVar));
                        sVar.q(false);
                    } else {
                        sVar.c0(-386221114);
                        kVar = new w61.k(i4.p0(2131954035, sVar), i4.p0(2131953686, sVar));
                        sVar.q(false);
                    }
                    String str2 = (String) kVar.r;
                    String str3 = (String) kVar.s;
                    w1.r f6 = f0.o.f(rVar5, ih.d.b(sVar).o, d2.a0Shadow.b);
                    boolean z13 = i == 0 || z8;
                    z11 = (i8 & 29360128) != 8388608;
                    N = sVar.N();
                    obj = androidx.compose.runtime.n.a;
                    if (!z11 || N == obj) {
                        N = new com.github.rudroid.agents.base.g(4, aVar);
                        sVar.n0(N);
                    }
                    w1.r a = com.github.rudroid.uitoolkit.extensions.d.a(f6, z13, (j71.c) N);
                    f4 = sVar.f(str2) | sVar.f(str3);
                    N2 = sVar.N();
                    if (!f4 || N2 == obj) {
                        N2 = new com.github.rudroid.actions.checkdetail.ui.n(str2, 7, str3);
                        sVar.n0(N2);
                    }
                    w1.r f7 = d3.q.b(a, true, (j71.c) N2).f(rVar4);
                    androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar, 0);
                    int hashCode = Long.hashCode(sVar.T);
                    v1 l = sVar.l();
                    w1.r c = w1.a.c(sVar, f7);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar.g0();
                    if (sVar.S) {
                        sVar.q0();
                    } else {
                        sVar.k(fVar);
                    }
                    v2.eShadow eVar = v2.g.f;
                    androidx.compose.runtime.t.I(sVar, eVar, a2);
                    v2.eShadow eVar2 = v2.g.e;
                    androidx.compose.runtime.t.I(sVar, eVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    v2.eShadow eVar3 = v2.g.g;
                    androidx.compose.runtime.t.w(sVar, valueOf, eVar3);
                    v2.d dVar = v2.g.h;
                    androidx.compose.runtime.t.E(sVar, dVar);
                    v2.eShadow eVar4 = v2.g.d;
                    androidx.compose.runtime.t.I(sVar, eVar4, c);
                    N3 = sVar.N();
                    if (N3 == obj) {
                        N3 = androidx.compose.runtime.t.B(Boolean.FALSE);
                        sVar.n0(N3);
                    }
                    f1 f1Var = (f1) N3;
                    float f8 = !((Boolean) f1Var.getValue()).booleanValue() ? ih.a.l : ih.a.m;
                    float f9 = ih.a.n;
                    w1.r y = androidx.compose.foundation.layout.b.y(rVar5, f9, f8);
                    l2 a3 = j2.a(androidx.compose.foundation.layout.l.g(f9), w1.c.B, sVar, 54);
                    w1.r rVar6 = rVar4;
                    int hashCode2 = Long.hashCode(sVar.T);
                    v1 l2 = sVar.l();
                    w1.r c2 = w1.a.c(sVar, y);
                    sVar.g0();
                    if (sVar.S) {
                        sVar.q0();
                    } else {
                        sVar.k(fVar);
                    }
                    androidx.compose.runtime.t.I(sVar, eVar, a3);
                    androidx.compose.runtime.t.I(sVar, eVar2, l2);
                    f1.e.t(hashCode2, sVar, eVar3, sVar, dVar);
                    androidx.compose.runtime.t.I(sVar, eVar4, c2);
                    if (1.0f <= 0.0d) {
                        l0.a.a("invalid weight; must be greater than zero");
                    }
                    w1 w1Var = new w1(1.0f, true);
                    q0 q0Var = ih.d.f(sVar).n;
                    N4 = sVar.N();
                    if (N4 == obj) {
                        N4 = new ab.e(f1Var, 9);
                        sVar.n0(N4);
                    }
                    int i16 = i8 >> 3;
                    ub.b(str, w1Var, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) N4, q0Var, sVar, i16 & 14, 1572864, 65532);
                    sVar2 = sVar;
                    if (z9) {
                        z12 = false;
                        sVar2.c0(1420792056);
                    } else {
                        sVar2.c0(1424435920);
                        float f11 = 12;
                        com.github.rudroid.uitoolkit.f1.a(null, new s3.h(m7.y.a(f11, f11)), 2, ih.d.b(sVar2).A, sVar2, 432, 1);
                        z12 = false;
                    }
                    sVar2.q(z12);
                    i7 = i;
                    c(i7, i16 & 112, sVar2, null);
                    if (i7 == 0 || z8) {
                        sVar2.c0(1424804014);
                        N5 = sVar2.N();
                        if (N5 == obj) {
                            N5 = new u0(12);
                            sVar2.n0(N5);
                        }
                        float f12 = f3;
                        h0.a(d3.q.a(rVar5, (j71.c) N5), z, f12, 0.0f, null, 0L, 0, sVar, (i8 >> 6) & 8176, 112);
                        f5 = f12;
                        sVar2 = sVar;
                        sVar2.q(z12);
                    } else {
                        sVar2.c0(1420792056);
                        sVar2.q(z12);
                        f5 = f3;
                    }
                    sVar2.q(true);
                    k0.a(null, 0L, 0L, 0.0f, false, sVar, 0, 31);
                    sVar.q(true);
                    f2 = f5;
                    z6 = z9;
                    z7 = z8;
                    rVar3 = rVar6;
                } else {
                    i8 = i15;
                    f3 = -180.0f;
                }
            } else {
                sVar.V();
                f3 = f;
                i8 = i6 & (-57345);
            }
            rVar4 = rVar2;
            z9 = z4;
            z8 = z5;
            sVar.r();
            if (z) {
            }
            String str22 = (String) kVar.r;
            String str32 = (String) kVar.s;
            w1.r f62 = f0.o.f(rVar5, ih.d.b(sVar).o, d2.a0Shadow.b);
            if (i == 0) {
            }
            if ((i8 & 29360128) != 8388608) {
            }
            N = sVar.N();
            obj = androidx.compose.runtime.n.a;
            if (!z11) {
            }
            N = new com.github.rudroid.agents.base.g(4, aVar);
            sVar.n0(N);
            w1.r a4 = com.github.rudroid.uitoolkit.extensions.d.a(f62, z13, (j71.c) N);
            f4 = sVar.f(str22) | sVar.f(str32);
            N2 = sVar.N();
            if (!f4) {
            }
            N2 = new com.github.rudroid.actions.checkdetail.ui.n(str22, 7, str32);
            sVar.n0(N2);
            w1.r f72 = d3.q.b(a4, true, (j71.c) N2).f(rVar4);
            androidx.compose.foundation.layout.e0 a22 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar, 0);
            int hashCode3 = Long.hashCode(sVar.T);
            v1 l3 = sVar.l();
            w1.r c3 = w1.a.c(sVar, f72);
            v2.h.o.getClass();
            v2.f fVar2 = v2.g.b;
            sVar.g0();
            if (sVar.S) {
            }
            v2.eShadow eVar5 = v2.g.f;
            androidx.compose.runtime.t.I(sVar, eVar5, a22);
            v2.eShadow eVar22 = v2.g.e;
            androidx.compose.runtime.t.I(sVar, eVar22, l3);
            Integer valueOf2 = Integer.valueOf(hashCode3);
            v2.eShadow eVar32 = v2.g.g;
            androidx.compose.runtime.t.w(sVar, valueOf2, eVar32);
            v2.d dVar2 = v2.g.h;
            androidx.compose.runtime.t.E(sVar, dVar2);
            v2.eShadow eVar42 = v2.g.d;
            androidx.compose.runtime.t.I(sVar, eVar42, c3);
            N3 = sVar.N();
            if (N3 == obj) {
            }
            f1 f1Var2 = (f1) N3;
            float f82 = !((Boolean) f1Var2.getValue()).booleanValue() ? ih.a.l : ih.a.m;
            float f92 = ih.a.n;
            w1.r y2 = androidx.compose.foundation.layout.b.y(rVar5, f92, f82);
            l2 a32 = j2.a(androidx.compose.foundation.layout.l.g(f92), w1.c.B, sVar, 54);
            w1.r rVar62 = rVar4;
            int hashCode22 = Long.hashCode(sVar.T);
            v1 l22 = sVar.l();
            w1.r c22 = w1.a.c(sVar, y2);
            sVar.g0();
            if (sVar.S) {
            }
            androidx.compose.runtime.t.I(sVar, eVar5, a32);
            androidx.compose.runtime.t.I(sVar, eVar22, l22);
            f1.e.t(hashCode22, sVar, eVar32, sVar, dVar2);
            androidx.compose.runtime.t.I(sVar, eVar42, c22);
            if (1.0f <= 0.0d) {
            }
            w1 w1Var2 = new w1(1.0f, true);
            q0 q0Var2 = ih.d.f(sVar).n;
            N4 = sVar.N();
            if (N4 == obj) {
            }
            int i162 = i8 >> 3;
            ub.b(str, w1Var2, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) N4, q0Var2, sVar, i162 & 14, 1572864, 65532);
            sVar2 = sVar;
            if (z9) {
            }
            sVar2.q(z12);
            i7 = i;
            c(i7, i162 & 112, sVar2, null);
            if (i7 == 0) {
            }
            sVar2.c0(1424804014);
            N5 = sVar2.N();
            if (N5 == obj) {
            }
            float f122 = f3;
            h0.a(d3.q.a(rVar5, (j71.c) N5), z, f122, 0.0f, null, 0L, 0, sVar, (i8 >> 6) & 8176, 112);
            f5 = f122;
            sVar2 = sVar;
            sVar2.q(z12);
            sVar2.q(true);
            k0.a(null, 0L, 0L, 0.0f, false, sVar, 0, 31);
            sVar.q(true);
            f2 = f5;
            z6 = z9;
            z7 = z8;
            rVar3 = rVar62;
        } else {
            i7 = i;
            sVar.V();
            f2 = f;
            rVar3 = rVar2;
            z6 = z4;
            z7 = z5;
        }
        b2 t = sVar.t();
        if (t != null) {
            final int i17 = i7;
            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.listitems.l
                public final Object s(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    m.a(rVar3, str, i17, z, f2, z6, aVar, z7, (androidx.compose.runtime.s) obj2, androidx.compose.runtime.t.L(i2 | 1), i3);
                    return w61.a0.a;
                }
            };
        }
    }

    public static final void b(final w1.r rVar, final boolean z, float f, int i, final r1.d dVar, androidx.compose.runtime.s sVar, final int i2) {
        int i3;
        final float f2;
        final int i4;
        int i5;
        int i6;
        sVar.e0(-247126333);
        if ((i2 & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar.g(true) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= sVar.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        int i7 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i7 = 90112 | i3;
        }
        if ((1572864 & i2) == 0) {
            i7 |= sVar.h(dVar) ? 1048576 : 524288;
        }
        if (sVar.S(i7 & 1, (599187 & i7) != 599186)) {
            sVar.X();
            if ((i2 & 1) == 0 || sVar.A()) {
                i5 = i7 & (-465921);
                f2 = -180.0f;
                i6 = 2131231173;
            } else {
                sVar.V();
                i5 = i7 & (-465921);
                f2 = f;
                i6 = i;
            }
            sVar.r();
            l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar, 48);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, rVar);
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
            dVar.f(n2.a, sVar, Integer.valueOf(((i5 >> 15) & 112) | 6));
            sVar.c0(1019259663);
            h0.a(null, z, f2, 0.0f, null, 0L, i6, sVar, (i5 >> 3) & 8176, 49);
            sVar.q(false);
            sVar.q(true);
            i4 = i6;
        } else {
            sVar.V();
            f2 = f;
            i4 = i;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.listitems.k
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m.b(rVar, z, f2, i4, dVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i2 | 1));
                    return w61.a0.a;
                }
            };
        }
    }

    public static final void c(int i, int i2, androidx.compose.runtime.s sVar, w1.r rVar) {
        w1.r rVar2;
        sVar.e0(-1688399436);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= sVar.d(i) ? 32 : 16;
        }
        if (sVar.S(i3 & 1, (i3 & 19) != 18)) {
            String n0 = i4.n0(2131820622, i, new Object[]{Integer.valueOf(i)}, sVar);
            float f = ih.a.l;
            w1.r rVar3 = w1.o.a;
            com.github.rudroid.uitoolkit.j.b(androidx.compose.foundation.layout.b.z(rVar3, f, 0.0f, 2), null, String.valueOf(i), 0.0f, ih.d.f(sVar).B, null, 0, ih.d.a(sVar).j0, ih.d.a(sVar).l0, 0.0f, null, 0L, n0, sVar, 805306368, 0, 3178);
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.agents.agenttasks.c(rVar2, i, i2, 5);
        }
    }
}
