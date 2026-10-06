package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class he implements aaShadow.a {
    public static final he a = new he();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(le.a, true)))).a(eVar, wVar);
        }
        return new jn0.ll(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ll llVar = (jn0.ll) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(llVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(le.a, true)))).b(fVar, wVar, llVar.a);
    }
}
