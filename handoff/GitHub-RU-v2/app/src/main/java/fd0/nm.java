package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nm implements aa.a {
    public static final nm a = new nm();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.sw swVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                swVar = (kc0.sw) aa.c.c(pm.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(om.a, false)))).a(eVar, wVar);
            }
        }
        if (swVar != null) {
            return new kc0.qw(swVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.qw qwVar = (kc0.qw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qwVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(pm.a, false).b(fVar, wVar, qwVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(om.a, false)))).b(fVar, wVar, qwVar.b);
    }
}
