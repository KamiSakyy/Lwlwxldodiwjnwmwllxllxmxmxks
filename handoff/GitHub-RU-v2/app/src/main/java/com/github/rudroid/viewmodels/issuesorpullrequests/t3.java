package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$fetchIssueOrPullRequestDeeplink$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {965}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class t3 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ w2 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(w2 w2Var, String str, a71.c cVar) {
        super(2, cVar);
        this.w = w2Var;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new t3(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        w2 w2Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            y71.y a = w2Var.A.a(w2Var.e0.d(), w2Var.f0(), w2Var.e0(), w2Var.c0(), this.x, new com.github.rudroid.actions.checklog.t(4));
            s3 s3Var = new s3(w2Var);
            this.v = 1;
            if (a.b(s3Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        String str = w2Var.r0;
        w2Var.g0(str, str != null);
        String str2 = w2Var.r0;
        if (str2 != null) {
            y71.y1 y1Var = w2Var.s0;
            y1Var.getClass();
            y1Var.k((Object) null, str2);
        }
        return w61.a0.a;
    }
}
