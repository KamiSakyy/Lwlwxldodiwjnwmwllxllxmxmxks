package eo0;

import java.util.List;
import jn0.m90;
import jn0.p90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rv implements aa.a {
    public static final rv a = new rv();
    public static final List b = sy.d0.n("comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m90 m90Var = null;
        while (eVar.r0(b) == 0) {
            m90Var = (m90) aa.c.b(aa.c.c(pv.a, true)).a(eVar, wVar);
        }
        return new p90(m90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p90 p90Var = (p90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p90Var, "value");
        fVar.z0("comment");
        aa.c.b(aa.c.c(pv.a, true)).b(fVar, wVar, p90Var.a);
    }
}
