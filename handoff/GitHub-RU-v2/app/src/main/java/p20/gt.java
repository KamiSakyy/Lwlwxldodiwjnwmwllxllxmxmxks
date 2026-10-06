package p20;

import java.util.List;
import u10.p60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gt implements aaShadow.a {
    public static final gt a = new gt();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ht.a, true)))).a(eVar, wVar);
        }
        return new p60(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p60 p60Var = (p60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p60Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ht.a, true)))).b(fVar, wVar, p60Var.a);
    }
}
