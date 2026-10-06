package jl0;

import aa.w;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0Shadow.n("deleteUserList");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        il0.h hVar = null;
        while (eVar.r0(b) == 0) {
            hVar = (il0.h) aa.c.b(aa.c.c(e.a, false)).a(eVar, wVar);
        }
        return new il0.g(hVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        il0.g gVar = (il0.g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("deleteUserList");
        aa.c.b(aa.c.c(e.a, false)).b(fVar, wVar, gVar.a);
    }
}
