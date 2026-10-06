package sa0;

import aa.w;
import java.util.List;
import ra0.c0;
import sy.d0Shadow;
import w80.v3;
import w80.z3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = d0Shadow.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v3 v3Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            z3 z3Var = z3.a;
            v3Var = z3.c(eVar, wVar);
        }
        return new c0(str, v3Var);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        c0 c0Var = (c0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, c0Var.a);
        v3 v3Var = c0Var.b;
        if (v3Var != null) {
            z3 z3Var = z3.a;
            z3.d(fVar, wVar, v3Var);
        }
    }
}
