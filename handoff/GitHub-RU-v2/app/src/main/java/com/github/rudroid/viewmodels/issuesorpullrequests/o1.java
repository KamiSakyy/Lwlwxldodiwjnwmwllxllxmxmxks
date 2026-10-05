package com.github.rudroid.viewmodels.issuesorpullrequests;

import java.util.List;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestViewModel$requestReviewFromSuggestedReviewer$1", f = "IssueOrPullRequestViewModel.kt", l = {1216}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class o1 extends c71.j implements j71.e {
    public final /* synthetic */ yz0.g2 A;
    public int v;
    public final /* synthetic */ l w;
    public final /* synthetic */ String x;
    public final /* synthetic */ List y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(l lVar, String str, List list, List list2, yz0.g2 g2Var, a71.c cVar) {
        super(2, cVar);
        this.w = lVar;
        this.x = str;
        this.y = list;
        this.z = list2;
        this.A = g2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new o1(this.w, this.x, this.y, this.z, this.A, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            l lVar = this.w;
            zk.b1 b1Var = lVar.D;
            oa.j d = lVar.e0.d();
            yz0.g2 g2Var = this.A;
            y71.y yVar = new y71.y(new m1(lVar, g2Var, null), b1Var.a(d, this.x, this.y, this.z, new com.github.rudroid.repositories.repositoryownerrepositories.d(19, lVar, g2Var)));
            n1 n1Var = new n1(lVar, g2Var);
            this.v = 1;
            if (yVar.b(n1Var, this) == aVar) {
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
