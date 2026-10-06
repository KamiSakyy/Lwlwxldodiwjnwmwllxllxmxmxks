package dw;

import java.util.List;
import m10.wh;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g7 implements aa.i0 {
    public static final f7 Companion = new f7();

    public final aa.m d() {
        wh.Companion.getClass();
        aa.q0 q0Var = wh.B;
        k71.k.g(q0Var, "type");
        List list = ew.u.a;
        List list2 = ew.u.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == g7.class;
    }

    public final aa.p0 g() {
        return aa.c.c(h7.a, true);
    }

    public final int hashCode() {
        return k71.xShadow.a(g7.class).hashCode();
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
