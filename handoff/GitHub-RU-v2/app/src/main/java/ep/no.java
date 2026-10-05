package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class no implements aa.a {
    public static final no a = new no();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.dz dzVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                dzVar = (jo.dz) aa.c.c(lo.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ho.a, true)))).a(eVar, wVar);
            }
        }
        if (dzVar != null) {
            return new jo.fz(dzVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.fz fzVar = (jo.fz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fzVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(lo.a, false).b(fVar, wVar, fzVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ho.a, true)))).b(fVar, wVar, fzVar.b);
    }
}
