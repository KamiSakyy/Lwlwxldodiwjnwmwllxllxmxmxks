package cs0;

import aa.w;
import java.util.List;
import java.util.Set;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n implements aa.a {
    public static final List a = d0.n("__typename");

    public static j c(ea.e eVar, w wVar) {
        h hVar;
        g gVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        i iVar = null;
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            hVar = s.c(eVar, wVar);
        } else {
            hVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), set2, str, set)) {
            eVar.s0();
            gVar = r.c(eVar, wVar);
        } else {
            gVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            iVar = t.c(eVar, wVar);
        }
        return new j(str, hVar, gVar, iVar);
    }

    public static void d(ea.f fVar, w wVar, j jVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, jVar.a);
        h hVar = jVar.b;
        if (hVar != null) {
            s.d(fVar, wVar, hVar);
        }
        g gVar = jVar.c;
        if (gVar != null) {
            r.d(fVar, wVar, gVar);
        }
        i iVar = jVar.d;
        if (iVar != null) {
            t.d(fVar, wVar, iVar);
        }
    }
}
