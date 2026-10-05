package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$deleteBranch$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {719, 733}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class l3 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ w2 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(w2 w2Var, String str, a71.c cVar) {
        super(2, cVar);
        this.w = w2Var;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new l3(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        if (r3.b(r13, r12) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r13 == r0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        String str;
        l3 l3Var;
        yz0.c2 c2Var;
        b71.a aVar = b71.a.r;
        int i = this.v;
        w2 w2Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            zk.m mVar = w2Var.C;
            oa.j d = w2Var.e0.d();
            String d0 = w2Var.d0();
            yz0.i2 i2Var = (yz0.i2) ((com.github.rudroid.utilities.ui.g1) w2Var.k0.r.getValue()).getData();
            if (i2Var == null || (c2Var = i2Var.X) == null || (str = c2Var.b) == null) {
                str = "";
            }
            String str2 = str;
            x3 x3Var = new x3(w2Var, 6);
            this.v = 1;
            l3Var = this;
            obj = mVar.a(d, d0, this.x, str2, x3Var, l3Var);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            l3Var = this;
        }
        y71.y yVar = new y71.y(new j3(w2Var, null), (y71.i) obj);
        k3 k3Var = new k3(w2Var);
        l3Var.v = 2;
    }
}
