package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestViewModel$unblockUserFromOrg$1", f = "IssueOrPullRequestViewModel.kt", l = {1275}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f2 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ l w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(l lVar, String str, String str2, String str3, a71.c cVar) {
        super(2, cVar);
        this.w = lVar;
        this.x = str;
        this.y = str2;
        this.z = str3;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f2(this.w, this.x, this.y, this.z, cVar);
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
            bj.f fVar = lVar.J;
            oa.j d = lVar.e0.d();
            String d0 = lVar.d0();
            String str = this.z;
            y71.y yVar = new y71.y(new d2(lVar, str, null), fVar.a(d, this.x, this.y, d0, new com.github.rudroid.repositories.repositoryownerrepositories.d(21, lVar, str)));
            e2 e2Var = new e2(lVar, str);
            this.v = 1;
            if (yVar.b(e2Var, this) == aVar) {
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
