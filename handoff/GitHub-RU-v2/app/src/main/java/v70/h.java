package v70;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        b bVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bVar = (b) aa.c.c(f.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(e.a, true)))).a(eVar, wVar);
            }
        }
        if (bVar != null) {
            return new c(bVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        c cVar = (c) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(f.a, false).b(fVar, wVar, cVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(e.a, true)))).b(fVar, wVar, cVar.b);
    }
}
