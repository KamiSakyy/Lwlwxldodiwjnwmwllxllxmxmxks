package com.github.rudroid.widget.agenttasks;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q implements j71.g {
    public final /* synthetic */ List r;
    public final /* synthetic */ com.github.rudroid.widget.agenttasks.model.b s;

    public q(List list, com.github.rudroid.widget.agenttasks.model.b bVar) {
        this.r = list;
        this.s = bVar;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        d6.f fVar = (d6.f) obj;
        int intValue = ((Number) obj2).intValue();
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = ((intValue2 & 8) == 0 ? sVar.f(fVar) : sVar.h(fVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= sVar.d(intValue) ? 32 : 16;
        }
        if ((i & 147) == 146 && sVar.C()) {
            sVar.V();
        } else {
            com.github.rudroid.widget.agenttasks.model.a aVar = (com.github.rudroid.widget.agenttasks.model.a) this.r.get(intValue);
            sVar.c0(1300489704);
            r.a(null, aVar, this.s.a, sVar, 0);
            m7.y.f(k41.b.y(z5.l.a, ih.a.k), sVar, 0);
            sVar.q(false);
        }
        return w61.a0.a;
    }
}
