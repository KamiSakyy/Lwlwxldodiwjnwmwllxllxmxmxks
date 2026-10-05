package da0;

import aa.w;
import ca0.f;
import ca0.h;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = d0.n("viewer");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        h hVar = null;
        while (eVar.r0(b) == 0) {
            hVar = (h) aa.c.c(e.a, false).a(eVar, wVar);
        }
        if (hVar != null) {
            return new f(hVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        f fVar2 = (f) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(fVar2, "value");
        fVar.z0("viewer");
        aa.c.c(e.a, false).b(fVar, wVar, fVar2.a);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
