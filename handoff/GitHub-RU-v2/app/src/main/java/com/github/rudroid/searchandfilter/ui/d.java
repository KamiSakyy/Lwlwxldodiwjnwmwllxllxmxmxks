package com.github.rudroid.searchandfilter.ui;

import java.util.List;
import y71.y1;

@c71.e(c = "com.github.rudroid.searchandfilter.ui.FilterBarFragmentBase$subscribeToViewModel$2", f = "FilterBarFragmentBase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ FilterBarFragmentBase w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FilterBarFragmentBase filterBarFragmentBase, a71.c cVar) {
        super(2, cVar);
        this.w = filterBarFragmentBase;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        d dVar = new d(this.w, cVar);
        dVar.v = obj;
        return dVar;
    }

    public final Object s(Object obj, Object obj2) {
        d r = r((a71.c) obj2, (wm.b) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        com.github.rudroid.searchandfilter.filterbar.e eVar;
        wm.b bVar = (wm.b) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        FilterBarFragmentBase filterBarFragmentBase = this.w;
        y1 y1Var = filterBarFragmentBase.H0;
        if (filterBarFragmentBase.H4().z == null) {
            eVar = null;
        } else if (bVar == null) {
            String C3 = filterBarFragmentBase.C3(2131954238);
            k71.k.f(C3, "getString(...)");
            eVar = new com.github.rudroid.searchandfilter.filterbar.e(C3, new b(0, filterBarFragmentBase, FilterBarFragmentBase.class, "createShortcut", "createShortcut()V", 0, 0));
        } else {
            String D3 = filterBarFragmentBase.D3(2131954237, new Object[]{bVar.getName()});
            k71.k.f(D3, "getString(...)");
            eVar = new com.github.rudroid.searchandfilter.filterbar.e(D3, null);
        }
        String C32 = filterBarFragmentBase.C3(2131954253);
        k71.k.f(C32, "getString(...)");
        com.github.rudroid.searchandfilter.filterbar.e eVar2 = new com.github.rudroid.searchandfilter.filterbar.e(C32, new a(0, filterBarFragmentBase, FilterBarFragmentBase.class, "reset", "reset()V", 0, 0));
        List r = eVar != null ? x61.l.r(new com.github.rudroid.searchandfilter.filterbar.e[]{eVar, eVar2}) : sy.d0Shadow.n(eVar2);
        y1Var.getClass();
        y1Var.k((Object) null, r);
        return w61.a0.a;
    }
    public Object ordinal() { return null; }
}
