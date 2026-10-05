package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sb implements aa.a {
    public static final sb a = new sb();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.ph phVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                phVar = (jo.ph) aa.c.c(yb.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(vb.a, true)))).a(eVar, wVar);
            }
        }
        if (phVar != null) {
            return new jo.jh(phVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.jh jhVar = (jo.jh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jhVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(yb.a, false).b(fVar, wVar, jhVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(vb.a, true)))).b(fVar, wVar, jhVar.b);
    }
}
