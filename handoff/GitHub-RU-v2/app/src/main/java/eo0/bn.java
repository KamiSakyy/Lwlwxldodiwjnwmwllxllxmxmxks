package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bn implements aa.a {
    public static final bn a = new bn();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.cx cxVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                cxVar = (jn0.cx) aa.c.c(zm.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(vm.a, true)))).a(eVar, wVar);
            }
        }
        if (cxVar != null) {
            return new jn0.ex(cxVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ex exVar = (jn0.ex) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(exVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(zm.a, false).b(fVar, wVar, exVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(vm.a, true)))).b(fVar, wVar, exVar.b);
    }
}
