package com.github.rudroid.starredreposandlists.createoreditlist;

import z01.r1;

@c71.e(c = "com.github.rudroid.starredreposandlists.createoreditlist.CreateNewListViewModel$1", f = "CreateNewListViewModel.kt", l = {32}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ r w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, a71.c cVar) {
        super(2, cVar);
        this.w = rVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new k(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            r rVar = this.w;
            i1 i1Var = rVar.u;
            oa.j d = rVar.v.d();
            l lVar = new l(1, rVar);
            i1Var.getClass();
            y71.y J = b31.b.J(((r1) i1Var.a.a(d)).r(), d, lVar);
            j jVar = new j(rVar);
            this.v = 1;
            if (J.b(jVar, this) == aVar) {
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
