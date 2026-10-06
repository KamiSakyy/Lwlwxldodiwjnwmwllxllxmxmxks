package sa0;

import aa.w;
import java.util.List;
import java.util.Set;
import sy.d0Shadow;
import w80.a2;
import w80.h2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = d0Shadow.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        a2 a2Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        w80.h hVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), set2, str, set)) {
            eVar.s0();
            a2Var = h2.c(eVar, wVar);
        } else {
            a2Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), set2, str, set)) {
            eVar.s0();
            hVar = w80.m.c(eVar, wVar);
        }
        return new ra0.r(str, a2Var, hVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ra0.r rVar = (ra0.r) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, rVar.a);
        a2 a2Var = rVar.b;
        if (a2Var != null) {
            h2.d(fVar, wVar, a2Var);
        }
        w80.h hVar = rVar.c;
        if (hVar != null) {
            w80.m.d(fVar, wVar, hVar);
        }
    }
}
