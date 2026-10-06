package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class th implements aaShadow.a {
    public static final th a = new th();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.fq fqVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fqVar = (jo.fq) aa.c.c(sh.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(qh.a, false)))).a(eVar, wVar);
            }
        }
        if (fqVar != null) {
            return new jo.gq(fqVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.gqShadow gqVar = (jo.gq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gqVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(sh.a, false).b(fVar, wVar, gqVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(qh.a, false)))).b(fVar, wVar, gqVar.b);
    }
}
