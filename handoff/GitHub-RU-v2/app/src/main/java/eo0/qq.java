package eo0;

import java.util.List;
import jn0.g20;
import jn0.h20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qq implements aaShadow.a {
    public static final qq a = new qq();
    public static final List b = sy.d0Shadow.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        g20 g20Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                g20Var = (g20) aa.c.c(pq.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(mq.a, true)))).a(eVar, wVar);
            }
        }
        if (g20Var != null) {
            return new h20(g20Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h20 h20Var = (h20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h20Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(pq.a, false).b(fVar, wVar, h20Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(mq.a, true)))).b(fVar, wVar, h20Var.b);
    }
}
