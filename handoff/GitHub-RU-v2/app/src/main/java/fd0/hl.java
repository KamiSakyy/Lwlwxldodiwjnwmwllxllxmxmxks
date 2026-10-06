package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hl implements aaShadow.a {
    public static final hl a = new hl();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.su suVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                suVar = (kc0.su) aa.c.c(fl.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(bl.a, true)))).a(eVar, wVar);
            }
        }
        if (suVar != null) {
            return new kc0.uu(suVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.uu uuVar = (kc0.uu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uuVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(fl.a, false).b(fVar, wVar, uuVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(bl.a, true)))).b(fVar, wVar, uuVar.b);
    }
}
