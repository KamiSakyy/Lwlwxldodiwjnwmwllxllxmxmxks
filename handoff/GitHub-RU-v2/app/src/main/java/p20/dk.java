package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dk implements aa.a {
    public static final dk a = new dk();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.dt dtVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                dtVar = (u10.dt) aa.c.c(bk.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(xj.a, true)))).a(eVar, wVar);
            }
        }
        if (dtVar != null) {
            return new u10.ft(dtVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ft ftVar = (u10.ft) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ftVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(bk.a, false).b(fVar, wVar, ftVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(xj.a, true)))).b(fVar, wVar, ftVar.b);
    }
}
