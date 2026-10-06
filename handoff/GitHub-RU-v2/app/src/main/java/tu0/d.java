package tu0;

import aa.w;
import ea.f;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0Shadow.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        su0.d dVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                dVar = (su0.d) aa.c.c(c.a, true).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(b.a, true)))).a(eVar, wVar);
            }
        }
        if (dVar != null) {
            return new su0.e(dVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(f fVar, w wVar, Object obj) {
        su0.e eVar = (su0.e) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(eVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(c.a, true).b(fVar, wVar, eVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(b.a, true)))).b(fVar, wVar, eVar.b);
    }
}
