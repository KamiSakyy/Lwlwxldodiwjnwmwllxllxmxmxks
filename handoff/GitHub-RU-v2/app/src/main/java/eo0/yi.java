package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yi implements aaShadow.a {
    public static final yi a = new yi();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ur urVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                urVar = (jn0.ur) aa.c.c(aj.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(zi.a, true)))).a(eVar, wVar);
            }
        }
        if (urVar != null) {
            return new jn0.sr(urVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.sr srVar = (jn0.sr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(srVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(aj.a, false).b(fVar, wVar, srVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(zi.a, true)))).b(fVar, wVar, srVar.b);
    }
}
