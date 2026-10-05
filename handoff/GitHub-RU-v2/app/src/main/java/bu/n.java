package bu;

import aa.w;
import java.util.List;
import m10.py;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements aa.a {
    public static final n a = new n();
    public static final List b = d0.n("mergeMethod");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        py pyVar = null;
        while (eVar.r0(b) == 0) {
            pyVar = (py) aa.c.b(n10.b.s).a(eVar, wVar);
        }
        return new k(pyVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        k kVar = (k) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("mergeMethod");
        aa.c.b(n10.b.s).b(fVar, wVar, kVar.a);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
