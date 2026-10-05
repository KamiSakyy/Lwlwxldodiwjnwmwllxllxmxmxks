package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestViewModel$tryIssueResolver$1", f = "IssueOrPullRequestViewModel.kt", l = {1055}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class w1 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ l w;
    public final /* synthetic */ fl.b x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(l lVar, fl.b bVar, a71.c cVar) {
        super(2, cVar);
        this.w = lVar;
        this.x = bVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new w1(this.w, this.x, cVar);
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
            zk.k1 k1Var = lVar.V;
            oa.j d = lVar.e0.d();
            String f0 = lVar.f0();
            String e0 = lVar.e0();
            int c0 = lVar.c0();
            fl.b bVar = this.x;
            y71.y a = k1Var.a(d, f0, e0, c0, new com.github.rudroid.repositories.repositoryownerrepositories.d(20, lVar, bVar));
            v1 v1Var = new v1(lVar, bVar);
            this.v = 1;
            if (a.b(v1Var, this) == aVar) {
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
