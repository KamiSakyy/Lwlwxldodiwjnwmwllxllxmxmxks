package fd0;

import java.util.List;
import kc0.sx;
import kc0.ux;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fn implements aa.a {
    public static final fn a = new fn();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ux uxVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                uxVar = (ux) aa.c.c(hn.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(gn.a, true)))).a(eVar, wVar);
            }
        }
        if (uxVar != null) {
            return new sx(uxVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        sx sxVar = (sx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sxVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(hn.a, false).b(fVar, wVar, sxVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(gn.a, true)))).b(fVar, wVar, sxVar.b);
    }
}
