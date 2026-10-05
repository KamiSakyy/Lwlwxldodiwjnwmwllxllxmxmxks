package ih0;

import aa.w;
import gn0.bm;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements aa.a {
    public static final n a = new n();
    public static final List b = d0.n("mergeMethod");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        bm bmVar = null;
        while (eVar.r0(b) == 0) {
            bmVar = (bm) aa.c.b(hn0.a.E).a(eVar, wVar);
        }
        return new k(bmVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        k kVar = (k) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("mergeMethod");
        aa.c.b(hn0.a.E).b(fVar, wVar, kVar.a);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
