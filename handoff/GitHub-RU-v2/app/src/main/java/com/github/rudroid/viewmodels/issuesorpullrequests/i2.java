package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestViewModel$unlockIssueOrPullRequest$1", f = "IssueOrPullRequestViewModel.kt", l = {567, 583}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class i2 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ l w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(l lVar, String str, a71.c cVar) {
        super(2, cVar);
        this.w = lVar;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new i2(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r3.b(r8, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r8 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        l lVar = this.w;
        if (i == 0) {
            sy.y.j(obj);
            kj.o0 o0Var = lVar.L;
            oa.j d = lVar.e0.d();
            n0 n0Var = new n0(lVar, 17);
            this.v = 1;
            obj = o0Var.a(d, this.x, n0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
        }
        y71.y yVar = new y71.y(new g2(lVar, null), (y71.i) obj);
        h2 h2Var = new h2(lVar);
        this.v = 2;
    }
}
