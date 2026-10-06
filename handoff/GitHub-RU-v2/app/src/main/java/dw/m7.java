package dw;

import java.util.List;
import m10.i30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m7 implements aa.i0 {
    public static final l7 Companion = new l7();

    public final aa.m d() {
        i30.Companion.getClass();
        aa.q0 q0Var = i30.w0;
        k71.k.g(q0Var, "type");
        List list = ew.v.a;
        List list2 = ew.v.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == m7.class;
    }

    public final aa.p0 g() {
        return aa.c.c(p7.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(m7.class).hashCode();
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
