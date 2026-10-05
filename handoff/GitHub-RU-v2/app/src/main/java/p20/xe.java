package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xe implements aa.a {
    public static final xe a = new xe();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(we.a, false)))).a(eVar, wVar);
        }
        return new u10.hm(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.hm hmVar = (u10.hm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hmVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(we.a, false)))).b(fVar, wVar, hmVar.a);
    }
}
