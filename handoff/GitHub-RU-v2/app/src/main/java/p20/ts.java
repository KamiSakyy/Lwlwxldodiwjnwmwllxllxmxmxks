package p20;

import java.util.List;
import u10.y50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ts implements aaShadow.a {
    public static final ts a = new ts();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ps.a, true)))).a(eVar, wVar);
        }
        return new y50(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y50 y50Var = (y50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y50Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ps.a, true)))).b(fVar, wVar, y50Var.a);
    }
}
