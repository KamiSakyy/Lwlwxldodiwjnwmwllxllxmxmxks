package com.github.rudroid.searchandfilter.complexfilter.explore;

import androidx.lifecycle.a1;
import com.github.rudroid.searchandfilter.complexfilter.label.g;
import com.github.rudroid.searchandfilter.complexfilter.milestone.g;
import com.github.rudroid.searchandfilter.complexfilter.notificationfilter.s0;
import com.github.rudroid.searchandfilter.complexfilter.repository.a;
import com.github.rudroid.searchandfilter.complexfilter.user.o;
import com.github.rudroid.searchandfilter.q;
import com.github.rudroid.settings.TimezoneUpdateWorker;
import com.github.rudroid.shortcuts.navigation.ConfigureShortcutRoute;
import com.github.service.models.response.LegacyProjectWithNumber;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.SpokenLanguage;
import com.github.service.models.response.organizations.Organization;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import xn.e1;
import yz0.k2;
import yz0.v2;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a0 implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ a0(int i) {
        this.r = i;
    }

    public final Object k(Object obj) {
        int i = this.r;
        boolean z = true;
        ArrayList arrayList = null;
        w61.a0 a0Var = w61.a0.a;
        switch (i) {
            case 0:
                fl.f fVar = (fl.f) obj;
                int i2 = i0.D;
                fl.g gVar = fVar.a;
                List<w61.k> list = (List) fVar.b;
                if (list != null) {
                    arrayList = new ArrayList(x61.n.F(list, 10));
                    for (w61.k kVar : list) {
                        arrayList.add(new u((SpokenLanguage) kVar.r, ((Boolean) kVar.s).booleanValue()));
                    }
                }
                return new fl.f(gVar, arrayList, fVar.c);
            case 1:
                fl.f fVar2 = (fl.f) obj;
                g.a aVar = com.github.rudroid.searchandfilter.complexfilter.label.g.Companion;
                k71.k.g(fVar2, "model");
                fl.g gVar2 = fVar2.a;
                List<w61.k> list2 = (List) fVar2.b;
                if (list2 != null) {
                    arrayList = new ArrayList(x61.n.F(list2, 10));
                    for (w61.k kVar2 : list2) {
                        arrayList.add(new com.github.rudroid.searchandfilter.complexfilter.label.a((k2) kVar2.r, ((Boolean) kVar2.s).booleanValue()));
                    }
                }
                return new fl.f(gVar2, arrayList, fVar2.c);
            case 2:
                fl.f fVar3 = (fl.f) obj;
                g.a aVar2 = com.github.rudroid.searchandfilter.complexfilter.milestone.g.Companion;
                k71.k.g(fVar3, "model");
                fl.g gVar3 = fVar3.a;
                List<w61.k> list3 = (List) fVar3.b;
                if (list3 != null) {
                    arrayList = new ArrayList(x61.n.F(list3, 10));
                    for (w61.k kVar3 : list3) {
                        arrayList.add(new com.github.rudroid.searchandfilter.complexfilter.milestone.a((v2) kVar3.r, ((Boolean) kVar3.s).booleanValue()));
                    }
                }
                return new fl.f(gVar3, arrayList, fVar3.c);
            case 3:
                k71.k.g((d3.c0) obj, "$this$semantics");
                return a0Var;
            case 4:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return a0Var;
            case 5:
                fl.f fVar4 = (fl.f) obj;
                int i3 = com.github.rudroid.searchandfilter.complexfilter.notificationfilter.a0.D;
                fl.g gVar4 = fVar4.a;
                List<w61.k> list4 = (List) fVar4.b;
                if (list4 != null) {
                    arrayList = new ArrayList(x61.n.F(list4, 10));
                    for (w61.k kVar4 : list4) {
                        arrayList.add(new com.github.rudroid.searchandfilter.complexfilter.notificationfilter.k((com.github.domain.searchandfilter.filters.data.notification.a) kVar4.r, ((Boolean) kVar4.s).booleanValue()));
                    }
                }
                return new fl.f(gVar4, arrayList, fVar4.c);
            case 6:
                fl.f fVar5 = (fl.f) obj;
                int i4 = s0.F;
                fl.g gVar5 = fVar5.a;
                List<w61.k> list5 = (List) fVar5.b;
                if (list5 != null) {
                    arrayList = new ArrayList(x61.n.F(list5, 10));
                    for (w61.k kVar5 : list5) {
                        arrayList.add(new com.github.rudroid.searchandfilter.complexfilter.notificationfilter.k((com.github.domain.searchandfilter.filters.data.notification.a) kVar5.r, ((Boolean) kVar5.s).booleanValue()));
                    }
                }
                return new fl.f(gVar5, arrayList, fVar5.c);
            case 7:
                fl.f fVar6 = (fl.f) obj;
                int i5 = com.github.rudroid.searchandfilter.complexfilter.organization.o.E;
                fl.g gVar6 = fVar6.a;
                List<w61.k> list6 = (List) fVar6.b;
                if (list6 != null) {
                    arrayList = new ArrayList(x61.n.F(list6, 10));
                    for (w61.k kVar6 : list6) {
                        arrayList.add(new com.github.rudroid.searchandfilter.complexfilter.organization.a((Organization) kVar6.r, ((Boolean) kVar6.s).booleanValue()));
                    }
                }
                return new fl.f(gVar6, arrayList, fVar6.c);
            case 8:
                LegacyProjectWithNumber legacyProjectWithNumber = (LegacyProjectWithNumber) obj;
                int i6 = com.github.rudroid.searchandfilter.complexfilter.project.i.I;
                k71.k.g(legacyProjectWithNumber, "project");
                String str = legacyProjectWithNumber.u;
                if (str != null && str.length() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                fl.f fVar7 = (fl.f) obj;
                int i7 = com.github.rudroid.searchandfilter.complexfilter.project.i.I;
                k71.k.g(fVar7, "model");
                fl.g gVar7 = fVar7.a;
                List<w61.k> list7 = (List) fVar7.b;
                if (list7 != null) {
                    arrayList = new ArrayList(x61.n.F(list7, 10));
                    for (w61.k kVar7 : list7) {
                        arrayList.add(new com.github.rudroid.searchandfilter.complexfilter.project.o((LegacyProjectWithNumber) kVar7.r, ((Boolean) kVar7.s).booleanValue()));
                    }
                }
                return new fl.f(gVar7, arrayList, fVar7.c);
            case 10:
                LegacyProjectWithNumber legacyProjectWithNumber2 = (LegacyProjectWithNumber) obj;
                int i8 = com.github.rudroid.searchandfilter.complexfilter.project.y.I;
                k71.k.g(legacyProjectWithNumber2, "project");
                String str2 = legacyProjectWithNumber2.u;
                return Boolean.valueOf(!(str2 == null || str2.length() == 0));
            case 11:
                fl.f fVar8 = (fl.f) obj;
                int i9 = com.github.rudroid.searchandfilter.complexfilter.project.y.I;
                k71.k.g(fVar8, "model");
                fl.g gVar8 = fVar8.a;
                List<w61.k> list8 = (List) fVar8.b;
                if (list8 != null) {
                    arrayList = new ArrayList(x61.n.F(list8, 10));
                    for (w61.k kVar8 : list8) {
                        arrayList.add(new com.github.rudroid.searchandfilter.complexfilter.project.o((LegacyProjectWithNumber) kVar8.r, ((Boolean) kVar8.s).booleanValue()));
                    }
                }
                return new fl.f(gVar8, arrayList, fVar8.c);
            case 12:
                fl.f fVar9 = (fl.f) obj;
                a.C0001a c0001a = com.github.rudroid.searchandfilter.complexfilter.repository.a.Companion;
                k71.k.g(fVar9, "model");
                fl.g gVar9 = fVar9.a;
                List<w61.k> list9 = (List) fVar9.b;
                if (list9 != null) {
                    arrayList = new ArrayList(x61.n.F(list9, 10));
                    for (w61.k kVar9 : list9) {
                        arrayList.add(new com.github.rudroid.searchandfilter.complexfilter.repository.r((SimpleRepository) kVar9.r, ((Boolean) kVar9.s).booleanValue()));
                    }
                }
                return new fl.f(gVar9, arrayList, fVar9.c);
            case 13:
                fl.f fVar10 = (fl.f) obj;
                o.a aVar3 = com.github.rudroid.searchandfilter.complexfilter.user.o.Companion;
                k71.k.g(fVar10, "model");
                fl.g gVar10 = fVar10.a;
                List<w61.k> list10 = (List) fVar10.b;
                if (list10 != null) {
                    arrayList = new ArrayList(x61.n.F(list10, 10));
                    for (w61.k kVar10 : list10) {
                        arrayList.add(new com.github.rudroid.searchandfilter.complexfilter.user.j((yz0.f) kVar10.r, ((Boolean) kVar10.s).booleanValue()));
                    }
                }
                return new fl.f(gVar10, arrayList, fVar10.c);
            case 14:
                com.github.rudroid.searchandfilter.filterbar.f fVar11 = (com.github.rudroid.searchandfilter.filterbar.f) obj;
                k71.k.g(fVar11, "it");
                return Integer.valueOf(fVar11.a);
            case 15:
                Objects.toString((fl.b) obj);
                return a0Var;
            case 16:
                Objects.toString((fl.b) obj);
                return a0Var;
            case 17:
                Objects.toString((fl.b) obj);
                return a0Var;
            case 18:
                Objects.toString((fl.b) obj);
                return a0Var;
            case 19:
                Objects.toString((fl.b) obj);
                return a0Var;
            case 20:
                fl.b bVar = (fl.b) obj;
                TimezoneUpdateWorker.a aVar4 = TimezoneUpdateWorker.Companion;
                k71.k.g(bVar, "error");
                throw new Throwable(f1.e.g("Timezone update failed to publish: ", bVar.b));
            case 21:
                d3.c0 c0Var = (d3.c0) obj;
                k71.k.g(c0Var, "$this$semantics");
                d3.z.b(c0Var);
                return a0Var;
            case 22:
                k71.k.g((String) obj, "it");
                return a0Var;
            case 23:
                k71.k.g((e1) obj, "it");
                return a0Var;
            case 24:
                d3.c0 c0Var2 = (d3.c0) obj;
                k71.k.g(c0Var2, "$this$semantics");
                d3.z.b(c0Var2);
                return a0Var;
            case 25:
                a1 a1Var = (a1) obj;
                k71.k.g(a1Var, "savedStateHandle");
                q.b.b(com.github.rudroid.searchandfilter.q.Companion, a1Var, ((ConfigureShortcutRoute) sy.y.m(a1Var, k71.x.a(ConfigureShortcutRoute.class), ig.b.a)).v, 1);
                return a0Var;
            case 26:
                a1 a1Var2 = (a1) obj;
                k71.k.g(a1Var2, "savedStateHandle");
                q.b.b(com.github.rudroid.searchandfilter.q.Companion, a1Var2, false, 3);
                return a0Var;
            case 27:
                k71.k.g((d3.c0) obj, "$this$semantics");
                return a0Var;
            case 28:
                d3.c0 c0Var3 = (d3.c0) obj;
                k71.k.g(c0Var3, "$this$semantics");
                d3.z.b(c0Var3);
                return a0Var;
            default:
                d3.c0 c0Var4 = (d3.c0) obj;
                k71.k.g(c0Var4, "$this$semantics");
                d3.z.b(c0Var4);
                return a0Var;
        }
    }
}
