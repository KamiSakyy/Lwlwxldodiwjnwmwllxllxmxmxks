package uc0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0.n("node");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        tc0.h hVar = null;
        while (eVar.r0(b) == 0) {
            hVar = (tc0.h) aa.c.b(aa.c.c(e.a, true)).a(eVar, wVar);
        }
        return new tc0.g(hVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        tc0.g gVar = (tc0.g) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(gVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(e.a, true)).b(fVar, wVar, gVar.a);
    }
}
