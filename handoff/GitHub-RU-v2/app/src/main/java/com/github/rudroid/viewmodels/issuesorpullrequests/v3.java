package com.github.rudroid.viewmodels.issuesorpullrequests;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
final class v3<T> implements y71.j {
    public final /* synthetic */ w2 r;

    public v3(w2 w2Var) {
        this.r = w2Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        String str = (String) obj;
        k71.k.g(str, "value");
        w2 w2Var = this.r;
        w2Var.T.c(str, "EXTRA_ID");
        v71.q1 q1Var = w2Var.y0;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        w2Var.y0 = v71.b0.z(androidx.lifecycle.d1.k(w2Var), (a71.h) null, (v71.a0) null, new j4(w2Var, str, null), 3);
        return w61.a0.a;
    }
}
