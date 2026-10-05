package sd0;

import gn0.s00;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d1 implements aa.i0 {
    public static final c1 Companion = new c1();

    public final aa.m d() {
        s00.Companion.getClass();
        aa.q0 q0Var = s00.P;
        k71.k.g(q0Var, "type");
        List list = td0.g.a;
        List list2 = td0.g.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == d1.class;
    }

    public final aa.p0 g() {
        return aa.c.c(f1.a, false);
    }

    public final int hashCode() {
        return k71.x.a(d1.class).hashCode();
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
