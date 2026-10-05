package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.IssuesViewModel$loadHead$1", f = "IssuesViewModel.kt", l = {155}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class g2 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ e2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(e2 e2Var, a71.c cVar) {
        super(2, cVar);
        this.w = e2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new g2(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            e2 e2Var = this.w;
            y71.y a = e2Var.u.a(e2Var.x.d(), e2.P(e2Var, e2Var.R()), e2Var.T(), e2Var.S(), new d2(e2Var, 2));
            f2 f2Var = new f2(e2Var);
            this.v = 1;
            if (a.b(f2Var, this) == aVar) {
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
