package eo0;

import java.util.List;
import jn0.w60;
import jn0.x60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zt implements aa.a {
    public static final zt a = new zt();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w60 w60Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                w60Var = (w60) aa.c.c(yt.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(xt.a, true)))).a(eVar, wVar);
            }
        }
        if (w60Var != null) {
            return new x60(w60Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x60 x60Var = (x60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x60Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(yt.a, false).b(fVar, wVar, x60Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(xt.a, true)))).b(fVar, wVar, x60Var.b);
    }
}
