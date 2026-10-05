package cq;

import java.util.List;
import m10.rf0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u6 implements aa.i0 {
    public static final t6 Companion = new t6();

    public final aa.m d() {
        rf0.Companion.getClass();
        aa.q0 q0Var = rf0.g0;
        k71.k.g(q0Var, "type");
        List list = dq.m0.a;
        List list2 = dq.m0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == u6.class;
    }

    public final aa.p0 g() {
        return aa.c.c(v6.a, false);
    }

    public final int hashCode() {
        return k71.x.a(u6.class).hashCode();
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
