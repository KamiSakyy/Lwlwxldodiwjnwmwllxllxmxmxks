package com.github.rudroid.settings;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
final class g1<T> implements y71.j {
    public final /* synthetic */ i1 r;

    public g1(i1 i1Var) {
        this.r = i1Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        oa.j jVar = (oa.j) obj;
        i1 i1Var = this.r;
        i1Var.L = true;
        boolean f = jVar.f(com.github.rudroid.common.a.B);
        boolean z = jVar.o;
        i1Var.K = f;
        boolean f2 = jVar.f(com.github.rudroid.common.a.w);
        i1Var.M = f2;
        if (f2 || z) {
            if (i1Var.K) {
                i1Var.C = v71.b0.z(androidx.lifecycle.d1.k(i1Var), (a71.h) null, (v71.a0) null, new o1(i1Var, null), 3);
            } else {
                v71.q1 q1Var = i1Var.C;
                if (q1Var != null) {
                    q1Var.m((CancellationException) null);
                }
                i1Var.C = v71.b0.z(androidx.lifecycle.d1.k(i1Var), (a71.h) null, (v71.a0) null, new k1(i1Var, null), 3);
            }
        }
        if (i1Var.L) {
            v71.q1 q1Var2 = i1Var.D;
            if (q1Var2 != null) {
                q1Var2.m((CancellationException) null);
            }
            i1Var.D = v71.b0.z(androidx.lifecycle.d1.k(i1Var), (a71.h) null, (v71.a0) null, new m1(i1Var, null), 3);
        }
        y71.y1 y1Var = i1Var.I;
        Boolean valueOf = Boolean.valueOf(z);
        y1Var.getClass();
        y1Var.k((Object) null, valueOf);
        return w61.a0.a;
    }
}
