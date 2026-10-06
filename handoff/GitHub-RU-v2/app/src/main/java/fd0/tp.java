package fd0;

import java.util.List;
import kc0.j10;
import kc0.k10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tp implements aaShadow.a {
    public static final tp a = new tp();
    public static final List b = sy.d0Shadow.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j10 j10Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                j10Var = (j10) aa.c.c(sp.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(rp.a, true)))).a(eVar, wVar);
            }
        }
        if (j10Var != null) {
            return new k10(j10Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k10 k10Var = (k10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k10Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(sp.a, false).b(fVar, wVar, k10Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(rp.a, true)))).b(fVar, wVar, k10Var.b);
    }
}
