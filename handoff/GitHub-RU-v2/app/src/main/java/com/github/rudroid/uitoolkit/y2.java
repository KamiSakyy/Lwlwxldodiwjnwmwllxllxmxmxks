package com.github.rudroid.uitoolkit;

import androidx.compose.runtime.i3;
import androidx.lifecycle.d1;
import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.rudroid.widget.shortcuts.ShortcutWidgetSettingsActivity;
import com.github.rudroid.widget.shortcuts.ShortcutWidgetWorker;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.issueorpullrequest.IssueTypeColor;
import com.github.service.models.response.type.PullRequestMergeMethod;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class y2 implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ y2(Object obj, com.github.rudroid.feed.ui.g0 g0Var, w1.r rVar, i3 i3Var, int i, int i2) {
        this.r = i2;
        this.t = obj;
        this.u = g0Var;
        this.s = rVar;
        this.v = i3Var;
    }

    public final Object s(Object obj, Object obj2) {
        w61.a0 a0Var;
        boolean z;
        float f;
        w1.r rVar;
        boolean z2;
        w1.r rVar2;
        boolean z3;
        int i = this.r;
        w1.o oVar = w1.o.a;
        Object obj3 = androidx.compose.runtime.n.a;
        w61.a0 a0Var2 = w61.a0.a;
        Object obj4 = this.v;
        Object obj5 = this.s;
        Object obj6 = this.u;
        Object obj7 = this.t;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                b3.c((w1.r) obj5, (j71.e) obj7, (j71.f) obj6, (v0) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                break;
            case 1:
                r1.d dVar = (r1.d) obj5;
                r1.d dVar2 = (r1.d) obj7;
                r1.d dVar3 = (r1.d) obj6;
                r1.d dVar4 = (r1.d) obj4;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    sVar.V();
                    break;
                } else {
                    w1.r e = androidx.compose.foundation.layout.p2.e(oVar, 1.0f);
                    float f2 = ih.a.l;
                    w1.r B = androidx.compose.foundation.layout.b.B(e, 0.0f, f2, 0.0f, f2, 5);
                    sVar.c0(-1003410150);
                    sVar.c0(212064437);
                    sVar.q(false);
                    s3.c cVar = (s3.c) sVar.j(w2.g1.h);
                    Object N = sVar.N();
                    if (N == obj3) {
                        N = new y3.o(cVar);
                        sVar.n0(N);
                    }
                    y3.o oVar2 = (y3.o) N;
                    Object N2 = sVar.N();
                    if (N2 == obj3) {
                        N2 = new y3.k();
                        sVar.n0(N2);
                    }
                    y3.k kVar = (y3.k) N2;
                    Object N3 = sVar.N();
                    if (N3 == obj3) {
                        N3 = androidx.compose.runtime.t.B(Boolean.FALSE);
                        sVar.n0(N3);
                    }
                    androidx.compose.runtime.f1 f1Var = (androidx.compose.runtime.f1) N3;
                    Object N4 = sVar.N();
                    if (N4 == obj3) {
                        N4 = new y3.m(kVar);
                        sVar.n0(N4);
                    }
                    y3.m mVar = (y3.m) N4;
                    Object N5 = sVar.N();
                    if (N5 == obj3) {
                        a0Var = a0Var2;
                        androidx.compose.runtime.p1 p1Var = new androidx.compose.runtime.p1(a0Var, androidx.compose.runtime.i.u);
                        sVar.n0(p1Var);
                        N5 = p1Var;
                    } else {
                        a0Var = a0Var2;
                    }
                    androidx.compose.runtime.f1 f1Var2 = (androidx.compose.runtime.f1) N5;
                    boolean h = sVar.h(oVar2) | sVar.d(257);
                    Object N6 = sVar.N();
                    if (h || N6 == obj3) {
                        N6 = new com.github.rudroid.uitoolkit.banner.h(f1Var2, oVar2, mVar, f1Var);
                        sVar.n0(N6);
                    }
                    androidx.compose.ui.layout.v0 v0Var = (androidx.compose.ui.layout.v0) N6;
                    Object N7 = sVar.N();
                    if (N7 == obj3) {
                        N7 = new com.github.rudroid.uitoolkit.banner.i(f1Var, mVar);
                        sVar.n0(N7);
                    }
                    j71.a aVar = (j71.a) N7;
                    boolean h2 = sVar.h(oVar2);
                    Object N8 = sVar.N();
                    if (h2 || N8 == obj3) {
                        N8 = new com.github.rudroid.uitoolkit.banner.j(oVar2);
                        sVar.n0(N8);
                    }
                    androidx.compose.ui.layout.z.a(d3.q.b(B, false, (j71.c) N8), r1.i.d(1200550679, new com.github.rudroid.uitoolkit.banner.k(f1Var2, kVar, aVar, dVar, dVar2, dVar3, dVar4), sVar), v0Var, sVar, 48);
                    sVar.q(false);
                    break;
                }
            case 2:
                f0.z1 z1Var = (f0.z1) obj5;
                final com.github.rudroid.activities.m0 m0Var = (ShortcutWidgetSettingsActivity) obj7;
                oa.j jVar = (oa.j) obj6;
                StoredShortcutModel storedShortcutModel = (StoredShortcutModel) obj4;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                ShortcutWidgetSettingsActivity.a aVar2 = ShortcutWidgetSettingsActivity.Companion;
                if (!sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar2.V();
                    break;
                } else {
                    long j = ih.d.b(sVar2).d;
                    String p0 = i4.p0(2131954616, sVar2);
                    String p02 = i4.p0(2131954621, sVar2);
                    float a = com.github.rudroid.uitoolkit.utils.b0.a(z1Var, sVar2, 0);
                    boolean h3 = sVar2.h(m0Var);
                    Object N9 = sVar2.N();
                    if (h3 || N9 == obj3) {
                        final int i2 = 1;
                        N9 = new j71.a() { // from class: com.github.rudroid.widget.shortcuts.e0
                            public final Object a() {
                                int i3 = i2;
                                w61.a0 a0Var3 = w61.a0.a;
                                androidx.lifecycle.c0 c0Var = m0Var;
                                switch (i3) {
                                    case 0:
                                        androidx.lifecycle.c0 c0Var2 = (ShortcutWidgetSettingsActivity) c0Var;
                                        ShortcutWidgetSettingsActivity.a aVar3 = ShortcutWidgetSettingsActivity.Companion;
                                        v71.b0.z(d1.i(c0Var2), (a71.h) null, (v71.a0Shadow) null, new k0(c0Var2, null), 3).o0(new c0(1, c0Var2));
                                        ShortcutWidgetWorker.Companion.getClass();
                                        ShortcutWidgetWorker.a.a(c0Var2);
                                        break;
                                    case 1:
                                        ShortcutWidgetSettingsActivity.a aVar4 = ShortcutWidgetSettingsActivity.Companion;
                                        ((ShortcutWidgetSettingsActivity) c0Var).finish();
                                        break;
                                    default:
                                        ShortcutWidgetWorker.Companion.getClass();
                                        ShortcutWidgetWorker.a.a(c0Var);
                                        break;
                                }
                                return a0Var3;
                            }
                        };
                        sVar2.n0(N9);
                    }
                    qg.pShadow.c(null, p02, p0, j, (j71.a) N9, 0, a, 0.0f, 0, 0, r1.i.d(1937530825, new com.github.rudroid.actions.workflowruns.f(jVar, storedShortcutModel, m0Var, 29), sVar2), sVar2, 0, 6, 929);
                    break;
                }
            case 3:
                ArrayList arrayList = (ArrayList) obj5;
                j71.c cVar2 = (j71.c) obj7;
                androidx.compose.runtime.f1 f1Var3 = (androidx.compose.runtime.f1) obj6;
                String str = (String) obj4;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    sVar3.V();
                    break;
                } else {
                    boolean booleanValue = ((Boolean) f1Var3.getValue()).booleanValue();
                    boolean f3 = sVar3.f(cVar2);
                    Object N10 = sVar3.N();
                    if (f3 || N10 == obj3) {
                        N10 = new com.github.rudroid.copilot.ui.f(cVar2, f1Var3, 10);
                        sVar3.n0(N10);
                    }
                    j71.c cVar3 = (j71.c) N10;
                    Object N11 = sVar3.N();
                    if (N11 == obj3) {
                        N11 = new com.github.rudroid.fragments.onboarding.notifications.ui.p(f1Var3, 29);
                        sVar3.n0(N11);
                    }
                    com.github.rudroid.uitoolkit.menu.l.a(null, booleanValue, arrayList, null, cVar3, (j71.a) N11, 0L, 0L, false, r1.i.d(-1487244097, new com.github.rudroid.settings.copilot.debug.q((Object) f1Var3, (Object) str, false, 24), sVar3), sVar3, 805502976, 457);
                    break;
                }
            case 4:
                androidx.compose.foundation.layout.d2 d2Var = (androidx.compose.foundation.layout.d2) obj5;
                String str2 = (String) obj7;
                g3.q0 q0Var = (g3.q0) obj6;
                r1.d dVar5 = (r1.d) obj4;
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (!sVar4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    sVar4.V();
                    break;
                } else {
                    androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.l.a;
                    androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.g(ih.a.l), w1.c.D, sVar4, 6);
                    int hashCode = Long.hashCode(sVar4.T);
                    androidx.compose.runtime.v1 l = sVar4.l();
                    w1.r c = w1.a.c(sVar4, oVar);
                    v2.h.o.getClass();
                    v2.f fVar2 = v2.g.b;
                    sVar4.g0();
                    if (sVar4.S) {
                        sVar4.k(fVar2);
                    } else {
                        sVar4.q0();
                    }
                    androidx.compose.runtime.t.I(sVar4, v2.g.f, a2);
                    androidx.compose.runtime.t.I(sVar4, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar4, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar4, v2.g.h);
                    androidx.compose.runtime.t.I(sVar4, v2.g.d, c);
                    w1.r e2 = androidx.compose.foundation.layout.p2.e(androidx.compose.foundation.layout.b.w(oVar, d2Var), 1.0f);
                    Object N12 = sVar4.N();
                    if (N12 == obj3) {
                        N12 = new ef.b(8);
                        sVar4.n0(N12);
                    }
                    ub.b(str2, d3.q.b(e2, false, (j71.c) N12), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0Var, sVar4, 0, 0, 131068);
                    dVar5.f(androidx.compose.foundation.layout.f0.a, sVar4, 6);
                    sVar4.q(true);
                    break;
                }
            case 5:
                String str3 = (String) obj5;
                he.i iVar = (he.i) obj7;
                he.l lVar = iVar.g;
                j71.a aVar3 = (j71.a) obj6;
                j71.a aVar4 = (j71.a) obj4;
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (!sVar5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                    sVar5.V();
                    break;
                } else {
                    float f4 = ih.a.l;
                    float f5 = ih.a.n;
                    w1.r rVar3 = w1.o.a;
                    w1.r w = f0.o.w(androidx.compose.foundation.layout.p2.e(androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.b.B(rVar3, 0.0f, f4, 0.0f, f5, 5), androidx.compose.foundation.layout.r1.r), 1.0f), f0.o.v(sVar5), false);
                    androidx.compose.foundation.layout.l2 a3 = androidx.compose.foundation.layout.j2.a(androidx.compose.foundation.layout.l.a, w1.c.A, sVar5, 0);
                    int hashCode2 = Long.hashCode(sVar5.T);
                    androidx.compose.runtime.v1 l2 = sVar5.l();
                    w1.r c2 = w1.a.c(sVar5, w);
                    v2.h.o.getClass();
                    v2.f fVar3 = v2.g.b;
                    sVar5.g0();
                    if (sVar5.S) {
                        sVar5.k(fVar3);
                    } else {
                        sVar5.q0();
                    }
                    androidx.compose.runtime.t.I(sVar5, v2.g.f, a3);
                    androidx.compose.runtime.t.I(sVar5, v2.g.e, l2);
                    androidx.compose.runtime.t.w(sVar5, Integer.valueOf(hashCode2), v2.g.g);
                    androidx.compose.runtime.t.E(sVar5, v2.g.h);
                    androidx.compose.runtime.t.I(sVar5, v2.g.d, c2);
                    androidx.compose.foundation.layout.b.g(sVar5, androidx.compose.foundation.layout.b.B(rVar3, f5, 0.0f, 0.0f, 0.0f, 14));
                    int i3 = iVar.n;
                    zg.b0.a(null, str3, lVar.b, i4.p0(lVar.c, sVar5), lVar.d, lVar.e, lVar.f, sVar5, 0, 1);
                    IssueType issueType = iVar.h;
                    if (issueType == null) {
                        sVar5.c0(-960107161);
                    } else {
                        IssueTypeColor issueTypeColor = issueType.v;
                        sVar5.c0(-960107160);
                        androidx.compose.foundation.layout.b.g(sVar5, androidx.compose.foundation.layout.b.B(rVar3, f4, 0.0f, 0.0f, 0.0f, 14));
                        com.github.rudroid.fragments.ui.i0.a((w1.r) null, androidx.compose.foundation.layout.b.y(rVar3, f4, ih.a.j), issueType, g3.q0.a(ih.d.f(sVar5).d, com.github.rudroid.fragments.ui.g0.b(issueTypeColor, sVar5), y41.t1.C(14), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777212), com.github.rudroid.fragments.ui.g0.a(issueTypeColor, sVar5), sVar5, 0, 1);
                    }
                    boolean z4 = false;
                    sVar5.q(false);
                    h01.p pVar = iVar.i;
                    if (pVar == null) {
                        sVar5.c0(-959310740);
                    } else {
                        sVar5.c0(-959310739);
                        androidx.compose.foundation.layout.b.g(sVar5, androidx.compose.foundation.layout.b.B(rVar3, f4, 0.0f, 0.0f, 0.0f, 14));
                        zg.h0.a(null, pVar.b, pVar.a, zg.e0.s, sVar5, 3072);
                        z4 = false;
                    }
                    sVar5.q(z4);
                    if (iVar.k) {
                        sVar5.c0(-958903740);
                        androidx.compose.foundation.layout.b.g(sVar5, androidx.compose.foundation.layout.b.B(rVar3, f4, 0.0f, 0.0f, 0.0f, 14));
                        float f6 = ih.a.k;
                        k0.b(null, 0L, 1, f6, f6, sVar5, 384, 3);
                        z = false;
                    } else {
                        z = false;
                        sVar5.c0(-965936245);
                    }
                    sVar5.q(z);
                    h01.j jVar2 = iVar.j;
                    if (jVar2 == null) {
                        sVar5.c0(-958492464);
                        sVar5.q(z);
                        f = f4;
                        rVar = rVar3;
                    } else {
                        sVar5.c0(-958492463);
                        f = f4;
                        rVar = rVar3;
                        w1.r B2 = androidx.compose.foundation.layout.b.B(rVar, f, 0.0f, 0.0f, 0.0f, 14);
                        String p03 = i4.p0(2131953975, sVar5);
                        d3.k kVar2 = new d3.k(0);
                        boolean f7 = sVar5.f(aVar4);
                        Object N13 = sVar5.N();
                        if (f7 || N13 == obj3) {
                            N13 = new com.github.rudroid.uitoolkit.markdown.components.c(15, aVar4);
                            sVar5.n0(N13);
                        }
                        he.o.a(f0.o.m(B2, false, p03, kVar2, (j71.a) N13, 9), jVar2, sVar5, 0, 0);
                        sVar5.q(false);
                    }
                    if (iVar.l) {
                        sVar5.c0(-957744929);
                        androidx.compose.foundation.layout.b.g(sVar5, androidx.compose.foundation.layout.b.B(rVar, f, 0.0f, 0.0f, 0.0f, 14));
                        z2 = false;
                        zg.a0.a(0, 1, sVar5, null);
                    } else {
                        z2 = false;
                        sVar5.c0(-965936245);
                    }
                    sVar5.q(z2);
                    if (iVar.m > 0 || i3 > 0) {
                        sVar5.c0(-957421568);
                        rVar2 = rVar;
                        androidx.compose.foundation.layout.b.g(sVar5, androidx.compose.foundation.layout.b.B(rVar, f, 0.0f, 0.0f, 0.0f, 14));
                        int i4 = iVar.m;
                        zg.d0.b(null, i4, i3 + i4, 0L, 0L, null, null, sVar5, 0, 121);
                        sVar5.q(false);
                    } else {
                        sVar5.c0(-965936245);
                        sVar5.q(z2);
                        rVar2 = rVar;
                    }
                    if (iVar.o) {
                        sVar5.c0(-956965124);
                        String p04 = i4.p0(2131953664, sVar5);
                        androidx.compose.foundation.layout.b.g(sVar5, androidx.compose.foundation.layout.b.B(rVar2, f5, 0.0f, 0.0f, 0.0f, 14));
                        boolean z5 = iVar.p;
                        boolean f8 = sVar5.f(p04) | sVar5.f(aVar3);
                        Object N14 = sVar5.N();
                        if (f8 || N14 == obj3) {
                            N14 = new com.github.rudroid.agents.sessionevents.ui.m0(p04, aVar3, 6);
                            sVar5.n0(N14);
                        }
                        w1.r a4 = com.github.rudroid.uitoolkit.extensions.d.a(rVar2, z5, (j71.c) N14);
                        String str4 = iVar.r;
                        String str5 = str4 == null ? "" : str4;
                        String str6 = iVar.q;
                        zg.g0.a(a4, str5, str6 == null ? "" : str6, 0.0f, sVar5, 0, 8);
                        z3 = false;
                    } else {
                        z3 = false;
                        sVar5.c0(-965936245);
                    }
                    sVar5.q(z3);
                    androidx.compose.foundation.layout.b.g(sVar5, androidx.compose.foundation.layout.b.B(rVar2, 0.0f, 0.0f, f5, 0.0f, 11));
                    sVar5.q(true);
                    break;
                }
            case 6:
                ArrayList arrayList2 = (ArrayList) obj5;
                PullRequestMergeMethod pullRequestMergeMethod = (PullRequestMergeMethod) obj7;
                List list = (List) obj6;
                j71.c cVar4 = (j71.c) obj4;
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (!sVar6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                    sVar6.V();
                    break;
                } else {
                    androidx.compose.foundation.layout.e0 a5 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar6, 0);
                    int hashCode3 = Long.hashCode(sVar6.T);
                    androidx.compose.runtime.v1 l3 = sVar6.l();
                    w1.r c3 = w1.a.c(sVar6, oVar);
                    v2.h.o.getClass();
                    v2.f fVar4 = v2.g.b;
                    sVar6.g0();
                    if (sVar6.S) {
                        sVar6.k(fVar4);
                    } else {
                        sVar6.q0();
                    }
                    androidx.compose.runtime.t.I(sVar6, v2.g.f, a5);
                    androidx.compose.runtime.t.I(sVar6, v2.g.e, l3);
                    androidx.compose.runtime.t.w(sVar6, Integer.valueOf(hashCode3), v2.g.g);
                    androidx.compose.runtime.t.E(sVar6, v2.g.h);
                    androidx.compose.runtime.t.I(sVar6, v2.g.d, c3);
                    de.j.a(2131954820, 0, sVar6, (w1.r) null);
                    gh.j.b(null, r1.i.d(-1017690159, new bd.f(arrayList2, pullRequestMergeMethod, list, cVar4, 23), sVar6), sVar6, 48, 1);
                    sVar6.q(true);
                    break;
                }
            case 7:
                w1.r rVar4 = (w1.r) obj5;
                androidx.compose.runtime.f1 f1Var4 = (androidx.compose.runtime.f1) obj7;
                r1.d dVar6 = (r1.d) obj6;
                z0.c cVar5 = (z0.c) obj4;
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (!sVar7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                    sVar7.V();
                    break;
                } else {
                    Object N15 = sVar7.N();
                    if (N15 == obj3) {
                        N15 = new ab.e(f1Var4, 29);
                        sVar7.n0(N15);
                    }
                    w1.r n = androidx.compose.ui.layout.z.n(rVar4, (j71.c) N15);
                    androidx.compose.ui.layout.v0 d = androidx.compose.foundation.layout.t.d(w1.c.r, true);
                    int hashCode4 = Long.hashCode(sVar7.T);
                    androidx.compose.runtime.v1 l4 = sVar7.l();
                    w1.r c4 = w1.a.c(sVar7, n);
                    v2.h.o.getClass();
                    v2.f fVar5 = v2.g.b;
                    sVar7.g0();
                    if (sVar7.S) {
                        sVar7.k(fVar5);
                    } else {
                        sVar7.q0();
                    }
                    androidx.compose.runtime.t.I(sVar7, v2.g.f, d);
                    androidx.compose.runtime.t.I(sVar7, v2.g.e, l4);
                    androidx.compose.runtime.t.w(sVar7, Integer.valueOf(hashCode4), v2.g.g);
                    androidx.compose.runtime.t.E(sVar7, v2.g.h);
                    androidx.compose.runtime.t.I(sVar7, v2.g.d, c4);
                    dVar6.s(sVar7, 0);
                    Object N16 = sVar7.N();
                    if (N16 == obj3) {
                        N16 = new de.f(f1Var4, 22);
                        sVar7.n0(N16);
                    }
                    cVar5.b((j71.a) N16, sVar7, 6);
                    sVar7.q(true);
                    break;
                }
            case 8:
                ((Integer) obj2).getClass();
                zc.c.a((t10.e) obj7, (com.github.rudroid.feed.ui.g0) obj6, (w1.r) obj5, (i3) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                zc.o.a((t10.j) obj7, (com.github.rudroid.feed.ui.g0) obj6, (w1.r) obj5, (i3) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                break;
        }
        return a0Var2;
    }

    public /* synthetic */ y2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
    }

    public /* synthetic */ y2(w1.r rVar, j71.e eVar, j71.f fVar, v0 v0Var, int i) {
        this.r = 0;
        this.s = rVar;
        this.t = eVar;
        this.u = fVar;
        this.v = v0Var;
    }
}
