package com.github.rudroid.utilities.viewmodel.paging.model;

import com.github.rudroid.utilities.w0;

@c71.e(c = "com.github.rudroid.utilities.viewmodel.paging.model.LegacyPagingModel$observe$1$1", f = "LegacyPagingModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d extends c71.j implements j71.e {
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, a71.c cVar) {
        super(2, cVar);
        this.v = jVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        d r = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        w0.n(this.v.w);
        return w61.a0.a;
    }
}
