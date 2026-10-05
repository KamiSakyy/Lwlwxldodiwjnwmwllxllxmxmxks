package sr;

import aa.w;
import java.util.List;
import java.util.Set;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t implements aa.a {
    public static final t a = new t();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        c cVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        d dVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            cVar = n.c(eVar, wVar);
        } else {
            cVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            dVar = o.c(eVar, wVar);
        }
        return new i(str, cVar, dVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        i iVar = (i) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, iVar.a);
        c cVar = iVar.b;
        if (cVar != null) {
            n.d(fVar, wVar, cVar);
        }
        d dVar = iVar.c;
        if (dVar != null) {
            o.d(fVar, wVar, dVar);
        }
    }
}
