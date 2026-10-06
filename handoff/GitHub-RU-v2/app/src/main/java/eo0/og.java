package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class og implements aaShadow.a {
    public static final og a = new og();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.no noVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                noVar = (jn0.no) aa.c.c(ng.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(lg.a, false)))).a(eVar, wVar);
            }
        }
        if (noVar != null) {
            return new jn0.oo(noVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.oo ooVar = (jn0.oo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ooVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(ng.a, false).b(fVar, wVar, ooVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(lg.a, false)))).b(fVar, wVar, ooVar.b);
    }
}
