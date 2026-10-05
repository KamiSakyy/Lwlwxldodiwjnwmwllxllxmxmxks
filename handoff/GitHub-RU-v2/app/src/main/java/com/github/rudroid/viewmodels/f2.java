package com.github.rudroid.viewmodels;

import com.github.rudroid.viewmodels.e2;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
final class f2<T> implements y71.j {
    public final /* synthetic */ e2 r;

    public f2(e2 e2Var) {
        this.r = e2Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        yz0.e4 e4Var = (yz0.e4) obj;
        e2.a aVar = e2.Companion;
        e2 e2Var = this.r;
        String S = e2Var.S();
        y71.y1 y1Var = e2Var.z;
        boolean b = k71.k.b(S, e4Var.a);
        w61.a0 a0Var = w61.a0.a;
        if (b) {
            if (e4Var.b.b.isEmpty()) {
                com.github.rudroid.utilities.w0.l(y1Var, e4Var);
                return a0Var;
            }
            com.github.rudroid.utilities.w0.p(y1Var, e4Var);
            return a0Var;
        }
        e2Var.t.c(e4Var.a, "EXTRA_REPO_NAME");
        v71.q1 q1Var = e2Var.F;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        e2Var.U();
        return a0Var;
    }
}
