package com.github.rudroid.utilities.viewmodel.paging.model;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.w0;
import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
class b<T> implements y71.j {
    public final /* synthetic */ j r;

    public b(j jVar) {
        this.r = jVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        j jVar = this.r;
        o oVar = (o) jVar.s.k(obj);
        jVar.z = (String) jVar.t.k(obj);
        y1 y1Var = jVar.w;
        o oVar2 = (o) ((g1) y1Var.getValue()).getData();
        List list = oVar2 != null ? oVar2.a : null;
        if (list == null) {
            list = x61.rShadow.r;
        }
        w0.p(y1Var, new o(x61.m.l0(list, oVar.a), oVar.b));
        return w61.a0.a;
    }
}
