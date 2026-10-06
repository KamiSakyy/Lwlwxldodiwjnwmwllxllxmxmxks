package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oo implements aaShadow.a {
    public static final oo a = new oo();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.ez ezVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ezVar = (jo.ez) aa.c.c(mo.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(io.a, true)))).a(eVar, wVar);
            }
        }
        if (ezVar != null) {
            return new jo.gz(ezVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.gz gzVar = (jo.gz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gzVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(mo.a, false).b(fVar, wVar, gzVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(io.a, true)))).b(fVar, wVar, gzVar.b);
    }
}
