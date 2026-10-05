package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b7 implements aa.a {
    public static final b7 a = new b7();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.qa qaVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                qaVar = (jn0.qa) aa.c.c(d7.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(c7.a, true)))).a(eVar, wVar);
            }
        }
        if (qaVar != null) {
            return new jn0.oa(qaVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.oa oaVar = (jn0.oa) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oaVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(d7.a, false).b(fVar, wVar, oaVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(c7.a, true)))).b(fVar, wVar, oaVar.b);
    }
}
