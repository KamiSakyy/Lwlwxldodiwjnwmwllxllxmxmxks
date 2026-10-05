package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.PullRequestsViewModel$refresh$1", f = "PullRequestsViewModel.kt", l = {230}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k6 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ a6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(a6 a6Var, a71.c cVar) {
        super(2, cVar);
        this.w = a6Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new k6(this.w, cVar);
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
            y71.y yVar = new y71.y(new i6(a6Var, null), a6Var.v.a(a6Var.y.d(), a6.P(a6Var, a6Var.S()), a6Var.G, a6Var.T(), new x5(a6Var, 5)));
            j6 j6Var = new j6(a6Var);
            this.v = 1;
            if (yVar.b(j6Var, this) == aVar) {
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
