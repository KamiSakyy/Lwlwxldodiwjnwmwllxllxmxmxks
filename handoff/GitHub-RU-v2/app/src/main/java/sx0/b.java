package sx0;

import aa.w;
import ea.f;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements aa.a {
    public static final b a = new b();
    public static final List b = d0.n("changeUserStatus");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        rx0.a aVar = null;
        while (eVar.r0(b) == 0) {
            aVar = (rx0.a) aa.c.b(aa.c.c(a.a, false)).a(eVar, wVar);
        }
        return new rx0.c(aVar);
    }

    public final void b(f fVar, w wVar, Object obj) {
        rx0.c cVar = (rx0.c) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("changeUserStatus");
        aa.c.b(aa.c.c(a.a, false)).b(fVar, wVar, cVar.a);
    }
}
