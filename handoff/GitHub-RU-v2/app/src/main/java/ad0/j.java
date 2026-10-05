package ad0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;
import zc0.n;
import zc0.q;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements aa.a {
    public static final j a = new j();
    public static final List b = d0.n("checkSuite");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        n nVar = null;
        while (eVar.r0(b) == 0) {
            nVar = (n) aa.c.b(aa.c.c(h.a, false)).a(eVar, wVar);
        }
        return new q(nVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        q qVar = (q) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(qVar, "value");
        fVar.z0("checkSuite");
        aa.c.b(aa.c.c(h.a, false)).b(fVar, wVar, qVar.a);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
