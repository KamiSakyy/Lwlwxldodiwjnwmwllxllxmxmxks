package p20;

import java.util.List;
import u10.u20;
import u10.y20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pq implements aaShadow.a {
    public static final pq a = new pq();
    public static final List b = sy.d0.n("unmarkFileAsViewed");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y20 y20Var = null;
        while (eVar.r0(b) == 0) {
            y20Var = (y20) aa.c.b(aa.c.c(tq.a, false)).a(eVar, wVar);
        }
        return new u20(y20Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u20 u20Var = (u20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u20Var, "value");
        fVar.z0("unmarkFileAsViewed");
        aa.c.b(aa.c.c(tq.a, false)).b(fVar, wVar, u20Var.a);
    }
}
