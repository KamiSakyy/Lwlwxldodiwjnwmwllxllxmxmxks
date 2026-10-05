package com.github.rudroid.support;

import aa.t0;
import aa.u0;
import ad.a;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.a1;
import androidx.lifecycle.p0;
import com.github.rudroid.activities.m0;
import com.github.rudroid.interfaces.s0;
import com.github.rudroid.templates.IssueTemplatesBottomSheet;
import com.github.rudroid.uitoolkit.menu.d;
import com.github.rudroid.utilities.ui.ComposeDatePickerDialogFragment;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.viewmodels.f1;
import com.github.rudroid.widget.agenttasks.AgentTasksWidgetSettingsActivity;
import com.github.rudroid.widget.contribution.ContributionWidgetSettingsActivity;
import com.github.rudroid.widget.pullrequests.PullRequestsWidgetSettingsActivity;
import com.github.service.models.ApiFailure;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutScope;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.google.android.gms.measurement.internal.x3;
import d1.e0;
import d2.g0;
import d2.h0;
import d2.i0;
import d2.r0;
import d3.c0;
import f1.d5;
import f1.gc;
import f1.k6;
import f1.q8;
import f1.r8;
import f1.s5;
import f1.u6;
import f1.z9;
import fp.y0;
import g3.n0;
import h0.c3;
import java.util.ArrayList;
import java.util.List;
import k81.q1;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l7.x1;
import m10.t7;
import s0.q0;
import y41.t1;
import y71.y1;
import yz0.g5;
import yz0.h5;
import yz0.j5;
import yz0.k5;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class u implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ u(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x08fe  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List, x61.r] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.github.rudroid.searchandfilter.complexfilter.i0] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        String str;
        String str2;
        int i;
        d2.l lVar;
        boolean z;
        d2.g f;
        d2.r a;
        f2.b bVar;
        a5.s sVar;
        float f2;
        float f3;
        long u;
        float intBitsToFloat;
        Bitmap bitmap;
        int i2 = this.r;
        List list = x61.r.r;
        w61.a0 a0Var = w61.a0.a;
        Object obj2 = this.s;
        switch (i2) {
            case 0:
                s sVar2 = (s) obj2;
                ApiFailure apiFailure = (ApiFailure) obj;
                y1 y1Var = sVar2.u;
                g1.a aVar = g1.Companion;
                h hVar = (h) ((g1) y1Var.getValue()).getData();
                if (hVar == null) {
                    h.Companion.getClass();
                    hVar = h.f;
                }
                fl.b e = com.google.common.util.concurrent.a.e(apiFailure, sVar2.s.d());
                aVar.getClass();
                y1Var.k((Object) null, g1.a.b(e, hVar));
                return a0Var;
            case 1:
                IssueTemplatesBottomSheet issueTemplatesBottomSheet = (IssueTemplatesBottomSheet) obj2;
                j5 j5Var = (k5) obj;
                k71.k.g(j5Var, "it");
                a1 A3 = issueTemplatesBottomSheet.A3();
                com.github.rudroid.templates.u uVar = (com.github.rudroid.templates.u) ((g1) issueTemplatesBottomSheet.I4().v.r.getValue()).getData();
                String str3 = uVar != null ? uVar.b : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = issueTemplatesBottomSheet.I4().w;
                String str5 = issueTemplatesBottomSheet.I4().x;
                String str6 = issueTemplatesBottomSheet.I4().y;
                boolean z2 = j5Var instanceof j5;
                String str7 = z2 ? j5Var.u : null;
                String str8 = z2 ? j5Var.v : null;
                if (z2) {
                    str2 = j5Var.s;
                } else if (j5Var instanceof g5) {
                    str2 = ((g5) j5Var).s;
                } else {
                    if (!(j5Var instanceof h5)) {
                        str = null;
                        List list2 = !z2 ? j5Var.x : list;
                        if (z2) {
                            list = j5Var.y;
                        }
                        A3.h0("ISSUE_TEMPLATES_RESULT", sy.n.d(new w61.k("RESULT_CREATE_ISSUE_DATA", new fc.a(str3, str4, str5, str6, str7, str8, (Uri) null, str, list2, list, !z2 ? j5Var.z : null, 64))));
                        issueTemplatesBottomSheet.s4();
                        return a0Var;
                    }
                    str2 = ((h5) j5Var).s;
                }
                str = str2;
                if (!z2) {
                }
                if (z2) {
                }
                A3.h0("ISSUE_TEMPLATES_RESULT", sy.n.d(new w61.k("RESULT_CREATE_ISSUE_DATA", new fc.a(str3, str4, str5, str6, str7, str8, (Uri) null, str, list2, list, !z2 ? j5Var.z : null, 64))));
                issueTemplatesBottomSheet.s4();
                return a0Var;
            case 2:
                s5.b bVar2 = (s5.b) obj;
                k71.k.g(bVar2, "it");
                ((com.github.rudroid.twofactor.missed.d) obj2).b.getClass();
                Long l = (Long) bVar2.d(com.github.rudroid.twofactor.missed.l.a);
                Boolean bool = (Boolean) bVar2.d(com.github.rudroid.twofactor.missed.l.b);
                return new com.github.rudroid.twofactor.missed.m(l, bool != null ? bool.booleanValue() : false);
            case 3:
                c0 c0Var = (c0) obj;
                k71.k.g(c0Var, "$this$clearAndSetSemantics");
                d3.z.g(c0Var, ((d.c) obj2).j);
                return a0Var;
            case 4:
                w1.r rVar = (w1.r) obj;
                k71.k.g(rVar, "$this$applyIf");
                return b2.d.k(rVar, (b2.a0) obj2);
            case 5:
                ComposeDatePickerDialogFragment composeDatePickerDialogFragment = (ComposeDatePickerDialogFragment) obj2;
                Long l2 = (Long) obj;
                if (l2 != null) {
                    long longValue = l2.longValue();
                    j71.c cVar = composeDatePickerDialogFragment.J0;
                    if (cVar != null) {
                        cVar.k(Long.valueOf(longValue));
                    }
                }
                composeDatePickerDialogFragment.t4(false, false);
                return a0Var;
            case 6:
                com.github.rudroid.utilities.viewmodel.paging.model.j jVar = (com.github.rudroid.utilities.viewmodel.paging.model.j) obj2;
                fl.b bVar3 = (fl.b) obj;
                k71.k.g(bVar3, "it");
                y71.g1 g1Var = jVar.w;
                com.github.rudroid.utilities.viewmodel.paging.model.o oVar = (com.github.rudroid.utilities.viewmodel.paging.model.o) ((g1) g1Var.getValue()).getData();
                List list3 = oVar != null ? oVar.a : null;
                boolean z3 = list3 == null || list3.isEmpty();
                jVar.getClass();
                k71.k.g(g1Var, "<this>");
                k71.k.g(bVar3, "executionError");
                jVar.v.a(g1Var, bVar3, z3);
                return a0Var;
            case 7:
                com.github.rudroid.utilities.viewmodel.paging.model.o oVar2 = (com.github.rudroid.utilities.viewmodel.paging.model.o) obj;
                ArrayList c = ((com.github.rudroid.utilities.viewmodel.paging.model.p) obj2).s.c(oVar2.a, list);
                ArrayList arrayList = new ArrayList(x61.n.F(c, 10));
                int size = c.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = c.get(i3);
                    i3++;
                    w61.k kVar = (w61.k) obj3;
                    arrayList.add(new com.github.rudroid.utilities.viewmodel.paging.model.x(kVar.r, ((Boolean) kVar.s).booleanValue()));
                }
                return new com.github.rudroid.utilities.viewmodel.paging.model.o(arrayList, oVar2.b);
            case 8:
                y1 y1Var2 = ((com.github.rudroid.viewmodels.g) obj2).u;
                fl.e eVar = fl.f.Companion;
                Boolean bool2 = Boolean.FALSE;
                eVar.getClass();
                fl.f a2 = fl.e.a((fl.b) obj, bool2);
                y1Var2.getClass();
                y1Var2.k((Object) null, a2);
                return a0Var;
            case 9:
                com.github.rudroid.viewmodels.g1 g1Var2 = (com.github.rudroid.viewmodels.g1) obj2;
                fl.b bVar4 = (fl.b) obj;
                if (f1.a.a[bVar4.a.ordinal()] != 1) {
                    p0 p0Var = g1Var2.x;
                    fl.e eVar2 = fl.f.Companion;
                    fl.f fVar = (fl.f) p0Var.d();
                    List list4 = fVar != null ? (List) fVar.b : null;
                    eVar2.getClass();
                    p0Var.k(fl.e.a(bVar4, list4));
                }
                return a0Var;
            case 10:
                com.github.rudroid.webview.viewholders.a aVar2 = (com.github.rudroid.webview.viewholders.a) obj2;
                String str9 = (String) obj;
                int i4 = com.github.rudroid.webview.viewholders.a.A;
                k71.k.g(str9, "suggestionId");
                View view = ((com.github.rudroid.adapters.viewholders.e) aVar2).u.A;
                k71.k.f(view, "getRoot(...)");
                rc.d.a(view);
                s0 s0Var = aVar2.x;
                a.d dVar = aVar2.y;
                if (dVar != null) {
                    s0Var.p(dVar.t, dVar.u, dVar.s, dVar.B, str9);
                    return a0Var;
                }
                k71.k.m("diffLineWebViewItem");
                throw null;
            case 11:
                com.github.rudroid.widget.agenttasks.model.b bVar5 = (com.github.rudroid.widget.agenttasks.model.b) obj2;
                d6.h hVar2 = (d6.h) obj;
                k71.k.g(hVar2, "$this$LazyColumn");
                List list5 = bVar5.b;
                hVar2.b(list5.size(), new com.github.rudroid.widget.agenttasks.p(list5), new r1.d(new com.github.rudroid.widget.agenttasks.q(list5, bVar5), true, 329696715));
                return a0Var;
            case 12:
                m0 m0Var = (AgentTasksWidgetSettingsActivity) obj2;
                int i5 = AgentTasksWidgetSettingsActivity.l0;
                m0Var.setResult(-1);
                m0Var.finish();
                return a0Var;
            case 13:
                m0 m0Var2 = (ContributionWidgetSettingsActivity) obj2;
                ContributionWidgetSettingsActivity.a aVar3 = ContributionWidgetSettingsActivity.Companion;
                m0Var2.setResult(-1);
                m0Var2.finish();
                return a0Var;
            case 14:
                m0 m0Var3 = (PullRequestsWidgetSettingsActivity) obj2;
                PullRequestsWidgetSettingsActivity.a aVar4 = PullRequestsWidgetSettingsActivity.Companion;
                m0Var3.setResult(-1);
                m0Var3.finish();
                return a0Var;
            case 15:
                q2.u uVar2 = (q2.u) obj;
                if (((d1.k) obj2).e(uVar2.c)) {
                    uVar2.a();
                }
                return a0Var;
            case 16:
                ((e81.c) obj2).f((Object) null);
                return a0Var;
            case 17:
                ek.d dVar2 = (ek.d) obj2;
                v7.a aVar5 = (v7.a) obj;
                k71.k.g(aVar5, "_connection");
                v7.c F0 = aVar5.F0("SELECT * FROM shortcuts");
                try {
                    int o = y9.a.o(F0, "id");
                    int o2 = y9.a.o(F0, "name");
                    int o3 = y9.a.o(F0, "full_query_string");
                    int o4 = y9.a.o(F0, "query");
                    int o5 = y9.a.o(F0, "scope");
                    int o6 = y9.a.o(F0, "type");
                    int o7 = y9.a.o(F0, "color");
                    int o8 = y9.a.o(F0, "icon");
                    ArrayList arrayList2 = new ArrayList();
                    while (F0.B0()) {
                        String l0 = F0.l0(o);
                        String l02 = F0.l0(o2);
                        String l03 = F0.l0(o3);
                        String l04 = F0.l0(o4);
                        x1 x1Var = dVar2.c;
                        x1Var.getClass();
                        k71.k.g(l04, "value");
                        ((fk.c) ((w61.p) x1Var.r).getValue()).getClass();
                        ArrayList a3 = fk.c.a(l04);
                        ArrayList arrayList3 = a3 == null ? list : a3;
                        String l05 = F0.l0(o5);
                        dVar2.d.getClass();
                        k71.k.g(l05, "value");
                        ShortcutScope.Companion companion = com.github.service.models.response.shortcuts.a.Companion;
                        companion.getClass();
                        l81.b bVar6 = l81.c.d;
                        bVar6.getClass();
                        com.github.service.models.response.shortcuts.a aVar6 = (com.github.service.models.response.shortcuts.a) bVar6.a(l05, companion.serializer());
                        String l06 = F0.l0(o6);
                        dVar2.e.getClass();
                        ShortcutType g = u31.f.g(l06);
                        String l07 = F0.l0(o7);
                        dVar2.f.getClass();
                        ShortcutColor a4 = m90.c.a(l07);
                        String l08 = F0.l0(o8);
                        dVar2.g.getClass();
                        arrayList2.add(new ek.e(a4, n51.e.e(l08), aVar6, g, l0, l02, l03, arrayList3));
                    }
                    return arrayList2;
                } finally {
                    F0.close();
                }
            case 18:
                f0.t tVar = (f0.t) obj2;
                a2.e eVar3 = (a2.e) obj;
                if (eVar3.b() * tVar.I < 0.0f || c2.e.d(eVar3.r.a()) <= 0.0f) {
                    return eVar3.c(new ef.b(11));
                }
                float f4 = 2;
                float min = Math.min(s3.f.b(tVar.I, 0.0f) ? 1.0f : (float) Math.ceil(eVar3.b() * tVar.I), (float) Math.ceil(c2.e.d(eVar3.r.a()) / f4));
                float f5 = min / f4;
                long floatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (eVar3.r.a() >> 32)) - min) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (eVar3.r.a() & 4294967295L)) - min) & 4294967295L);
                float f6 = min * f4;
                boolean z4 = f6 > c2.e.d(eVar3.r.a());
                g0 a5 = tVar.K.a(eVar3.r.a(), eVar3.r.getLayoutDirection(), eVar3);
                if (!(a5 instanceof g0)) {
                    if (!(a5 instanceof i0)) {
                        boolean z5 = z4;
                        if (!(a5 instanceof h0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d2.p pVar = tVar.J;
                        if (z5) {
                            floatToRawIntBits = 0;
                        }
                        long j = floatToRawIntBits;
                        if (z5) {
                            floatToRawIntBits2 = eVar3.r.a();
                        }
                        return eVar3.c(new com.github.rudroid.repository.fork.ui.l(pVar, j, floatToRawIntBits2, z5 ? f2.g.a : new f2.h(min, 0.0f, 0, 0, 30), 1));
                    }
                    d2.p pVar2 = tVar.J;
                    c2.d dVar3 = ((i0) a5).f;
                    if (y9.a.u(dVar3)) {
                        return eVar3.c(new f0.r(z4, pVar2, dVar3.e, f5, min, floatToRawIntBits, floatToRawIntBits2, new f2.h(min, 0.0f, 0, 0, 30)));
                    }
                    boolean z6 = z4;
                    if (tVar.H == null) {
                        tVar.H = new f0.q();
                    }
                    f0.q qVar = tVar.H;
                    k71.k.d(qVar);
                    d2.i iVar = qVar.d;
                    if (iVar == null) {
                        iVar = d2.k.a();
                        qVar.d = iVar;
                    }
                    iVar.g();
                    d2.i.c(iVar, dVar3);
                    if (!z6) {
                        d2.i a6 = d2.k.a();
                        d2.i.c(a6, new c2.d(min, min, dVar3.b() - min, dVar3.a() - min, f0.o.y(min, dVar3.e), f0.o.y(min, dVar3.f), f0.o.y(min, dVar3.g), f0.o.y(min, dVar3.h)));
                        iVar.f(iVar, a6, 0);
                    }
                    return eVar3.c(new e0(20, iVar, pVar2));
                }
                r0 r0Var = tVar.J;
                g0 g0Var = a5;
                d2.i iVar2 = g0Var.f;
                if (z4) {
                    return eVar3.c(new e0(21, g0Var, r0Var));
                }
                if (r0Var instanceof r0) {
                    lVar = new d2.l(5, d2.t.b(1.0f, r0Var.a));
                    i = 1;
                } else {
                    i = 0;
                    lVar = null;
                }
                c2.c d = iVar2.d();
                float f7 = d.b;
                float f8 = d.a;
                if (tVar.H == null) {
                    tVar.H = new f0.q();
                }
                f0.q qVar2 = tVar.H;
                k71.k.d(qVar2);
                d2.i iVar3 = qVar2.d;
                if (iVar3 == null) {
                    iVar3 = d2.k.a();
                    qVar2.d = iVar3;
                }
                iVar3.g();
                d2.i.b(iVar3, d);
                iVar3.f(iVar3, iVar2, 0);
                k71.w wVar = new k71.w();
                d2.i iVar4 = iVar3;
                long ceil = (((int) Math.ceil(d.c - f8)) << 32) | (((int) Math.ceil(d.d - f7)) & 4294967295L);
                f0.q qVar3 = tVar.H;
                k71.k.d(qVar3);
                d2.g gVar = qVar3.a;
                d2.r rVar2 = qVar3.b;
                d2.c0 c0Var2 = gVar != null ? new d2.c0(gVar.a()) : null;
                try {
                    try {
                        if (c0Var2 == null || c0Var2.a != 0) {
                            d2.c0 c0Var3 = gVar != null ? new d2.c0(gVar.a()) : null;
                            if (c0Var3 == null || i != c0Var3.a) {
                                z = false;
                                if (gVar != null && rVar2 != null) {
                                    intBitsToFloat = Float.intBitsToFloat((int) (eVar3.r.a() >> 32));
                                    bitmap = gVar.a;
                                    if (intBitsToFloat <= bitmap.getWidth() && Float.intBitsToFloat((int) (eVar3.r.a() & 4294967295L)) <= bitmap.getHeight() && z) {
                                        f = gVar;
                                        a = rVar2;
                                        bVar = qVar3.c;
                                        if (bVar == null) {
                                            bVar = new f2.b();
                                            qVar3.c = bVar;
                                        }
                                        sVar = bVar.s;
                                        f2.a aVar7 = bVar.r;
                                        long I = w8.s.I(ceil);
                                        s3.m layoutDirection = eVar3.r.getLayoutDirection();
                                        s3.c cVar2 = aVar7.a;
                                        f2.b bVar7 = bVar;
                                        s3.m mVar = aVar7.b;
                                        d2.r rVar3 = aVar7.c;
                                        long j2 = aVar7.d;
                                        aVar7.a = eVar3;
                                        aVar7.b = layoutDirection;
                                        aVar7.c = a;
                                        aVar7.d = I;
                                        a.f();
                                        f2.d.z0(bVar7, d2.t.b, 0L, I, 0.0f, 58);
                                        f2 = -f8;
                                        f3 = -f7;
                                        ((x3) sVar.t).u(f2, f3);
                                        f2.d.d0(bVar7, g0Var.f, r0Var, 0.0f, new f2.h(f6, 0.0f, 0, 0, 30), 52);
                                        float f9 = 1;
                                        float intBitsToFloat2 = (Float.intBitsToFloat((int) (bVar7.a() >> 32)) + f9) / Float.intBitsToFloat((int) (bVar7.a() >> 32));
                                        float intBitsToFloat3 = (Float.intBitsToFloat((int) (bVar7.a() & 4294967295L)) + f9) / Float.intBitsToFloat((int) (bVar7.a() & 4294967295L));
                                        d2.g gVar2 = f;
                                        d2.r rVar4 = a;
                                        long l09 = bVar7.l0();
                                        u = sVar.u();
                                        sVar.t().f();
                                        ((x3) sVar.t).t(intBitsToFloat2, intBitsToFloat3, l09);
                                        f2.d.d0(bVar7, iVar4, r0Var, 0.0f, (f2.h) null, 28);
                                        ((x3) sVar.t).u(-f2, -f3);
                                        rVar4.q();
                                        aVar7.a = cVar2;
                                        aVar7.b = mVar;
                                        aVar7.c = rVar3;
                                        aVar7.d = j2;
                                        gVar2.a.prepareToDraw();
                                        wVar.r = gVar2;
                                        return eVar3.c(new f0.s(d, wVar, ceil, lVar, 0));
                                    }
                                }
                                f = d2.a0.f((int) (ceil >> 32), (int) (ceil & 4294967295L), i);
                                qVar3.a = f;
                                a = d2.a0.a(f);
                                qVar3.b = a;
                                bVar = qVar3.c;
                                if (bVar == null) {
                                }
                                sVar = bVar.s;
                                f2.a aVar72 = bVar.r;
                                long I2 = w8.s.I(ceil);
                                s3.m layoutDirection2 = eVar3.r.getLayoutDirection();
                                s3.c cVar22 = aVar72.a;
                                f2.b bVar72 = bVar;
                                s3.m mVar2 = aVar72.b;
                                d2.r rVar32 = aVar72.c;
                                long j22 = aVar72.d;
                                aVar72.a = eVar3;
                                aVar72.b = layoutDirection2;
                                aVar72.c = a;
                                aVar72.d = I2;
                                a.f();
                                f2.d.z0(bVar72, d2.t.b, 0L, I2, 0.0f, 58);
                                f2 = -f8;
                                f3 = -f7;
                                ((x3) sVar.t).u(f2, f3);
                                f2.d.d0(bVar72, g0Var.f, r0Var, 0.0f, new f2.h(f6, 0.0f, 0, 0, 30), 52);
                                float f92 = 1;
                                float intBitsToFloat22 = (Float.intBitsToFloat((int) (bVar72.a() >> 32)) + f92) / Float.intBitsToFloat((int) (bVar72.a() >> 32));
                                float intBitsToFloat32 = (Float.intBitsToFloat((int) (bVar72.a() & 4294967295L)) + f92) / Float.intBitsToFloat((int) (bVar72.a() & 4294967295L));
                                d2.g gVar22 = f;
                                d2.r rVar42 = a;
                                long l092 = bVar72.l0();
                                u = sVar.u();
                                sVar.t().f();
                                ((x3) sVar.t).t(intBitsToFloat22, intBitsToFloat32, l092);
                                f2.d.d0(bVar72, iVar4, r0Var, 0.0f, (f2.h) null, 28);
                                ((x3) sVar.t).u(-f2, -f3);
                                rVar42.q();
                                aVar72.a = cVar22;
                                aVar72.b = mVar2;
                                aVar72.c = rVar32;
                                aVar72.d = j22;
                                gVar22.a.prepareToDraw();
                                wVar.r = gVar22;
                                return eVar3.c(new f0.s(d, wVar, ceil, lVar, 0));
                            }
                        }
                        if (gVar != null) {
                            intBitsToFloat = Float.intBitsToFloat((int) (eVar3.r.a() >> 32));
                            bitmap = gVar.a;
                            if (intBitsToFloat <= bitmap.getWidth()) {
                                f = gVar;
                                a = rVar2;
                                bVar = qVar3.c;
                                if (bVar == null) {
                                }
                                sVar = bVar.s;
                                f2.a aVar722 = bVar.r;
                                long I22 = w8.s.I(ceil);
                                s3.m layoutDirection22 = eVar3.r.getLayoutDirection();
                                s3.c cVar222 = aVar722.a;
                                f2.b bVar722 = bVar;
                                s3.m mVar22 = aVar722.b;
                                d2.r rVar322 = aVar722.c;
                                long j222 = aVar722.d;
                                aVar722.a = eVar3;
                                aVar722.b = layoutDirection22;
                                aVar722.c = a;
                                aVar722.d = I22;
                                a.f();
                                f2.d.z0(bVar722, d2.t.b, 0L, I22, 0.0f, 58);
                                f2 = -f8;
                                f3 = -f7;
                                ((x3) sVar.t).u(f2, f3);
                                f2.d.d0(bVar722, g0Var.f, r0Var, 0.0f, new f2.h(f6, 0.0f, 0, 0, 30), 52);
                                float f922 = 1;
                                float intBitsToFloat222 = (Float.intBitsToFloat((int) (bVar722.a() >> 32)) + f922) / Float.intBitsToFloat((int) (bVar722.a() >> 32));
                                float intBitsToFloat322 = (Float.intBitsToFloat((int) (bVar722.a() & 4294967295L)) + f922) / Float.intBitsToFloat((int) (bVar722.a() & 4294967295L));
                                d2.g gVar222 = f;
                                d2.r rVar422 = a;
                                long l0922 = bVar722.l0();
                                u = sVar.u();
                                sVar.t().f();
                                ((x3) sVar.t).t(intBitsToFloat222, intBitsToFloat322, l0922);
                                f2.d.d0(bVar722, iVar4, r0Var, 0.0f, (f2.h) null, 28);
                                ((x3) sVar.t).u(-f2, -f3);
                                rVar422.q();
                                aVar722.a = cVar222;
                                aVar722.b = mVar22;
                                aVar722.c = rVar322;
                                aVar722.d = j222;
                                gVar222.a.prepareToDraw();
                                wVar.r = gVar222;
                                return eVar3.c(new f0.s(d, wVar, ceil, lVar, 0));
                            }
                        }
                        ((x3) sVar.t).t(intBitsToFloat222, intBitsToFloat322, l0922);
                        f2.d.d0(bVar722, iVar4, r0Var, 0.0f, (f2.h) null, 28);
                        ((x3) sVar.t).u(-f2, -f3);
                        rVar422.q();
                        aVar722.a = cVar222;
                        aVar722.b = mVar22;
                        aVar722.c = rVar322;
                        aVar722.d = j222;
                        gVar222.a.prepareToDraw();
                        wVar.r = gVar222;
                        return eVar3.c(new f0.s(d, wVar, ceil, lVar, 0));
                    } finally {
                        sVar.t().q();
                        sVar.F(u);
                    }
                    f2.d.d0(bVar722, g0Var.f, r0Var, 0.0f, new f2.h(f6, 0.0f, 0, 0, 30), 52);
                    float f9222 = 1;
                    float intBitsToFloat2222 = (Float.intBitsToFloat((int) (bVar722.a() >> 32)) + f9222) / Float.intBitsToFloat((int) (bVar722.a() >> 32));
                    float intBitsToFloat3222 = (Float.intBitsToFloat((int) (bVar722.a() & 4294967295L)) + f9222) / Float.intBitsToFloat((int) (bVar722.a() & 4294967295L));
                    d2.g gVar2222 = f;
                    d2.r rVar4222 = a;
                    long l09222 = bVar722.l0();
                    u = sVar.u();
                    sVar.t().f();
                } catch (Throwable th2) {
                    ((x3) sVar.t).u(-f2, -f3);
                    throw th2;
                }
                z = true;
                f = d2.a0.f((int) (ceil >> 32), (int) (ceil & 4294967295L), i);
                qVar3.a = f;
                a = d2.a0.a(f);
                qVar3.b = a;
                bVar = qVar3.c;
                if (bVar == null) {
                }
                sVar = bVar.s;
                f2.a aVar7222 = bVar.r;
                long I222 = w8.s.I(ceil);
                s3.m layoutDirection222 = eVar3.r.getLayoutDirection();
                s3.c cVar2222 = aVar7222.a;
                f2.b bVar7222 = bVar;
                s3.m mVar222 = aVar7222.b;
                d2.r rVar3222 = aVar7222.c;
                long j2222 = aVar7222.d;
                aVar7222.a = eVar3;
                aVar7222.b = layoutDirection222;
                aVar7222.c = a;
                aVar7222.d = I222;
                a.f();
                f2.d.z0(bVar7222, d2.t.b, 0L, I222, 0.0f, 58);
                f2 = -f8;
                f3 = -f7;
                ((x3) sVar.t).u(f2, f3);
                break;
            case 19:
                d3.z.g((c0) obj, (String) ((w61.k) obj2).r);
                return a0Var;
            case 20:
                s5 s5Var = (s5) obj2;
                a2.e eVar4 = (a2.e) obj;
                float b = eVar4.b() * ((s3.f) s5Var.R.d()).r;
                d2.i a7 = d2.k.a();
                d2.p0 p0Var2 = s5Var.Q;
                if (p0Var2 == null) {
                    p0Var2 = r8.a((q8) v2.l.h(s5Var, r8.a), j1.a0.d);
                }
                h0 a8 = p0Var2.a(eVar4.r.a(), eVar4.r.getLayoutDirection(), eVar4);
                if (a8 instanceof h0) {
                    d2.i.b(a7, a8.f);
                } else if (a8 instanceof i0) {
                    d2.i.c(a7, ((i0) a8).f);
                } else {
                    if (!(a8 instanceof g0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d2.i.a(a7, ((g0) a8).f);
                }
                d2.i a9 = d2.k.a();
                d2.i.b(a9, new c2.c(0.0f, Float.intBitsToFloat((int) (eVar4.r.a() & 4294967295L)) - b, Float.intBitsToFloat((int) (eVar4.r.a() >> 32)), Float.intBitsToFloat((int) (4294967295L & eVar4.r.a()))));
                d2.i a11 = d2.k.a();
                a11.f(a9, a7, 1);
                return eVar4.c(new e0(26, a11, s5Var));
            case 21:
                d2.m0 m0Var4 = (d2.m0) obj;
                float floatValue = ((Number) ((a0.e) obj2).d()).floatValue();
                float d2 = u6.d(m0Var4, floatValue);
                float e2 = u6.e(m0Var4, floatValue);
                m0Var4.q(e2 != 0.0f ? d2 / e2 : 1.0f);
                m0Var4.y(u6.c);
                return a0Var;
            case 22:
                k6 k6Var = (k6) obj2;
                k6Var.show();
                return new androidx.compose.foundation.lazy.layout.h0(5, k6Var);
            case 23:
                return Boolean.valueOf(k71.k.b(((d5) obj).a, (z9) obj2));
            case 24:
                n0 n0Var = (n0) obj2;
                g3.e eVar5 = (g3.e) obj;
                g3.m mVar3 = (g3.b) eVar5.a;
                if (mVar3 instanceof g3.m) {
                    g3.m mVar4 = mVar3;
                    if (mVar4.b == null) {
                        return g3.e.a(eVar5, new g3.m(mVar4.a, n0Var, mVar4.c), 0, 14);
                    }
                }
                if (!(mVar3 instanceof g3.l)) {
                    return eVar5;
                }
                g3.l lVar2 = (g3.l) mVar3;
                return lVar2.b == null ? g3.e.a(eVar5, new g3.l(lVar2.a, n0Var, lVar2.c), 0, 14) : eVar5;
            case 25:
                return (androidx.compose.ui.layout.w) ((gc) obj2).a.a();
            case 26:
                fp.a aVar8 = (fp.a) obj;
                k71.k.g(aVar8, "agentSessionParameters");
                int i6 = aVar8.c;
                u0 u0Var = new u0((Object) null);
                t7 b2 = k21.f.b((com.github.rudroid.common.k) obj2, aVar8);
                return new y0(i6, u0Var, b2 == null ? t0.d : new u0(b2), new u0(k41.b.R(aVar8.b)));
            case 27:
                g81.b bVar8 = (g81.b) obj2;
                i81.a aVar9 = (i81.a) obj;
                k71.k.g(aVar9, "$this$buildSerialDescriptor");
                i81.a.a(aVar9, "type", q1.b);
                i81.a.a(aVar9, "value", t1.o("kotlinx.serialization.Polymorphic<" + bVar8.a.c() + '>', i81.i.e, new SerialDescriptor[0]));
                List list6 = bVar8.b;
                k71.k.g(list6, "<set-?>");
                aVar9.b = list6;
                return a0Var;
            case 28:
                ((q0) obj2).a();
                return a0Var;
            default:
                c3 c3Var = (c3) obj2;
                return new c2.b(c3Var.c(c3Var.k, ((c2.b) obj).a, c3Var.j));
        }
    }

    public /* synthetic */ u(e81.c cVar, e81.b bVar) {
        this.r = 16;
        this.s = cVar;
    }
}
