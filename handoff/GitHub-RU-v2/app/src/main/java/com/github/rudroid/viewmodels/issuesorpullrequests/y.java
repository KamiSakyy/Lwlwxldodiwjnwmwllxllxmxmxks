package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestViewModel$closePullRequest$1", f = "IssueOrPullRequestViewModel.kt", l = {622}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class y extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ l w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(l lVar, String str, a71.c cVar) {
        super(2, cVar);
        this.w = lVar;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new y(this.w, this.x, cVar);
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
            y71.y yVar = new y71.y(new w(lVar, null), lVar.P.a(lVar.e0.d(), this.x, new n0(lVar, 5)));
            x xVar = new x(lVar);
            this.v = 1;
            if (yVar.b(xVar, this) == aVar) {
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
