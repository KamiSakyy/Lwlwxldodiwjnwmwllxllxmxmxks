package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$unPinIssue$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {746, 753}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class l5 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ w2 w;
    public final /* synthetic */ androidx.lifecycle.p0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(w2 w2Var, androidx.lifecycle.p0 p0Var, a71.c cVar) {
        super(2, cVar);
        this.w = w2Var;
        this.x = p0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new l5(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (((y71.i) r13).b(r1, r12) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r13 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        l5 l5Var;
        b71.a aVar = b71.a.r;
        int i = this.v;
        androidx.lifecycle.p0 p0Var = this.x;
        if (i == 0) {
            sy.y.j(obj);
            w2 w2Var = this.w;
            zk.s1 s1Var = w2Var.Q;
            oa.j d = w2Var.e0.d();
            String d0 = w2Var.d0();
            String f0 = w2Var.f0();
            String e0 = w2Var.e0();
            n nVar = new n(p0Var, 3);
            this.v = 1;
            l5Var = this;
            obj = s1Var.a(d, d0, f0, e0, nVar, l5Var);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            l5Var = this;
        }
        k5 k5Var = new k5(p0Var);
        l5Var.v = 2;
    }
}
