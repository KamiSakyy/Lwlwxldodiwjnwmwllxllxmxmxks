package com.github.rudroid.searchandfilter.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y71.y1;

@c71.e(c = "com.github.rudroid.searchandfilter.ui.FilterBarFragmentBase$subscribeToViewModel$1", f = "FilterBarFragmentBase.kt", l = {140}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class c extends c71.j implements j71.e {
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ FilterBarFragmentBase x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FilterBarFragmentBase filterBarFragmentBase, a71.c cVar) {
        super(2, cVar);
        this.x = filterBarFragmentBase;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        c cVar2 = new c(this.x, cVar);
        cVar2.w = obj;
        return cVar2;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (com.github.rudroid.searchandfilter.d0) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        com.github.rudroid.searchandfilter.d0 d0Var = (com.github.rudroid.searchandfilter.d0) this.w;
        w61.a0 a0Var = b71.a.r;
        int i = this.v;
        w61.a0 a0Var2 = w61.a0.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return a0Var2;
        }
        sy.y.j(obj);
        FilterBarFragmentBase filterBarFragmentBase = this.x;
        y1 y1Var = filterBarFragmentBase.G0;
        List list = d0Var.b;
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(filterBarFragmentBase.I4((com.github.domain.searchandfilter.filters.data.d) it.next(), d0Var.c));
        }
        y1Var.getClass();
        y1Var.k((Object) null, arrayList);
        y1 y1Var2 = filterBarFragmentBase.F0;
        Boolean valueOf = Boolean.valueOf(d0Var.a);
        this.w = null;
        this.v = 1;
        y1Var2.c(valueOf, this);
        return a0Var2 == a0Var ? a0Var : a0Var2;
    }
    public Object a(Object p1, Object p2) { return null; }
    public Object ordinal() { return null; }
}
