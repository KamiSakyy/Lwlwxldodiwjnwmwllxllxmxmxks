package com.github.rudroid.utilities.viewmodel.paging.model;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;

@c71.e(c = "com.github.rudroid.utilities.viewmodel.paging.model.PagedSelectableModel$pagedData$1", f = "PagedSelectableModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class q extends c71.j implements j71.f {
    public /* synthetic */ g1 v;
    public final /* synthetic */ p w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, a71.c cVar) {
        super(3, cVar);
        this.w = pVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        q qVar = new q(this.w, (a71.c) obj3);
        qVar.v = (g1) obj;
        return qVar.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        g1 g1Var = this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        return h1.h(g1Var, new com.github.rudroid.support.u(7, this.w));
    }
}
