package e20;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0Shadow.n("node");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        d20.h hVar = null;
        while (eVar.r0(b) == 0) {
            hVar = (d20.h) aa.c.b(aa.c.c(e.a, true)).a(eVar, wVar);
        }
        return new d20.g(hVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        d20.g gVar = (d20.g) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(gVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(e.a, true)).b(fVar, wVar, gVar.a);
    }

}
