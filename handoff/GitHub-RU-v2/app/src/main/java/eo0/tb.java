package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tb implements aaShadow.a {
    public static final tb a = new tb();
    public static final List b = sy.d0Shadow.o(new String[]{"nodes", "pageInfo"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        jn0.ai aiVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ac.a, true)))).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                aiVar = (jn0.ai) aa.c.c(ic.a, false).a(eVar, wVar);
            }
        }
        if (aiVar != null) {
            return new jn0.kh(list, aiVar);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.kh khVar = (jn0.kh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(khVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ac.a, true)))).b(fVar, wVar, khVar.a);
        fVar.z0("pageInfo");
        aa.c.c(ic.a, false).b(fVar, wVar, khVar.b);
    }
}
