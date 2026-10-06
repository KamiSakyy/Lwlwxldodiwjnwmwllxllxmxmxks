package jl0;

import aa.w;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0Shadow.n("list");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        il0.q qVar = null;
        while (eVar.r0(b) == 0) {
            qVar = (il0.q) aa.c.b(aa.c.c(j.a, false)).a(eVar, wVar);
        }
        return new il0.o(qVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        il0.o oVar = (il0.o) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("list");
        aa.c.b(aa.c.c(j.a, false)).b(fVar, wVar, oVar.a);
    }
}
