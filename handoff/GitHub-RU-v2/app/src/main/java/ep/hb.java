package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hb implements aaShadow.a {
    public static final hb a = new hb();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.xg xgVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                xgVar = (jo.xg) aa.c.c(kb.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ib.a, true)))).a(eVar, wVar);
            }
        }
        if (xgVar != null) {
            return new jo.ug(xgVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ug ugVar = (jo.ug) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ugVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(kb.a, false).b(fVar, wVar, ugVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ib.a, true)))).b(fVar, wVar, ugVar.b);
    }
}
