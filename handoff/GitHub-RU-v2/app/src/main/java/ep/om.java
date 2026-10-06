package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class om implements aaShadow.a {
    public static final om a = new om();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.xw xwVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                xwVar = (jo.xw) aa.c.c(tm.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(qm.a, true)))).a(eVar, wVar);
            }
        }
        if (xwVar != null) {
            return new jo.sw(xwVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.sw swVar = (jo.sw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(swVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(tm.a, false).b(fVar, wVar, swVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(qm.a, true)))).b(fVar, wVar, swVar.b);
    }
}
