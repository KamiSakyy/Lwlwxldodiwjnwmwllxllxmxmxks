package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestViewModel$fetchIssueOrPullRequestDeeplink$1", f = "IssueOrPullRequestViewModel.kt", l = {980}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class j0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ l w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l lVar, String str, a71.c cVar) {
        super(2, cVar);
        this.w = lVar;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new j0(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        l lVar = this.w;
        if (i == 0) {
            sy.y.j(obj);
            y71.y a = lVar.A.a(lVar.e0.d(), lVar.f0(), lVar.e0(), lVar.c0(), this.x, new com.github.rudroid.actions.checklog.t(4));
            i0 i0Var = new i0(lVar);
            this.v = 1;
            if (a.b(i0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        String str = lVar.r0;
        lVar.g0(str, str != null);
        String str2 = lVar.r0;
        if (str2 != null) {
            y71.y1 y1Var = lVar.s0;
            y1Var.getClass();
            y1Var.k((Object) null, str2);
        }
        return w61.a0.a;
    }
}
