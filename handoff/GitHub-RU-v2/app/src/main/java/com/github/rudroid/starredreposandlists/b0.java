package com.github.rudroid.starredreposandlists;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import y71.y1;
import yz0.c4;
import yz0.f8;

/* loaded from: /home/user/work/p/classes3.dex */
final class b0<T> implements y71.j {
    public final /* synthetic */ h0 r;

    public b0(h0 h0Var) {
        this.r = h0Var;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    public final Object c(Object obj, a71.c cVar) {
        w61.k kVar = (w61.k) obj;
        Object obj2 = kVar.r;
        c4 c4Var = (c4) obj2;
        x01.i iVar = c4Var.b;
        h0 h0Var = this.r;
        h0Var.x = iVar;
        y1 y1Var = h0Var.A;
        java.util.List r5 = (java.util.List) (((f8) kVar.s).c);
        if (r5.isEmpty() && c4Var.a.isEmpty()) {
            com.github.rudroid.utilities.ui.g1.Companion.getClass();
            com.github.rudroid.utilities.ui.h0 h0Var2 = new com.github.rudroid.utilities.ui.h0(null);
            y1Var.getClass();
            y1Var.k((Object) null, h0Var2);
        } else {
            g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
            w61.k kVar2 = new w61.k(obj2, (Object) r5);
            aVar.getClass();
            t1 t1Var = new t1(kVar2);
            y1Var.getClass();
            y1Var.k((Object) null, t1Var);
        }
        return w61.a0.a;
    }
}
