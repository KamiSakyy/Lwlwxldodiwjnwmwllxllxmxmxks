package ef0;

import aa.w;
import java.util.List;
import java.util.Set;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        b bVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
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
            bVar = l.c(eVar, wVar);
        } else {
            bVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            cVar = m.c(eVar, wVar);
        }
        return new h(str, bVar, cVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        h hVar = (h) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, hVar.a);
        b bVar = hVar.b;
        if (bVar != null) {
            l.d(fVar, wVar, bVar);
        }
        c cVar = hVar.c;
        if (cVar != null) {
            m.d(fVar, wVar, cVar);
        }
    }
}
