package fd0;

import java.util.List;
import kc0.v10;
import kc0.x10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cq implements aaShadow.a {
    public static final cq a = new cq();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v10 v10Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                v10Var = (v10) aa.c.c(aq.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(yp.a, true)))).a(eVar, wVar);
            }
        }
        if (v10Var != null) {
            return new x10(v10Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x10 x10Var = (x10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x10Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(aq.a, false).b(fVar, wVar, x10Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(yp.a, true)))).b(fVar, wVar, x10Var.b);
    }
}
