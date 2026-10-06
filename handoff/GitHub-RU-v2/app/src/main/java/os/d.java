package os;

import aa.i0;
import aa.m;
import aa.p0;
import aa.q0;
import aa.w;
import java.util.List;
import k71.xShadow;
import m10.fd;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements i0 {
    public static final c Companion = new c();

    public final m d() {
        fd.Companion.getClass();
        q0 q0Var = fd.l;
        k71.k.g(q0Var, "type");
        List list = ps.a.a;
        List list2 = ps.a.a;
        k71.k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == d.class;
    }

    public final p0 g() {
        return aa.c.c(e.a, false);
    }

    public final int hashCode() {
        return xShadow.a(d.class).hashCode();
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
