package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ka implements aa.a {
    public static final ka a = new ka();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.pf pfVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                pfVar = (jo.pf) aa.c.c(ma.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(la.a, true)))).a(eVar, wVar);
            }
        }
        if (pfVar != null) {
            return new jo.nf(pfVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.nf nfVar = (jo.nf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nfVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(ma.a, false).b(fVar, wVar, nfVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(la.a, true)))).b(fVar, wVar, nfVar.b);
    }
}
