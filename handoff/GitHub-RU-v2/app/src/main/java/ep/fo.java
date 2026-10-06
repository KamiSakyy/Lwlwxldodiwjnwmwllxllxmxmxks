package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fo implements aaShadow.a {
    public static final fo a = new fo();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.uy uyVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                uyVar = (jo.uy) aa.c.c(eo.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ao.a, true)))).a(eVar, wVar);
            }
        }
        if (uyVar != null) {
            return new jo.vy(uyVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.vy vyVar = (jo.vy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vyVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(eo.a, false).b(fVar, wVar, vyVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ao.a, true)))).b(fVar, wVar, vyVar.b);
    }
}
