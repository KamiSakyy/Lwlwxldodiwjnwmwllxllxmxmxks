package com.github.rudroid.uitoolkit.markdown.components;

import a0.d2;
import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import com.github.rudroid.agents.sessionevents.ui.t1;
import com.github.rudroid.m0;
import com.github.rudroid.starredreposandlists.u0;
import com.github.rudroid.uitoolkit.w0;
import com.google.android.gms.internal.measurement.i4;
import d2.p0;
import f1.e8;
import f1.o5;
import f1.ub;
import g3.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public static final void a(w1.r rVar, List list, boolean z, j71.a aVar, androidx.compose.runtime.s sVar, int i) {
        w1.r rVar2;
        int i2;
        int i3;
        boolean z2;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(-1921566050);
        int i4 = i | 6 | (sVar2.h(list) ? 32 : 16) | (sVar2.g(z) ? 256 : 128) | (sVar2.h(aVar) ? 2048 : 1024);
        if (sVar2.S(i4 & 1, (i4 & 1171) != 1170)) {
            if (z) {
                i2 = -2049825592;
                i3 = 2131953683;
            } else {
                i2 = -2049728438;
                i3 = 2131953684;
            }
            String d = m0.d(sVar2, i2, i3, sVar2, false);
            int i5 = i4 & 7168;
            boolean z3 = i5 == 2048;
            Object N = sVar2.N();
            Object obj = androidx.compose.runtime.n.a;
            if (z3 || N == obj) {
                N = new com.github.rudroid.actions.checkdetail.ui.m(29, aVar);
                sVar2.n0(N);
            }
            w1.r rVar3 = w1.o.a;
            w1.r m = f0.o.m(rVar3, false, d, (d3.k) null, (j71.a) N, 13);
            androidx.compose.foundation.layout.g gVar = androidx.compose.foundation.layout.l.c;
            w1.h hVar = w1.c.D;
            e0 a = c0.a(gVar, hVar, sVar2, 0);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, m);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            v2.e eVar = v2.g.f;
            androidx.compose.runtime.t.I(sVar2, eVar, a);
            v2.e eVar2 = v2.g.e;
            androidx.compose.runtime.t.I(sVar2, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.e eVar3 = v2.g.g;
            androidx.compose.runtime.t.w(sVar2, valueOf, eVar3);
            v2.d dVar = v2.g.h;
            androidx.compose.runtime.t.E(sVar2, dVar);
            v2.e eVar4 = v2.g.d;
            androidx.compose.runtime.t.I(sVar2, eVar4, c);
            float f = ih.a.n;
            float f2 = ih.a.l;
            ub.b(i4.p0(2131952023, sVar2), androidx.compose.foundation.layout.b.A(rVar3, f, f2, f, ih.a.k), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).u, sVar, 0, 0, 131068);
            w1.r rVar4 = rVar3;
            com.github.rudroid.uitoolkit.text.k.b(androidx.compose.foundation.layout.b.B(rVar3, f, 0.0f, f, f2, 2), com.github.rudroid.uitoolkit.text.m.b(2131231441, null, null, 14), androidx.compose.foundation.layout.b.f(f2, 0.0f, 0.0f, 0.0f, 14), ih.d.b(sVar).s0, null, null, r1.i.d(1794044119, new t1(list, z, 3), sVar), sVar, 1573254, 48);
            androidx.compose.runtime.s sVar3 = sVar;
            if (z) {
                sVar3.c0(1215412960);
                w1.r r = f0.o.r(rVar4, true, 2);
                boolean z4 = i5 == 2048;
                Object N2 = sVar3.N();
                if (z4 || N2 == obj) {
                    N2 = new c(0, aVar);
                    sVar3.n0(N2);
                }
                w1.r m2 = f0.o.m(r, false, d, (d3.k) null, (j71.a) N2, 13);
                e0 a2 = c0.a(gVar, hVar, sVar3, 0);
                int hashCode2 = Long.hashCode(sVar3.T);
                v1 l2 = sVar3.l();
                w1.r c2 = w1.a.c(sVar3, m2);
                sVar3.g0();
                if (sVar3.S) {
                    sVar3.k(fVar);
                } else {
                    sVar3.q0();
                }
                androidx.compose.runtime.t.I(sVar3, eVar, a2);
                androidx.compose.runtime.t.I(sVar3, eVar2, l2);
                f1.e.t(hashCode2, sVar3, eVar3, sVar3, dVar);
                androidx.compose.runtime.t.I(sVar3, eVar4, c2);
                sVar3.c0(1369277449);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bh.a aVar2 = (bh.a) it.next();
                    float f3 = ih.a.n;
                    w1.r rVar5 = rVar4;
                    ub.b(aVar2.c, androidx.compose.foundation.layout.b.B(rVar5, f3, ih.a.l, f3, 0.0f, 8), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar).y, ih.d.b(sVar).s, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, 0, 0, 131068);
                    rVar4 = rVar5;
                    ub.b(aVar2.d, androidx.compose.foundation.layout.b.B(rVar5, f3, 0.0f, f3, 0.0f, 10), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).x, sVar, 48, 0, 131068);
                    sVar3 = sVar;
                }
                sVar2 = sVar3;
                z2 = false;
                sVar2.q(false);
                androidx.compose.foundation.layout.b.g(sVar2, p2.f(rVar4, ih.a.n));
                sVar2.q(true);
            } else {
                sVar2 = sVar3;
                z2 = false;
                sVar2.c0(1204551738);
            }
            sVar2.q(z2);
            sVar2.q(true);
            rVar2 = rVar4;
        } else {
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new bd.p(rVar2, list, z, aVar, i);
        }
    }

    public static final void b(w1.r rVar, String str, k91.a aVar, j71.c cVar, List list, androidx.compose.runtime.s sVar, int i) {
        CharSequence charSequence;
        int i2;
        int i3;
        List r;
        v2.d dVar;
        j71.e eVar;
        v2.e eVar2;
        j71.e eVar3;
        j71.e eVar4;
        boolean z;
        boolean z2;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(str, "content");
        k71.k.g(aVar, "node");
        int i4 = aVar.c;
        int i5 = aVar.b;
        k71.k.g(cVar, "onCopyCode");
        k71.k.g(list, "vulnerabilities");
        sVar2.e0(-1477172827);
        int i6 = (i & 6) == 0 ? (sVar2.f(rVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= sVar2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= sVar2.h(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= sVar2.h(cVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= sVar2.h(list) ? 16384 : 8192;
        }
        int i7 = i6;
        if (sVar2.S(i7 & 1, (i7 & 9363) != 9362)) {
            long j = ih.d.b(sVar2).c;
            sVar2.c0(2071097743);
            g3.d dVar2 = new g3.d();
            g.b(ih.d.d(sVar2), dVar2, str, x61.s.r, aVar);
            g3.g k = dVar2.k();
            String str2 = k.s;
            sVar2.q(false);
            k91.a n = k21.f.n(aVar, j91.a.h0);
            if (n == null || (charSequence = k21.f.t(n, str)) == null) {
                charSequence = "";
            }
            boolean f = sVar2.f(list) | sVar2.d(i5) | sVar2.d(i4);
            Object N = sVar2.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            Object obj = N;
            if (f || N == iVar) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    bh.a aVar2 = (bh.a) obj2;
                    if (aVar2.a == i5 && aVar2.b == i4) {
                        arrayList.add(obj2);
                    }
                }
                sVar2.n0(arrayList);
                obj = arrayList;
            }
            List list2 = (List) obj;
            Object[] objArr = new Object[0];
            Object N2 = sVar2.N();
            if (N2 == iVar) {
                N2 = new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(11);
                sVar2.n0(N2);
            }
            f1 f1Var = (f1) u1.j.c(objArr, (j71.a) N2, sVar2, 48);
            boolean f2 = sVar2.f(f1Var);
            Object N3 = sVar2.N();
            if (f2 || N3 == iVar) {
                N3 = new com.github.rudroid.fragments.onboarding.notifications.ui.p(f1Var, 16);
                sVar2.n0(N3);
            }
            j71.a aVar3 = (j71.a) N3;
            boolean isEmpty = list2.isEmpty();
            boolean booleanValue = ((Boolean) f1Var.getValue()).booleanValue();
            int i8 = i7 >> 9;
            sVar2.c0(242764352);
            String p0 = i4.p0(2131953725, sVar2);
            boolean f3 = ((((i8 & 14) ^ 6) > 4 && sVar2.f(cVar)) || (i8 & 6) == 4) | sVar2.f(str2);
            Object N4 = sVar2.N();
            if (f3 || N4 == iVar) {
                N4 = new bd.c(11, cVar, str2);
                sVar2.n0(N4);
            }
            d3.f fVar = new d3.f(p0, (j71.a) N4);
            if (isEmpty) {
                r = d0.n(fVar);
                sVar2.q(false);
            } else {
                if (booleanValue) {
                    i2 = -531485242;
                    i3 = 2131953683;
                } else {
                    i2 = -531388088;
                    i3 = 2131953684;
                }
                String d = m0.d(sVar2, i2, i3, sVar2, false);
                boolean f4 = sVar2.f(aVar3);
                Object N5 = sVar2.N();
                if (f4 || N5 == iVar) {
                    N5 = new com.github.rudroid.actions.checkdetail.ui.m(28, aVar3);
                    sVar2.n0(N5);
                }
                r = x61.l.r(new d3.f[]{fVar, new d3.f(d, (j71.a) N5)});
                sVar2.q(false);
            }
            String q0 = i4.q0(2131953843, new Object[]{charSequence}, sVar2);
            String n0 = i4.n0(2131820560, list2.size(), new Object[]{Integer.valueOf(list2.size())}, sVar2);
            boolean f5 = sVar2.f(charSequence) | sVar2.f(str2);
            Object N6 = sVar2.N();
            if (f5 || N6 == iVar) {
                if (!t71.p.T(charSequence) || !list2.isEmpty()) {
                    if (t71.p.T(charSequence) && !list2.isEmpty()) {
                        str2 = f1.e.h(str2, ".\n", n0);
                    } else if (t71.p.T(charSequence) || !list2.isEmpty()) {
                        str2 = q0 + ".\n" + str2 + ".\n" + n0;
                    } else {
                        str2 = f1.e.h(q0, ".\n", str2);
                    }
                }
                sVar2.n0(str2);
                N6 = str2;
            }
            String str3 = (String) N6;
            boolean h = sVar2.h(r) | sVar2.f(str3);
            Object N7 = sVar2.N();
            if (h || N7 == iVar) {
                N7 = new com.github.rudroid.repositories.repositoryownerrepositories.d(12, r, str3);
                sVar2.n0(N7);
            }
            w1.r f6 = f0.o.f(a2.i.b(d3.q.b(rVar, true, (j71.c) N7), ih.d.e(sVar2).d), j, d2.a0.b);
            f0.v a = f0.o.a(0.0f, ih.d.a(sVar2).F0);
            w1.r h2 = f0.o.h(f6, a.a, a.b, ih.d.e(sVar2).d);
            w1.j jVar = w1.c.r;
            v0 d2 = androidx.compose.foundation.layout.t.d(jVar, false);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, h2);
            v2.h.o.getClass();
            v2.f fVar2 = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar2);
            } else {
                sVar2.q0();
            }
            j71.e eVar5 = v2.g.f;
            androidx.compose.runtime.t.I(sVar2, eVar5, d2);
            j71.e eVar6 = v2.g.e;
            androidx.compose.runtime.t.I(sVar2, eVar6, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.e eVar7 = v2.g.g;
            androidx.compose.runtime.t.w(sVar2, valueOf, eVar7);
            v2.d dVar3 = v2.g.h;
            androidx.compose.runtime.t.E(sVar2, dVar3);
            j71.e eVar8 = v2.g.d;
            androidx.compose.runtime.t.I(sVar2, eVar8, c);
            w1.o oVar = w1.o.a;
            w1.r a2 = z.a0.a(oVar, (j71.e) null, 3);
            CharSequence charSequence2 = charSequence;
            e0 a3 = c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
            int hashCode2 = Long.hashCode(sVar2.T);
            v1 l2 = sVar2.l();
            w1.r c2 = w1.a.c(sVar2, a2);
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar2);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, eVar5, a3);
            androidx.compose.runtime.t.I(sVar2, eVar6, l2);
            f1.e.t(hashCode2, sVar2, eVar7, sVar2, dVar3);
            androidx.compose.runtime.t.I(sVar2, eVar8, c2);
            w1.r e = p2.e(oVar, 1.0f);
            float f7 = ih.a.n;
            float f8 = ih.a.l;
            w1.r A = androidx.compose.foundation.layout.b.A(e, f7, f7, f7, f8);
            l2 a4 = j2.a(androidx.compose.foundation.layout.l.a, w1.c.A, sVar2, 0);
            int hashCode3 = Long.hashCode(sVar2.T);
            v1 l3 = sVar2.l();
            w1.r c3 = w1.a.c(sVar2, A);
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar2);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, eVar5, a4);
            androidx.compose.runtime.t.I(sVar2, eVar6, l3);
            f1.e.t(hashCode3, sVar2, eVar7, sVar2, dVar3);
            androidx.compose.runtime.t.I(sVar2, eVar8, c3);
            if (t71.p.T(charSequence2)) {
                dVar = dVar3;
                eVar = eVar6;
                eVar2 = eVar7;
                eVar3 = eVar5;
                eVar4 = eVar8;
                z = false;
                sVar2.c0(1271998525);
            } else {
                sVar2.c0(1278199982);
                w1.r z3 = androidx.compose.foundation.layout.b.z(oVar, f8, 0.0f, 2);
                Object N8 = sVar2.N();
                if (N8 == iVar) {
                    N8 = new u0(13);
                    sVar2.n0(N8);
                }
                eVar3 = eVar5;
                eVar = eVar6;
                eVar4 = eVar8;
                dVar = dVar3;
                eVar2 = eVar7;
                w0.a(d3.q.a(z3, (j71.c) N8), null, new com.github.rudroid.uitoolkit.p2(charSequence2.toString(), null, null, null, null, new d2.t(ih.d.a(sVar2).j0), new d2.t(ih.d.a(sVar2).l0), ih.d.f(sVar2).r, 30), sVar2, 0, 2);
                z = false;
            }
            sVar2.q(z);
            if (1.0f <= 0.0d) {
                l0.a.a("invalid weight; must be greater than zero");
            }
            androidx.compose.foundation.layout.b.g(sVar2, new w1(1.0f, true));
            w1.r o = p2.o(androidx.compose.foundation.layout.b.B(oVar, 0.0f, 0.0f, 0.0f, ih.a.k, 7), 24);
            boolean f9 = ((i7 & 7168) == 2048) | sVar2.f(k);
            Object N9 = sVar2.N();
            if (f9 || N9 == iVar) {
                N9 = new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(25, cVar, k);
                sVar2.n0(N9);
            }
            j71.e eVar9 = eVar4;
            v2.e eVar10 = eVar2;
            e8.h((j71.a) N9, o, false, (o5) null, (p0) null, a.a, sVar, 1572912, 60);
            sVar2 = sVar;
            sVar2.q(true);
            w1.r B = androidx.compose.foundation.layout.b.B(f0.o.w(p2.e(oVar, 1.0f), f0.o.v(sVar2), false), f7, 0.0f, f7, f7, 2);
            v0 d3 = androidx.compose.foundation.layout.t.d(jVar, false);
            int hashCode4 = Long.hashCode(sVar2.T);
            v1 l4 = sVar2.l();
            w1.r c4 = w1.a.c(sVar2, B);
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar2);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, eVar3, d3);
            androidx.compose.runtime.t.I(sVar2, eVar, l4);
            f1.e.t(hashCode4, sVar2, eVar10, sVar2, dVar);
            androidx.compose.runtime.t.I(sVar2, eVar9, c4);
            a0.b(null, k, ih.d.c(sVar2).j, sVar2, 0, 1);
            sVar2.q(true);
            if (list2.isEmpty()) {
                z2 = false;
                sVar2.c0(-382023015);
            } else {
                sVar2.c0(-373783928);
                e8.g((w1.r) null, 0.0f, 0L, sVar, 0, 7);
                a(null, list2, ((Boolean) f1Var.getValue()).booleanValue(), aVar3, sVar, 0);
                sVar2 = sVar;
                z2 = false;
            }
            sVar2.q(z2);
            sVar2.q(true);
            sVar2.q(true);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new d2(rVar, str, aVar, cVar, list, i, 8);
        }
    }
}
