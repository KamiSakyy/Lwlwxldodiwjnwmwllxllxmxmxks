package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestViewModel$removeReaction$1", f = "IssueOrPullRequestViewModel.kt", l = {810, 816}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class l1 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ l w;
    public final /* synthetic */ yz0.r3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(l lVar, yz0.r3 r3Var, a71.c cVar) {
        super(2, cVar);
        this.w = lVar;
        this.x = r3Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new l1(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (y71.n1Shadow.j((y71.i) r11, r10) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r11 == r0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        l1 l1Var;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            l lVar = this.w;
            kj.g0 g0Var = lVar.G;
            oa.j d = lVar.e0.d();
            yz0.i2 i2Var = (yz0.i2) ((com.github.rudroid.utilities.ui.g1) lVar.j0.getValue()).getData();
            String str = i2Var != null ? i2Var.h : null;
            n0 n0Var = new n0(lVar, 14);
            this.v = 1;
            l1Var = this;
            obj = g0Var.a(d, str, this.x, n0Var, l1Var);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            l1Var = this;
        }
        l1Var.v = 2;
    }
}
