package gs;

import aa.w;
import java.util.List;
import java.util.Set;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements aa.a {
    public static final j a = new j();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        b bVar;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        c cVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            bVar = h.c(eVar, wVar);
        } else {
            bVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            cVar = i.c(eVar, wVar);
        }
        return new d(str, bVar, cVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        d dVar = (d) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(dVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, dVar.a);
        b bVar = dVar.b;
        if (bVar != null) {
            h.d(fVar, wVar, bVar);
        }
        c cVar = dVar.c;
        if (cVar != null) {
            i.d(fVar, wVar, cVar);
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
