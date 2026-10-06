package com.github.rudroid.settings.codeoptions;

import ad.a;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.m2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.i3;
import androidx.compose.runtime.v1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.rudroid.actions.checkdetail.jobbottomsheet.ReRunJobBottomSheet;
import com.github.rudroid.agents.sessionevents.ui.q1;
import com.github.rudroid.copilot.u4;
import com.github.rudroid.m0;
import com.github.rudroid.settings.codeoptions.CodeOptionsActivity;
import com.github.rudroid.templates.IssueTemplatesBottomSheet;
import com.github.rudroid.twofactor.TwoFactorDialog;
import com.github.rudroid.uitoolkit.o2;
import com.github.rudroid.utilities.k1;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.widget.pullrequests.PullRequestsWidgetSettingsActivity;
import com.github.rudroid.widget.shortcuts.a0;
import com.github.service.models.response.PullRequestWidgetData;
import com.github.service.models.response.PullsWidgetFilter;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.google.android.gms.internal.measurement.i4;
import d1.i1;
import d1.x0;
import f1.l2;
import f1.o0;
import f1.p0;
import f1.t2;
import f1.ub;
import f1.w3;
import f1.x3;
import g3.q0;
import h0.b2;
import h0.h1Shadow;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l01.w0;
import nj.y0;
import s0.b1;
import s0.z0;
import sc.c1;
import sg.n0;
import xn.v2;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class g implements j71.f {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        r1.d d;
        x3 x3Var = (x3) this.s;
        String str = (String) this.t;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
        int intValue = ((Integer) obj3).intValue();
        f2 f2Var = dh.e.a;
        k71.k.g((androidx.compose.foundation.layout.f0) obj, "$this$DatePickerDialog");
        int i = 0;
        int i2 = 1;
        if (sVar.S(intValue & 1, (intValue & 17) != 16)) {
            l2 a = dh.c.a(0L, sVar, 2047);
            if (str != null) {
                sVar.c0(-1838332251);
                d = r1.i.d(-940010913, new bd.m(str, 11), sVar);
                sVar.q(false);
            } else {
                sVar.c0(-1837971566);
                d = r1.i.d(1904019880, new dh.d(x3Var, i), sVar);
                sVar.q(false);
            }
            w3.b(x3Var, (w1.r) null, (t2) null, a, d, r1.i.d(772521285, new dh.d(x3Var, i2), sVar), false, (b2.a0) null, sVar, 196608);
        } else {
            sVar.V();
        }
        return w61.a0.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        List<w0> list = (List) this.s;
        j71.c cVar = (j71.c) this.t;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
        ((Integer) obj3).getClass();
        k71.k.g((z.y) obj, "$this$AnimatedVisibility");
        String p0 = i4.p0(2131953976, sVar);
        boolean z = false;
        androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar, 0);
        int hashCode = Long.hashCode(sVar.T);
        v1 l = sVar.l();
        w1.r rVar = w1.o.a;
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
        sVar.c0(773452963);
        for (w0 w0Var : list) {
            boolean f = sVar.f(cVar) | sVar.h(w0Var);
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            Object obj4 = N;
            if (f || N == iVar) {
                i1 i1Var = new i1(7, cVar, w0Var);
                sVar.n0(i1Var);
                obj4 = i1Var;
            }
            w1.r m = f0.o.m(rVar, false, (String) null, (d3.k) null, (j71.a) obj4, 15);
            w1.r rVar2 = rVar;
            boolean f2 = sVar.f(p0);
            Object N2 = sVar.N();
            if (f2 || N2 == iVar) {
                N2 = new d9.m(p0, 20);
                sVar.n0(N2);
            }
            w1.r x = androidx.compose.foundation.layout.b.x(p2.e(d3.q.b(m, z, (j71.c) N2), 1.0f), ih.a.n);
            String str = w0Var.t;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            q0 q0Var = ih.d.f(sVar).l;
            androidx.compose.runtime.s sVar2 = sVar;
            com.github.rudroid.uitoolkit.text.k.c(x, com.github.rudroid.uitoolkit.text.m.b(2131231463, null, null, 14), androidx.compose.foundation.layout.b.f(0.0f, 0.0f, ih.a.m, 0.0f, 11), new d2.t(ih.d.b(sVar).z), null, null, str2, null, 0L, 0, 0, q0Var, false, sVar2, 0, 0, 14256);
            z = z;
            sVar = sVar2;
            rVar = rVar2;
        }
        sVar.q(z);
        sVar.q(true);
        return w61.a0.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        j71.c cVar = (j71.c) this.s;
        g0.c cVar2 = (g0.c) this.t;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (sVar.S(intValue & 1, (intValue & 17) != 16)) {
            Object N = sVar.N();
            if (N == androidx.compose.runtime.n.a) {
                N = new g0.d();
                sVar.n0(N);
            }
            g0.d dVar_r7 = (g0.d) N;
            dVar_r7.a.clear();
            cVar.k(dVar_r7);
            dVar_r7.a(cVar2, sVar, 0);
        } else {
            sVar.V();
        }
        return w61.a0.a;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Collection] */
    private final Object i(Object obj, Object obj2, Object obj3) {
        String str = (String) this.s;
        k71.s sVar = (k71.s) this.t;
        y0 y0Var = (y0) obj;
        int intValue = ((Integer) obj2).intValue();
        v2 v2Var = (v2) obj3;
        if (y0Var.b(str) == null && intValue == 1) {
            y0Var.c(str, v2Var);
            if (!v2Var.a.isEmpty()) {
                sVar.r = true;
            }
        } else if (y0Var.a(str, v2Var)) {
            sVar.r = true;
        }
        return w61.a0.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        o0.x xVar = (o0.x) this.s;
        s3.m mVar = (s3.m) this.t;
        float floatValue = ((Float) obj).floatValue();
        float floatValue2 = ((Float) obj2).floatValue();
        float floatValue3 = ((Float) obj3).floatValue();
        boolean C = b41.b.C(xVar, floatValue);
        if (xVar.l().e != b2.r && mVar != s3.m.r) {
            C = !C;
        }
        int i = xVar.l().b;
        float q = i == 0 ? 0.0f : b41.b.q(xVar) / i;
        float f = q - ((int) q);
        char c = Math.abs(floatValue) >= xVar.q.W(i0.j.a) ? floatValue > 0.0f ? (char) 1 : (char) 2 : (char) 0;
        if (c == 0) {
            floatValue2 = Math.abs(f) > 0.5f ? floatValue3 : floatValue3;
        } else {
            if (c != 1) {
                if (c != 2) {
                    floatValue2 = 0.0f;
                }
            }
        }
        return Float.valueOf(floatValue2);
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        Spannable spannable = (Spannable) this.s;
        a1 a1Var = (a1) this.t;
        g3.h0 h0Var = (g3.h0) obj;
        int intValue = ((Integer) obj2).intValue();
        int intValue2 = ((Integer) obj3).intValue();
        k3.i iVar = h0Var.f;
        k3.s sVar = h0Var.c;
        if (sVar == null) {
            sVar = k3.s.w;
        }
        k3.o oVar = h0Var.d;
        int i = oVar != null ? oVar.a : 0;
        k3.p pVar = h0Var.e;
        int i2 = pVar != null ? pVar.a : 65535;
        o3.c cVar = (o3.c) a1Var.s;
        k3.e0 b = cVar.v.b(iVar, sVar, i, i2);
        if (b instanceof k3.e0) {
            Object obj4 = b.r;
            k71.k.e(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
            typeface = (Typeface) obj4;
        } else {
            l51.h hVar = new l51.h(b, cVar.A);
            cVar.A = hVar;
            Object obj5 = hVar.u;
            k71.k.e(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
            typeface = (Typeface) obj5;
        }
        spannable.setSpan(new j3.b(1, typeface), intValue, intValue2, 33);
        return w61.a0.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        j71.a aVar = (j71.a) this.s;
        hd.a aVar2 = (hd.a) this.t;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
        int intValue = ((Integer) obj3).intValue();
        k71.k.g((androidx.compose.foundation.layout.x) obj, "$this$GenericBanner");
        if (sVar.S(intValue & 1, (intValue & 17) != 16)) {
            Object N = sVar.N();
            if (N == androidx.compose.runtime.n.a) {
                N = new q00.c(10);
                sVar.n0(N);
            }
            qd.q.a(d3.q.a(w1.o.a, (j71.c) N), aVar, aVar2, sVar, 0);
        } else {
            sVar.V();
        }
        return w61.a0.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        ReRunJobBottomSheet reRunJobBottomSheet = (ReRunJobBottomSheet) this.s;
        oa.j jVar = (oa.j) this.t;
        mn.d dVar_r7 = (mn.d) obj;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
        ((Integer) obj3).getClass();
        k71.k.g(dVar_r7, "data");
        w1.r u = p2.u(w1.o.a);
        androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar, 0);
        int hashCode = Long.hashCode(sVar.T);
        v1 l = sVar.l();
        w1.r c = w1.a.c(sVar, u);
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
        c1 c1Var = reRunJobBottomSheet.V0;
        if (c1Var == null) {
            k71.k.m("forUserImageLoaderFactory");
            throw null;
        }
        ih.f.a((g9.h) c1Var.a(jVar), r1.i.d(327665867, new pc.j(3, dVar_r7), sVar), sVar, 48);
        boolean h = sVar.h(reRunJobBottomSheet) | sVar.h(dVar_r7);
        Object N = sVar.N();
        if (h || N == androidx.compose.runtime.n.a) {
            N = new fg.d(25, dVar_r7, reRunJobBottomSheet);
            sVar.n0(N);
        }
        com.google.common.util.concurrent.a.b((w1.r) null, (m0.s) null, (d2) null, (androidx.compose.foundation.layout.k) null, (w1.d) null, (h1Shadow) null, false, (f0.j) null, (j71.c) N, sVar, 0, 511);
        sVar.q(true);
        return w61.a0.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        ReRunJobBottomSheet reRunJobBottomSheet = (ReRunJobBottomSheet) this.s;
        String str = (String) this.t;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
        int intValue = ((Integer) obj3).intValue();
        k71.k.g((m0.b) obj, "$this$item");
        if (sVar.S(intValue & 1, (intValue & 17) != 16)) {
            Object N = sVar.N();
            Object obj4 = androidx.compose.runtime.n.a;
            if (N == obj4) {
                N = new q00.c(19);
                sVar.n0(N);
            }
            w1.r b = d3.q.b(w1.o.a, false, (j71.c) N);
            boolean h = sVar.h(reRunJobBottomSheet) | sVar.f(str);
            Object N2 = sVar.N();
            if (h || N2 == obj4) {
                N2 = new nf.j(11, reRunJobBottomSheet, str);
                sVar.n0(N2);
            }
            ra.j.a(0, 0, sVar, (j71.a) N2, b);
        } else {
            sVar.V();
        }
        return w61.a0.a;
    }

    private final Object u(Object obj, Object obj2, Object obj3) {
        j71.c cVar = (j71.c) this.s;
        j0.j jVar = (j0.j) this.t;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
        ((Integer) obj3).getClass();
        sVar.c0(-102778667);
        Object N = sVar.N();
        androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
        if (N == iVar) {
            N = androidx.compose.runtime.t.p(sVar);
            sVar.n0(N);
        }
        v71.z zVar = (v71.z) N;
        Object N2 = sVar.N();
        if (N2 == iVar) {
            N2 = androidx.compose.runtime.t.B((Object) null);
            sVar.n0(N2);
        }
        f1 f1Var = (f1) N2;
        f1 G = androidx.compose.runtime.t.G(cVar, sVar);
        boolean f = sVar.f(jVar);
        Object N3 = sVar.N();
        if (f || N3 == iVar) {
            N3 = new z0(0, f1Var, jVar);
            sVar.n0(N3);
        }
        androidx.compose.runtime.t.c(jVar, (j71.c) N3, sVar);
        boolean h = sVar.h(zVar) | sVar.f(jVar) | sVar.f(G);
        Object N4 = sVar.N();
        if (h || N4 == iVar) {
            N4 = new b1(zVar, f1Var, jVar, G);
            sVar.n0(N4);
        }
        w1.r a = q2.h0.a(w1.o.a, jVar, (PointerInputEventHandler) N4);
        sVar.q(false);
        return a;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        t10.s sVar = (t10.s) this.s;
        com.github.rudroid.feed.ui.g0 g0Var = (com.github.rudroid.feed.ui.g0) this.t;
        androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
        int intValue = ((Integer) obj3).intValue();
        k71.k.g((e1) obj, "$this$FlowRow");
        if (sVar2.S(intValue & 1, (intValue & 17) != 16)) {
            int i = sVar.f;
            boolean h = sVar2.h(g0Var) | sVar2.h(sVar);
            Object N = sVar2.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            Object obj4 = N;
            if (h || N == iVar) {
                zc.m mVar = new zc.m(g0Var, sVar, 1);
                sVar2.n0(mVar);
                obj4 = mVar;
            }
            yc.e.a((w1.r) null, 2131820667, i, 2131231418, (Integer) null, false, (j71.a) obj4, i4.p0(2131953774, sVar2), sVar2, 0, 49);
            int i2 = sVar.g;
            boolean h2 = sVar2.h(g0Var) | sVar2.h(sVar);
            Object N2 = sVar2.N();
            Object obj5 = N2;
            if (h2 || N2 == iVar) {
                zc.m mVar2 = new zc.m(g0Var, sVar, 2);
                sVar2.n0(mVar2);
                obj5 = mVar2;
            }
            yc.e.a((w1.r) null, 2131820602, i2, 2131231395, (Integer) null, false, (j71.a) obj5, i4.p0(2131953773, sVar2), sVar2, 0, 49);
        } else {
            sVar2.V();
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0abc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2, Object obj3) {
        String str;
        fn.a aVar;
        f11.b bVar;
        h6.a aVar2;
        h6.a aVar3;
        boolean z;
        boolean z2;
        g3.g gVar;
        boolean z3;
        String str2;
        String q0;
        g3.g gVar2;
        boolean z4;
        int i = this.r;
        Object obj4 = androidx.compose.runtime.n.a;
        w1.o oVar = w1.o.a;
        w61.a0 a0Var = w61.a0.a;
        Object obj5 = this.t;
        Object obj6 = this.s;
        switch (i) {
            case 0:
                f1 f1Var = (f1) obj6;
                CodeOptionsActivity codeOptionsActivity = (CodeOptionsActivity) obj5;
                d2 d2Var = (d2) obj;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                CodeOptionsActivity.a aVar4 = CodeOptionsActivity.Companion;
                k71.k.g(d2Var, "paddingValues");
                if ((intValue & 6) == 0) {
                    intValue |= sVar.f(d2Var) ? 4 : 2;
                }
                if (sVar.S(intValue & 1, (intValue & 19) != 18)) {
                    w1.r w = androidx.compose.foundation.layout.b.w(oVar, d2Var);
                    f fVar = (f) f1Var.getValue();
                    com.github.rudroid.html.a aVar5 = codeOptionsActivity.t0;
                    if (aVar5 == null) {
                        k71.k.m("tagHandler");
                        throw null;
                    }
                    boolean h = sVar.h(codeOptionsActivity);
                    Object N = sVar.N();
                    if (h || N == obj4) {
                        N = new h(codeOptionsActivity, 0);
                        sVar.n0(N);
                    }
                    j71.e eVar = (j71.e) N;
                    boolean h2 = sVar.h(codeOptionsActivity);
                    Object N2 = sVar.N();
                    if (h2 || N2 == obj4) {
                        N2 = new h(codeOptionsActivity, 1);
                        sVar.n0(N2);
                    }
                    n.b(w, fVar, eVar, (j71.e) N2, aVar5, sVar, 0);
                } else {
                    sVar.V();
                }
                return a0Var;
            case 1:
                ArrayList arrayList = (ArrayList) obj6;
                f fVar2 = (f) obj5;
                s3.f fVar3 = (s3.f) obj;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                a.g gVar3 = n.a;
                if ((intValue2 & 6) == 0) {
                    intValue2 |= sVar2.c(fVar3.r) ? 4 : 2;
                }
                if (sVar2.S(intValue2 & 1, (intValue2 & 19) != 18)) {
                    androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
                    int hashCode = Long.hashCode(sVar2.T);
                    v1 l = sVar2.l();
                    w1.r c = w1.a.c(sVar2, oVar);
                    v2.h.o.getClass();
                    v2.f fVar4 = v2.g.b;
                    sVar2.g0();
                    if (sVar2.S) {
                        sVar2.k(fVar4);
                    } else {
                        sVar2.q0();
                    }
                    androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
                    androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar2, v2.g.h);
                    androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
                    sVar2.c0(1027731336);
                    int size = arrayList.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj7 = arrayList.get(i3);
                        i3++;
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            sy.d0Shadow.x();
                            throw null;
                        }
                        d.a(null, fVar3.r, i4, (g3.g) obj7, fVar2, null, sVar2, (intValue2 << 3) & 112, 33);
                        i2 = i4;
                    }
                    sVar2.q(false);
                    sVar2.q(true);
                } else {
                    sVar2.V();
                }
                return a0Var;
            case 2:
                j71.e eVar2 = (j71.e) obj5;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                a.g gVar4 = n.a;
                k71.k.g((z.y) obj, "$this$AnimatedVisibility");
                int e = ((f) obj6).e();
                boolean f = sVar3.f(eVar2);
                Object N3 = sVar3.N();
                if (f || N3 == obj4) {
                    N3 = new j(5, eVar2);
                    sVar3.n0(N3);
                }
                n.d(e, 0, sVar3, (j71.c) N3, null);
                return a0Var;
            case 3:
                nj.d dVar_r7 = (nj.d) obj6;
                j71.c cVar = (j71.c) obj5;
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                k71.k.g((androidx.compose.foundation.layout.f0) obj, "$this$PrimaryPreferenceGroup");
                if (sVar4.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                    com.github.rudroid.settings.copilot.debug.t.b(dVar_r7.a, cVar, sVar4, 0);
                    androidx.compose.foundation.layout.b.g(sVar4, p2.f(oVar, ih.a.n));
                } else {
                    sVar4.V();
                }
                return a0Var;
            case 4:
                i3 i3Var = (i3) obj6;
                IssueTemplatesBottomSheet issueTemplatesBottomSheet = (IssueTemplatesBottomSheet) obj5;
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                k71.k.g((androidx.compose.foundation.layout.f0) obj, "$this$PrimaryBottomSheetContent");
                if (sVar5.S(intValue4 & 1, (intValue4 & 17) != 16)) {
                    g1 g1Var = (g1) i3Var.getValue();
                    boolean h3 = sVar5.h(issueTemplatesBottomSheet);
                    Object N4 = sVar5.N();
                    if (h3 || N4 == obj4) {
                        N4 = new com.github.rudroid.support.u(1, issueTemplatesBottomSheet);
                        sVar5.n0(N4);
                    }
                    com.github.rudroid.templates.ui.f.a(null, (j71.c) N4, g1Var, null, sVar5, 0);
                } else {
                    sVar5.V();
                }
                return a0Var;
            case 5:
                w2.a aVar6 = (TwoFactorDialog) obj5;
                f1 f1Var2 = (f1) obj6;
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                int i5 = TwoFactorDialog.B;
                k71.k.g((androidx.compose.foundation.layout.f0) obj, "$this$TextLoadingInputDialog");
                if (sVar6.S(intValue5 & 1, (intValue5 & 17) != 16)) {
                    fl.f fVar5 = (fl.f) f1Var2.getValue();
                    switch (TwoFactorDialog.j(fVar5).ordinal()) {
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            com.github.rudroid.twofactor.b bVar2 = (com.github.rudroid.twofactor.b) fVar5.b;
                            if (bVar2 != null && (aVar = bVar2.a) != null && (bVar = aVar.b) != null) {
                                str = aVar6.getContext().getString(2131954766, bVar.t, f1.e.g("@", bVar.u));
                                if (str != null) {
                                    sVar6.c0(1901642057);
                                    sVar6.q(false);
                                    break;
                                } else {
                                    sVar6.c0(1901642058);
                                    ub.b(str, (w1.r) null, ih.d.b(sVar6).t, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar6).d, sVar6, 0, 0, 131066);
                                    sVar6.q(false);
                                    break;
                                }
                            }
                            break;
                        case 0:
                        case 1:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            str = null;
                            if (str != null) {
                            }
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    sVar6.V();
                }
                return a0Var;
            case 6:
                f1 f1Var3 = (f1) obj6;
                f1 f1Var4 = (f1) obj5;
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                PullRequestsWidgetSettingsActivity.a aVar7 = PullRequestsWidgetSettingsActivity.Companion;
                k71.k.g((androidx.compose.foundation.layout.f0) obj, "$this$PrimaryDialog");
                if (sVar7.S(intValue6 & 1, (intValue6 & 17) != 16)) {
                    androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar7, 0);
                    int hashCode2 = Long.hashCode(sVar7.T);
                    v1 l2 = sVar7.l();
                    w1.r c2 = w1.a.c(sVar7, oVar);
                    v2.h.o.getClass();
                    v2.f fVar6 = v2.g.b;
                    sVar7.g0();
                    if (sVar7.S) {
                        sVar7.k(fVar6);
                    } else {
                        sVar7.q0();
                    }
                    androidx.compose.runtime.t.I(sVar7, v2.g.f, a2);
                    androidx.compose.runtime.t.I(sVar7, v2.g.e, l2);
                    androidx.compose.runtime.t.w(sVar7, Integer.valueOf(hashCode2), v2.g.g);
                    androidx.compose.runtime.t.E(sVar7, v2.g.h);
                    androidx.compose.runtime.t.I(sVar7, v2.g.d, c2);
                    sVar7.c0(1641503428);
                    for (PullsWidgetFilter pullsWidgetFilter : PullsWidgetFilter.getEntries()) {
                        boolean z5 = f1Var3.getValue() == pullsWidgetFilter;
                        w1.r f2 = f0.o.f(oVar, ih.d.b(sVar7).d, d2.a0Shadow.b);
                        String p0 = i4.p0(com.github.rudroid.widget.pullrequests.r.a(pullsWidgetFilter), sVar7);
                        String p02 = i4.p0(z5 ? 2131954108 : 2131953737, sVar7);
                        boolean f3 = sVar7.f(f1Var3) | sVar7.d(pullsWidgetFilter.ordinal()) | sVar7.f(f1Var4);
                        Object N5 = sVar7.N();
                        if (f3 || N5 == obj4) {
                            N5 = new com.github.rudroid.actions.workflowruns.ui.e(f1Var3, pullsWidgetFilter, f1Var4, 10);
                            sVar7.n0(N5);
                        }
                        o2.a(0, 0, sVar7, (j71.a) N5, p0, p02, f2, z5);
                    }
                    sVar7.q(false);
                    sVar7.q(true);
                } else {
                    sVar7.V();
                }
                return a0Var;
            case 7:
                ((Integer) obj3).getClass();
                k71.k.g((i6.g) obj, "$this$Column");
                com.github.rudroid.widget.pullrequests.u.b(z5.l.a, (PullRequestWidgetData) obj6, (m6.e) obj5, (androidx.compose.runtime.s) obj2, 6);
                return a0Var;
            case 8:
                StoredShortcutModel storedShortcutModel = (StoredShortcutModel) obj6;
                m6.e eVar3 = (m6.e) obj5;
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                k71.k.g((i6.q) obj, "$this$Row");
                int e2 = com.github.rudroid.shortcuts.r.e(storedShortcutModel.w);
                ShortcutColor shortcutColor = storedShortcutModel.v;
                int[] iArr = a0.a.c;
                switch (iArr[shortcutColor.ordinal()]) {
                    case 1:
                        aVar2 = new h6.a(kh.d.u, kh.cShadow.l);
                        break;
                    case 2:
                        aVar2 = new h6.a(kh.d.J, kh.cShadow.J);
                        break;
                    case 3:
                        aVar2 = new h6.a(kh.d.A, kh.cShadow.z);
                        break;
                    case 4:
                        aVar2 = new h6.a(kh.d.b0, kh.cShadow.e0);
                        break;
                    case 5:
                        aVar2 = new h6.a(kh.d.d, kh.cShadow.a);
                        break;
                    case 6:
                        aVar2 = new h6.a(kh.d.X, kh.cShadow.a0);
                        break;
                    case 7:
                        aVar2 = new h6.a(kh.d.U, kh.cShadow.V);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                switch (iArr[shortcutColor.ordinal()]) {
                    case 1:
                        aVar3 = new h6.a(kh.d.h, kh.cShadow.u);
                        break;
                    case 2:
                        aVar3 = new h6.a(kh.d.D, kh.cShadow.P);
                        break;
                    case 3:
                        aVar3 = new h6.a(kh.d.w, kh.cShadow.F);
                        break;
                    case 4:
                        aVar3 = new h6.a(kh.d.Y, kh.cShadow.i0);
                        break;
                    case 5:
                        aVar3 = new h6.a(kh.d.a, kh.cShadow.e);
                        break;
                    case 6:
                        aVar3 = new h6.a(kh.d.V, kh.cShadow.c0);
                        break;
                    case 7:
                        aVar3 = new h6.a(kh.d.O, kh.cShadow.Z);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                sy.rShadow.a(new z5.a(e2), i21.a.C(k41.b.M(ih.a.N).d(new z5.c(aVar3)).d(new b6.w(new n6.b(2))), 4), 0, new z5.d(new z5.q(aVar2)), sVar8, 32816, 8);
                m7.y.f(k41.b.c0(ih.a.l), sVar8, 0);
                m71.a.d(storedShortcutModel.t, (z5.n) null, eVar3, 1, sVar8, 3072, 2);
                return a0Var;
            case 9:
                j71.a aVar8 = (j71.a) obj6;
                j71.c cVar2 = (j71.c) obj5;
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                sVar9.c0(759876635);
                Object N6 = sVar9.N();
                if (N6 == obj4) {
                    N6 = androidx.compose.runtime.t.s(aVar8);
                    sVar9.n0(N6);
                }
                i3 i3Var2 = (i3) N6;
                Object N7 = sVar9.N();
                if (N7 == obj4) {
                    N7 = new a0.e(new c2.b(((c2.b) i3Var2.getValue()).a), d1.z0.b, new c2.b(d1.z0.c), 8);
                    sVar9.n0(N7);
                }
                a0.e eVar4 = (a0.e) N7;
                boolean h4 = sVar9.h(eVar4);
                Object N8 = sVar9.N();
                if (h4 || N8 == obj4) {
                    N8 = new a61.o(i3Var2, eVar4, (a71.c) null, 8);
                    sVar9.n0(N8);
                }
                androidx.compose.runtime.t.f(sVar9, (j71.e) N8, a0Var);
                a0.p pVar = eVar4.c;
                boolean f4 = sVar9.f(pVar);
                Object N9 = sVar9.N();
                if (f4 || N9 == obj4) {
                    z = false;
                    N9 = new x0(pVar, 0);
                    sVar9.n0(N9);
                } else {
                    z = false;
                }
                w1.r rVar = (w1.r) cVar2.k((j71.a) N9);
                sVar9.q(z);
                return rVar;
            case 10:
                u4.b bVar3 = (u4.b) obj6;
                j71.a aVar9 = (j71.a) obj5;
                m2 m2Var = (m2) obj;
                androidx.compose.runtime.s sVar10 = (androidx.compose.runtime.s) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                k71.k.g(m2Var, "$this$CopilotBannerContainer");
                if ((intValue7 & 6) == 0) {
                    intValue7 |= sVar10.f(m2Var) ? 4 : 2;
                }
                if (sVar10.S(intValue7 & 1, (intValue7 & 19) != 18)) {
                    String q02 = i4.q0(2131952148, new Object[]{Integer.valueOf((int) bVar3.a)}, sVar10);
                    w1.r a3 = m2Var.a(oVar, 1.0f, true);
                    androidx.compose.foundation.layout.e0 a4 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar10, 0);
                    int hashCode3 = Long.hashCode(sVar10.T);
                    v1 l3 = sVar10.l();
                    w1.r c3 = w1.a.c(sVar10, a3);
                    v2.h.o.getClass();
                    v2.f fVar7 = v2.g.b;
                    sVar10.g0();
                    if (sVar10.S) {
                        sVar10.k(fVar7);
                    } else {
                        sVar10.q0();
                    }
                    androidx.compose.runtime.t.I(sVar10, v2.g.f, a4);
                    androidx.compose.runtime.t.I(sVar10, v2.g.e, l3);
                    androidx.compose.runtime.t.w(sVar10, Integer.valueOf(hashCode3), v2.g.g);
                    androidx.compose.runtime.t.E(sVar10, v2.g.h);
                    androidx.compose.runtime.t.I(sVar10, v2.g.d, c3);
                    dc.j.a((w1.r) null, (g3.g) null, new g3.g(q02), sVar10, 48, 1);
                    if (bVar3.b) {
                        sVar10.c0(2048593624);
                        androidx.compose.foundation.layout.b.g(sVar10, p2.f(oVar, 16));
                        ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(2007941390, new q1(6, aVar9), sVar10), sVar10, 805306374, 510);
                        z2 = false;
                    } else {
                        z2 = false;
                        sVar10.c0(2046968449);
                    }
                    sVar10.q(z2);
                    sVar10.q(true);
                } else {
                    sVar10.V();
                }
                return a0Var;
            case 11:
                u4.c cVar3 = (u4.c) obj6;
                j71.a aVar10 = (j71.a) obj5;
                androidx.compose.runtime.s sVar11 = (androidx.compose.runtime.s) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$CopilotBannerContainer");
                if (sVar11.S(intValue8 & 1, (intValue8 & 17) != 16)) {
                    androidx.compose.foundation.layout.e0 a5 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar11, 0);
                    int hashCode4 = Long.hashCode(sVar11.T);
                    v1 l4 = sVar11.l();
                    w1.r c4 = w1.a.c(sVar11, oVar);
                    v2.h.o.getClass();
                    v2.f fVar8 = v2.g.b;
                    sVar11.g0();
                    if (sVar11.S) {
                        sVar11.k(fVar8);
                    } else {
                        sVar11.q0();
                    }
                    androidx.compose.runtime.t.I(sVar11, v2.g.f, a5);
                    androidx.compose.runtime.t.I(sVar11, v2.g.e, l4);
                    androidx.compose.runtime.t.w(sVar11, Integer.valueOf(hashCode4), v2.g.g);
                    androidx.compose.runtime.t.E(sVar11, v2.g.h);
                    androidx.compose.runtime.t.I(sVar11, v2.g.d, c4);
                    String str3 = cVar3.a;
                    String str4 = str3 != null ? str3.toString() : null;
                    g3.g gVar5 = new g3.g(i4.p0(2131952063, sVar11));
                    if (str4 == null) {
                        sVar11.c0(-780594851);
                        sVar11.q(false);
                        gVar = null;
                    } else {
                        sVar11.c0(-780594850);
                        g3.g gVar6 = new g3.g(i4.q0(2131952062, new Object[]{str4}, sVar11));
                        sVar11.q(false);
                        gVar = gVar6;
                    }
                    dc.j.a((w1.r) null, gVar5, gVar, sVar11, 0, 1);
                    if (cVar3.b) {
                        sVar11.c0(-780231933);
                        androidx.compose.foundation.layout.b.g(sVar11, p2.f(oVar, 16));
                        ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(2075913636, new q1(7, aVar10), sVar11), sVar11, 805306374, 510);
                        z3 = false;
                    } else {
                        z3 = false;
                        sVar11.c0(-782018959);
                    }
                    sVar11.q(z3);
                    sVar11.q(true);
                } else {
                    sVar11.V();
                }
                return a0Var;
            case 12:
                u4.a aVar11 = (u4.a) obj6;
                j71.e eVar5 = (j71.e) obj5;
                androidx.compose.runtime.s sVar12 = (androidx.compose.runtime.s) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$CopilotBannerContainer");
                if (!sVar12.S(intValue9 & 1, (intValue9 & 17) != 16)) {
                    sVar12.V();
                    return a0Var;
                }
                androidx.compose.foundation.layout.e0 a6 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar12, 0);
                int hashCode5 = Long.hashCode(sVar12.T);
                v1 l5 = sVar12.l();
                w1.r c5 = w1.a.c(sVar12, oVar);
                v2.h.o.getClass();
                v2.f fVar9 = v2.g.b;
                sVar12.g0();
                if (sVar12.S) {
                    sVar12.k(fVar9);
                } else {
                    sVar12.q0();
                }
                v2.eShadow eVar6 = v2.g.f;
                androidx.compose.runtime.t.I(sVar12, eVar6, a6);
                v2.eShadow eVar7 = v2.g.e;
                androidx.compose.runtime.t.I(sVar12, eVar7, l5);
                Integer valueOf = Integer.valueOf(hashCode5);
                v2.eShadow eVar8 = v2.g.g;
                androidx.compose.runtime.t.w(sVar12, valueOf, eVar8);
                v2.d dVar2 = v2.g.h;
                androidx.compose.runtime.t.E(sVar12, dVar2);
                v2.eShadow eVar9 = v2.g.d;
                androidx.compose.runtime.t.I(sVar12, eVar9, c5);
                ub.b(i4.q0(2131952139, new Object[]{aVar11.b.getName()}, sVar12), (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar12).n, sVar12, 0, 0, 131070);
                androidx.compose.foundation.layout.b.g(sVar12, p2.f(oVar, 4));
                ch.h c6 = ih.d.c(sVar12);
                ih.e.a(false, null, null, null, null, new ch.h(ih.d.f(sVar12).m, c6.b, c6.c, c6.d, c6.e, c6.f, c6.g, c6.h, c6.i, c6.j), null, null, null, r1.i.d(-422434924, new com.github.rudroid.issueorpullrequest.mergebox.ui.e0(17, aVar11), sVar12), sVar12, 805306368, 479);
                androidx.compose.foundation.layout.b.g(sVar12, p2.f(oVar, 16));
                androidx.compose.foundation.layout.l2 a7 = j2.a(androidx.compose.foundation.layout.l.a, w1.c.A, sVar12, 0);
                int hashCode6 = Long.hashCode(sVar12.T);
                v1 l6 = sVar12.l();
                w1.r c7 = w1.a.c(sVar12, oVar);
                sVar12.g0();
                if (sVar12.S) {
                    sVar12.k(fVar9);
                } else {
                    sVar12.q0();
                }
                androidx.compose.runtime.t.I(sVar12, eVar6, a7);
                androidx.compose.runtime.t.I(sVar12, eVar7, l6);
                f1.e.t(hashCode6, sVar12, eVar8, sVar12, dVar2);
                androidx.compose.runtime.t.I(sVar12, eVar9, c7);
                ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1500156208, new com.github.rudroid.settings.copilot.debug.q((Object) aVar11, (Object) eVar5, false, 22), sVar12), sVar12, 805306374, 510);
                androidx.compose.foundation.layout.b.g(sVar12, p2.s(oVar, ih.a.l));
                String p03 = i4.p0(2131951840, sVar12);
                f2 f2Var = p0.a;
                o0 e3 = p0.e(d2.t.j, ih.d.b(sVar12).s, ih.d.b(sVar12).H, sVar12, 4);
                boolean f5 = sVar12.f(eVar5) | sVar12.h(aVar11);
                Object N10 = sVar12.N();
                if (f5 || N10 == obj4) {
                    N10 = new dc.m(eVar5, aVar11, 0);
                    sVar12.n0(N10);
                }
                n0.a(null, p03, false, (j71.a) N10, e3, null, sVar12, 196608, 5);
                sVar12.q(true);
                sVar12.q(true);
                return a0Var;
            case 13:
                u4.d dVar3 = (u4.d) obj6;
                j71.a aVar12 = (j71.a) obj5;
                m2 m2Var2 = (m2) obj;
                androidx.compose.runtime.s sVar13 = (androidx.compose.runtime.s) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                k71.k.g(m2Var2, "$this$CopilotBannerContainer");
                if ((intValue10 & 6) == 0) {
                    intValue10 |= sVar13.f(m2Var2) ? 4 : 2;
                }
                if (sVar13.S(intValue10 & 1, (intValue10 & 19) != 18)) {
                    boolean z6 = dVar3.b;
                    double d = dVar3.a;
                    if (z6) {
                        sVar13.c0(1960277731);
                        str2 = i4.q0(2131952148, new Object[]{Integer.valueOf((int) d)}, sVar13);
                        sVar13.q(false);
                    } else {
                        sVar13.c0(1960457531);
                        sVar13.q(false);
                        str2 = null;
                    }
                    if (dVar3.b) {
                        q0 = m0.d(sVar13, 1960544362, 2131952149, sVar13, false);
                    } else {
                        sVar13.c0(1960691395);
                        q0 = i4.q0(2131952148, new Object[]{Integer.valueOf((int) d)}, sVar13);
                        sVar13.q(false);
                    }
                    w1.r a8 = m2Var2.a(oVar, 1.0f, true);
                    androidx.compose.foundation.layout.e0 a9 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar13, 0);
                    int hashCode7 = Long.hashCode(sVar13.T);
                    v1 l7 = sVar13.l();
                    w1.r c8 = w1.a.c(sVar13, a8);
                    v2.h.o.getClass();
                    v2.f fVar10 = v2.g.b;
                    sVar13.g0();
                    if (sVar13.S) {
                        sVar13.k(fVar10);
                    } else {
                        sVar13.q0();
                    }
                    androidx.compose.runtime.t.I(sVar13, v2.g.f, a9);
                    androidx.compose.runtime.t.I(sVar13, v2.g.e, l7);
                    androidx.compose.runtime.t.w(sVar13, Integer.valueOf(hashCode7), v2.g.g);
                    androidx.compose.runtime.t.E(sVar13, v2.g.h);
                    androidx.compose.runtime.t.I(sVar13, v2.g.d, c8);
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder(16);
                        new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        new ArrayList();
                        sb.append(str2);
                        String sb2 = sb.toString();
                        ArrayList arrayList3 = new ArrayList(arrayList2.size());
                        int size2 = arrayList2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            arrayList3.add(((g3.c) arrayList2.get(i6)).a(sb.length()));
                        }
                        gVar2 = new g3.g(sb2, arrayList3);
                    } else {
                        gVar2 = null;
                    }
                    StringBuilder sb3 = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    new ArrayList();
                    sb3.append(q0);
                    String sb4 = sb3.toString();
                    ArrayList arrayList5 = new ArrayList(arrayList4.size());
                    int size3 = arrayList4.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        arrayList5.add(((g3.c) arrayList4.get(i7)).a(sb3.length()));
                    }
                    dc.j.a((w1.r) null, gVar2, new g3.g(sb4, arrayList5), sVar13, 0, 1);
                    if (dVar3.c) {
                        sVar13.c0(1333327992);
                        androidx.compose.foundation.layout.b.g(sVar13, p2.f(oVar, 16));
                        ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(-1334086482, new q1(8, aVar12), sVar13), sVar13, 805306374, 510);
                        z4 = false;
                    } else {
                        z4 = false;
                        sVar13.c0(1331067937);
                    }
                    sVar13.q(z4);
                    sVar13.q(true);
                } else {
                    sVar13.V();
                }
                return a0Var;
            case 14:
                xn.e1 e1Var = (xn.e1) obj6;
                String str5 = (String) obj5;
                androidx.compose.runtime.s sVar14 = (androidx.compose.runtime.s) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                k71.k.g((androidx.compose.foundation.layout.f0) obj, "$this$BaseActionDialog");
                if (sVar14.S(intValue11 & 1, (intValue11 & 17) != 16)) {
                    ub.b(i4.q0(2131952487, new Object[]{fg.h.a(e1Var, (Context) sVar14.j(w2.j0.b)), str5}, sVar14), androidx.compose.foundation.layout.b.z(oVar, ih.a.n, 0.0f, 2), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar14).d, ih.d.b(sVar14).s, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar14, 0, 0, 131068);
                } else {
                    sVar14.V();
                }
                return a0Var;
            case 15:
                return c(obj, obj2, obj3);
            case 16:
                return g(obj, obj2, obj3);
            case 17:
                return h(obj, obj2, obj3);
            case 18:
                return i(obj, obj2, obj3);
            case 19:
                return l(obj, obj2, obj3);
            case 20:
                return m(obj, obj2, obj3);
            case 21:
                return p(obj, obj2, obj3);
            case 22:
                return q(obj, obj2, obj3);
            case 23:
                return r(obj, obj2, obj3);
            case 24:
                return u(obj, obj2, obj3);
            case 25:
                return v(obj, obj2, obj3);
            default:
                j71.e eVar10 = (j71.e) obj6;
                j71.e eVar11 = (j71.e) obj5;
                androidx.compose.runtime.s sVar15 = (androidx.compose.runtime.s) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                k71.k.g((androidx.compose.foundation.layout.x) obj, "$this$ListItemScaffold");
                if (sVar15.S(intValue12 & 1, (intValue12 & 17) != 16)) {
                    androidx.compose.foundation.layout.e0 a11 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar15, 0);
                    int hashCode8 = Long.hashCode(sVar15.T);
                    v1 l8 = sVar15.l();
                    w1.r c9 = w1.a.c(sVar15, oVar);
                    v2.h.o.getClass();
                    v2.f fVar11 = v2.g.b;
                    sVar15.g0();
                    if (sVar15.S) {
                        sVar15.k(fVar11);
                    } else {
                        sVar15.q0();
                    }
                    androidx.compose.runtime.t.I(sVar15, v2.g.f, a11);
                    androidx.compose.runtime.t.I(sVar15, v2.g.e, l8);
                    androidx.compose.runtime.t.w(sVar15, Integer.valueOf(hashCode8), v2.g.g);
                    androidx.compose.runtime.t.E(sVar15, v2.g.h);
                    androidx.compose.runtime.t.I(sVar15, v2.g.d, c9);
                    ub.a(q0.a(ih.d.f(sVar15).n, ih.d.b(sVar15).s, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), r1.i.d(307520045, new k1(5, eVar11), sVar15), sVar15, 48);
                    if (eVar10 == null) {
                        sVar15.c0(-192577445);
                    } else {
                        sVar15.c0(1794903142);
                        eVar10.s(sVar15, 0);
                    }
                    sVar15.q(false);
                    sVar15.q(true);
                } else {
                    sVar15.V();
                }
                return a0Var;
        }
    }

    public /* synthetic */ g(TwoFactorDialog twoFactorDialog, f1 f1Var) {
        this.r = 5;
        this.t = twoFactorDialog;
        this.s = f1Var;
    }















    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ReRunJobBottomSheet {
        public ReRunJobBottomSheet() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class b {
        public b() {
        }
    }
}
