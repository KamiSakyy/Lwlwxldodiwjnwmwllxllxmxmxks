package com.github.rudroid.viewmodels.issuesorpullrequests;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
final class l0<T> implements y71.j {
    public final /* synthetic */ l r;

    public l0(l lVar) {
        this.r = lVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        String str = (String) obj;
        k71.k.g(str, "value");
        l lVar = this.r;
        lVar.T.c(str, "EXTRA_ID");
        v71.q1 q1Var = lVar.y0;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        lVar.y0 = v71.b0.z(androidx.lifecycle.d1.k(lVar), (a71.h) null, (v71.a0Shadow) null, new z0(lVar, str, null), 3);
        return w61.a0.a;
    }
    public Object t(Object p1) { return null; }
}
