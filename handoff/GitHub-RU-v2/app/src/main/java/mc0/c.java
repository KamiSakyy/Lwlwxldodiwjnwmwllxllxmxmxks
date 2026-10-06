package mc0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = d0.n("user");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        lc0.k kVar = null;
        while (eVar.r0(b) == 0) {
            kVar = (lc0.k) aa.c.b(aa.c.c(j.a, true)).a(eVar, wVar);
        }
        return new lc0.d(kVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        lc0.d dVar = (lc0.d) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(dVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(j.a, true)).b(fVar, wVar, dVar.a);
    }
    public static final Object f = null;
    public static final Object i = null;
}
