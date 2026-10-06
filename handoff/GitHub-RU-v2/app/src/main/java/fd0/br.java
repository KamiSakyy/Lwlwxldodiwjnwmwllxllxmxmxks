package fd0;

import java.util.List;
import kc0.d30;
import kc0.e30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class br implements aaShadow.a {
    public static final br a = new br();
    public static final List b = sy.d0Shadow.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d30 d30Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                d30Var = (d30) aa.c.c(ar.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(zq.a, true)))).a(eVar, wVar);
            }
        }
        if (d30Var != null) {
            return new e30(d30Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e30 e30Var = (e30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e30Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(ar.a, false).b(fVar, wVar, e30Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(zq.a, true)))).b(fVar, wVar, e30Var.b);
    }
}
