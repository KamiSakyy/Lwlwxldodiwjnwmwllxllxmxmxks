package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.PullRequestSearchViewModel$loadHead$1", f = "PullRequestSearchViewModel.kt", l = {57}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k5 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ r5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(r5 r5Var, a71.c cVar) {
        super(2, cVar);
        this.w = r5Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new k5(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            r5 r5Var = this.w;
            y71.y a = r5Var.u.a(r5Var.x.d(), r5Var.s, null, null, new i5(r5Var, 0));
            j5 j5Var = new j5(r5Var);
            this.v = 1;
            if (a.b(j5Var, this) == aVar) {
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
