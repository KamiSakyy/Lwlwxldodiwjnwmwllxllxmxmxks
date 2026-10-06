package vw0;

import aa.w;
import java.util.List;
import java.util.Set;
import sy.d0Shadow;
import uu0.k3;
import uu0.r3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = d0Shadow.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        k3 k3Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        uu0.o oVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), set2, str, set)) {
            eVar.s0();
            k3Var = r3.c(eVar, wVar);
        } else {
            k3Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), set2, str, set)) {
            eVar.s0();
            oVar = uu0.t.c(eVar, wVar);
        }
        return new uw0.r(str, k3Var, oVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        uw0.r rVar = (uw0.r) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, rVar.a);
        k3 k3Var = rVar.b;
        if (k3Var != null) {
            r3.d(fVar, wVar, k3Var);
        }
        uu0.o oVar = rVar.c;
        if (oVar != null) {
            uu0.t.d(fVar, wVar, oVar);
        }
    }
}
