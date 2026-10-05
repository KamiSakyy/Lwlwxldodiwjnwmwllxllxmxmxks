package com.github.rudroid.viewmodels.issuesorpullrequests;

import com.github.rudroid.issueorpullrequest.g;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$unblockUserFromOrg$1$2", f = "LegacyIssueOrPullRequestViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class m5 extends c71.j implements j71.e {
    public final /* synthetic */ w2 v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(w2 w2Var, String str, a71.c cVar) {
        super(2, cVar);
        this.v = w2Var;
        this.w = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new m5(this.v, this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        m5 r = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        y71.m1 m1Var = this.v.t0;
        fl.e eVar = fl.f.Companion;
        g.f fVar = new g.f(this.w);
        eVar.getClass();
        m1Var.m(fl.e.b(fVar));
        return w61.a0.a;
    }
}
