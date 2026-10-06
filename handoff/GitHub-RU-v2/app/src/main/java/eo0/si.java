package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class si implements aaShadow.a {
    public static final si a = new si();
    public static final List b = sy.d0Shadow.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.hr hrVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                hrVar = (jn0.hr) aa.c.c(ri.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(oi.a, false)))).a(eVar, wVar);
            }
        }
        if (hrVar != null) {
            return new jn0.ir(hrVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ir irVar = (jn0.ir) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(irVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(ri.a, false).b(fVar, wVar, irVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(oi.a, false)))).b(fVar, wVar, irVar.b);
    }
}
