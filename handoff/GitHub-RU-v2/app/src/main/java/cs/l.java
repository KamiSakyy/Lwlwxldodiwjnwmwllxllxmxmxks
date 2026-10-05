package cs;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements aa.a {
    public static final l a = new l();
    public static final List b = d0.n("nodes");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(i.a, true)))).a(eVar, wVar);
        }
        return new e(list);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        e eVar = (e) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(i.a, true)))).b(fVar, wVar, eVar.a);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
