package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ek implements aaShadow.a {
    public static final ek a = new ek();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.et etVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                etVar = (u10.et) aa.c.c(ck.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(yj.a, true)))).a(eVar, wVar);
            }
        }
        if (etVar != null) {
            return new u10.gt(etVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.gt gtVar = (u10.gt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gtVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(ck.a, false).b(fVar, wVar, gtVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(yj.a, true)))).b(fVar, wVar, gtVar.b);
    }
}
