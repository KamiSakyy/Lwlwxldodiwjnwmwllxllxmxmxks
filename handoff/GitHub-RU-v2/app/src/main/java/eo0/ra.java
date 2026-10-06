package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ra implements aaShadow.a {
    public static final ra a = new ra();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ag agVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                agVar = (jn0.ag) aa.c.c(ua.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(sa.a, true)))).a(eVar, wVar);
            }
        }
        if (agVar != null) {
            return new jn0.xf(agVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.xf xfVar = (jn0.xf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xfVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(ua.a, false).b(fVar, wVar, xfVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(sa.a, true)))).b(fVar, wVar, xfVar.b);
    }
}
