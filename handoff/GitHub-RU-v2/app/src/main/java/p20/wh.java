package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wh implements aa.a {
    public static final wh a = new wh();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.xp xpVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                xpVar = (u10.xp) aa.c.c(vh.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(uh.a, false)))).a(eVar, wVar);
            }
        }
        if (xpVar != null) {
            return new u10.yp(xpVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.yp ypVar = (u10.yp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ypVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(vh.a, false).b(fVar, wVar, ypVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(uh.a, false)))).b(fVar, wVar, ypVar.b);
    }
}
