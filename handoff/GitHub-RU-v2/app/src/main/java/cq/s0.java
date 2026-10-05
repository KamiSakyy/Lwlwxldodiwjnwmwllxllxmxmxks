package cq;

import java.util.List;
import m10.rg0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 implements aa.i0 {
    public static final r0 Companion = new r0();

    public final aa.m d() {
        rg0.Companion.getClass();
        aa.j0 j0Var = rg0.a;
        k71.k.g(j0Var, "type");
        List list = dq.j.a;
        List list2 = dq.j.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", j0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == s0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(t0.a, true);
    }

    public final int hashCode() {
        return k71.x.a(s0.class).hashCode();
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
