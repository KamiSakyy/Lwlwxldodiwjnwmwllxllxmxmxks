package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fj implements aa.a {
    public static final fj a = new fj();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.fs fsVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fsVar = (u10.fs) aa.c.c(jj.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(gj.a, true)))).a(eVar, wVar);
            }
        }
        if (fsVar != null) {
            return new u10.bs(fsVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.bs bsVar = (u10.bs) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bsVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(jj.a, false).b(fVar, wVar, bsVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(gj.a, true)))).b(fVar, wVar, bsVar.b);
    }
}
