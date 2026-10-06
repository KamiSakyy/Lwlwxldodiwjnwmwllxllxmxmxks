package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class og implements aaShadow.a {
    public static final og a = new og();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.oo ooVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ooVar = (u10.oo) aa.c.c(qg.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(pg.a, true)))).a(eVar, wVar);
            }
        }
        if (ooVar != null) {
            return new u10.mo(ooVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.mo moVar = (u10.mo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(moVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(qg.a, false).b(fVar, wVar, moVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(pg.a, true)))).b(fVar, wVar, moVar.b);
    }
}
