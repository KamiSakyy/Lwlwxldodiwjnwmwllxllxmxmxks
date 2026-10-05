package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.PullRequestReviewViewModel$fetchPullRequestReviewFromDeeplink$1", f = "PullRequestReviewViewModel.kt", l = {116}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class l4 extends c71.j implements j71.e {
    public final /* synthetic */ String A;
    public int v;
    public final /* synthetic */ c5 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(c5 c5Var, String str, String str2, int i, String str3, a71.c cVar) {
        super(2, cVar);
        this.w = c5Var;
        this.x = str;
        this.y = str2;
        this.z = i;
        this.A = str3;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new l4(this.w, this.x, this.y, this.z, this.A, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            c5 c5Var = this.w;
            y71.y yVar = new y71.y(new j4(c5Var, null), c5Var.B.a(c5Var.D.d(), this.x, this.y, this.z, this.A, new i4(c5Var, 0)));
            k4 k4Var = new k4(c5Var);
            this.v = 1;
            if (yVar.b(k4Var, this) == aVar) {
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
