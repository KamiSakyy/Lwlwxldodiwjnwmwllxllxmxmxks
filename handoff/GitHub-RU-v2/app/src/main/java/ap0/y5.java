package ap0;

import java.util.List;
import pz0.w80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y5 implements aa.i0 {
    public static final x5 Companion = new x5();

    public final aa.m d() {
        w80.Companion.getClass();
        aa.q0 q0Var = w80.W;
        k71.k.g(q0Var, "type");
        List list = bp0.f0.a;
        List list2 = bp0.f0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == y5.class;
    }

    public final aa.p0 g() {
        return aa.c.c(z5.a, false);
    }

    public final int hashCode() {
        return k71.x.a(y5.class).hashCode();
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
