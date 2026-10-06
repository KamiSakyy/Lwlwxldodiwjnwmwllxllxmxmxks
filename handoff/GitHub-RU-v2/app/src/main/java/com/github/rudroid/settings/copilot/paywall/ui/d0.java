package com.github.rudroid.settings.copilot.paywall.ui;

import a0.r1;
import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.n2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;
import f1.qa;
import f1.ub;
import h0.h1Shadow;
import java.util.List;
import w2.g1;
import xn.e1;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 {

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[h0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                h0 h0Var = h0.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                h0 h0Var2 = h0.r;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                h0 h0Var3 = h0.r;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final void a(int i, int i2, androidx.compose.runtime.s sVar, j71.c cVar, j71.c cVar2, w1.r rVar) {
        int i3;
        w1.r rVar2;
        int i4;
        w1.r rVar3;
        sVar.e0(-748536775);
        if ((i & 6) == 0) {
            i3 = (sVar.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.h(cVar2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 384;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i4 = i3 | (sVar.f(rVar2) ? 256 : 128);
        }
        if (sVar.S(i4 & 1, (i4 & 147) != 146)) {
            w1.r rVar4 = i5 != 0 ? w1.o.a : rVar2;
            w1.r z = androidx.compose.foundation.layout.b.z(p2.e(rVar4, 1.0f), ih.a.n, 0.0f, 2);
            androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar, 0);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, z);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, v2.g.f, a2);
            androidx.compose.runtime.t.I(sVar, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar, v2.g.h);
            androidx.compose.runtime.t.I(sVar, v2.g.d, c);
            String p0 = i4.p0(2131953438, sVar);
            String p02 = i4.p0(2131951986, sVar);
            boolean f = ((i4 & 112) == 32) | sVar.f(p02);
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            if (f || N == iVar) {
                N = new bd.c(8, cVar2, p02);
                sVar.n0(N);
            }
            c(0, sVar, (j71.a) N, i4.p0(2131954493, sVar), null);
            boolean f2 = ((i4 & 14) == 4) | sVar.f(p0);
            Object N2 = sVar.N();
            if (f2 || N2 == iVar) {
                N2 = new bd.c(9, cVar, p0);
                sVar.n0(N2);
            }
            c(0, sVar, (j71.a) N2, i4.p0(2131954548, sVar), null);
            sVar.q(true);
            rVar3 = rVar4;
        } else {
            sVar.V();
            rVar3 = rVar2;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new androidx.compose.foundation.lazy.layout.w0(cVar, cVar2, rVar3, i, i2, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(j71.c cVar, j71.c cVar2, e1 e1Var, w1.r rVar, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        w1.r rVar2;
        w1.r rVar3;
        b2 t;
        k71.k.g(cVar, "onPrivacyPolicyClick");
        k71.k.g(cVar2, "onTermsOfUseClick");
        k71.k.g(e1Var, "licenseToBuy");
        sVar.e0(-1280220304);
        if ((i & 6) == 0) {
            i3 = (sVar.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.h(cVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.d(e1Var.ordinal()) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            rVar2 = rVar;
            i3 |= sVar.f(rVar2) ? 2048 : 1024;
            if (sVar.S(i3 & 1, (i3 & 1171) == 1170)) {
                sVar.V();
                rVar3 = rVar2;
            } else {
                w1.r rVar4 = i4 != 0 ? w1.o.a : rVar2;
                List r = e1Var == e1.u ? x61.l.r(new m0[]{m.a, m.b, m.c, m.d, m.e, m.f, m.g, m.h}) : x61.l.r(new m0[]{e0.a, e0.b, e0.c, e0.d, e0.e, e0.f, e0.g, e0.h});
                w1.r d = p2.d(rVar4, 1.0f);
                boolean h = ((i3 & 14) == 4) | ((i3 & 896) == 256) | sVar.h(r) | ((i3 & 112) == 32);
                Object N = sVar.N();
                if (h || N == androidx.compose.runtime.n.a) {
                    a0.a aVar = new a0.a(r, e1Var, cVar, cVar2, 8);
                    sVar.n0(aVar);
                    N = aVar;
                }
                com.google.common.util.concurrent.a.b(d, (m0.s) null, (d2) null, (androidx.compose.foundation.layout.k) null, (w1.d) null, (h1Shadow) null, false, (f0.j) null, (j71.c) N, sVar, 0, 510);
                rVar3 = rVar4;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new com.github.rudroid.achievements.ui.b0(cVar, cVar2, e1Var, rVar3, i, i2, 16);
                return;
            }
            return;
        }
        rVar2 = rVar;
        if (sVar.S(i3 & 1, (i3 & 1171) == 1170)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final void c(int i, androidx.compose.runtime.s sVar, j71.a aVar, String str, w1.r rVar) {
        w1.r rVar2;
        k71.k.g(aVar, "onClick");
        k71.k.g(str, "text");
        sVar.e0(266598248);
        int i2 = i | 6 | (sVar.h(aVar) ? 32 : 16) | (sVar.f(str) ? 256 : 128);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            rVar2 = w1.o.a;
            sg.k0Shadow.a(((i2 << 3) & 896) | 12582912, 114, null, sVar, null, null, sg.v.l(0L, sVar, 7), aVar, r1.i.d(-1377238065, new ab.m(str, 6), sVar), p2.e(rVar2, 1.0f), false);
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new y(rVar2, aVar, str, i);
        }
    }

    public static final void d(w1.r rVar, e1 e1Var, androidx.compose.runtime.s sVar, int i) {
        w1.r rVar2;
        boolean z;
        int i2;
        int i3;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(e1Var, "licenseToBuy");
        sVar2.e0(-1573984308);
        int i4 = i | 6 | (sVar2.d(e1Var.ordinal()) ? 32 : 16);
        if (sVar2.S(i4 & 1, (i4 & 19) != 18)) {
            w1.r rVar3 = w1.o.a;
            w1.r e = p2.e(androidx.compose.foundation.layout.b.y(rVar3, 20, 12), 1.0f);
            androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.E, sVar2, 48);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, e);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, v2.g.f, a2);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
            String p0 = i4.p0(2131952261, sVar2);
            r3.k kVar = new r3.k(3);
            g3.q0 q0Var = ih.d.f(sVar2).H;
            long C = t1.C(36);
            long B = t1.B(0.1d);
            t1.p(B);
            ub.b(p0, (w1.r) null, 0L, 0L, (k3.s) null, 0L, kVar, 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(q0Var, 0L, C, (k3.s) null, (k3.o) null, (k3.i) null, t1.E(-s3.o.c(B), B & 1095216660480L), 0, 0L, (g3.z) null, (r3.i) null, 16777085), sVar, 0, 0, 130046);
            e1 e1Var2 = e1.u;
            if (e1Var == e1Var2) {
                i2 = 1953587820;
                i3 = 2131952229;
                z = false;
            } else {
                z = false;
                i2 = 1953677255;
                i3 = 2131952244;
            }
            String d = com.github.rudroid.m0.d(sVar, i2, i3, sVar, z);
            r3.k kVar2 = new r3.k(3);
            g3.q0 q0Var2 = ih.d.f(sVar).H;
            k3.s sVar3 = k3.s.z;
            long C2 = t1.C(36);
            long B2 = t1.B(0.1d);
            t1.p(B2);
            ub.b(d, (w1.r) null, 0L, 0L, (k3.s) null, 0L, kVar2, 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(q0Var2, 0L, C2, sVar3, (k3.o) null, (k3.i) null, t1.E(-s3.o.c(B2), B2 & 1095216660480L), 0, 0L, (g3.z) null, (r3.i) null, 16777081), sVar, 0, 0, 130046);
            float f = 8;
            androidx.compose.foundation.layout.b.g(sVar, p2.f(rVar3, f));
            ub.b(i4.p0(e1Var == e1Var2 ? 2131952251 : 2131952246, sVar), (w1.r) null, 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar).q, 0L, t1.C(15), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777213), sVar, 0, 0, 130046);
            androidx.compose.foundation.layout.b.g(sVar, p2.f(rVar3, f));
            com.github.rudroid.uitoolkit.k0.a(null, 0L, 0L, 0.0f, false, sVar, 0, 31);
            float f2 = 16;
            androidx.compose.foundation.layout.b.g(sVar, p2.f(rVar3, f2));
            ub.b(i4.p0(2131952252, sVar), (w1.r) null, 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar).v, 0L, t1.C(11), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777213), sVar, 0, 0, 130046);
            androidx.compose.foundation.layout.b.g(sVar, p2.f(rVar3, f2));
            ub.b(i4.p0(2131952253, sVar), (w1.r) null, 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar).v, 0L, t1.C(11), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777213), sVar, 0, 0, 130046);
            sVar2 = sVar;
            rVar2 = rVar3;
            androidx.compose.foundation.layout.b.g(sVar2, p2.f(rVar2, f2));
            com.github.rudroid.uitoolkit.k0.a(null, 0L, 0L, 0.0f, false, sVar2, 0, 31);
            sVar2.q(true);
        } else {
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.settings.copilot.debug.q(rVar2, e1Var, i);
        }
    }

    public static final void e(w1.r rVar, m0 m0Var, e1 e1Var, androidx.compose.runtime.s sVar, int i) {
        w1.r rVar2;
        sVar.e0(1928960274);
        int i2 = i | 6 | (sVar.h(m0Var) ? 32 : 16) | (sVar.d(e1Var.ordinal()) ? 256 : 128);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            w1.r rVar3 = w1.o.a;
            qa.a(androidx.compose.foundation.layout.b.y(rVar3, 20, 12), ih.d.e(sVar).e, ih.d.b(sVar).b, 0L, 0.0f, 0.0f, (f0.v) null, r1.i.d(1979211245, new com.github.rudroid.settings.copilot.debug.q(1, m0Var, e1Var), sVar), sVar, 12582912, 120);
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.profile.status.ui.x(rVar2, m0Var, e1Var, i, 7);
        }
    }

    public static final void f(w1.r rVar, i0 i0Var, e1 e1Var, androidx.compose.runtime.s sVar, int i) {
        w1.r rVar2;
        w61.k kVar;
        boolean z;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(1663656510);
        int i2 = i | 6 | (sVar2.f(i0Var) ? 32 : 16) | (sVar2.d(e1Var.ordinal()) ? 256 : 128);
        if (sVar2.S(i2 & 1, (i2 & 147) != 146)) {
            if (e1Var == e1.u) {
                sVar2.c0(-1931277989);
                kVar = new w61.k(i4.p0(2131952053, sVar2), i4.p0(2131952054, sVar2));
                sVar2.q(false);
            } else {
                sVar2.c0(-1931104265);
                kVar = new w61.k(i4.p0(2131952054, sVar2), i4.p0(2131952055, sVar2));
                sVar2.q(false);
            }
            String str = (String) kVar.r;
            String str2 = (String) kVar.s;
            float f = ih.a.n;
            w1.r rVar3 = w1.o.a;
            w1.r e = p2.e(androidx.compose.foundation.layout.b.z(rVar3, 0.0f, f, 1), 1.0f);
            l2 a2 = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, e);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            v2.eShadow eVar = v2.g.f;
            androidx.compose.runtime.t.I(sVar2, eVar, a2);
            v2.eShadow eVar2 = v2.g.e;
            androidx.compose.runtime.t.I(sVar2, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.eShadow eVar3 = v2.g.g;
            androidx.compose.runtime.t.w(sVar2, valueOf, eVar3);
            v2.d dVar = v2.g.h;
            androidx.compose.runtime.t.E(sVar2, dVar);
            v2.eShadow eVar4 = v2.g.d;
            androidx.compose.runtime.t.I(sVar2, eVar4, c);
            n2 n2Var = n2.a;
            w1.r a3 = n2Var.a(rVar3, 0.7f, true);
            androidx.compose.foundation.layout.e0 a4 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
            int hashCode2 = Long.hashCode(sVar2.T);
            v1 l2 = sVar2.l();
            w1.r c2 = w1.a.c(sVar2, a3);
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, eVar, a4);
            androidx.compose.runtime.t.I(sVar2, eVar2, l2);
            f1.e.t(hashCode2, sVar2, eVar3, sVar2, dVar);
            androidx.compose.runtime.t.I(sVar2, eVar4, c2);
            boolean z2 = i0Var.c;
            Integer num = i0Var.e;
            h0 h0Var = i0Var.b;
            h0 h0Var2 = i0Var.a;
            l lVar = i0Var.f;
            if (z2) {
                sVar2.c0(207787125);
                z = false;
                h(null, sVar2, 0);
                com.github.rudroid.m0.C(rVar3, ih.a.l, sVar2, false);
            } else {
                z = false;
                sVar2.c0(201397994);
                sVar2.q(false);
            }
            boolean z3 = z;
            ub.b(i4.p0(i0Var.d, sVar2), (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar2).u, 0L, t1.C(15), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777213), sVar, 0, 0, 131070);
            sVar2 = sVar;
            if (lVar != null) {
                sVar2.c0(208179430);
                w2.q0 q0Var = (w2.q0) sVar2.j(g1.r);
                String p0 = i4.p0(2131952256, sVar2);
                String p02 = i4.p0(2131952256, sVar2);
                String p03 = i4.p0(2131952038, sVar2);
                g3.q0 a5 = g3.q0.a(ih.d.f(sVar2).r, 0L, t1.C(15), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16773117);
                boolean h = sVar2.h(q0Var);
                Object N = sVar2.N();
                if (h || N == androidx.compose.runtime.n.a) {
                    N = new com.github.rudroid.fragments.onboarding.notifications.viewmodel.z(26, q0Var);
                    sVar2.n0(N);
                }
                com.github.rudroid.uitoolkit.text.s.a(null, p0, p02, p03, 0L, a5, (j71.c) N, sVar, 0, 17);
                sVar2 = sVar;
            } else {
                sVar2.c0(201397994);
            }
            sVar2.q(z3);
            if (num != null) {
                sVar2.c0(208821037);
                ub.b(i4.p0(num.intValue(), sVar2), (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar2).v, 0L, t1.C(13), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777213), sVar, 0, 0, 131070);
                sVar2 = sVar;
            } else {
                sVar2.c0(201397994);
            }
            sVar2.q(z3);
            sVar2.q(true);
            p5.a(j(h0Var2, sVar2), i(h0Var2, str, sVar2), n2Var.a(rVar3, 0.15f, true), k(h0Var2, sVar2), sVar2, 8, 0);
            p5.a(j(h0Var, sVar2), i(h0Var, str2, sVar2), n2Var.a(rVar3, 0.15f, true), k(h0Var, sVar2), sVar2, 8, 0);
            sVar2.q(true);
            rVar2 = rVar3;
        } else {
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.profile.status.ui.x(rVar2, i0Var, e1Var, i, 8);
        }
    }

    public static final void g(w1.r rVar, int i, e1 e1Var, androidx.compose.runtime.s sVar, int i2) {
        androidx.compose.runtime.s sVar2;
        w1.r rVar2;
        w61.k kVar;
        sVar.e0(2078183502);
        int i3 = i2 | 6 | (sVar.d(i) ? 32 : 16) | (sVar.d(e1Var.ordinal()) ? 256 : 128);
        if (sVar.S(i3 & 1, (i3 & 147) != 146)) {
            if (e1Var == e1.u) {
                sVar.c0(-788648213);
                kVar = new w61.k(i4.p0(2131952053, sVar), i4.p0(2131952054, sVar));
                sVar.q(false);
            } else {
                sVar.c0(-788474489);
                kVar = new w61.k(i4.p0(2131952054, sVar), i4.p0(2131952055, sVar));
                sVar.q(false);
            }
            String str = (String) kVar.r;
            String str2 = (String) kVar.s;
            float f = ih.a.n;
            w1.r rVar3 = w1.o.a;
            w1.r e = p2.e(androidx.compose.foundation.layout.b.z(rVar3, 0.0f, f, 1), 1.0f);
            l2 a2 = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar, 48);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, e);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, v2.g.f, a2);
            androidx.compose.runtime.t.I(sVar, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar, v2.g.h);
            androidx.compose.runtime.t.I(sVar, v2.g.d, c);
            n2 n2Var = n2.a;
            w1.r a3 = n2Var.a(rVar3, 0.7f, true);
            String p0 = i4.p0(i, sVar);
            g3.q0 q0Var = ih.d.f(sVar).J;
            long C = t1.C(17);
            long B = t1.B(0.1d);
            t1.p(B);
            rVar2 = rVar3;
            ub.b(p0, a3, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(q0Var, 0L, C, (k3.s) null, (k3.o) null, (k3.i) null, t1.E(-s3.o.c(B), 1095216660480L & B), 0, 0L, (g3.z) null, (r3.i) null, 16777085), sVar, 0, 0, 131068);
            w1.r a4 = n2Var.a(rVar2, 0.15f, true);
            g3.q0 q0Var2 = ih.d.f(sVar).J;
            long C2 = t1.C(17);
            long B2 = t1.B(0.1d);
            t1.p(B2);
            ub.b(str, a4, 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(q0Var2, 0L, C2, (k3.s) null, (k3.o) null, (k3.i) null, t1.E(-s3.o.c(B2), 1095216660480L & B2), 0, 0L, (g3.z) null, (r3.i) null, 16777085), sVar, 0, 0, 130044);
            w1.r a5 = n2Var.a(rVar2, 0.15f, true);
            g3.q0 q0Var3 = ih.d.f(sVar).J;
            long C3 = t1.C(17);
            long B3 = t1.B(0.1d);
            t1.p(B3);
            ub.b(str2, a5, 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(q0Var3, 0L, C3, (k3.s) null, (k3.o) null, (k3.i) null, t1.E(-s3.o.c(B3), 1095216660480L & B3), 0, 0L, (g3.z) null, (r3.i) null, 16777085), sVar, 0, 0, 130044);
            sVar2 = sVar;
            sVar2.q(true);
        } else {
            sVar2 = sVar;
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new r1(rVar2, i, e1Var, i2, 21);
        }
    }

    public static final void h(w1.r rVar, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        sVar.e0(-1897187260);
        int i2 = i | 6;
        if (sVar.S(i2 & 1, (i2 & 3) != 2)) {
            String p0 = i4.p0(2131952189, sVar);
            w1.r rVar2 = w1.o.a;
            sVar2 = sVar;
            com.github.rudroid.uitoolkit.copilot.m.a(rVar2, null, p0, null, sVar2, 6, 10);
            rVar = rVar2;
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new androidx.compose.foundation.layout.r(i, 12, rVar);
        }
    }

    public static final String i(h0 h0Var, String str, androidx.compose.runtime.s sVar) {
        k71.k.g(str, "licenseString");
        int ordinal = h0Var.ordinal();
        if (ordinal == 0) {
            sVar.c0(-239118048);
            String q0 = i4.q0(2131953758, new Object[]{str}, sVar);
            sVar.q(false);
            return q0;
        }
        if (ordinal == 1) {
            sVar.c0(-239114044);
            String q02 = i4.q0(2131953760, new Object[]{str}, sVar);
            sVar.q(false);
            return q02;
        }
        if (ordinal == 2) {
            sVar.c0(-239110202);
            String q03 = i4.q0(2131953759, new Object[]{str}, sVar);
            sVar.q(false);
            return q03;
        }
        if (ordinal != 3) {
            throw f1.e.r(-239119495, sVar, false);
        }
        sVar.c0(-239106136);
        String q04 = i4.q0(2131953761, new Object[]{str}, sVar);
        sVar.q(false);
        return q04;
    }

    public static final i2.b j(h0 h0Var, androidx.compose.runtime.s sVar) {
        int ordinal = h0Var.ordinal();
        if (ordinal == 0) {
            sVar.c0(-139670873);
            i2.b C = z3.C(2131231158, 0, sVar);
            sVar.q(false);
            return C;
        }
        if (ordinal == 1) {
            sVar.c0(-139668090);
            i2.b C2 = z3.C(2131231214, 0, sVar);
            sVar.q(false);
            return C2;
        }
        if (ordinal == 2) {
            sVar.c0(-139665626);
            i2.b C3 = z3.C(2131231462, 0, sVar);
            sVar.q(false);
            return C3;
        }
        if (ordinal != 3) {
            throw f1.e.r(-139672203, sVar, false);
        }
        sVar.c0(-139662998);
        i2.b C4 = z3.C(2131231318, 0, sVar);
        sVar.q(false);
        return C4;
    }

    public static final long k(h0 h0Var, androidx.compose.runtime.s sVar) {
        int ordinal = h0Var.ordinal();
        if (ordinal == 0) {
            sVar.c0(-1898808776);
            long j = ih.d.a(sVar).x;
            sVar.q(false);
            return j;
        }
        if (ordinal == 1) {
            sVar.c0(-1898806377);
            long j2 = ih.d.a(sVar).n;
            sVar.q(false);
            return j2;
        }
        if (ordinal == 2) {
            sVar.c0(-1898804295);
            long j3 = ih.d.a(sVar).R;
            sVar.q(false);
            return j3;
        }
        if (ordinal != 3) {
            throw f1.e.r(-1898810918, sVar, false);
        }
        sVar.c0(-1898801992);
        long j4 = ih.d.a(sVar).x;
        sVar.q(false);
        return j4;
    }
}
