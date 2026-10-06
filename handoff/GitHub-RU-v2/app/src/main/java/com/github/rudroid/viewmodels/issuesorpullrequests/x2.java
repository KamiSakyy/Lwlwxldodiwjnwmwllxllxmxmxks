package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$addReaction$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {781, 787}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class x2 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ w2 w;
    public final /* synthetic */ yz0.r3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(w2 w2Var, yz0.r3 r3Var, a71.c cVar) {
        super(2, cVar);
        this.w = w2Var;
        this.x = r3Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new x2(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (y71.n1Shadow.j((y71.i) r11, r10) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r11 == r0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        x2 x2Var;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            w2 w2Var = this.w;
            kj.g gVar = w2Var.F;
            oa.j d = w2Var.e0.d();
            yz0.i2 i2Var = (yz0.i2) ((com.github.rudroid.utilities.ui.g1) w2Var.j0.getValue()).getData();
            String str = i2Var != null ? i2Var.h : null;
            x3 x3Var = new x3(w2Var, 2);
            this.v = 1;
            x2Var = this;
            obj = gVar.a(d, str, this.x, x3Var, x2Var);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            x2Var = this;
        }
        x2Var.v = 2;
    }
}
