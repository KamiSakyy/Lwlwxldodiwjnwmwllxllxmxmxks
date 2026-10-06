package a40;

import java.util.List;
import java.util.Set;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        e eVar2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        f fVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Commit"}), set2, str, set)) {
            eVar.s0();
            eVar2 = s.c(eVar, wVar);
        } else {
            eVar2 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            fVar = t.c(eVar, wVar);
        }
        return new d(str, eVar2, fVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d dVar = (d) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, dVar.a);
        e eVar = dVar.b;
        if (eVar != null) {
            s.d(fVar, wVar, eVar);
        }
        f fVar2 = dVar.c;
        if (fVar2 != null) {
            t.d(fVar, wVar, fVar2);
        }
    }
}
