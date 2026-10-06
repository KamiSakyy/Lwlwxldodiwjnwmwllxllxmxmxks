package nv0;

import aa.i0;
import aa.j0;
import aa.m;
import aa.p0;
import aa.w;
import java.util.List;
import k71.k;
import k71.xShadow;
import pz0.z30;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements i0 {
    public static final c Companion = new c();

    public final m d() {
        z30.Companion.getClass();
        j0 j0Var = z30.a;
        k.g(j0Var, "type");
        List list = ov0.a.a;
        List list2 = ov0.a.a;
        k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new m("data", j0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == d.class;
    }

    public final p0 g() {
        return aa.c.c(f.a, true);
    }

    public final int hashCode() {
        return xShadow.a(d.class).hashCode();
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k.g(wVar, "customScalarAdapters");
    }
}
