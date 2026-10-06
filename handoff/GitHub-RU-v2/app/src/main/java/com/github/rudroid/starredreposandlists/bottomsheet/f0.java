package com.github.rudroid.starredreposandlists.bottomsheet;

import java.util.List;
import y71.n1;

@c71.e(c = "com.github.rudroid.starredreposandlists.bottomsheet.SaveListSelectionsViewModel$saveListSelections$1", f = "SaveListSelectionsViewModel.kt", l = {34}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ g0 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ List y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, String str, List list, List list2, a71.c cVar) {
        super(2, cVar);
        this.w = g0Var;
        this.x = str;
        this.y = list;
        this.z = list2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f0(this.w, this.x, this.y, this.z, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            g0 g0Var = this.w;
            xm.c cVar = g0Var.t;
            oa.j d = g0Var.u.d();
            g gVar = new g(2, g0Var);
            cVar.getClass();
            y71.y J = b31.b.J(((z01.j0) cVar.a.a(d)).c(this.x, this.y, this.z), d, gVar);
            this.v = 1;
            if (n1.j(J, this) == aVar) {
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
    public Object A(Object p1) { return null; }
}
