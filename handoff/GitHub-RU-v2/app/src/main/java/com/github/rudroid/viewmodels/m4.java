package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.PullRequestReviewViewModel$fetchReviewById$1$2", f = "PullRequestReviewViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class m4 extends c71.j implements j71.e {
    public final /* synthetic */ c5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(c5 c5Var, a71.c cVar) {
        super(2, cVar);
        this.v = c5Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new m4(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        m4 r = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        y71.y1 y1Var = this.v.H;
        yz0.l3 l3Var = (yz0.l3) ((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData();
        if (l3Var != null) {
            com.github.rudroid.utilities.ui.g1.Companion.getClass();
            com.github.rudroid.utilities.ui.r0 r0Var = new com.github.rudroid.utilities.ui.r0(l3Var);
            y1Var.getClass();
            y1Var.k((Object) null, r0Var);
        } else {
            com.github.rudroid.utilities.ui.g1.Companion.getClass();
            com.github.rudroid.utilities.ui.u0 u0Var = new com.github.rudroid.utilities.ui.u0(l3Var);
            y1Var.getClass();
            y1Var.k((Object) null, u0Var);
        }
        return w61.a0.a;
    }
}
