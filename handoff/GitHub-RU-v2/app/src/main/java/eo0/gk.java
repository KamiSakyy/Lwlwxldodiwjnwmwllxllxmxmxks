package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gk implements aa.a {
    public static final gk a = new gk();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.dt dtVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                dtVar = (jn0.dt) aa.c.c(fk.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ek.a, false)))).a(eVar, wVar);
            }
        }
        if (dtVar != null) {
            return new jn0.et(dtVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.et etVar = (jn0.et) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(etVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(fk.a, false).b(fVar, wVar, etVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ek.a, false)))).b(fVar, wVar, etVar.b);
    }
}
