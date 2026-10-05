package e20;

import aa.w;
import d20.o;
import d20.p;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0.n("node");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        p pVar = null;
        while (eVar.r0(b) == 0) {
            pVar = (p) aa.c.b(aa.c.c(i.a, true)).a(eVar, wVar);
        }
        return new o(pVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        o oVar = (o) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(oVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(i.a, true)).b(fVar, wVar, oVar.a);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
