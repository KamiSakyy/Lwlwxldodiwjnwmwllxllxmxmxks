package com.github.rudroid.settings.copilot.debug;

import java.time.LocalDate;
import xn.f1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
final /* synthetic */ class m extends k71.i implements j71.c {
    public final Object k(Object obj) {
        Object value;
        nj.d dVar;
        Object value2;
        nj.d dVar2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        nj.e eVar = ((v) ((k71.c) this).s).s;
        if (!booleanValue) {
            y1 y1Var = eVar.c;
            do {
                value = y1Var.getValue();
                dVar = (nj.d) value;
                k71.k.g(dVar, "$this$updateOverrides");
            } while (!y1Var.i(value, nj.d.a(dVar, null, null, null, null, null, 15)));
        } else if (((nj.d) eVar.d.r.getValue()).e == null) {
            y1 y1Var2 = eVar.c;
            do {
                value2 = y1Var2.getValue();
                dVar2 = (nj.d) value2;
                k71.k.g(dVar2, "$this$updateOverrides");
            } while (!y1Var2.i(value2, nj.d.a(dVar2, null, null, null, null, new f1(LocalDate.now().plusDays(30L), Boolean.TRUE, Double.valueOf(100.0d), false, 0.0d), 15)));
        }
        return w61.a0.a;
    }
}
