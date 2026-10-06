package ks0;

import aa.i0;
import aa.j0;
import aa.m;
import aa.p0;
import aa.w;
import java.util.List;
import k71.xShadow;
import pz0.kg;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements i0 {
    public static final f Companion = new f();

    public final m d() {
        kg.Companion.getClass();
        j0 j0Var = kg.a;
        k71.k.g(j0Var, "type");
        List list = ls0.a.a;
        List list2 = ls0.a.a;
        k71.k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new m("data", j0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == g.class;
    }

    public final p0 g() {
        return aa.c.c(h.a, true);
    }

    public final int hashCode() {
        return xShadow.a(g.class).hashCode();
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
