package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y9 implements aaShadow.a {
    public static final y9 a = new y9();
    public static final List b = sy.d0Shadow.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.bf bfVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bfVar = (kc0.bf) aa.c.c(eaShadow.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(z9.a, true)))).a(eVar, wVar);
            }
        }
        if (bfVar != null) {
            return new kc0.ve(bfVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ve veVar = (kc0.ve) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(veVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(eaShadow.a, false).b(fVar, wVar, veVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(z9.a, true)))).b(fVar, wVar, veVar.b);
    }
}
