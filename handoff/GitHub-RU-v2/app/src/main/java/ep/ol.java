package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ol implements aa.a {
    public static final ol a = new ol();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.bv bvVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bvVar = (jo.bv) aa.c.c(nl.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ml.a, false)))).a(eVar, wVar);
            }
        }
        if (bvVar != null) {
            return new jo.cv(bvVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.cv cvVar = (jo.cv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cvVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(nl.a, false).b(fVar, wVar, cvVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ml.a, false)))).b(fVar, wVar, cvVar.b);
    }
}
