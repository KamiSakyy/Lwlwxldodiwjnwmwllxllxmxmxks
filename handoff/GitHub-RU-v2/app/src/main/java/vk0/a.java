package vk0;

import aa.w;
import ea.f;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = d0Shadow.n("viewer");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        uk0.c cVar = null;
        while (eVar.r0(b) == 0) {
            cVar = (uk0.c) aa.c.c(b.a, false).a(eVar, wVar);
        }
        if (cVar != null) {
            return new uk0.b(cVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(f fVar, w wVar, Object obj) {
        uk0.b bVar = (uk0.b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("viewer");
        aa.c.c(b.a, false).b(fVar, wVar, bVar.a);
    }
}
