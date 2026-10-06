package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u9 implements aaShadow.a {
    public static final u9 a = new u9();
    public static final List b = sy.d0Shadow.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.re reVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                reVar = (jn0.re) aa.c.c(w9.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(v9.a, true)))).a(eVar, wVar);
            }
        }
        if (reVar != null) {
            return new jn0.pe(reVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.pe peVar = (jn0.pe) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(peVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(w9.a, false).b(fVar, wVar, peVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(v9.a, true)))).b(fVar, wVar, peVar.b);
    }
}
