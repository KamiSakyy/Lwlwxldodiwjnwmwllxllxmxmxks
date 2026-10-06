package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class si implements aaShadow.a {
    public static final si a = new si();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.br brVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                brVar = (kc0.br) aa.c.c(ri.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(qi.a, false)))).a(eVar, wVar);
            }
        }
        if (brVar != null) {
            return new kc0.cr(brVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.cr crVar = (kc0.cr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(crVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(ri.a, false).b(fVar, wVar, crVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(qi.a, false)))).b(fVar, wVar, crVar.b);
    }
}
