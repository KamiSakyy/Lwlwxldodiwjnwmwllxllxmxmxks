package qy;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements aa.a {
    public static final b a = new b();
    public static final List b = d0.n("mergeQueueEntry");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        py.f fVar = null;
        while (eVar.r0(b) == 0) {
            fVar = (py.f) aa.c.b(aa.c.c(e.a, false)).a(eVar, wVar);
        }
        return new py.c(fVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        py.c cVar = (py.c) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("mergeQueueEntry");
        aa.c.b(aa.c.c(e.a, false)).b(fVar, wVar, cVar.a);
    }
}
