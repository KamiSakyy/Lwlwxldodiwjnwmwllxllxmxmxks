package i60;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements aa.a {
    public static final j a = new j();
    public static final List b = d0.n("nodes");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(i.a, false)))).a(eVar, wVar);
        }
        return new d(list);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        d dVar = (d) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(i.a, false)))).b(fVar, wVar, dVar.a);
    }
}
