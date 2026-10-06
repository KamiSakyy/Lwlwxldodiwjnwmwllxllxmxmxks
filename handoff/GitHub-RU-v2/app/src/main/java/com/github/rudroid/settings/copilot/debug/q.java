package com.github.rudroid.settings.copilot.debug;

import android.content.Context;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.n2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.i3;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import com.github.rudroid.adapters.viewholders.y3;
import com.github.rudroid.copilot.u4;
import com.github.rudroid.profile.ui.q0;
import com.github.rudroid.settings.copilot.paywall.ui.d0;
import com.github.rudroid.settings.copilot.paywall.ui.i0;
import com.github.rudroid.settings.copilot.paywall.ui.m0;
import com.github.rudroid.settings.copilot.paywall.ui.n0;
import com.github.rudroid.settings.copilot.paywall.ui.x0;
import com.github.rudroid.starredreposandlists.u0;
import com.github.rudroid.twofactor.TwoFactorDialog;
import com.github.rudroid.uitoolkit.b3;
import com.github.rudroid.uitoolkit.k0;
import com.github.rudroid.uitoolkit.menu.d;
import com.github.rudroid.users.UsersFragment;
import com.github.rudroid.widget.WidgetUIState;
import com.github.service.models.response.type.MobileAuthRequestType;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import d1.c2Shadow;
import d1.i1;
import f0.z1;
import f1.a4;
import f1.b4;
import f1.c4;
import f1.d7;
import f1.g7;
import f1.o0;
import f1.p5;
import f1.ub;
import f1.x3;
import g3.g0;
import g3.p0;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xn.a3;
import xn.e1;
import xn.x2;
import yz0.k5;
import yz0.s2;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class q implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ q(int i, Object obj, Object obj2) {
        this.r = i;
        this.t = obj;
        this.s = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v110 */
    public final Object s(Object obj, Object obj2) {
        MobileAuthRequestType mobileAuthRequestType;
        String string;
        fn.a aVar;
        f11.b bVar;
        w61.k kVar;
        boolean z;
        float f;
        String str;
        int r1;
        boolean z2;
        int i;
        int i2 = this.r;
        w1.o oVar = w1.o.a;
        p0 p0Var = null;
        Object obj3 = androidx.compose.runtime.n.a;
        w61.a0 a0Var = w61.a0.a;
        Object obj4 = this.t;
        Object obj5 = this.s;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                t.b((e1) obj5, (j71.c) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 1:
                m0 m0Var = (m0) obj4;
                e1 e1Var = (e1) obj5;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    w1.r z3 = androidx.compose.foundation.layout.b.z(oVar, 16, 0.0f, 2);
                    e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar, 0);
                    int hashCode = Long.hashCode(sVar.T);
                    v1 l = sVar.l();
                    w1.r c = w1.a.c(sVar, z3);
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
                    d0.g(null, m0Var.a, e1Var, sVar, 0);
                    sVar.c0(-563226383);
                    for (i0 i0Var : m0Var.b) {
                        k0.a(null, 0L, 0L, 0.0f, false, sVar, 0, 31);
                        d0.f(null, i0Var, e1Var, sVar, 0);
                    }
                    sVar.q(false);
                    sVar.q(true);
                } else {
                    sVar.V();
                }
                return a0Var;
            case 2:
                ((Integer) obj2).getClass();
                d0.d((w1.r) obj4, (e1) obj5, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 3:
                ((Integer) obj2).getClass();
                n0.b((w1.r) obj5, (x2) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 4:
                ((Integer) obj2).getClass();
                x0.e((w1.r) obj5, (a3) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 5:
                ((Integer) obj2).getClass();
                com.github.rudroid.starredreposandlists.ui.j.d((w1.r) obj5, (com.github.service.models.response.a) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 6:
                ((Integer) obj2).getClass();
                com.github.rudroid.templates.ui.h.a((w1.r) obj5, (k5) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 7:
                w2.a aVar2 = (TwoFactorDialog) obj5;
                f1 f1Var = (f1) obj4;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = TwoFactorDialog.B;
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    fl.f fVar2 = (fl.f) f1Var.getValue();
                    com.github.rudroid.twofactor.b bVar2 = (com.github.rudroid.twofactor.b) fVar2.b;
                    if (bVar2 == null || (aVar = bVar2.a) == null || (bVar = aVar.b) == null || (mobileAuthRequestType = bVar.w) == null) {
                        mobileAuthRequestType = MobileAuthRequestType.UNKNOWN;
                    }
                    switch (TwoFactorDialog.j(fVar2).ordinal()) {
                        case 0:
                            string = aVar2.getContext().getString(2131951773);
                            k71.k.f(string, "getString(...)");
                            break;
                        case 1:
                            string = aVar2.getContext().getString(2131951776);
                            k71.k.f(string, "getString(...)");
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            int i4 = TwoFactorDialog.b.a[mobileAuthRequestType.ordinal()];
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        if (i4 != 4 && i4 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        string = aVar2.getContext().getString(2131954909);
                                        k71.k.f(string, "getString(...)");
                                        break;
                                    } else {
                                        string = aVar2.getContext().getString(2131954910);
                                        k71.k.f(string, "getString(...)");
                                        break;
                                    }
                                } else {
                                    string = aVar2.getContext().getString(2131954907);
                                    k71.k.f(string, "getString(...)");
                                    break;
                                }
                            } else {
                                string = aVar2.getContext().getString(2131954908);
                                k71.k.f(string, "getString(...)");
                                break;
                            }
                        case 6:
                            string = aVar2.getContext().getString(2131951770);
                            k71.k.f(string, "getString(...)");
                            break;
                        case 7:
                            string = aVar2.getContext().getString(2131951778);
                            k71.k.f(string, "getString(...)");
                            break;
                        case 8:
                            string = aVar2.getContext().getString(2131951772);
                            k71.k.f(string, "getString(...)");
                            break;
                        case 9:
                            string = aVar2.getContext().getString(2131951780);
                            k71.k.f(string, "getString(...)");
                            break;
                        case 10:
                            string = aVar2.getContext().getString(2131951775);
                            k71.k.f(string, "getString(...)");
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    ub.b(string, (w1.r) null, ih.d.b(sVar2).s, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).c, sVar2, 0, 0, 131066);
                } else {
                    sVar2.V();
                }
                return a0Var;
            case 8:
                r1.d dVar = (r1.d) obj5;
                j71.f fVar3 = (j71.f) obj4;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    b3.f(null, dVar, fVar3, sVar3, 0);
                } else {
                    sVar3.V();
                }
                return a0Var;
            case 9:
                d.C0009d c0009d = (d.C0009d) obj5;
                String str2 = (String) obj4;
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (!sVar4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    sVar4.V();
                    return a0Var;
                }
                boolean z4 = c0009d.i;
                String str3 = c0009d.a;
                boolean z5 = c0009d.j;
                String str4 = c0009d.c;
                if (z4) {
                    sVar4.c0(-1331726929);
                    sVar4.c0(234136799);
                    long j = c0009d.f;
                    if (j == 16) {
                        j = ih.d.b(sVar4).s;
                    }
                    sVar4.q(false);
                    d2.t tVar = new d2.t(j);
                    long j2 = c0009d.h;
                    if (j2 == 16) {
                        j2 = ih.d.b(sVar4).A;
                    }
                    kVar = new w61.k(tVar, new d2.t(j2));
                    sVar4.q(false);
                } else {
                    sVar4.c0(-1331521585);
                    kVar = new w61.k(new d2.t(ih.d.b(sVar4).v), new d2.t(ih.d.b(sVar4).A));
                    sVar4.q(false);
                }
                long j3 = ((d2.t) kVar.r).a;
                long j4 = ((d2.t) kVar.s).a;
                int i5 = c0009d.l;
                if (i5 > 1 || str4 != null) {
                    z = z5;
                    f = ih.a.l;
                } else {
                    z = z5;
                    f = 0;
                }
                f2 f2 = androidx.compose.foundation.layout.b.f(0.0f, f, (str2 != null || z) ? (k71.k.b(str2, str3) || z) ? ih.a.p : ih.a.q : ih.a.l, (i5 > 1 || str4 != null) ? ih.a.l : 0, 1);
                l2 a2 = j2.a(androidx.compose.foundation.layout.l.g, w1.c.B, sVar4, 54);
                int hashCode2 = Long.hashCode(sVar4.T);
                v1 l2 = sVar4.l();
                w1.r c2 = w1.a.c(sVar4, oVar);
                v2.h.o.getClass();
                v2.f fVar4 = v2.g.b;
                sVar4.g0();
                if (sVar4.S) {
                    sVar4.k(fVar4);
                } else {
                    sVar4.q0();
                }
                v2.e eVar = v2.g.f;
                androidx.compose.runtime.t.I(sVar4, eVar, a2);
                v2.e eVar2 = v2.g.e;
                androidx.compose.runtime.t.I(sVar4, eVar2, l2);
                Integer valueOf = Integer.valueOf(hashCode2);
                v2.e eVar3 = v2.g.g;
                androidx.compose.runtime.t.w(sVar4, valueOf, eVar3);
                v2.d dVar2 = v2.g.h;
                androidx.compose.runtime.t.E(sVar4, dVar2);
                v2.e eVar4 = v2.g.d;
                androidx.compose.runtime.t.I(sVar4, eVar4, c2);
                w1.r w = androidx.compose.foundation.layout.b.w(oVar, f2);
                boolean z6 = c0009d.k != null;
                boolean h = sVar4.h(c0009d);
                Object N = sVar4.N();
                if (h || N == obj3) {
                    str = str2;
                    N = new u0(15, c0009d);
                    sVar4.n0(N);
                } else {
                    str = str2;
                }
                w1.r a3 = com.github.rudroid.uitoolkit.extensions.d.a(w, z6, (j71.c) N);
                boolean h2 = sVar4.h(c0009d);
                Object N2 = sVar4.N();
                if (h2 || N2 == obj3) {
                    N2 = new y3(c0009d, 1);
                    sVar4.n0(N2);
                }
                w1.r b = d3.q.b(a3, false, (j71.c) N2);
                if (1.0f <= 0.0d) {
                    l0.a.a("invalid weight; must be greater than zero");
                }
                w1.r f3 = b.f(new w1(1.0f, true));
                e0 a4 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.e, w1.c.D, sVar4, 6);
                int hashCode3 = Long.hashCode(sVar4.T);
                v1 l3 = sVar4.l();
                w1.r c3 = w1.a.c(sVar4, f3);
                sVar4.g0();
                if (sVar4.S) {
                    sVar4.k(fVar4);
                } else {
                    sVar4.q0();
                }
                androidx.compose.runtime.t.I(sVar4, eVar, a4);
                androidx.compose.runtime.t.I(sVar4, eVar2, l3);
                f1.e.t(hashCode3, sVar4, eVar3, sVar4, dVar2);
                androidx.compose.runtime.t.I(sVar4, eVar4, c3);
                com.github.rudroid.uitoolkit.text.k.b(null, c0009d.d, androidx.compose.foundation.layout.b.f(ih.a.n, 0.0f, 0.0f, 0.0f, 14), j4, null, null, r1.i.d(727564765, new q0(c0009d, j3), sVar4), sVar4, 1573248, 49);
                if (str4 != null) {
                    sVar4.c0(-853906112);
                    sVar4.c0(526646566);
                    long j5 = c0009d.g;
                    if (j5 == 16) {
                        j5 = ih.d.b(sVar4).v;
                    }
                    long j6 = j5;
                    sVar4.q(false);
                    ub.b(c0009d.c, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar4).x, j6, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar4, 0, 0, 131070);
                    r1 = 0;
                } else {
                    r1 = 0;
                    sVar4.c0(-863247404);
                }
                sVar4.q((boolean) r1);
                sVar4.q(true);
                if (k71.k.b(str3, str)) {
                    sVar4.c0(1081571794);
                    p5.a(z3.C(2131231158, (int) r1, sVar4), (String) null, (w1.r) null, ih.d.b(sVar4).F, sVar4, 56, 4);
                    sVar4.q((boolean) r1);
                } else {
                    if (z) {
                        sVar4.c0(1081862698);
                        p5.a(z3.C(2131231352, (int) r1, sVar4), (String) null, (w1.r) null, ih.d.b(sVar4).A, sVar4, 56, 4);
                    } else {
                        sVar4.c0(1071741694);
                    }
                    sVar4.q((boolean) r1);
                }
                sVar4.q(true);
                return a0Var;
            case 10:
                float floatValue = ((Float) obj).floatValue();
                ((com.github.rudroid.uitoolkit.swipetodismiss.a) obj5).a(floatValue, ((Float) obj2).floatValue());
                ((k71.t) obj4).r = floatValue;
                return a0Var;
            case 11:
                m0.s sVar5 = (m0.s) obj5;
                UsersFragment usersFragment = (UsersFragment) obj4;
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (sVar6.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                    float e = com.github.rudroid.uitoolkit.utils.lists.t.e(sVar5, true, sVar6, 0);
                    String str5 = usersFragment.C4().t;
                    String str6 = str5 == null ? "" : str5;
                    String p0 = i4.p0(usersFragment.C4().s.b.r, sVar6);
                    boolean h3 = sVar6.h(usersFragment);
                    Object N3 = sVar6.N();
                    if (h3 || N3 == obj3) {
                        N3 = new com.github.rudroid.users.g(usersFragment, 1);
                        sVar6.n0(N3);
                    }
                    qg.p.c(null, str6, p0, 0L, (j71.a) N3, 0, e, 0.0f, 0, 0, null, sVar6, 0, 0, 1961);
                } else {
                    sVar6.V();
                }
                return a0Var;
            case 12:
                b2.a0 a0Var2 = (b2.a0) obj4;
                if (!((Boolean) ((i3) obj5).getValue()).booleanValue()) {
                    b2.a0.a(a0Var2);
                }
                return a0Var;
            case 13:
                j71.f fVar5 = (j71.f) obj5;
                fl.b bVar3 = (fl.b) obj4;
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (sVar7.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                    fVar5.f(bVar3, sVar7, 0);
                } else {
                    sVar7.V();
                }
                return a0Var;
            case 14:
                ((Integer) obj2).getClass();
                com.github.rudroid.widget.b.a((WidgetUIState) obj5, (m6.e) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 15:
                com.github.rudroid.widget.f fVar6 = (com.github.rudroid.widget.f) obj5;
                z1 z1Var = (z1) obj4;
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj;
                int intValue7 = ((Integer) obj2).intValue();
                int i6 = com.github.rudroid.widget.f.i0;
                if (sVar8.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                    long j7 = ih.d.b(sVar8).d;
                    String p02 = i4.p0(fVar6.t0(), sVar8);
                    String p03 = i4.p0(2131951653, sVar8);
                    float a5 = com.github.rudroid.uitoolkit.utils.b0.a(z1Var, sVar8, 0);
                    boolean h4 = sVar8.h(fVar6);
                    Object N4 = sVar8.N();
                    if (h4 || N4 == obj3) {
                        N4 = new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j(25, fVar6);
                        sVar8.n0(N4);
                    }
                    qg.p.c(null, p03, p02, j7, (j71.a) N4, 0, a5, 0.0f, 0, 0, null, sVar8, 0, 0, 1953);
                } else {
                    sVar8.V();
                }
                return a0Var;
            case 16:
                ((Integer) obj2).getClass();
                com.github.rudroid.widget.agenttasks.r.b((z5.n) obj5, (com.github.rudroid.widget.agenttasks.model.b) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 17:
                ((Integer) obj2).getClass();
                com.github.rudroid.widget.shortcuts.a0.e((z5.n) obj5, (com.github.rudroid.widget.shortcuts.model.h) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 18:
                d1.z1 z1Var2 = (d1.z1) obj5;
                v71.z zVar = (v71.z) obj4;
                u0.a aVar3 = (u0.a) obj;
                Context context = (Context) obj2;
                boolean j8 = z1Var2.j();
                g3.g m = z1Var2.m();
                String str7 = m != null ? m.s : null;
                p0 p0Var2 = z1Var2.v;
                if (p0Var2 != null) {
                    long j9 = p0Var2.a;
                    l3.p pVar = z1Var2.b;
                    p0Var = new p0(g0.b(pVar.m((int) (j9 >> 32)), pVar.m((int) (j9 & 4294967295L))));
                }
                d1.t.a(aVar3, context, j8, str7, p0Var, z1Var2.i, new c2Shadow(z1Var2, zVar, context, 0));
                return a0Var;
            case 19:
                ((Integer) obj2).getClass();
                m71.a.a((z5.n) obj5, (j71.c) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 20:
                ArrayList arrayList = (ArrayList) obj5;
                i6.c cVar = (i6.c) obj4;
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && sVar9.C()) {
                    sVar9.V();
                } else {
                    int size = arrayList.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj6 = arrayList.get(i8);
                        i8++;
                        int i9 = i7 + 1;
                        if (i7 < 0) {
                            sy.d0.x();
                            throw null;
                        }
                        w61.k kVar2 = (w61.k) obj6;
                        Long l4 = (Long) kVar2.r;
                        j71.f fVar7 = (j71.f) kVar2.s;
                        if (l4 != null && l4.longValue() == Long.MIN_VALUE) {
                            l4 = null;
                        }
                        long longValue = l4 != null ? l4.longValue() : (-4611686018427387904L) - i7;
                        if (longValue == Long.MIN_VALUE) {
                            throw new IllegalStateException("Implicit list item ids exhausted.");
                        }
                        m71.a.b(longValue, cVar, r1.i.d(1419565165, new d6.c(fVar7, 0), sVar9), sVar9, 384);
                        i7 = i9;
                    }
                }
                return a0Var;
            case 21:
                r1.d dVar3 = (r1.d) obj5;
                j71.a aVar4 = (j71.a) obj4;
                androidx.compose.runtime.s sVar10 = (androidx.compose.runtime.s) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (sVar10.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                    float f4 = ih.a.m;
                    w1.o oVar2 = w1.o.a;
                    w1.r A = androidx.compose.foundation.layout.b.A(oVar2, f4, f4, f4, f4);
                    v0 d = androidx.compose.foundation.layout.t.d(w1.c.r, false);
                    int hashCode4 = Long.hashCode(sVar10.T);
                    v1 l5 = sVar10.l();
                    w1.r c4 = w1.a.c(sVar10, A);
                    v2.h.o.getClass();
                    v2.f fVar8 = v2.g.b;
                    sVar10.g0();
                    if (sVar10.S) {
                        sVar10.k(fVar8);
                    } else {
                        sVar10.q0();
                    }
                    v2.e eVar5 = v2.g.f;
                    androidx.compose.runtime.t.I(sVar10, eVar5, d);
                    v2.e eVar6 = v2.g.e;
                    androidx.compose.runtime.t.I(sVar10, eVar6, l5);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    v2.e eVar7 = v2.g.g;
                    androidx.compose.runtime.t.w(sVar10, valueOf2, eVar7);
                    v2.d dVar4 = v2.g.h;
                    androidx.compose.runtime.t.E(sVar10, dVar4);
                    v2.e eVar8 = v2.g.d;
                    androidx.compose.runtime.t.I(sVar10, eVar8, c4);
                    l2 a6 = j2.a(androidx.compose.foundation.layout.l.a, w1.c.A, sVar10, 0);
                    int hashCode5 = Long.hashCode(sVar10.T);
                    v1 l6 = sVar10.l();
                    w1.r c5 = w1.a.c(sVar10, oVar2);
                    sVar10.g0();
                    if (sVar10.S) {
                        sVar10.k(fVar8);
                    } else {
                        sVar10.q0();
                    }
                    androidx.compose.runtime.t.I(sVar10, eVar5, a6);
                    androidx.compose.runtime.t.I(sVar10, eVar6, l6);
                    f1.e.t(hashCode5, sVar10, eVar7, sVar10, dVar4);
                    androidx.compose.runtime.t.I(sVar10, eVar8, c5);
                    dVar3.f(n2.a, sVar10, 6);
                    if (aVar4 != null) {
                        sVar10.c0(149335720);
                        boolean f5 = sVar10.f(aVar4);
                        Object N5 = sVar10.N();
                        if (f5 || N5 == obj3) {
                            i = 4;
                            N5 = new com.github.rudroid.uitoolkit.markdown.components.c(4, aVar4);
                            sVar10.n0(N5);
                        } else {
                            i = 4;
                        }
                        w1.r B = androidx.compose.foundation.layout.b.B(f0.o.m(oVar2, false, (String) null, (d3.k) null, (j71.a) N5, 15), ih.a.l, i, 0.0f, 0.0f, 12);
                        z2 = false;
                        p5.a(z3.C(2131231500, 0, sVar10), i4.p0(2131951849, sVar10), B, ih.d.b(sVar10).A, sVar10, 8, 0);
                    } else {
                        z2 = false;
                        sVar10.c0(147493235);
                    }
                    sVar10.q(z2);
                    sVar10.q(true);
                    sVar10.q(true);
                } else {
                    sVar10.V();
                }
                return a0Var;
            case 22:
                u4.a aVar5 = (u4.a) obj5;
                j71.e eVar9 = (j71.e) obj4;
                androidx.compose.runtime.s sVar11 = (androidx.compose.runtime.s) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (sVar11.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                    boolean z7 = aVar5.c;
                    String p04 = i4.p0(2131951851, sVar11);
                    o0 f6 = sg.v.f(0L, 0L, sVar11, 7);
                    boolean f7 = sVar11.f(eVar9) | sVar11.h(aVar5);
                    Object N6 = sVar11.N();
                    if (f7 || N6 == obj3) {
                        N6 = new dc.m(eVar9, aVar5, 1);
                        sVar11.n0(N6);
                    }
                    sg.m0.a(null, p04, z7, null, null, null, false, (j71.a) N6, f6, sVar11, 0, 121);
                } else {
                    sVar11.V();
                }
                return a0Var;
            case 23:
                ((Integer) obj2).getClass();
                de.a.b((w1.r) obj5, (s2) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 24:
                f1 f1Var2 = (f1) obj5;
                String str8 = (String) obj4;
                androidx.compose.runtime.s sVar12 = (androidx.compose.runtime.s) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (sVar12.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                    w1.o oVar3 = w1.o.a;
                    w1.r e2 = p2.e(oVar3, 1.0f);
                    Object N7 = sVar12.N();
                    if (N7 == obj3) {
                        N7 = new de.f(f1Var2, 0);
                        sVar12.n0(N7);
                    }
                    w1.r m2 = f0.o.m(e2, false, (String) null, (d3.k) null, (j71.a) N7, 15);
                    e0 a7 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar12, 0);
                    int hashCode6 = Long.hashCode(sVar12.T);
                    v1 l7 = sVar12.l();
                    w1.r c6 = w1.a.c(sVar12, m2);
                    v2.h.o.getClass();
                    v2.f fVar9 = v2.g.b;
                    sVar12.g0();
                    if (sVar12.S) {
                        sVar12.k(fVar9);
                    } else {
                        sVar12.q0();
                    }
                    v2.e eVar10 = v2.g.f;
                    androidx.compose.runtime.t.I(sVar12, eVar10, a7);
                    v2.e eVar11 = v2.g.e;
                    androidx.compose.runtime.t.I(sVar12, eVar11, l7);
                    Integer valueOf3 = Integer.valueOf(hashCode6);
                    v2.e eVar12 = v2.g.g;
                    androidx.compose.runtime.t.w(sVar12, valueOf3, eVar12);
                    v2.d dVar5 = v2.g.h;
                    androidx.compose.runtime.t.E(sVar12, dVar5);
                    v2.e eVar13 = v2.g.d;
                    androidx.compose.runtime.t.I(sVar12, eVar13, c6);
                    de.j.a(2131954798, 0, sVar12, (w1.r) null);
                    w1.r e3 = p2.e(oVar3, 1.0f);
                    float f8 = ih.a.n;
                    w1.r x = androidx.compose.foundation.layout.b.x(e3, f8);
                    l2 a8 = j2.a(androidx.compose.foundation.layout.l.g, w1.c.B, sVar12, 54);
                    int hashCode7 = Long.hashCode(sVar12.T);
                    v1 l8 = sVar12.l();
                    w1.r c7 = w1.a.c(sVar12, x);
                    sVar12.g0();
                    if (sVar12.S) {
                        sVar12.k(fVar9);
                    } else {
                        sVar12.q0();
                    }
                    androidx.compose.runtime.t.I(sVar12, eVar10, a8);
                    androidx.compose.runtime.t.I(sVar12, eVar11, l8);
                    f1.e.t(hashCode7, sVar12, eVar12, sVar12, dVar5);
                    androidx.compose.runtime.t.I(sVar12, eVar13, c7);
                    w1.r B2 = androidx.compose.foundation.layout.b.B(oVar3, 0.0f, 0.0f, f8, 0.0f, 11);
                    if (1.0f <= 0.0d) {
                        l0.a.a("invalid weight; must be greater than zero");
                    }
                    ub.b(str8 == null ? "" : str8, B2.f(new w1(1.0f, true)), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 2, 0, (j71.c) null, ih.d.f(sVar12).l, sVar12, 0, 24960, 110588);
                    String upperCase = i4.p0(2131954797, sVar12).toUpperCase(Locale.ROOT);
                    k71.k.f(upperCase, "toUpperCase(...)");
                    ub.b(upperCase, (w1.r) null, ih.d.b(sVar12).F, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar12).h, sVar12, 0, 0, 131066);
                    sVar12.q(true);
                    sVar12.q(true);
                } else {
                    sVar12.V();
                }
                return a0Var;
            case 25:
                ((Integer) obj2).getClass();
                df.o.a((ArrayList) obj5, (String) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 26:
                j71.c cVar2 = (j71.c) obj4;
                x3 x3Var = (x3) obj5;
                androidx.compose.runtime.s sVar13 = (androidx.compose.runtime.s) obj;
                int intValue11 = ((Integer) obj2).intValue();
                f2 f2Var = dh.e.a;
                if (sVar13.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                    boolean f9 = sVar13.f(cVar2) | sVar13.f(x3Var);
                    Object N8 = sVar13.N();
                    if (f9 || N8 == obj3) {
                        N8 = new i1(3, cVar2, x3Var);
                        sVar13.n0(N8);
                    }
                    sg.k0.a(12582912, 123, null, sVar13, null, null, null, (j71.a) N8, dh.a.a, null, false);
                } else {
                    sVar13.V();
                }
                return a0Var;
            case 27:
                ((Integer) obj2).getClass();
                ((a4) obj5).a((w51.r) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 28:
                ((Integer) obj2).getClass();
                ((b4) obj5).a((d7) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            default:
                ((Integer) obj2).getClass();
                ((c4) obj5).a((g7) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
        }
    }

    public /* synthetic */ q(Object obj, Object obj2, int i, int i2) {
        this.r = i2;
        this.s = obj;
        this.t = obj2;
    }

    public /* synthetic */ q(Object obj, Object obj2, boolean z, int i) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    public /* synthetic */ q(w1.r rVar, e1 e1Var, int i) {
        this.r = 2;
        this.t = rVar;
        this.s = e1Var;
    }
}
