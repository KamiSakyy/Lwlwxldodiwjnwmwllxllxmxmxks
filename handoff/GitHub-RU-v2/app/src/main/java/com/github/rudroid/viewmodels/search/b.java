package com.github.rudroid.viewmodels.search;

import c71.e;
import c71.j;
import sy.y;
import w61.a0;

@e(c = "com.github.rudroid.viewmodels.search.SearchViewQueryViewModel$observeQuery$1", f = "SearchViewQueryViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
class b extends j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ c w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, a71.c cVar2) {
        super(2, cVar2);
        this.w = cVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        b bVar = new b(this.w, cVar);
        bVar.v = obj;
        return bVar;
    }

    public final Object s(Object obj, Object obj2) {
        b r = r((a71.c) obj2, (String) obj);
        a0 a0Var = a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        String str = (String) this.v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        this.w.S(str);
        return a0.a;
    }
}
