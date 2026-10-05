package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestViewModel$loadNextPage$1", f = "IssueOrPullRequestViewModel.kt", l = {1109}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class q0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ l w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(l lVar, a71.c cVar) {
        super(2, cVar);
        this.w = lVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new q0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            this.v = 1;
            if (l.Q(this.w, false, this) == aVar) {
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
