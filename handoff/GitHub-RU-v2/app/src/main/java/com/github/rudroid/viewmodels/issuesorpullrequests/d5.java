package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$toggleSubscription$1$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d5 extends c71.j implements j71.e {
    public final /* synthetic */ yz0.i2 v;
    public final /* synthetic */ w2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(yz0.i2 i2Var, w2 w2Var, a71.c cVar) {
        super(2, cVar);
        this.v = i2Var;
        this.w = w2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d5(this.v, this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        d5 r = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        yz0.i2 i2Var = this.v;
        String str = i2Var.h;
        boolean z = i2Var.i;
        w2 w2Var = this.w;
        if (z) {
            v71.b0.z(androidx.lifecycle.d1.k(w2Var), (a71.h) null, (v71.a0) null, new u5(w2Var, str, null), 3);
        } else {
            v71.b0.z(androidx.lifecycle.d1.k(w2Var), (a71.h) null, (v71.a0) null, new c5(w2Var, str, null), 3);
        }
        return w61.a0.a;
    }
}
