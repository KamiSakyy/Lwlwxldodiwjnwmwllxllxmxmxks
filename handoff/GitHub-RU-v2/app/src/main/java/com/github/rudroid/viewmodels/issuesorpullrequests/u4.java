package com.github.rudroid.viewmodels.issuesorpullrequests;

import java.util.List;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$reRequestReview$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {1232}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class u4 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ w2 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ List y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(w2 w2Var, String str, List list, List list2, a71.c cVar) {
        super(2, cVar);
        this.w = w2Var;
        this.x = str;
        this.y = list;
        this.z = list2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new u4(this.w, this.x, this.y, this.z, cVar);
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
            y71.y a = w2Var.D.a(w2Var.e0.d(), this.x, this.y, this.z, new x3(w2Var, 13));
            this.v = 1;
            if (y71.n1.j(a, this) == aVar) {
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
