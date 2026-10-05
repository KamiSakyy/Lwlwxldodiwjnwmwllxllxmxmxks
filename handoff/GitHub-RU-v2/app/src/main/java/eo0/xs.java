package eo0;

import java.util.List;
import jn0.k50;
import jn0.m50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xs implements aa.a {
    public static final xs a = new xs();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k50 k50Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                k50Var = (k50) aa.c.c(vs.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ts.a, true)))).a(eVar, wVar);
            }
        }
        if (k50Var != null) {
            return new m50(k50Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m50 m50Var = (m50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m50Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(vs.a, false).b(fVar, wVar, m50Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ts.a, true)))).b(fVar, wVar, m50Var.b);
    }
}
