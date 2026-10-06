package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mj implements aaShadow.a {
    public static final mj a = new mj();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ps psVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                psVar = (kc0.ps) aa.c.c(rj.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(oj.a, true)))).a(eVar, wVar);
            }
        }
        if (psVar != null) {
            return new kc0.ks(psVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ks ksVar = (kc0.ks) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ksVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(rj.a, false).b(fVar, wVar, ksVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(oj.a, true)))).b(fVar, wVar, ksVar.b);
    }
}
