package w10;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = d0.n("user");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        v10.k kVar = null;
        while (eVar.r0(b) == 0) {
            kVar = (v10.k) aa.c.b(aa.c.c(j.a, true)).a(eVar, wVar);
        }
        return new v10.d(kVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        v10.d dVar = (v10.d) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(dVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(j.a, true)).b(fVar, wVar, dVar.a);
    }
    public static final Object f = null;
    public static final Object i = null;
}
