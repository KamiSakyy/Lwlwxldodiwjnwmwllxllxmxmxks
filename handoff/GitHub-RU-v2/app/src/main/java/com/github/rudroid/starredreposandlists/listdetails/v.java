package com.github.rudroid.starredreposandlists.listdetails;

import com.github.rudroid.starredreposandlists.listdetails.b0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v implements j71.g {
    public final /* synthetic */ List r;
    public final /* synthetic */ com.github.rudroid.interfaces.m0 s;
    public final /* synthetic */ com.github.rudroid.html.b t;

    public v(List list, com.github.rudroid.interfaces.m0 m0Var, com.github.rudroid.html.b bVar) {
        this.r = list;
        this.s = m0Var;
        this.t = bVar;
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
            b0 b0Var = (b0) this.r.get(intValue);
            sVar.c0(-1486742605);
            if (b0Var instanceof b0.a) {
                sVar.c0(-1156336771);
                y0 y0Var = ((b0.a) b0Var).a;
                a0.a(null, y0Var.a, y0Var.b, y0Var.c, y0Var.d, sVar, 0);
                sVar.q(false);
            } else {
                if (!(b0Var instanceof b0.b)) {
                    throw f1.e.r(-1156338096, sVar, false);
                }
                sVar.c0(-1156324881);
                x.b(((b0.b) b0Var).a, this.s, this.t, sVar, 0);
                sVar.q(false);
            }
            sVar.q(false);
        } else {
            sVar.V();
        }
        return w61.a0.a;
    }
}
