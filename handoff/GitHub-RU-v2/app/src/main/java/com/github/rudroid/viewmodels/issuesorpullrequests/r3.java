package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$fetchDefaultMergeMessage$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {933}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class r3 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ w2 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(w2 w2Var, String str, a71.c cVar) {
        super(2, cVar);
        this.w = w2Var;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new r3(this.w, this.x, cVar);
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
            y71.y a = w2Var.U.a(w2Var.e0.d(), this.x, new x3(w2Var, 8));
            q3 q3Var = new q3(w2Var);
            this.v = 1;
            if (a.b(q3Var, this) == aVar) {
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
