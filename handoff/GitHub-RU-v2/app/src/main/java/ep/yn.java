package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yn implements aa.a {
    public static final yn a = new yn();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.my myVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                myVar = (jo.my) aa.c.c(xn.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(un.a, true)))).a(eVar, wVar);
            }
        }
        if (myVar != null) {
            return new jo.ny(myVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ny nyVar = (jo.ny) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nyVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(xn.a, false).b(fVar, wVar, nyVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(un.a, true)))).b(fVar, wVar, nyVar.b);
    }
}
