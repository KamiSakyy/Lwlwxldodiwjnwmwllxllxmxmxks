package com.github.rudroid.viewmodels;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
final class d6<T> implements y71.j {
    public final /* synthetic */ a6 r;

    public d6(a6 a6Var) {
        this.r = a6Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        yz0.m3 m3Var = (yz0.m3) obj;
        x01.i iVar = m3Var.c;
        a6 a6Var = this.r;
        a6Var.E = iVar;
        y71.y1 y1Var = a6Var.A;
        String str = m3Var.a;
        boolean b = k71.k.b(a6Var.T(), str);
        w61.a0 a0Var = w61.a0.a;
        if (b) {
            if (m3Var.b.isEmpty()) {
                com.github.rudroid.utilities.w0.l(y1Var, m3Var);
                return a0Var;
            }
            com.github.rudroid.utilities.w0.p(y1Var, m3Var);
            return a0Var;
        }
        a6Var.t.c(str, "EXTRA_REPO_NAME");
        v71.q1 q1Var = a6Var.I;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        a6Var.U();
        return a0Var;
    }
}
