package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cn implements aa.a {
    public static final cn a = new cn();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.dx dxVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                dxVar = (jn0.dx) aa.c.c(an.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(wm.a, true)))).a(eVar, wVar);
            }
        }
        if (dxVar != null) {
            return new jn0.fx(dxVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.fx fxVar = (jn0.fx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fxVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(an.a, false).b(fVar, wVar, fxVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(wm.a, true)))).b(fVar, wVar, fxVar.b);
    }
}
