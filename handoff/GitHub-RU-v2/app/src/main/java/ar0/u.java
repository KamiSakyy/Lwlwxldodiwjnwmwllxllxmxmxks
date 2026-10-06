package ar0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u implements aa.a {
    public static final u a = new u();
    public static final List b = sy.d0Shadow.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        q qVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                qVar = (q) aa.c.c(xShadow.a, true).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(w.a, true)))).a(eVar, wVar);
            }
        }
        if (qVar != null) {
            return new o(qVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o oVar = (o) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(xShadow.a, true).b(fVar, wVar, oVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(w.a, true)))).b(fVar, wVar, oVar.b);
    }
}
