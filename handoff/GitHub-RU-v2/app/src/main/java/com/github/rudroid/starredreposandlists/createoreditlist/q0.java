package com.github.rudroid.starredreposandlists.createoreditlist;

@c71.e(c = "com.github.rudroid.starredreposandlists.createoreditlist.EditListViewModel$1", f = "EditListViewModel.kt", l = {56}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class q0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ u0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(u0 u0Var, a71.c cVar) {
        super(2, cVar);
        this.w = u0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new q0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        u0 u0Var = this.w;
        com.github.rudroid.activities.util.c cVar = u0Var.u;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            ym.d dVar = u0Var.s;
            oa.j d = cVar.d();
            String str = cVar.d().c;
            String str2 = u0Var.v.a;
            n0 n0Var = new n0(u0Var, 0);
            dVar.getClass();
            k71.k.g(str, "login");
            k71.k.g(str2, "slug");
            y71.y yVar = new y71.y(new o0(u0Var, null), b31.b.J(((z01.j0) dVar.a.a(d)).g(str, str2), d, n0Var));
            p0 p0Var = new p0(u0Var);
            this.v = 1;
            if (yVar.b(p0Var, this) == aVar) {
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
