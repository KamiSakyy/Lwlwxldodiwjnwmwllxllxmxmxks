package com.github.rudroid.searchandfilter.ui;

import androidx.lifecycle.o1;
import androidx.lifecycle.t1;
import com.github.rudroid.searchandfilter.ui.FilterBarFragmentRepositoryScope;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class h implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ FilterBarFragmentRepositoryScope s;

    public /* synthetic */ h(FilterBarFragmentRepositoryScope filterBarFragmentRepositoryScope, int i) {
        this.r = i;
        this.s = filterBarFragmentRepositoryScope;
    }

    public final Object a() {
        int i = this.r;
        FilterBarFragmentRepositoryScope filterBarFragmentRepositoryScope = this.s;
        switch (i) {
            case 0:
                FilterBarFragmentRepositoryScope.a aVar = FilterBarFragmentRepositoryScope.Companion;
                if (((Boolean) filterBarFragmentRepositoryScope.P0.a(filterBarFragmentRepositoryScope, FilterBarFragmentRepositoryScope.R0[2])).booleanValue()) {
                    k71.e a = k71.x.a(com.github.rudroid.searchandfilter.q.class);
                    FilterBarFragmentRepositoryScope.e eVar = new FilterBarFragmentRepositoryScope.e(filterBarFragmentRepositoryScope);
                    FilterBarFragmentRepositoryScope.f fVar = new FilterBarFragmentRepositoryScope.f(filterBarFragmentRepositoryScope);
                    FilterBarFragmentRepositoryScope.g gVar = new FilterBarFragmentRepositoryScope.g(filterBarFragmentRepositoryScope);
                    t1 t1Var = (t1) eVar.a();
                    o1 o1Var = (o1) gVar.a();
                    t6.c cVar = (t6.c) fVar.a();
                    k71.k.g(t1Var, "store");
                    k71.k.g(o1Var, "factory");
                    k71.k.g(cVar, "extras");
                    w51.r rVar = new w51.r(t1Var, o1Var, cVar);
                    String b = a.b();
                    if (b != null) {
                        return (com.github.rudroid.searchandfilter.q) rVar.E(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                    }
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
                w61.h s = sy.w.s(w61.i.s, new FilterBarFragmentRepositoryScope.h(new h(filterBarFragmentRepositoryScope, 1)));
                k71.e a2 = k71.x.a(com.github.rudroid.searchandfilter.q.class);
                FilterBarFragmentRepositoryScope.i iVar = new FilterBarFragmentRepositoryScope.i(s);
                FilterBarFragmentRepositoryScope.j jVar = new FilterBarFragmentRepositoryScope.j(s);
                FilterBarFragmentRepositoryScope.k kVar = new FilterBarFragmentRepositoryScope.k(filterBarFragmentRepositoryScope, s);
                t1 t1Var2 = (t1) iVar.a();
                o1 o1Var2 = (o1) kVar.a();
                t6.c cVar2 = (t6.c) jVar.a();
                k71.k.g(t1Var2, "store");
                k71.k.g(o1Var2, "factory");
                k71.k.g(cVar2, "extras");
                w51.r rVar2 = new w51.r(t1Var2, o1Var2, cVar2);
                String b2 = a2.b();
                if (b2 != null) {
                    return (com.github.rudroid.searchandfilter.q) rVar2.E(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            default:
                FilterBarFragmentRepositoryScope.a aVar2 = FilterBarFragmentRepositoryScope.Companion;
                return filterBarFragmentRepositoryScope.j4();
        }
    }
    public Object ordinal() { return null; }
    public static Object values() { return null; }
    public static final Object r = null;
}
