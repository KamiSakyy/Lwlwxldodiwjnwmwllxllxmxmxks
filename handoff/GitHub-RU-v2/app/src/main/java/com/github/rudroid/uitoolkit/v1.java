package com.github.rudroid.uitoolkit;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v1 implements j71.g {
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ j71.c t;

    public v1(ArrayList arrayList, boolean z, j71.c cVar) {
        this.r = arrayList;
        this.s = z;
        this.t = cVar;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        m0.b bVar = (m0.b) obj;
        int intValue = ((Number) obj2).intValue();
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (sVar.f(bVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= sVar.d(intValue) ? 32 : 16;
        }
        if (sVar.S(i & 1, (i & 147) != 146)) {
            s2 s2Var = (s2) this.r.get(intValue);
            sVar.c0(-896850891);
            w1.b(s2Var, this.s, this.t, sVar, 0);
            sVar.q(false);
        } else {
            sVar.V();
        }
        return w61.a0.a;
    }
}
