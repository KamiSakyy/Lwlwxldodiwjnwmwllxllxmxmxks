package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.PullRequestsViewModel$checkRepositoryEmptyAndArchivedStatus$1", f = "PullRequestsViewModel.kt", l = {157}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class c6 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ a6 w;
    public final /* synthetic */ oa.j x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(a6 a6Var, oa.j jVar, a71.c cVar) {
        super(2, cVar);
        this.w = a6Var;
        this.x = jVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new c6(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            a6 a6Var = this.w;
            ml.i iVar = a6Var.x;
            String str = a6Var.G;
            if (str == null) {
                str = "";
            }
            String T = a6Var.T();
            String str2 = T != null ? T : "";
            x5 x5Var = new x5(a6Var, 2);
            iVar.getClass();
            oa.j jVar = this.x;
            k71.k.g(jVar, "user");
            y71.y J = b31.b.J(((z01.g1) iVar.a.a(jVar)).l(str, str2), jVar, x5Var);
            b6 b6Var = new b6(a6Var);
            this.v = 1;
            if (J.b(b6Var, this) == aVar) {
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
