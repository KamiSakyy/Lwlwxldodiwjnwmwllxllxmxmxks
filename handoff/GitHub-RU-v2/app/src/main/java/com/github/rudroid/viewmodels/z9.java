package com.github.rudroid.viewmodels;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
final class z9<T> implements y71.j {
    public final /* synthetic */ t9 r;

    public z9(t9 t9Var) {
        this.r = t9Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        w61.q qVar = (w61.q) obj;
        int intValue = ((Number) qVar.r).intValue();
        List list = (List) qVar.s;
        x01.i iVar = (x01.i) qVar.t;
        t9 t9Var = this.r;
        t9Var.U(iVar);
        t9Var.N = intValue;
        if (t9Var.J.length() > 0) {
            t9Var.I.addAll(list);
        } else {
            t9Var.H.addAll(list);
        }
        androidx.lifecycle.p0 p0Var = t9Var.z;
        fl.e eVar = fl.f.Companion;
        ArrayList Q = t9Var.Q(false);
        eVar.getClass();
        p0Var.k(fl.e.c(Q));
        return w61.a0.a;
    }
}
