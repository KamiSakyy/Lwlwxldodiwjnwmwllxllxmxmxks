package fd0;

import java.util.List;
import kc0.vc0;
import kc0.wc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lx implements aa.a {
    public static final lx a = new lx();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        vc0 vc0Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                vc0Var = (vc0) aa.c.c(kx.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(jx.a, true)))).a(eVar, wVar);
            }
        }
        if (vc0Var != null) {
            return new wc0(vc0Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wc0 wc0Var = (wc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wc0Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(kx.a, false).b(fVar, wVar, wc0Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(jx.a, true)))).b(fVar, wVar, wc0Var.b);
    }
}
