package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$observeBannerModel$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {896, 900}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class j4 extends c71.j implements j71.e {
    public zk.v0 v;
    public int w;
    public final /* synthetic */ w2 x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(w2 w2Var, String str, a71.c cVar) {
        super(2, cVar);
        this.x = w2Var;
        this.y = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new j4(this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r7.b(r1, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r7 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        zk.v0 v0Var;
        b71.a aVar = b71.a.r;
        int i = this.w;
        w2 w2Var = this.x;
        if (i == 0) {
            sy.y.j(obj);
            v0Var = w2Var.x;
            com.github.rudroid.activities.util.c cVar = w2Var.e0;
            this.v = v0Var;
            this.w = 1;
            cVar.getClass();
            obj = com.github.rudroid.activities.util.a.c(cVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            v0Var = this.v;
            sy.y.j(obj);
        }
        y71.y a = v0Var.a((oa.j) obj, this.y, new com.github.rudroid.actions.checklog.t(4));
        i4 i4Var = new i4(w2Var);
        this.v = null;
        this.w = 2;
    }
}
