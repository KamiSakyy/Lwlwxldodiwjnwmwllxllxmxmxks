package vw0;

import aa.w;
import java.util.List;
import sy.d0Shadow;
import uw0.x;
import uw0.y;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements aa.a {
    public static final p a = new p();
    public static final List b = d0Shadow.n("list");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        x xVar = null;
        while (eVar.r0(b) == 0) {
            xVar = (x) aa.c.b(aa.c.c(o.a, false)).a(eVar, wVar);
        }
        return new y(xVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        y yVar = (y) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yVar, "value");
        fVar.z0("list");
        aa.c.b(aa.c.c(o.a, false)).b(fVar, wVar, yVar.a);
    }
}
