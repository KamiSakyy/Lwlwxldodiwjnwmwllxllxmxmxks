package com.github.rudroid.viewmodels;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
final class v9<T> implements y71.j {
    public final /* synthetic */ t9 r;

    public v9(t9 t9Var) {
        this.r = t9Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        w61.k kVar = (w61.k) obj;
        List list = (List) kVar.r;
        x01.i iVar = (x01.i) kVar.s;
        t9 t9Var = this.r;
        t9Var.U(iVar);
        LinkedHashSet linkedHashSet = t9Var.G;
        LinkedHashSet linkedHashSet2 = t9Var.I;
        if (t9Var.J.length() > 0) {
            linkedHashSet2.clear();
            linkedHashSet2.addAll(list);
        } else if (linkedHashSet.isEmpty()) {
            linkedHashSet.addAll(list);
        }
        androidx.lifecycle.p0 p0Var = t9Var.z;
        fl.e eVar = fl.f.Companion;
        ArrayList Q = t9Var.Q(false);
        eVar.getClass();
        p0Var.k(fl.e.c(Q));
        return w61.a0.a;
    }
}
