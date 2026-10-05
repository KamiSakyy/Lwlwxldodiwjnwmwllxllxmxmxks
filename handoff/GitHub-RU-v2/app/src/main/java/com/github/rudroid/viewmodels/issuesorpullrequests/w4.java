package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$requestReviewFromSuggestedReviewer$1$2", f = "LegacyIssueOrPullRequestViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class w4 extends c71.j implements j71.e {
    public final /* synthetic */ w2 v;
    public final /* synthetic */ yz0.g2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(w2 w2Var, yz0.g2 g2Var, a71.c cVar) {
        super(2, cVar);
        this.v = w2Var;
        this.w = g2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new w4(this.v, this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        w4 r = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        y71.y1 y1Var = this.v.m0;
        d6 d6Var = (d6) y1Var.getValue();
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        d6 a = d6.a(d6Var, false, false, false, null, null, false, false, new com.github.rudroid.utilities.ui.u0(this.w), 16383);
        y1Var.getClass();
        y1Var.k((Object) null, a);
        return w61.a0.a;
    }
}
