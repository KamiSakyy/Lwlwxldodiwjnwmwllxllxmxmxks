package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.EditRepositoryDescriptionViewModel$onSaveClick$1", f = "EditRepositoryDescriptionViewModel.kt", l = {101}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class o0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ l0 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(l0 l0Var, String str, a71.c cVar) {
        super(2, cVar);
        this.w = l0Var;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new o0(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            l0 l0Var = this.w;
            ml.q qVar = l0Var.t;
            oa.j d = l0Var.s.d();
            String str = l0Var.u;
            k0 k0Var = new k0(l0Var, 1);
            qVar.getClass();
            k71.k.g(str, "repositoryId");
            String str2 = this.x;
            k71.k.g(str2, "description");
            y71.y yVar = new y71.y(new m0(l0Var, null), b31.b.J(((z01.g1) qVar.a.a(d)).d(str, str2), d, k0Var));
            n0 n0Var = new n0(l0Var);
            this.v = 1;
            if (yVar.b(n0Var, this) == aVar) {
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
