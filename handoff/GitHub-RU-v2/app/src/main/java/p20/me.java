package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class me implements aaShadow.a {
    public static final me a = new me();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.rl rlVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                rlVar = (u10.rl) aa.c.c(le.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(je.a, false)))).a(eVar, wVar);
            }
        }
        if (rlVar != null) {
            return new u10.sl(rlVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.sl slVar = (u10.sl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(slVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(le.a, false).b(fVar, wVar, slVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(je.a, false)))).b(fVar, wVar, slVar.b);
    }
}
