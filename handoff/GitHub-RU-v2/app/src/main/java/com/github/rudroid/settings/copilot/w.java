package com.github.rudroid.settings.copilot;

import androidx.lifecycle.d1;
import java.util.concurrent.CancellationException;
import v71.q1;

/* loaded from: /home/user/work/p/classes3.dex */
final class w<T> implements y71.j {
    public final /* synthetic */ o r;

    public w(o oVar) {
        this.r = oVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        oa.j jVar = (oa.j) obj;
        boolean f = jVar.f(com.github.rudroid.common.a.L);
        o oVar = this.r;
        if (f) {
            q1 q1Var = oVar.G;
            if (q1Var != null) {
                q1Var.m((CancellationException) null);
            }
            oVar.G = v71.b0.z(d1.k(oVar), (a71.h) null, (v71.a0Shadow) null, new t(oVar, jVar, null), 3);
            oVar.P(jVar);
            q1 q1Var2 = oVar.I;
            if (q1Var2 != null) {
                q1Var2.m((CancellationException) null);
            }
            oVar.I = v71.b0.z(d1.k(oVar), (a71.h) null, (v71.a0Shadow) null, new v(oVar, jVar, null), 3);
        } else {
            q1 q1Var3 = oVar.G;
            if (q1Var3 != null) {
                q1Var3.m((CancellationException) null);
            }
            q1 q1Var4 = oVar.H;
            if (q1Var4 != null) {
                q1Var4.m((CancellationException) null);
            }
            q1 q1Var5 = oVar.I;
            if (q1Var5 != null) {
                q1Var5.m((CancellationException) null);
            }
        }
        return w61.a0.a;
    }
}
