package com.github.rudroid.viewmodels;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
final class ab<T> implements y71.j {
    public final /* synthetic */ za r;

    public ab(za zaVar) {
        this.r = zaVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        w61.k kVar = (w61.k) obj;
        List list = (List) kVar.r;
        x01.i iVar = (x01.i) kVar.s;
        za zaVar = this.r;
        zaVar.x = iVar;
        y71.y1 y1Var = zaVar.v;
        if (list.isEmpty()) {
            com.github.rudroid.utilities.w0.k(y1Var);
        } else {
            com.github.rudroid.utilities.w0.p(y1Var, list);
        }
        return w61.a0.a;
    }
}
