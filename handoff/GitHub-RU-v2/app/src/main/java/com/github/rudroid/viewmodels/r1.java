package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.IssueSearchViewModel$loadNextPage$1", f = "IssueSearchViewModel.kt", l = {105}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class r1 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ v1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(v1 v1Var, a71.c cVar) {
        super(2, cVar);
        this.w = v1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new r1(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            v1 v1Var = this.w;
            y71.y yVar = new y71.y(new p1(v1Var, null), v1Var.w.a(v1Var.x.d(), v1Var.s, null, null, new m1(v1Var, 1)));
            q1 q1Var = new q1(v1Var);
            this.v = 1;
            if (yVar.b(q1Var, this) == aVar) {
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
