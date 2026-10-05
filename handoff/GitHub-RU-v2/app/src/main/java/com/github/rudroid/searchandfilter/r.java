package com.github.rudroid.searchandfilter;

import com.github.rudroid.searchandfilter.e0;
import com.github.rudroid.searchandfilter.q;
import java.util.ArrayList;
import java.util.List;
import y71.y1;

@c71.e(c = "com.github.rudroid.searchandfilter.FilterBarViewModel$loadPersistedFilters$1", f = "FilterBarViewModel.kt", l = {396}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class r extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ q.c w;
    public final /* synthetic */ q x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q.c cVar, q qVar, a71.c cVar2) {
        super(2, cVar2);
        this.w = cVar;
        this.x = qVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new r(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        a71.c cVar = null;
        if (i == 0) {
            sy.y.j(obj);
            q.c cVar2 = this.w;
            yl.c cVar3 = cVar2.d;
            oa.j d = cVar2.a.d();
            fk.f fVar = cVar2.e;
            this.v = 1;
            if (fVar instanceof fk.j) {
                cVar3.getClass();
                obj = null;
            } else {
                obj = v71.b0.L(cVar3.c, new yl.b(cVar3, d, fVar, cVar, 0), this);
            }
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        x61.r rVar = (List) obj;
        q qVar = this.x;
        y1 y1Var = qVar.E;
        List list = qVar.t;
        if (rVar == null) {
            rVar = x61.r.r;
        }
        ArrayList a = c0.a(list, rVar);
        y1Var.getClass();
        y1Var.k((Object) null, a);
        qVar.Z(e0.b.r);
        return w61.a0.a;
    }
}
