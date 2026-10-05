package p20;

import java.util.List;
import u10.x10;
import u10.y10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class aq implements aa.a {
    public static final aq a = new aq();
    public static final List b = sy.d0.n("unfollowUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y10 y10Var = null;
        while (eVar.r0(b) == 0) {
            y10Var = (y10) aa.c.b(aa.c.c(bq.a, false)).a(eVar, wVar);
        }
        return new x10(y10Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x10 x10Var = (x10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x10Var, "value");
        fVar.z0("unfollowUser");
        aa.c.b(aa.c.c(bq.a, false)).b(fVar, wVar, x10Var.a);
    }
}
