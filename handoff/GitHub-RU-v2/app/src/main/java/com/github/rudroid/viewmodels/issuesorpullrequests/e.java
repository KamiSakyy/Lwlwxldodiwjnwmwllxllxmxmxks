package com.github.rudroid.viewmodels.issuesorpullrequests;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public xi.a a;
    public zi.a b;
    public zk.j0 c;
    public zk.c1 d;
    public com.github.rudroid.activities.util.c e;

    public e(xi.a aVar, zi.a aVar2, zk.j0 j0Var, zk.c1 c1Var, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(aVar, "aliveObserveIssueUseCase");
        k71.k.g(aVar2, "aliveObservePullRequestUseCase");
        k71.k.g(j0Var, "loadLastIssueOrPullRequestTimelineItemsUseCase");
        k71.k.g(c1Var, "refreshIssueOrPullRequestDataUseCase");
        k71.k.g(cVar, "accountHolder");
        this.a = aVar;
        this.b = aVar2;
        this.c = j0Var;
        this.d = c1Var;
        this.e = cVar;
    }

    public final Object a(boolean z, String str, String str2, int i, String str3, j71.a aVar, j71.c cVar, c71.j jVar) {
        y71.y J;
        com.github.rudroid.activities.util.c cVar2 = this.e;
        if (z) {
            oa.j d = cVar2.d();
            sn.b[] bVarArr = sn.b.r;
            J = this.b.a(d, str3, cVar);
        } else {
            oa.j d2 = cVar2.d();
            sn.a[] aVarArr = sn.a.r;
            xi.a aVar2 = this.a;
            aVar2.getClass();
            J = b31.b.J(((pn.a) aVar2.a.a(d2)).b(str3), d2, cVar);
        }
        Object j = y71.n1.j(y71.n1.x(new d(aVar, this, str, str2, i, cVar, null), y71.n1.o(J, 1000L)), jVar);
        b71.a aVar3 = b71.a.r;
        w61.a0 a0Var = w61.a0.a;
        if (j != aVar3) {
            j = a0Var;
        }
        return j == aVar3 ? j : a0Var;
    }
}
