package qy;

import aa.w;
import java.util.List;
import py.n;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0.n("mergeQueueEntry");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        n nVar = null;
        while (eVar.r0(b) == 0) {
            nVar = (n) aa.c.b(aa.c.c(k.a, false)).a(eVar, wVar);
        }
        return new py.k(nVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        py.k kVar = (py.k) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("mergeQueueEntry");
        aa.c.b(aa.c.c(k.a, false)).b(fVar, wVar, kVar.a);
    }
}
