package com.github.rudroid.viewmodels;

import com.github.rudroid.issueorpullrequest.navigation.EditIssueOrPullTitleRoute;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 extends androidx.lifecycle.k1 implements u0 {
    public final zk.p s;
    public final zk.q t;
    public final com.github.rudroid.activities.util.c u;
    public final String v;
    public final boolean w;
    public final String x;

    public e0(zk.p pVar, zk.q qVar, com.github.rudroid.activities.util.c cVar, androidx.lifecycle.a1 a1Var) {
        k71.k.g(pVar, "editIssueTitleUseCase");
        k71.k.g(qVar, "editPullRequestTitleUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.s = pVar;
        this.t = qVar;
        this.u = cVar;
        EditIssueOrPullTitleRoute editIssueOrPullTitleRoute = (EditIssueOrPullTitleRoute) sy.y.m(a1Var, k71.x.a(EditIssueOrPullTitleRoute.class), x61.s.r);
        this.v = editIssueOrPullTitleRoute.r;
        this.w = editIssueOrPullTitleRoute.t;
        this.x = editIssueOrPullTitleRoute.s;
    }

    @Override // com.github.rudroid.viewmodels.u0
    public final String n() {
        return this.x;
    }

    @Override // com.github.rudroid.viewmodels.u0
    public final y71.i1 q(String str) {
        k71.k.g(str, "titleText");
        y71.y1 s = com.github.rudroid.m0.s(fl.f.Companion, (Object) null);
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new d0(this, str, s, null), 3);
        return new y71.i1(s);
    }

    @Override // com.github.rudroid.viewmodels.u0
    public final boolean y(String str) {
        k71.k.g(str, "titleText");
        return (t71.p.T(str) || t71.p.T(this.v)) ? false : true;
    }
}
