package vw0;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = d0.n("list");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        uw0.d dVar = null;
        while (eVar.r0(b) == 0) {
            dVar = (uw0.d) aa.c.b(aa.c.c(c.a, true)).a(eVar, wVar);
        }
        return new uw0.b(dVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        uw0.b bVar = (uw0.b) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bVar, "value");
        fVar.z0("list");
        aa.c.b(aa.c.c(c.a, true)).b(fVar, wVar, bVar.a);
    }
    public Object O(Object p1) { return null; }
}
