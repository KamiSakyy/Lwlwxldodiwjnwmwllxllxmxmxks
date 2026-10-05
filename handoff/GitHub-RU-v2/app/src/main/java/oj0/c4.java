package oj0;

import gn0.eq;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c4 implements aa.i0 {
    public static final b4 Companion = new b4();

    public final aa.m d() {
        eq.Companion.getClass();
        aa.q0 q0Var = eq.m0;
        k71.k.g(q0Var, "type");
        List list = pj0.m.a;
        List list2 = pj0.m.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == c4.class;
    }

    public final aa.p0 g() {
        return aa.c.c(f4.a, false);
    }

    public final int hashCode() {
        return k71.x.a(c4.class).hashCode();
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
