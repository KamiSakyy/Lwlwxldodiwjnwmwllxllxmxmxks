package com.github.rudroid.settings.copilot.debug;

import androidx.lifecycle.k1;
import xn.f1;
import y71.i1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v extends k1 {
    public nj.e s;
    public i1 t;
    public i1 u;

    public v(nj.e eVar) {
        k71.k.g(eVar, "overrideStore");
        this.s = eVar;
        this.t = eVar.b;
        this.u = eVar.d;
    }

    public final void P(j71.c cVar) {
        Object value;
        nj.d dVar;
        nj.e eVar = this.s;
        f1 f1Var = ((nj.d) eVar.d.r.getValue()).e;
        if (f1Var != null) {
            y1 y1Var = eVar.c;
            do {
                value = y1Var.getValue();
                dVar = (nj.d) value;
                k71.k.g(dVar, "$this$updateOverrides");
            } while (!y1Var.i(value, nj.d.a(dVar, null, null, null, null, (f1) cVar.k(f1Var), 15)));
        }
    }
}
