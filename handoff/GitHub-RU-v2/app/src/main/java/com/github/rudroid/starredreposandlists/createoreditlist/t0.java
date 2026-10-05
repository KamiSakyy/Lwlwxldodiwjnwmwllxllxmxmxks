package com.github.rudroid.starredreposandlists.createoreditlist;

@c71.e(c = "com.github.rudroid.starredreposandlists.createoreditlist.EditListViewModel$saveList$1", f = "EditListViewModel.kt", l = {76}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class t0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ u0 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, String str, String str2, a71.c cVar) {
        super(2, cVar);
        this.w = u0Var;
        this.x = str;
        this.y = str2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new t0(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        String str;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            u0 u0Var = this.w;
            ym.c cVar = u0Var.t;
            oa.j d = u0Var.u.d();
            xz0.h hVar = (xz0.h) ((fl.f) u0Var.x.r.getValue()).b;
            if (hVar == null || (str = hVar.r) == null) {
                throw new IllegalStateException("List id must be set");
            }
            n0 n0Var = new n0(u0Var, 1);
            cVar.getClass();
            String str2 = this.x;
            k71.k.g(str2, "title");
            String str3 = this.y;
            k71.k.g(str3, "description");
            y71.y yVar = new y71.y(new r0(u0Var, null), b31.b.J(((z01.j0) cVar.a.a(d)).b(str, str2, str3), d, n0Var));
            s0 s0Var = new s0(u0Var);
            this.v = 1;
            if (yVar.b(s0Var, this) == aVar) {
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
