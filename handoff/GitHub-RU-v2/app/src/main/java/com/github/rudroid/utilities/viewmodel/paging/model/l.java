package com.github.rudroid.utilities.viewmodel.paging.model;

import y71.n1;

@c71.e(c = "com.github.rudroid.utilities.viewmodel.paging.model.LegacyPagingSearchableModel$ensureObservingSearchFlow$1", f = "LegacyPagingSearchableModel.kt", l = {44}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class l extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ n w;
    public final /* synthetic */ v6.a x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, v6.a aVar, a71.c cVar) {
        super(2, cVar);
        this.w = nVar;
        this.x = aVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new l(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            y71.i o = n1.o((y71.i) null, 250L);
            k kVar = new k(this.w, this.x);
            this.v = 1;
            if (o.b(kVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
