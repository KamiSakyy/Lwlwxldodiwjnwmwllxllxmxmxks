package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.PullRequestReviewViewModel$fetchReviewById$1", f = "PullRequestReviewViewModel.kt", l = {142}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class o4 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ c5 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(c5 c5Var, String str, a71.c cVar) {
        super(2, cVar);
        this.w = c5Var;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new o4(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            c5 c5Var = this.w;
            zk.q0 q0Var = c5Var.u;
            oa.j d = c5Var.D.d();
            i4 i4Var = new i4(c5Var, 1);
            q0Var.getClass();
            String str = this.x;
            k71.k.g(str, "reviewId");
            y71.y yVar = new y71.y(new m4(c5Var, null), b31.b.J(((z01.h1) q0Var.a.a(d)).a(str), d, i4Var));
            n4 n4Var = new n4(c5Var);
            this.v = 1;
            if (yVar.b(n4Var, this) == aVar) {
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
