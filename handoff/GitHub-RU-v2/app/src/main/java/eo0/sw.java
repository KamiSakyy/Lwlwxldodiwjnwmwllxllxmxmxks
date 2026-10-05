package eo0;

import java.util.List;
import jn0.ib0;
import jn0.jb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sw implements aa.a {
    public static final sw a = new sw();
    public static final List b = sy.d0.n("updateUserDashboardPins");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jb0 jb0Var = null;
        while (eVar.r0(b) == 0) {
            jb0Var = (jb0) aa.c.b(aa.c.c(tw.a, false)).a(eVar, wVar);
        }
        return new ib0(jb0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ib0 ib0Var = (ib0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ib0Var, "value");
        fVar.z0("updateUserDashboardPins");
        aa.c.b(aa.c.c(tw.a, false)).b(fVar, wVar, ib0Var.a);
    }
}
