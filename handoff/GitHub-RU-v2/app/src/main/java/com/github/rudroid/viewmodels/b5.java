package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.PullRequestReviewViewModel$unblockUserFromOrg$1", f = "PullRequestReviewViewModel.kt", l = {235}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class b5 extends c71.j implements j71.e {
    public final /* synthetic */ y71.y1 A;
    public int v;
    public final /* synthetic */ c5 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(c5 c5Var, String str, String str2, String str3, y71.y1 y1Var, a71.c cVar) {
        super(2, cVar);
        this.w = c5Var;
        this.x = str;
        this.y = str2;
        this.z = str3;
        this.A = y1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new b5(this.w, this.x, this.y, this.z, this.A, cVar);
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
            bj.g gVar = c5Var.A;
            oa.j d = c5Var.D.d();
            y71.y1 y1Var = this.A;
            com.github.rudroid.favorites.viewmodels.d dVar = new com.github.rudroid.favorites.viewmodels.d(y1Var, 10);
            gVar.getClass();
            String str = this.x;
            k71.k.g(str, "blockUserId");
            String str2 = this.y;
            k71.k.g(str2, "organizationId");
            y71.y yVar = new y71.y(new z4(y1Var, null), b31.b.J(((z01.d) gVar.a.a(d)).f(str, str2, this.z), d, dVar));
            a5 a5Var = new a5(y1Var);
            this.v = 1;
            if (yVar.b(a5Var, this) == aVar) {
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
