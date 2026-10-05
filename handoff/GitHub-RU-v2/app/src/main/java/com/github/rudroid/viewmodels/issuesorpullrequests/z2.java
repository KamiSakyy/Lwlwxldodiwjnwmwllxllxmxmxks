package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$approveRequiredWorkflowRuns$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {770}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class z2 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ w2 w;
    public final /* synthetic */ yz0.i2 x;
    public final /* synthetic */ androidx.lifecycle.p0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(w2 w2Var, yz0.i2 i2Var, androidx.lifecycle.p0 p0Var, a71.c cVar) {
        super(2, cVar);
        this.w = w2Var;
        this.x = i2Var;
        this.y = p0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new z2(this.w, this.x, this.y, cVar);
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
            zk.f fVar = w2Var.E;
            oa.j d = w2Var.e0.d();
            String str = this.x.h;
            androidx.lifecycle.p0 p0Var = this.y;
            y71.y a = fVar.a(d, str, new n(p0Var, 2));
            y2 y2Var = new y2(p0Var);
            this.v = 1;
            if (a.b(y2Var, this) == aVar) {
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
