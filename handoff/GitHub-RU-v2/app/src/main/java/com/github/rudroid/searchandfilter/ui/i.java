package com.github.rudroid.searchandfilter.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y71.y1;

@c71.e(c = "com.github.rudroid.searchandfilter.ui.FilterBarFragmentRepositoryScope$onViewCreated$1", f = "FilterBarFragmentRepositoryScope.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class i extends c71.j implements j71.e {
    public /* synthetic */ boolean v;
    public final /* synthetic */ FilterBarFragmentRepositoryScope w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(FilterBarFragmentRepositoryScope filterBarFragmentRepositoryScope, a71.c cVar) {
        super(2, cVar);
        this.w = filterBarFragmentRepositoryScope;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        i iVar = new i(this.w, cVar);
        iVar.v = ((Boolean) obj).booleanValue();
        return iVar;
    }

    public final Object s(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        i iVar = (i) r((a71.c) obj2, bool);
        w61.a0 a0Var = w61.a0.a;
        iVar.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        boolean z = this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        FilterBarFragmentRepositoryScope filterBarFragmentRepositoryScope = this.w;
        filterBarFragmentRepositoryScope.Q0 = z;
        y1 y1Var = filterBarFragmentRepositoryScope.G0;
        w61.k S = filterBarFragmentRepositoryScope.H4().S();
        List list = (List) S.r;
        bm.l lVar = (bm.l) S.s;
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(filterBarFragmentRepositoryScope.I4((com.github.domain.searchandfilter.filters.data.d) it.next(), lVar));
        }
        y1Var.getClass();
        y1Var.k((Object) null, arrayList);
        return w61.a0.a;
    }
}
