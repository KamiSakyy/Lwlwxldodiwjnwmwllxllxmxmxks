package p20;

import java.util.List;
import u10.i60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bt implements aa.a {
    public static final bt a = new bt();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(zs.a, false)))).a(eVar, wVar);
        }
        return new i60(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i60 i60Var = (i60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i60Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(zs.a, false)))).b(fVar, wVar, i60Var.a);
    }
}
