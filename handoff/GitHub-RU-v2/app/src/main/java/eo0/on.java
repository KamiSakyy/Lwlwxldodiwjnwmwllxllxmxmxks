package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class on implements aaShadow.a {
    public static final on a = new on();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.wx wxVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                wxVar = (jn0.wx) aa.c.c(nnShadow.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(mn.a, true)))).a(eVar, wVar);
            }
        }
        if (wxVar != null) {
            return new jn0.xx(wxVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.xx xxVar = (jn0.xx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xxVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(nnShadow.a, false).b(fVar, wVar, xxVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(mn.a, true)))).b(fVar, wVar, xxVar.b);
    }
}
