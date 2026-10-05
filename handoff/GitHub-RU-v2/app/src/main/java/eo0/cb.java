package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cb implements aa.a {
    public static final cb a = new cb();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.sg sgVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                sgVar = (jn0.sg) aa.c.c(ib.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(fb.a, true)))).a(eVar, wVar);
            }
        }
        if (sgVar != null) {
            return new jn0.mg(sgVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.mg mgVar = (jn0.mg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mgVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(ib.a, false).b(fVar, wVar, mgVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(fb.a, true)))).b(fVar, wVar, mgVar.b);
    }
}
