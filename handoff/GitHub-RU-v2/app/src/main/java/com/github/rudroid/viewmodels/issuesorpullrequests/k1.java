package com.github.rudroid.viewmodels.issuesorpullrequests;

import java.util.List;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestViewModel$reRequestReview$1", f = "IssueOrPullRequestViewModel.kt", l = {1247}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k1 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ l w;
    public final /* synthetic */ String x;
    public final /* synthetic */ List y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l lVar, String str, List list, List list2, a71.c cVar) {
        super(2, cVar);
        this.w = lVar;
        this.x = str;
        this.y = list;
        this.z = list2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new k1(this.w, this.x, this.y, this.z, cVar);
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
            y71.y a = lVar.D.a(lVar.e0.d(), this.x, this.y, this.z, new n0(lVar, 13));
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
