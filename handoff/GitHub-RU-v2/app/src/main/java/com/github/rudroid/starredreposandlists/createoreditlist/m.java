package com.github.rudroid.starredreposandlists.createoreditlist;

import y71.m1;

@c71.e(c = "com.github.rudroid.starredreposandlists.createoreditlist.CreateNewListViewModel$saveList$1$1$1", f = "CreateNewListViewModel.kt", l = {55}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class m extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ r w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, a71.c cVar) {
        super(2, cVar);
        this.w = rVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new m(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            m1 m1Var = this.w.w;
            f1 f1Var = f1.t;
            this.v = 1;
            if (m1Var.c(f1Var, this) == aVar) {
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
