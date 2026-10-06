package sa0;

import aa.w;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public class b implements aa.a {
    public static final b a = new b();
    public static final List b = d0Shadow.n("createUserList");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ra0.b bVar = null;
        while (eVar.r0(b) == 0) {
            bVar = (ra0.b) aa.c.b(aa.c.c(a.a, false)).a(eVar, wVar);
        }
        return new ra0.c(bVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ra0.c cVar = (ra0.c) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("createUserList");
        aa.c.b(aa.c.c(a.a, false)).b(fVar, wVar, cVar.a);
    }
}
