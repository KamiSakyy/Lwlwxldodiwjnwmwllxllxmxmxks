package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ul implements aaShadow.a {
    public static final ul a = new ul();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.mv mvVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                mvVar = (kc0.mv) aa.c.c(tl.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(sl.a, true)))).a(eVar, wVar);
            }
        }
        if (mvVar != null) {
            return new kc0.nv(mvVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.nv nvVar = (kc0.nv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nvVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(tl.a, false).b(fVar, wVar, nvVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(sl.a, true)))).b(fVar, wVar, nvVar.b);
    }
}
