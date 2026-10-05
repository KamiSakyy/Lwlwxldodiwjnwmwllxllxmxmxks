package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class no implements aa.a {
    public static final no a = new no();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(to.a, true)))).a(eVar, wVar);
        }
        return new jn0.dz(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.dz dzVar = (jn0.dz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dzVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(to.a, true)))).b(fVar, wVar, dzVar.a);
    }
}
