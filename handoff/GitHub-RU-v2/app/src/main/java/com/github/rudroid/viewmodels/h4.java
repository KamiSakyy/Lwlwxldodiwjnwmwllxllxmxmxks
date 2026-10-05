package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.PullRequestReviewViewModel$deleteReviewComment$1", f = "PullRequestReviewViewModel.kt", l = {176}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class h4 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ c5 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ y71.y1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(c5 c5Var, String str, y71.y1 y1Var, a71.c cVar) {
        super(2, cVar);
        this.w = c5Var;
        this.x = str;
        this.y = y1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new h4(this.w, this.x, this.y, cVar);
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
            hj.e eVar = c5Var.C;
            oa.j d = c5Var.D.d();
            y71.y1 y1Var = this.y;
            y71.y yVar = new y71.y(new f4(y1Var, null), eVar.a(d, this.x, new com.github.rudroid.favorites.viewmodels.d(y1Var, 8)));
            g4 g4Var = new g4(y1Var);
            this.v = 1;
            if (yVar.b(g4Var, this) == aVar) {
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
