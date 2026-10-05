package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eh implements aa.a {
    public static final eh a = new eh();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.fp fpVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fpVar = (kc0.fp) aa.c.c(dh.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ah.a, false)))).a(eVar, wVar);
            }
        }
        if (fpVar != null) {
            return new kc0.gp(fpVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.gp gpVar = (kc0.gp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gpVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(dh.a, false).b(fVar, wVar, gpVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ah.a, false)))).b(fVar, wVar, gpVar.b);
    }
}
