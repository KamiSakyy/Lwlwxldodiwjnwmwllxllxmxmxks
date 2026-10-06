package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tb implements aaShadow.a {
    public static final tb a = new tb();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.qh qhVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                qhVar = (jo.qh) aa.c.c(zb.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ub.a, true)))).a(eVar, wVar);
            }
        }
        if (qhVar != null) {
            return new jo.kh(qhVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.kh khVar = (jo.kh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(khVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(zb.a, false).b(fVar, wVar, khVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ub.a, true)))).b(fVar, wVar, khVar.b);
    }
}
