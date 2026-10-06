package fd0;

import java.util.List;
import kc0.oc0;
import kc0.pc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fx implements aaShadow.a {
    public static final fx a = new fx();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        pc0 pc0Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                pc0Var = (pc0) aa.c.c(gx.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ex.a, true)))).a(eVar, wVar);
            }
        }
        if (pc0Var != null) {
            return new oc0(pc0Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        oc0 oc0Var = (oc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oc0Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(gx.a, false).b(fVar, wVar, oc0Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ex.a, true)))).b(fVar, wVar, oc0Var.b);
    }
}
