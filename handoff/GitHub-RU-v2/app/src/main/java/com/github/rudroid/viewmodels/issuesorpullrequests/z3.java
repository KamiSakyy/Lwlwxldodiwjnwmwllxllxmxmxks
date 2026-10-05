package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$loadInitialPage$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {994}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class z3 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ w2 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(w2 w2Var, String str, boolean z, a71.c cVar) {
        super(2, cVar);
        this.w = w2Var;
        this.x = str;
        this.y = z;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new z3(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            w2 w2Var = this.w;
            zk.p0 p0Var = w2Var.w;
            oa.j d = w2Var.e0.d();
            String f0 = w2Var.f0();
            String e0 = w2Var.e0();
            int c0 = w2Var.c0();
            String str = this.x;
            y71.y a = p0Var.a(d, f0, e0, c0, str, str != null ? z01.b0.t : z01.b0.r, new x3(w2Var, 0));
            y3 y3Var = new y3(w2Var, this.y);
            this.v = 1;
            if (a.b(y3Var, this) == aVar) {
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
