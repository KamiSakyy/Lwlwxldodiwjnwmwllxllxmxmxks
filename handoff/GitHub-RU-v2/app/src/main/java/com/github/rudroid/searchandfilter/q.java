package com.github.rudroid.searchandfilter;

import android.os.Bundle;
import com.github.domain.searchandfilter.filters.data.CustomFilter;
import com.github.rudroid.searchandfilter.e0;
import com.github.rudroid.utilities.ui.t1;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.MobileEventContext;
import com.github.service.models.response.type.MobileSubjectType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import rm0.r3Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public class q extends androidx.lifecycle.k1 {
    public static final b Companion = new b();
    public j71.c A;
    public com.github.rudroid.searchandfilter.newflags.i B;
    public com.github.rudroid.searchandfilter.newflags.k C;
    public y1 D;
    public y1 E;
    public y1 F;
    public r3Shadow G;
    public y1 H;
    public y00.l I;
    public y1 J;
    public y00.l K;
    public y1 L;
    public y71.i1 M;
    public v71.q1 N;
    public bm.u s;
    public List t;
    public boolean u;
    public c v;
    public a w;
    public com.github.rudroid.activities.util.a x;
    public tm.e y;
    public d z;

    public static final class a {
        public com.github.rudroid.activities.util.a a;
        public kj.j b;
        public MobileAppElement c;
        public MobileEventContext d;

        public a(com.github.rudroid.activities.util.a aVar, kj.j jVar, MobileAppElement mobileAppElement, MobileEventContext mobileEventContext) {
            k71.k.g(aVar, "accountHolder");
            k71.k.g(jVar, "analyticsUseCase");
            k71.k.g(mobileAppElement, "analyticsAppElement");
            this.a = aVar;
            this.b = jVar;
            this.c = mobileAppElement;
            this.d = mobileEventContext;
        }
    }

    public static final class b {
        public static void a(Bundle bundle, fk.f fVar, MobileAppElement mobileAppElement, MobileEventContext mobileEventContext, ArrayList arrayList, ArrayList arrayList2, ShortcutType shortcutType, com.github.service.models.response.shortcuts.a aVar, boolean z) {
            k71.k.g(bundle, "<this>");
            k71.k.g(mobileAppElement, "analyticsAppElement");
            k71.k.g(arrayList, "defaultFilterSet");
            k71.k.g(shortcutType, "shortcutConversionType");
            k71.k.g(aVar, "shortcutConversionScope");
            if (fVar != null) {
                bundle.putParcelable("filter", fVar);
            }
            bundle.putSerializable("analytics_app_element_key", mobileAppElement);
            bundle.putSerializable("analytics_event_context_key", mobileEventContext);
            bundle.putParcelableArrayList("default_filter_set", arrayList);
            bundle.putParcelableArrayList("deeplink_filter_set", arrayList2);
            bundle.putSerializable("shortcut_conversion_type", shortcutType);
            bundle.putParcelable("shortcut_conversion_scope", aVar);
            bundle.putBoolean("visible_by_default", z);
        }

        public static void b(b bVar, androidx.lifecycle.a1 a1Var, boolean z, int i) {
            ArrayList arrayList = new ArrayList();
            if ((i & 2) != 0) {
                z = false;
            }
            bVar.getClass();
            k71.k.g(a1Var, "<this>");
            a1Var.c(arrayList, "default_filter_set");
            a1Var.c(Boolean.valueOf(z), "visible_by_default");
        }
    }

    public static final class c {
        public com.github.rudroid.activities.util.a a;
        public yl.d b;
        public yl.a c;
        public yl.c d;
        public fk.f e;

        public c(com.github.rudroid.activities.util.a aVar, yl.d dVar, yl.a aVar2, yl.c cVar, fk.f fVar) {
            k71.k.g(aVar, "accountHolder");
            k71.k.g(dVar, "persistFiltersUseCase");
            k71.k.g(aVar2, "deletePersistedFilterUseCase");
            k71.k.g(cVar, "loadFiltersUseCase");
            this.a = aVar;
            this.b = dVar;
            this.c = aVar2;
            this.d = cVar;
            this.e = fVar;
        }
    }

    public static final class d {
        public com.github.rudroid.activities.util.a a;
        public ShortcutType b;
        public com.github.service.models.response.shortcuts.a c;

        public d(com.github.rudroid.activities.util.c cVar, ShortcutType shortcutType, com.github.service.models.response.shortcuts.a aVar) {
            k71.k.g(cVar, "accountHolder");
            this.a = cVar;
            this.b = shortcutType;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return k71.k.b(this.a, dVar.a) && this.b == dVar.b && k71.k.b(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ShortcutConversionContextComponents(accountHolder=" + this.a + ", shortcutType=" + this.b + ", shortcutScope=" + this.c + ")";
        }
    }

    public q(bm.u uVar, List list, boolean z, c cVar, a aVar, com.github.rudroid.activities.util.a aVar2, tm.e eVar, d dVar, j71.c cVar2, com.github.rudroid.searchandfilter.newflags.i iVar, com.github.rudroid.searchandfilter.newflags.k kVar, androidx.lifecycle.a1 a1Var) {
        k71.k.g(uVar, "searchQueryParser");
        k71.k.g(list, "defaultFilterSet");
        k71.k.g(aVar2, "accountHolder");
        k71.k.g(eVar, "findShortcutByConfigurationUseCase");
        k71.k.g(iVar, "observeNewFiltersBadgeUseCase");
        k71.k.g(kVar, "setNewFilterInteractedUseCase");
        k71.k.g(a1Var, "savedStateHandle");
        this.s = uVar;
        this.t = list;
        this.u = z;
        this.v = cVar;
        this.w = aVar;
        this.x = aVar2;
        this.y = eVar;
        this.z = dVar;
        this.A = cVar2;
        this.B = iVar;
        this.C = kVar;
        y1 c2 = y71.n1.c(Boolean.valueOf(z));
        this.D = c2;
        y1 c3 = y71.n1.c(this.t);
        this.E = c3;
        y1 c4 = y71.n1.c(x61.r.r);
        this.F = c4;
        this.G = y71.n1.l(c2, c3, c4, new s(null, this));
        y1 c5 = y71.n1.c((Object) null);
        this.H = c5;
        this.I = new y00.l(new y71.i1(c5), 10);
        y1 c6 = y71.n1.c((Object) null);
        this.J = c6;
        this.K = new y00.l(new y71.i1(c6), 10);
        y1 c7 = y71.n1.c((Object) null);
        this.L = c7;
        this.M = new y71.i1(c7);
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new i(null, this), 3);
        if (cVar != null) {
            v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new k(null, this), 3);
            v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new p(null, this), 3);
            return;
        }
        if (a1Var.a("deeplink_filter_set") == null) {
            V();
            return;
        }
        ArrayList arrayList = (ArrayList) a1Var.a("deeplink_filter_set");
        if (arrayList != null) {
            c3.k((Object) null, arrayList);
            androidx.lifecycle.l1 l1Var = a1Var.b;
            l1Var.getClass();
            ((LinkedHashMap) l1Var.r).remove("deeplink_filter_set");
            ((LinkedHashMap) l1Var.t).remove("deeplink_filter_set");
            ((LinkedHashMap) l1Var.u).remove("deeplink_filter_set");
            if (a1Var.a.remove("deeplink_filter_set") != null) {
                throw new ClassCastException();
            }
            X(arrayList);
        }
    }

    public final void P(com.github.domain.searchandfilter.filters.data.d dVar, int i) {
        y1 y1Var = this.E;
        ArrayList H0 = x61.m.H0((Collection) y1Var.getValue());
        H0.add(i, dVar);
        y1Var.getClass();
        y1Var.k((Object) null, H0);
        Z(e0.b.r);
    }

    public final boolean Q() {
        Iterable iterable = (Iterable) this.E.getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((com.github.domain.searchandfilter.filters.data.d) it.next()).c()) {
                return true;
            }
        }
        return false;
    }

    public final List R() {
        return (List) S().r;
    }

    public final w61.k S() {
        Object obj;
        List list = (List) this.F.getValue();
        Iterable iterable = (Iterable) this.E.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            oa.j d2 = this.x.d();
            if (((com.github.domain.searchandfilter.filters.data.d) obj2).h(d2.f.d(d2, oa.j.p[2]))) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (list.contains(((com.github.domain.searchandfilter.filters.data.d) obj).r)) {
                break;
            }
        }
        com.github.domain.searchandfilter.filters.data.d dVar = (com.github.domain.searchandfilter.filters.data.d) obj;
        return new w61.k(arrayList, dVar != null ? dVar.r : null);
    }

    public final void T(String str) {
        k71.k.g(str, "id");
        ArrayList H0 = x61.m.H0(this.t);
        ArrayList arrayList = new ArrayList();
        int size = H0.size();
        int i = 0;
        while (i < size) {
            Object obj = H0.get(i);
            i++;
            if (!k71.k.b(((com.github.domain.searchandfilter.filters.data.d) obj).s, str)) {
                arrayList.add(obj);
            }
        }
        this.t = arrayList;
        U(str);
    }

    public final void U(String str) {
        k71.k.g(str, "id");
        y1 y1Var = this.E;
        Iterable iterable = (Iterable) y1Var.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!k71.k.b(((com.github.domain.searchandfilter.filters.data.d) obj).s, str)) {
                arrayList.add(obj);
            }
        }
        y1Var.getClass();
        y1Var.k((Object) null, arrayList);
        Z(e0.b.r);
    }

    public final void V() {
        this.E.j(this.t);
        Z(e0.b.r);
    }

    public final void W(List list, List list2) {
        k71.k.g(list, "newDefaultSet");
        k71.k.g(list2, "initialConfiguration");
        this.t = list;
        ArrayList a2 = c0.a(list, list2);
        y1 y1Var = this.E;
        y1Var.getClass();
        y1Var.k((Object) null, a2);
        Z(e0.b.r);
    }

    public final void X(List list) {
        com.github.rudroid.activities.util.a aVar;
        v71.q1 q1Var = this.N;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        d dVar = this.z;
        if (dVar == null || (aVar = dVar.a) == null) {
            return;
        }
        this.N = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new u(this, aVar.d(), list, dVar.c, dVar.b, null), 3);
    }

    public final void Y(com.github.domain.searchandfilter.filters.data.d dVar, MobileSubjectType mobileSubjectType) {
        if (((List) this.F.getValue()).contains(dVar.r)) {
            v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new v(this, dVar, null), 3);
        }
        y1 y1Var = this.E;
        Iterable<com.github.domain.searchandfilter.filters.data.d> iterable = (Iterable) y1Var.getValue();
        ArrayList arrayList = new ArrayList(x61.n.F(iterable, 10));
        for (com.github.domain.searchandfilter.filters.data.d dVar2 : iterable) {
            if (k71.k.b(dVar2.s, dVar.s)) {
                dVar2 = dVar;
            }
            arrayList.add(dVar2);
        }
        y1Var.getClass();
        y1Var.k((Object) null, arrayList);
        Z(e0.b.r);
        if (this.w != null) {
            v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new w(this, mobileSubjectType, null), 3);
        }
    }

    public final void Z(e0.b bVar) {
        Iterable iterable = (Iterable) this.E.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) this.A.k(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        List r0 = x61.m.r0(arrayList);
        ArrayList arrayList2 = new ArrayList(x61.n.F(r0, 10));
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.github.domain.searchandfilter.filters.data.d) it.next()).r(r0));
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            if (!t71.p.T((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        String c0 = x61.m.c0(arrayList3, " ", (String) null, (String) null, 0, (j71.c) null, 62);
        String str = (String) this.H.getValue();
        if (str == null) {
            str = "";
        }
        StringBuilder p = f1.e.p(c0);
        if (c0.length() > 0 && str.length() > 0) {
            p.append(" ");
        }
        p.append(str);
        e0 e0Var = new e0(p.toString(), bVar);
        y1 y1Var = this.J;
        y1Var.getClass();
        y1Var.k((Object) null, e0Var);
    }

    public final void a0(com.github.rudroid.utilities.ui.g1 g1Var) {
        k71.k.g(g1Var, "stateEvent");
        y1 y1Var = this.D;
        if (((Boolean) y1Var.getValue()).booleanValue()) {
            return;
        }
        Boolean valueOf = Boolean.valueOf((g1Var instanceof t1) || (g1Var instanceof com.github.rudroid.utilities.ui.h0));
        y1Var.getClass();
        y1Var.k((Object) null, valueOf);
    }

    public final void b0(fl.f fVar) {
        k71.k.g(fVar, "resultModel");
        y1 y1Var = this.D;
        if (((Boolean) y1Var.getValue()).booleanValue()) {
            return;
        }
        Boolean valueOf = Boolean.valueOf(i21.a.y(fVar));
        y1Var.getClass();
        y1Var.k((Object) null, valueOf);
    }

    public final void c0(com.github.rudroid.viewmodels.search.a aVar) {
        k71.k.g(aVar, "query");
        String str = aVar.a;
        boolean z = aVar.b;
        y1 y1Var = this.H;
        if (!z) {
            y1Var.j(str);
            Z(e0.b.s);
            return;
        }
        this.s.getClass();
        bm.s a2 = bm.u.a(str);
        List list = a2.b;
        if (list.isEmpty()) {
            y1Var.getClass();
            y1Var.k((Object) null, str);
            Z(e0.b.s);
            return;
        }
        y1 y1Var2 = this.E;
        List list2 = (List) y1Var2.getValue();
        ArrayList H0 = x61.m.H0(list);
        List<com.github.domain.searchandfilter.filters.data.d> r0 = x61.m.r0(list2);
        ArrayList arrayList = new ArrayList(x61.n.F(r0, 10));
        for (com.github.domain.searchandfilter.filters.data.d dVar : r0) {
            com.github.domain.searchandfilter.filters.data.d j = dVar.j(H0, true);
            if (j != null) {
                dVar = j;
            }
            arrayList.add(dVar);
        }
        ArrayList arrayList2 = new ArrayList(x61.n.F(H0, 10));
        int size = H0.size();
        int i = 0;
        while (i < size) {
            Object obj = H0.get(i);
            i++;
            arrayList2.add(new CustomFilter(((bm.t) obj).a));
        }
        Set J0 = x61.m.J0(arrayList);
        x61.m.J(J0, arrayList2);
        List r02 = x61.m.r0(J0);
        y1Var2.getClass();
        y1Var2.k((Object) null, r02);
        y1Var.j(a2.a);
        Z(e0.b.t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(bm.u uVar, androidx.lifecycle.a1 a1Var, ArrayList arrayList, com.github.rudroid.activities.util.c cVar, yl.d dVar, yl.a aVar, yl.c cVar2, tm.e eVar, fk.f fVar, kj.j jVar, MobileAppElement mobileAppElement, MobileEventContext mobileEventContext, com.github.rudroid.searchandfilter.newflags.i iVar, com.github.rudroid.searchandfilter.newflags.k kVar, int i) {
        this(uVar, arrayList, r2 != null ? r2.booleanValue() : false, r0, r5, cVar, eVar, null, r9, iVar, kVar, a1Var);
        com.github.rudroid.repository.branches.y yVar;
        MobileEventContext mobileEventContext2 = (i & 2048) != 0 ? null : mobileEventContext;
        if ((i & 16384) != 0) {
            yVar = new com.github.rudroid.repository.branches.y(21);
        } else {
            yVar = f1.O;
        }
        com.github.rudroid.repository.branches.y yVar2 = yVar;
        k71.k.g(uVar, "searchQueryParser");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(arrayList, "defaultFilterSet");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(dVar, "persistFiltersUseCase");
        k71.k.g(aVar, "deletePersistedFilterUseCase");
        k71.k.g(cVar2, "loadFiltersUseCase");
        k71.k.g(eVar, "findShortcutByConfigurationUseCase");
        k71.k.g(jVar, "analyticsUseCase");
        k71.k.g(mobileAppElement, "analyticsAppElement");
        k71.k.g(iVar, "observeNewFiltersBadgeUseCase");
        k71.k.g(kVar, "setNewFilterInteractedUseCase");
        c cVar3 = new c(cVar, dVar, aVar, cVar2, fVar);
        a aVar2 = new a(cVar, jVar, mobileAppElement, mobileEventContext2);
        Boolean bool = (Boolean) a1Var.a("visible_by_default");
    }
}
