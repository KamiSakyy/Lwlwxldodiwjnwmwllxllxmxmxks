package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestViewModel$toggleSubscription$1$1", f = "IssueOrPullRequestViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class u1 extends c71.j implements j71.e {
    public final /* synthetic */ yz0.i2 v;
    public final /* synthetic */ l w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(yz0.i2 i2Var, l lVar, a71.c cVar) {
        super(2, cVar);
        this.v = i2Var;
        this.w = lVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new u1(this.v, this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        u1 r = r((a71.c) obj2, (v71.z) obj);
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
        l lVar = this.w;
        if (z) {
            v71.b0.z(androidx.lifecycle.d1.k(lVar), (a71.h) null, (v71.a0Shadow) null, new l2(lVar, str, null), 3);
        } else {
            v71.b0.z(androidx.lifecycle.d1.k(lVar), (a71.h) null, (v71.a0Shadow) null, new t1(lVar, str, null), 3);
        }
        return w61.a0.a;
    }
}
