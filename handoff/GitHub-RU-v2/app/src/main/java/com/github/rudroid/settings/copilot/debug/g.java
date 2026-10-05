package com.github.rudroid.settings.copilot.debug;

import xn.f1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
final /* synthetic */ class g extends k71.i implements j71.c {
    public final Object k(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        v vVar = (v) ((k71.c) this).s;
        vVar.getClass();
        nj.e eVar = vVar.s;
        f1 f1Var = ((nj.d) eVar.d.r.getValue()).e;
        if (f1Var != null) {
            y1 y1Var = eVar.c;
            while (true) {
                Object value = y1Var.getValue();
                nj.d dVar = (nj.d) value;
                k71.k.g(dVar, "$this$updateOverrides");
                f1 f1Var2 = f1Var;
                if (y1Var.i(value, nj.d.a(dVar, null, null, null, null, f1.a(f1Var2, null, null, false, doubleValue, 15), 15))) {
                    break;
                }
                f1Var = f1Var2;
            }
        }
        return w61.a0.a;
    }
}
