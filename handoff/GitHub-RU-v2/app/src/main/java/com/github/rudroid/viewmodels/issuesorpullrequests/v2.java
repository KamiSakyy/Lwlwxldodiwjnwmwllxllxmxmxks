package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$2", f = "LegacyIssueOrPullRequestViewModel.kt", l = {381}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class v2 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ w2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(w2 w2Var, a71.c cVar) {
        super(2, cVar);
        this.w = w2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new v2(this.w, cVar);
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
            y71.i p = y71.n1.p(new wd.e(w2Var.b0.a.b));
            u2 u2Var = new u2(w2Var);
            this.v = 1;
            if (p.b(u2Var, this) == aVar) {
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
