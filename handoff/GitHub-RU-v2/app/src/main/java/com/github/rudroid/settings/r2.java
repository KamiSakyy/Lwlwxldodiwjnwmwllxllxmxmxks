package com.github.rudroid.settings;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
final class r2<T> implements y71.j {
    public final /* synthetic */ t2 r;

    public r2(t2 t2Var) {
        this.r = t2Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        t2 t2Var = this.r;
        v71.q1 q1Var = t2Var.B;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        t2Var.B = v71.b0.z(androidx.lifecycle.d1.k(t2Var), (a71.h) null, (v71.a0) null, new z2(t2Var, null), 3);
        v71.q1 q1Var2 = t2Var.A;
        if (q1Var2 != null) {
            q1Var2.m((CancellationException) null);
        }
        t2Var.A = v71.b0.z(androidx.lifecycle.d1.k(t2Var), (a71.h) null, (v71.a0) null, new x2(t2Var, null), 3);
        t2Var.P();
        t2Var.D.j(Boolean.TRUE);
        return w61.a0.a;
    }
}
