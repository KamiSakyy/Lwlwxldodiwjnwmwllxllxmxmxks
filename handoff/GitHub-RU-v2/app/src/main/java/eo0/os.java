package eo0;

import java.util.List;
import jn0.y40;
import jn0.z40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class os implements aaShadow.a {
    public static final os a = new os();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y40 y40Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                y40Var = (y40) aa.c.c(ns.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ms.a, true)))).a(eVar, wVar);
            }
        }
        if (y40Var != null) {
            return new z40(y40Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z40 z40Var = (z40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z40Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(ns.a, false).b(fVar, wVar, z40Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ms.a, true)))).b(fVar, wVar, z40Var.b);
    }
}
