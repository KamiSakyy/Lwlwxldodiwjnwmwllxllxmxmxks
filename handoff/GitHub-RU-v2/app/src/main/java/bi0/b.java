package bi0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements aa.a {
    public static final b a = new b();
    public static final List b = d0.n("organization");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        ai0.d dVar = null;
        while (eVar.r0(b) == 0) {
            dVar = (ai0.d) aa.c.b(aa.c.c(c.a, true)).a(eVar, wVar);
        }
        return new ai0.c(dVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ai0.c cVar = (ai0.c) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(c.a, true)).b(fVar, wVar, cVar.a);
    }

}
