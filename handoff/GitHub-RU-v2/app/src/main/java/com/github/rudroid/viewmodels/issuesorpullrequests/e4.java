package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$lockIssueOrPullRequest$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {525, 539}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class e4 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ w2 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(w2 w2Var, String str, a71.c cVar) {
        super(2, cVar);
        this.w = w2Var;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new e4(this.w, this.x, cVar);
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
        w2 w2Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            kj.z zVar = w2Var.K;
            oa.j d = w2Var.e0.d();
            x3 x3Var = new x3(w2Var, 9);
            this.v = 1;
            obj = zVar.a(d, this.x, x3Var, this);
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
        y71.y yVar = new y71.y(new c4(w2Var, null), (y71.i) obj);
        d4 d4Var = new d4(w2Var);
        this.v = 2;
    }
}
