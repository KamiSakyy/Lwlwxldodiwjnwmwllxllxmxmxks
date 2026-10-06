package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ap implements aaShadow.a {
    public static final ap a = new ap();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.xz xzVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                xzVar = (jo.xz) aa.c.c(zo.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(yo.a, true)))).a(eVar, wVar);
            }
        }
        if (xzVar != null) {
            return new jo.yz(xzVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.yz yzVar = (jo.yz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yzVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(zo.a, false).b(fVar, wVar, yzVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(yo.a, true)))).b(fVar, wVar, yzVar.b);
    }
}
