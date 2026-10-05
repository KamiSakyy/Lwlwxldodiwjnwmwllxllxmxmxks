package com.github.rudroid.widget.shortcuts;

import java.util.ArrayList;
import yz0.j3;
import yz0.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z implements j71.g {
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ com.github.rudroid.widget.shortcuts.model.h s;

    public z(ArrayList arrayList, com.github.rudroid.widget.shortcuts.model.h hVar) {
        this.r = arrayList;
        this.s = hVar;
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
            com.github.rudroid.widget.shortcuts.model.a aVar = (com.github.rudroid.widget.shortcuts.model.a) this.r.get(intValue);
            sVar.c0(-416452331);
            j3 j3Var = aVar.b;
            boolean z = j3Var instanceof j3;
            z5.l lVar = z5.l.a;
            com.github.rudroid.widget.shortcuts.model.h hVar = this.s;
            if (z) {
                sVar.c0(-416405212);
                a0.d(null, j3Var, hVar.a, sVar, 0);
                m7.y.f(k41.b.y(lVar, ih.a.k), sVar, 0);
                sVar.q(false);
            } else {
                if (j3Var instanceof y1) {
                    sVar.c0(-416172278);
                    a0.c(null, (y1) j3Var, hVar.a, sVar, 0);
                    m7.y.f(k41.b.y(lVar, ih.a.k), sVar, 0);
                } else {
                    sVar.c0(-419929106);
                }
                sVar.q(false);
            }
            sVar.q(false);
        }
        return w61.a0.a;
    }
}
