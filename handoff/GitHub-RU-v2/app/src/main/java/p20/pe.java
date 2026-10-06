package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pe implements aaShadow.a {
    public static final pe a = new pe();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.yl ylVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ylVar = (u10.yl) aa.c.c(qe.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(oe.a, true)))).a(eVar, wVar);
            }
        }
        if (ylVar != null) {
            return new u10.xl(ylVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.xl xlVar = (u10.xl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xlVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(qe.a, false).b(fVar, wVar, xlVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(oe.a, true)))).b(fVar, wVar, xlVar.b);
    }
}
