package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestViewModel$2", f = "IssueOrPullRequestViewModel.kt", l = {396}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ l w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, a71.c cVar) {
        super(2, cVar);
        this.w = lVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new k(this.w, cVar);
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
            y71.i p = y71.n1Shadow.p(new wd.e(lVar.b0.a.b));
            j jVar = new j(lVar);
            this.v = 1;
            if (p.b(jVar, this) == aVar) {
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
    public Object a(Object p1, Object p2, Object p3, Object p4, boolean p5, Object p6, Object p7, Object p8, Object p9, Object p10) { return null; }
}
