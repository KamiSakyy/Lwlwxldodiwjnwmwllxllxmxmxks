package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.PullRequestReviewViewModel$resolveReviewThread$1", f = "PullRequestReviewViewModel.kt", l = {202}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class w4 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ c5 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(c5 c5Var, String str, a71.c cVar) {
        super(2, cVar);
        this.w = c5Var;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new w4(this.w, this.x, cVar);
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
            y71.y a = c5Var.w.a(c5Var.D.d(), this.x, new i4(c5Var, 3));
            v4 v4Var = new v4(c5Var);
            this.v = 1;
            if (a.b(v4Var, this) == aVar) {
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
