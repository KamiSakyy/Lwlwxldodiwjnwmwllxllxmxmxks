package com.github.rudroid.viewmodels.issuesorpullrequests;

import java.util.List;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$requestReviewFromSuggestedReviewer$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {1201}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class y4 extends c71.j implements j71.e {
    public final /* synthetic */ yz0.g2 A;
    public int v;
    public final /* synthetic */ w2 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ List y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(w2 w2Var, String str, List list, List list2, yz0.g2 g2Var, a71.c cVar) {
        super(2, cVar);
        this.w = w2Var;
        this.x = str;
        this.y = list;
        this.z = list2;
        this.A = g2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new y4(this.w, this.x, this.y, this.z, this.A, cVar);
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
            zk.b1 b1Var = w2Var.D;
            oa.j d = w2Var.e0.d();
            yz0.g2 g2Var = this.A;
            y71.y yVar = new y71.y(new w4(w2Var, g2Var, null), b1Var.a(d, this.x, this.y, this.z, new com.github.rudroid.repositories.repositoryownerrepositories.d(22, w2Var, g2Var)));
            x4 x4Var = new x4(w2Var, g2Var);
            this.v = 1;
            if (yVar.b(x4Var, this) == aVar) {
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
