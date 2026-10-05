package com.github.rudroid.starredreposandlists.ui;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import b6.t1;
import com.github.rudroid.actions.checkssummary.ui.p;
import com.github.rudroid.agents.sessionevents.ui.u1;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.repositories.k;
import com.github.rudroid.starredreposandlists.u0;
import com.github.rudroid.uitoolkit.f3;
import com.github.rudroid.uitoolkit.text.m;
import com.github.rudroid.utilities.c1;
import com.github.rudroid.utilities.ui.l0;
import com.github.service.models.response.Avatar;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import d2.a0;
import d3.q;
import f1.f8;
import f1.g8;
import f1.p5;
import f1.ub;
import java.util.List;
import sy.d0;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public static final void a(r rVar, k kVar, boolean z, j71.c cVar, j71.a aVar, com.github.rudroid.html.b bVar, s sVar, int i) {
        k kVar2;
        boolean z2;
        s sVar2 = sVar;
        k71.k.g(cVar, "onEditListsClick");
        k71.k.g(aVar, "onClick");
        k71.k.g(bVar, "htmlStyler");
        sVar2.e0(1024498424);
        int i2 = i | (sVar2.f(rVar) ? 4 : 2) | (sVar2.f(kVar) ? 32 : 16) | (sVar2.g(z) ? 256 : 128) | (sVar2.h(cVar) ? 2048 : 1024) | (sVar2.h(aVar) ? 16384 : 8192) | (sVar2.h(bVar) ? 131072 : 65536);
        if (sVar2.S(i2 & 1, (74899 & i2) != 74898)) {
            String p0 = i4.p0(2131953848, sVar2);
            boolean z3 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object N = sVar2.N();
            Object obj = n.a;
            if (z3 || N == obj) {
                N = new i(cVar, kVar, 0);
                sVar2.n0(N);
            }
            List n = d0.n(new d3.f(p0, (j71.a) N));
            String p02 = i4.p0(2131953851, sVar2);
            o oVar = o.a;
            r m = f0.o.m(oVar, false, p02, (d3.k) null, aVar, 13);
            boolean h = sVar2.h(n);
            Object N2 = sVar2.N();
            if (h || N2 == obj) {
                N2 = new com.github.rudroid.searchandfilter.filterbar.j(1, n);
                sVar2.n0(N2);
            }
            r f = q.b(m, true, (j71.c) N2).f(rVar);
            e0 a = c0.a(l.c, w1.c.D, sVar2, 0);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            r c = w1.a.c(sVar2, f);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            t.I(sVar2, v2.g.f, a);
            t.I(sVar2, v2.g.e, l);
            t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            t.E(sVar2, v2.g.h);
            t.I(sVar2, v2.g.d, c);
            int i3 = i2 << 3;
            b(null, cVar, kVar, z, sVar2, ((i2 >> 6) & 112) | (i3 & 896) | (i3 & 7168));
            kVar2 = kVar;
            String g = kVar2.g();
            if (g == null) {
                sVar2.c0(2068206905);
            } else {
                sVar2.c0(2068206906);
                l0.a(g, bVar, null, null, 3, new d2.t(ih.d.b(sVar2).t), sVar, ((i2 >> 12) & 112) | 24576, 12);
                sVar2 = sVar;
            }
            sVar2.q(false);
            if (kVar2.f()) {
                sVar2.c0(2068514271);
                float f2 = ih.a.l;
                com.github.rudroid.uitoolkit.text.k.b(androidx.compose.foundation.layout.b.B(oVar, 0.0f, f2, 0.0f, 0.0f, 13), m.b(2131231420, null, androidx.compose.foundation.layout.b.B(oVar, 0.0f, 0.0f, f2, 0.0f, 11), 10), null, ih.d.b(sVar2).v, null, null, r1.i.d(1663606902, new b1(26, kVar2), sVar2), sVar2, 1572864, 52);
                z2 = false;
            } else {
                z2 = false;
                sVar2.c0(2065087872);
            }
            sVar2.q(z2);
            c(androidx.compose.foundation.layout.b.B(oVar, 0.0f, ih.a.l, 0.0f, 0.0f, 13), kVar2.i(), kVar2.b(), a0.c(kVar2.c()), sVar2, 0);
            sVar2.q(true);
        } else {
            kVar2 = kVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new u1(rVar, kVar2, z, cVar, aVar, bVar, i);
        }
    }

    public static final void b(r rVar, j71.c cVar, k kVar, boolean z, s sVar, int i) {
        r rVar2;
        boolean z2;
        boolean z3;
        boolean z4;
        Object N;
        j71.c cVar2 = cVar;
        k kVar2 = kVar;
        sVar.e0(-703661545);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= sVar.h(cVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? sVar.f(kVar2) : sVar.h(kVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.g(z) ? 2048 : 1024;
        }
        if (sVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            l2 a = j2.a(l.a, w1.c.B, sVar, 48);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r rVar3 = o.a;
            r c = w1.a.c(sVar, rVar3);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            v2.e eVar = v2.g.f;
            t.I(sVar, eVar, a);
            v2.e eVar2 = v2.g.e;
            t.I(sVar, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.e eVar3 = v2.g.g;
            t.w(sVar, valueOf, eVar3);
            v2.d dVar = v2.g.h;
            t.E(sVar, dVar);
            v2.e eVar4 = v2.g.d;
            t.I(sVar, eVar4, c);
            if (!(((double) 1.0f) > 0.0d)) {
                l0.a.a("invalid weight; must be greater than zero");
            }
            w1 w1Var = new w1(1.0f, true);
            e0 a2 = c0.a(l.c, w1.c.D, sVar, 0);
            int hashCode2 = Long.hashCode(sVar.T);
            v1 l2 = sVar.l();
            r c2 = w1.a.c(sVar, w1Var);
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            t.I(sVar, eVar, a2);
            t.I(sVar, eVar2, l2);
            f1.e.t(hashCode2, sVar, eVar3, sVar, dVar);
            t.I(sVar, eVar4, c2);
            d(null, kVar.a(), sVar, 0);
            e(null, kVar.getName(), kVar.d(), sVar, 0);
            sVar.q(true);
            if (z) {
                sVar.c0(1805524281);
                Object N2 = sVar.N();
                Object obj = n.a;
                if (N2 == obj) {
                    N2 = new u0(1);
                    sVar.n0(N2);
                }
                r a3 = q.a(rVar3, (j71.c) N2);
                Object N3 = sVar.N();
                if (N3 == obj) {
                    N3 = h1.k(sVar);
                }
                j0.j jVar = (j0.j) N3;
                g8 b = f8.b(ih.a.M, 4, 0L, false);
                d3.k kVar3 = new d3.k(0);
                boolean z5 = (i2 & 112) == 32;
                if ((i2 & 896) != 256) {
                    kVar2 = kVar;
                    if ((i2 & 512) == 0 || !sVar.h(kVar2)) {
                        z3 = false;
                        z4 = z3 | z5;
                        N = sVar.N();
                        if (!z4 || N == obj) {
                            cVar2 = cVar;
                            N = new i(cVar2, kVar2, 1);
                            sVar.n0(N);
                        } else {
                            cVar2 = cVar;
                        }
                        z2 = false;
                        p5.a(z3.C(2131231338, 0, sVar), (String) null, f0.o.k(a3, jVar, b, false, (String) null, kVar3, (j71.a) N, 12), ih.d.b(sVar).A, sVar, 56, 0);
                    }
                } else {
                    kVar2 = kVar;
                }
                z3 = true;
                z4 = z3 | z5;
                N = sVar.N();
                if (z4) {
                }
                cVar2 = cVar;
                N = new i(cVar2, kVar2, 1);
                sVar.n0(N);
                z2 = false;
                p5.a(z3.C(2131231338, 0, sVar), (String) null, f0.o.k(a3, jVar, b, false, (String) null, kVar3, (j71.a) N, 12), ih.d.b(sVar).A, sVar, 56, 0);
            } else {
                cVar2 = cVar;
                kVar2 = kVar;
                z2 = false;
                sVar.c0(1800478535);
            }
            sVar.q(z2);
            sVar.q(true);
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new bd.k(rVar2, cVar2, kVar2, z, i, 8);
        }
    }

    public static final void c(r rVar, int i, String str, long j, s sVar, int i2) {
        s sVar2;
        boolean z;
        sVar.e0(687465268);
        int i3 = i2 | (sVar.f(rVar) ? 4 : 2) | (sVar.d(i) ? 32 : 16) | (sVar.f(str) ? 256 : 128) | (sVar.e(j) ? 2048 : 1024);
        if (sVar.S(i3 & 1, (i3 & 1171) != 1170)) {
            l2 a = j2.a(l.a, w1.c.A, sVar, 0);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r c = w1.a.c(sVar, rVar);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            t.I(sVar, v2.g.f, a);
            t.I(sVar, v2.g.e, l);
            t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            t.E(sVar, v2.g.h);
            t.I(sVar, v2.g.d, c);
            String b = c1.b(i);
            float f = ih.a.l;
            o oVar = o.a;
            com.github.rudroid.uitoolkit.text.k.c(null, m.b(2131231457, null, androidx.compose.foundation.layout.b.B(oVar, 0.0f, 0.0f, f, 0.0f, 11), 10), null, new d2.t(ih.d.a(sVar).a0), null, null, b, i4.n0(2131820612, i, new Object[]{b}, sVar), 0L, 0, 0, null, false, sVar, 0, 0, 16181);
            sVar2 = sVar;
            if (str == null) {
                sVar2.c0(-514554023);
                sVar2.q(false);
                z = true;
            } else {
                sVar2.c0(-514554022);
                z = true;
                com.github.rudroid.uitoolkit.text.k.c(androidx.compose.foundation.layout.b.B(oVar, f, 0.0f, 0.0f, 0.0f, 14), m.b(2131231238, null, androidx.compose.foundation.layout.b.B(oVar, 0.0f, 0.0f, f, 0.0f, 11), 10), null, new d2.t(j), null, null, str, null, 0L, 0, 0, null, false, sVar, i3 & 7168, 0, 16308);
                sVar2 = sVar;
                sVar2.q(false);
            }
            sVar2.q(z);
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new t1(rVar, i, str, j, i2);
        }
    }

    public static final void d(r rVar, com.github.service.models.response.a aVar, s sVar, int i) {
        r rVar2;
        s sVar2 = sVar;
        sVar2.e0(1519980502);
        int i2 = i | 6 | (sVar2.h(aVar) ? 32 : 16);
        if (sVar2.S(i2 & 1, (i2 & 19) != 18)) {
            l2 a = j2.a(l.a, w1.c.B, sVar2, 48);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            r rVar3 = o.a;
            r c = w1.a.c(sVar2, rVar3);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            t.I(sVar2, v2.g.f, a);
            t.I(sVar2, v2.g.e, l);
            t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            t.E(sVar2, v2.g.h);
            t.I(sVar2, v2.g.d, c);
            Avatar avatar = aVar.y;
            String str = avatar.r;
            boolean z = false;
            com.github.rudroid.uitoolkit.a aVar2 = com.github.rudroid.uitoolkit.a.s;
            if (avatar.s == Avatar.Type.Organization) {
                z = true;
            }
            f3.a(null, str, z, aVar2, true, i4.q0(2131953649, new Object[]{aVar.x}, sVar2), null, null, sVar2, 27648, 193);
            r B = androidx.compose.foundation.layout.b.B(rVar3, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                l0.a.a("invalid weight; must be greater than zero");
            }
            ub.b(aVar.x, B.f(new w1(1.0f, true)), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).v, sVar, 0, 0, 131068);
            sVar2 = sVar;
            sVar2.q(true);
            rVar2 = rVar3;
        } else {
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.settings.copilot.debug.q(rVar2, aVar, i, 5);
        }
    }

    public static final void e(r rVar, String str, boolean z, s sVar, int i) {
        r rVar2;
        s sVar2 = sVar;
        sVar2.e0(-367525169);
        int i2 = i | 6 | (sVar2.f(str) ? 32 : 16) | (sVar2.g(z) ? 256 : 128);
        if (sVar2.S(i2 & 1, (i2 & 147) != 146)) {
            l2 a = j2.a(l.a, w1.c.B, sVar2, 48);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            r rVar3 = o.a;
            r c = w1.a.c(sVar2, rVar3);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            t.I(sVar2, v2.g.f, a);
            t.I(sVar2, v2.g.e, l);
            t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            t.E(sVar2, v2.g.h);
            t.I(sVar2, v2.g.d, c);
            if (z) {
                sVar2.c0(135203201);
                rVar2 = rVar3;
                p5.a(z3.C(2131231352, 0, sVar2), i4.p0(2131954082, sVar2), androidx.compose.foundation.layout.b.B(rVar3, 0.0f, 0.0f, ih.a.l, 0.0f, 11), ih.d.b(sVar2).z, sVar2, 8, 0);
            } else {
                rVar2 = rVar3;
                sVar2.c0(128297207);
            }
            sVar2.q(false);
            if (1.0f <= 0.0d) {
                l0.a.a("invalid weight; must be greater than zero");
            }
            ub.b(str, new w1(1.0f, true), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).b, sVar, (i2 >> 3) & 14, 0, 131068);
            sVar2 = sVar;
            sVar2.q(true);
        } else {
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new p(rVar2, str, z, i, 8);
        }
    }

}
