package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$setupAliveUpdates$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {1326}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class z4 extends c71.j implements j71.e {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public int v;
    public final /* synthetic */ w2 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(w2 w2Var, boolean z, String str, String str2, int i, String str3, a71.c cVar) {
        super(2, cVar);
        this.w = w2Var;
        this.x = z;
        this.y = str;
        this.z = str2;
        this.A = i;
        this.B = str3;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new z4(this.w, this.x, this.y, this.z, this.A, this.B, cVar);
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
            e eVar = w2Var.Y;
            p1 p1Var = new p1(w2Var, 1);
            x3 x3Var = new x3(w2Var, 15);
            this.v = 1;
            if (eVar.a(this.x, this.y, this.z, this.A, this.B, p1Var, x3Var, this) == aVar) {
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
