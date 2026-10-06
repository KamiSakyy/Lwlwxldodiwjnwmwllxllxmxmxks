package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tm implements aaShadow.a {
    public static final tm a = new tm();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.tw twVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                twVar = (jn0.tw) aa.c.c(sm.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(pm.a, true)))).a(eVar, wVar);
            }
        }
        if (twVar != null) {
            return new jn0.uw(twVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.uw uwVar = (jn0.uw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uwVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(sm.a, false).b(fVar, wVar, uwVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(pm.a, true)))).b(fVar, wVar, uwVar.b);
    }
}
