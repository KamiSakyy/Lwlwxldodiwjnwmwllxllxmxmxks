package ss0;

import aa.w;
import java.util.List;
import pz0.zs;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements aa.a {
    public static final n a = new n();
    public static final List b = d0Shadow.n("mergeMethod");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        zs zsVar = null;
        while (eVar.r0(b) == 0) {
            zsVar = (zs) aa.c.b(qz0.b.g).a(eVar, wVar);
        }
        return new k(zsVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        k kVar = (k) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("mergeMethod");
        aa.c.b(qz0.b.g).b(fVar, wVar, kVar.a);
    }
}
