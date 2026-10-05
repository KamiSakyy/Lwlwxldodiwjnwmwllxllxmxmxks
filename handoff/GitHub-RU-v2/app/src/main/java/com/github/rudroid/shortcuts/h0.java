package com.github.rudroid.shortcuts;

import androidx.lifecycle.d1;
import java.util.List;
import java.util.concurrent.CancellationException;
import v71.q1;

/* loaded from: /home/user/work/p/classes3.dex */
final class h0<T> implements y71.j {
    public final /* synthetic */ n0 r;

    public h0(n0 n0Var) {
        this.r = n0Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        w61.q qVar = (w61.q) obj;
        List list = (List) qVar.r;
        List list2 = (List) qVar.s;
        List list3 = (List) qVar.t;
        n0 n0Var = this.r;
        n0Var.z.j(list3);
        q1 q1Var = n0Var.C;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        n0Var.C = v71.b0.z(d1.k(n0Var), (a71.h) null, (v71.a0) null, new k0(n0Var, list, list2, null), 3);
        b71.a aVar = b71.a.r;
        return w61.a0.a;
    }
}
