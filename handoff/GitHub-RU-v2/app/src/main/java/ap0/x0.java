package ap0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 implements aa.a {
    public static final x0 a = new x0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        y2 y2Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        u2 u2Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            y2Var = a3.c(eVar, wVar);
        } else {
            y2Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            u2Var = v2.c(eVar, wVar);
        }
        return new u0(str, y2Var, u2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u0 u0Var = (u0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, u0Var.a);
        y2 y2Var = u0Var.b;
        if (y2Var != null) {
            a3.d(fVar, wVar, y2Var);
        }
        u2 u2Var = u0Var.c;
        if (u2Var != null) {
            v2.d(fVar, wVar, u2Var);
        }
    }
}
