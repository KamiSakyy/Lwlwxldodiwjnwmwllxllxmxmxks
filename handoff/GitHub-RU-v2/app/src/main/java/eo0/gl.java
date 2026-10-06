package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gl implements aaShadow.a {
    public static final gl a = new gl();
    public static final List b = sy.d0Shadow.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.av avVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                avVar = (jn0.av) aa.c.c(ll.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(il.a, true)))).a(eVar, wVar);
            }
        }
        if (avVar != null) {
            return new jn0.vu(avVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.vu vuVar = (jn0.vu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vuVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(ll.a, false).b(fVar, wVar, vuVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(il.a, true)))).b(fVar, wVar, vuVar.b);
    }
}
