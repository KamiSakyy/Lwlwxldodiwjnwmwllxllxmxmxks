package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fc implements aaShadow.a {
    public static final fc a = new fc();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.fi fiVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fiVar = (jo.fi) aa.c.c(ic.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(hc.a, true)))).a(eVar, wVar);
            }
        }
        if (fiVar != null) {
            return new jo.bi(fiVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.bi biVar = (jo.bi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(biVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(ic.a, false).b(fVar, wVar, biVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(hc.a, true)))).b(fVar, wVar, biVar.b);
    }
}
