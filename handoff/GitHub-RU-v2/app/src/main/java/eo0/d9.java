package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d9 implements aaShadow.a {
    public static final d9 a = new d9();
    public static final List b = sy.d0.o(new String[]{"nodes", "pageInfo"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        jn0.pd pdVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(b9.a, true)))).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                pdVar = (jn0.pd) aa.c.c(c9.a, false).a(eVar, wVar);
            }
        }
        if (pdVar != null) {
            return new jn0.qd(list, pdVar);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.qd qdVar = (jn0.qd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qdVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(b9.a, true)))).b(fVar, wVar, qdVar.a);
        fVar.z0("pageInfo");
        aa.c.c(c9.a, false).b(fVar, wVar, qdVar.b);
    }
}
