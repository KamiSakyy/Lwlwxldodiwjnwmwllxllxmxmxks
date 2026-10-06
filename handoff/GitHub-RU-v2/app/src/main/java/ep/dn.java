package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dn implements aaShadow.a {
    public static final dn a = new dn();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.rx rxVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                rxVar = (jo.rx) aa.c.c(hn.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(en.a, true)))).a(eVar, wVar);
            }
        }
        if (rxVar != null) {
            return new jo.nx(rxVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.nx nxVar = (jo.nx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nxVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(hn.a, false).b(fVar, wVar, nxVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(en.a, true)))).b(fVar, wVar, nxVar.b);
    }
}
