package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class je implements aaShadow.a {
    public static final je a = new je();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ke.a, true)))).a(eVar, wVar);
        }
        return new jn0.nl(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.nl nlVar = (jn0.nl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nlVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ke.a, true)))).b(fVar, wVar, nlVar.a);
    }
}
