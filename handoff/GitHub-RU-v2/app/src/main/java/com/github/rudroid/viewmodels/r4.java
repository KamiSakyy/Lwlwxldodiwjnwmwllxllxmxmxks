package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.PullRequestReviewViewModel$refresh$1", f = "PullRequestReviewViewModel.kt", l = {160}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class r4 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ c5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(c5 c5Var, a71.c cVar) {
        super(2, cVar);
        this.w = c5Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new r4(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return a0Var;
        }
        sy.y.j(obj);
        c5 c5Var = this.w;
        yz0.l3 l3Var = (yz0.l3) c5Var.I.getValue();
        if (l3Var != null) {
            String str = l3Var.a;
            zk.e1 e1Var = c5Var.v;
            oa.j d = c5Var.D.d();
            i4 i4Var = new i4(c5Var, 2);
            e1Var.getClass();
            y71.y yVar = new y71.y(new p4(c5Var, null), b31.b.J(((z01.h1) e1Var.a.a(d)).b(str), d, i4Var));
            q4 q4Var = new q4(c5Var);
            this.v = 1;
            if (yVar.b(q4Var, this) == aVar) {
                return aVar;
            }
        }
        return a0Var;
    }
}
