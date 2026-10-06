package com.github.rudroid.searchandfilter.complexfilter;

import androidx.compose.foundation.lazy.layout.s0;
import androidx.lifecycle.d1;
import java.util.concurrent.CancellationException;
import v71.q1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r extends s0 {
    public final /* synthetic */ k t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k kVar) {
        super(7, "");
        this.t = kVar;
    }

    public final void i(r71.e eVar, Object obj, Object obj2) {
        k71.k.g(eVar, "property");
        k kVar = this.t;
        y1 y1Var = kVar.x;
        fl.f.Companion.getClass();
        fl.f b = fl.e.b(x61.r.r);
        y1Var.getClass();
        y1Var.k((Object) null, b);
        String str = (String) kVar.B.t(kVar, k.D[0]);
        q1 q1Var = kVar.u;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        kVar.u = v71.b0.z(d1.k(kVar), (a71.h) null, (v71.a0) null, new n(kVar, str, null), 3);
    }
    public Object y(Object p1, Object p2) { return null; }
    public Object t(Object, Object) { return null; }
    public Object t(Object, Object) { return null; }
}
