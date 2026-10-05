package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pj implements aa.a {
    public static final pj a = new pj();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ms msVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                msVar = (u10.ms) aa.c.c(oj.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(lj.a, true)))).a(eVar, wVar);
            }
        }
        if (msVar != null) {
            return new u10.ns(msVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ns nsVar = (u10.ns) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nsVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(oj.a, false).b(fVar, wVar, nsVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(lj.a, true)))).b(fVar, wVar, nsVar.b);
    }
}
