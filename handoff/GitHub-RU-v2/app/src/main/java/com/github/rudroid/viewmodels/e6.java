package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.PullRequestsViewModel$loadHead$1", f = "PullRequestsViewModel.kt", l = {187}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class e6 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ a6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(a6 a6Var, a71.c cVar) {
        super(2, cVar);
        this.w = a6Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new e6(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            a6 a6Var = this.w;
            y71.y a = a6Var.u.a(a6Var.y.d(), a6.P(a6Var, a6Var.S()), a6Var.G, a6Var.T(), new x5(a6Var, 3));
            d6 d6Var = new d6(a6Var);
            this.v = 1;
            if (a.b(d6Var, this) == aVar) {
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
