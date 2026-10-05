package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$markAsRead$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {415}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f4 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ w2 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(w2 w2Var, String str, a71.c cVar) {
        super(2, cVar);
        this.w = w2Var;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f4(this.w, this.x, cVar);
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
            zk.m0 m0Var = w2Var.B;
            oa.j d = w2Var.e0.d();
            com.github.rudroid.utilities.ui.emojipicker.e eVar = new com.github.rudroid.utilities.ui.emojipicker.e(5);
            this.v = 1;
            if (m0Var.a(d, this.x, eVar, this) == aVar) {
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
