package com.github.rudroid.viewmodels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
final class b7<T> implements y71.j {
    public final /* synthetic */ v6 r;

    public b7(v6 v6Var) {
        this.r = v6Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        w61.k kVar = (w61.k) obj;
        List list = (List) kVar.r;
        x01.i iVar = (x01.i) kVar.s;
        k71.k.g(iVar, "<set-?>");
        v6 v6Var = this.r;
        v6Var.x = iVar;
        androidx.lifecycle.p0 p0Var = v6Var.w;
        fl.e eVar = fl.f.Companion;
        fl.f fVar = (fl.f) p0Var.d();
        List list2 = fVar != null ? (List) fVar.b : null;
        if (list2 == null) {
            list2 = x61.r.r;
        }
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.github.rudroid.repositories.l((p01.n) it.next()));
        }
        ArrayList l0 = x61.m.l0(list2, arrayList);
        eVar.getClass();
        p0Var.j(fl.e.c(l0));
        return w61.a0.a;
    }
}
