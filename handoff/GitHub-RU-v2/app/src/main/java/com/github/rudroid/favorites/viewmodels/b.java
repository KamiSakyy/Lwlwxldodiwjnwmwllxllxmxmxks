package com.github.rudroid.favorites.viewmodels;

import java.util.ArrayList;
import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
class b<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f12344r;

    public b(g gVar) {
        this.f12344r = gVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        List<g01.d> list = (List) obj;
        y1 y1Var = this.f12344r.f12368v;
        fl.e eVar = fl.f.Companion;
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        for (g01.d dVar : list) {
            arrayList.add(new uc.b(dVar.a, dVar.b));
        }
        eVar.getClass();
        fl.f c10 = fl.e.c(arrayList);
        y1Var.getClass();
        y1Var.k((Object) null, c10);
        return w61.a0.a;
    }
}
