package com.github.rudroid.starredreposandlists.listdetails;

import y71.y1;

@c71.e(c = "com.github.rudroid.starredreposandlists.listdetails.ListDetailViewModel$deleteList$1$1", f = "ListDetailViewModel.kt", l = {142}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class j0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ s0 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ y1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(s0 s0Var, String str, y1 y1Var, a71.c cVar) {
        super(2, cVar);
        this.w = s0Var;
        this.x = str;
        this.y = y1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new j0(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            s0 s0Var = this.w;
            ym.b bVar = s0Var.t;
            oa.j d = s0Var.u.d();
            y1 y1Var = this.y;
            g gVar = new g(1, y1Var);
            bVar.getClass();
            y71.y J = b31.b.J(((z01.j0) bVar.a.a(d)).d(this.x, d.c), d, gVar);
            i0 i0Var = new i0(y1Var);
            this.v = 1;
            if (J.b(i0Var, this) == aVar) {
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
