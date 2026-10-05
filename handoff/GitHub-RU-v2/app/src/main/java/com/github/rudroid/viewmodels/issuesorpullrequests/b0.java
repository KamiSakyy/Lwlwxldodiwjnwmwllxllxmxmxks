package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestViewModel$deleteBranch$1", f = "IssueOrPullRequestViewModel.kt", l = {734, 748}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class b0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ l w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(l lVar, String str, a71.c cVar) {
        super(2, cVar);
        this.w = lVar;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new b0(this.w, this.x, cVar);
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
        b0 b0Var;
        yz0.c2 c2Var;
        b71.a aVar = b71.a.r;
        int i = this.v;
        l lVar = this.w;
        if (i == 0) {
            sy.y.j(obj);
            zk.m mVar = lVar.C;
            oa.j d = lVar.e0.d();
            String d0 = lVar.d0();
            yz0.i2 i2Var = (yz0.i2) ((com.github.rudroid.utilities.ui.g1) lVar.k0.r.getValue()).getData();
            if (i2Var == null || (c2Var = i2Var.X) == null || (str = c2Var.b) == null) {
                str = "";
            }
            String str2 = str;
            n0 n0Var = new n0(lVar, 6);
            this.v = 1;
            b0Var = this;
            obj = mVar.a(d, d0, this.x, str2, n0Var, b0Var);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            b0Var = this;
        }
        y71.y yVar = new y71.y(new z(lVar, null), (y71.i) obj);
        a0 a0Var = new a0(lVar);
        b0Var.v = 2;
    }
}
