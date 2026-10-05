package tz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f implements aa.a {
    public static final List a = x61.l.r(new String[]{"nodes", "pageInfo"});

    public static c c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        b bVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(d.a, true)))).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                bVar = (b) aa.c.c(e.a, false).a(eVar, wVar);
            }
        }
        if (bVar != null) {
            return new c(list, bVar);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, c cVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(d.a, true)))).b(fVar, wVar, cVar.a);
        fVar.z0("pageInfo");
        aa.c.c(e.a, false).b(fVar, wVar, cVar.b);
    }
}
