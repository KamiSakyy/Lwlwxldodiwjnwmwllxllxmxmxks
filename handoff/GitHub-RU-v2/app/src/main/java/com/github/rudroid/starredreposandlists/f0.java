package com.github.rudroid.starredreposandlists;

@c71.e(c = "com.github.rudroid.starredreposandlists.StarredReposAndListsViewModel$loadNextPage$1", f = "StarredReposAndListsViewModel.kt", l = {126}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ h0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, a71.c cVar) {
        super(2, cVar);
        this.w = h0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            h0 h0Var = this.w;
            y71.y yVar = new y71.y(new d0(h0Var, null), h0Var.s.a(h0Var.u.d(), h0Var.w.a, (String) h0Var.y.t(h0Var, h0.C[0]), h0Var.x.b, new y(h0Var, 4)));
            e0 e0Var = new e0(h0Var);
            this.v = 1;
            if (yVar.b(e0Var, this) == aVar) {
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
