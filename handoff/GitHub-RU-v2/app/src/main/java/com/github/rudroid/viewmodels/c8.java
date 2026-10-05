package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.SubIssuesViewModel$observe$1", f = "SubIssuesViewModel.kt", l = {95}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class c8 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ g8 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(g8 g8Var, String str, a71.c cVar) {
        super(2, cVar);
        this.w = g8Var;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new c8(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            g8 g8Var = this.w;
            zk.u0 u0Var = g8Var.u;
            oa.j d = g8Var.v.d();
            z7 z7Var = new z7(g8Var, 2);
            u0Var.getClass();
            String str = this.x;
            k71.k.g(str, "issueId");
            y71.y yVar = new y71.y(new a8(g8Var, null), b31.b.J(((z01.f0) u0Var.a.a(d)).g(str), d, z7Var));
            b8 b8Var = new b8(g8Var, str);
            this.v = 1;
            if (yVar.b(b8Var, this) == aVar) {
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
