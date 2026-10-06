package vx0;

import ap0.e2;
import ap0.f2;
import java.util.List;
import java.util.Set;
import ux0.a1;
import ux0.y0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 implements aa.a {
    public static final i0 a = new i0();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        y0 y0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        e2 e2Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue", "Organization", "PullRequest", "User"}), set2, str, set)) {
            eVar.s0();
            y0Var = g0.c(eVar, wVar);
        } else {
            y0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            e2Var = f2.c(eVar, wVar);
        }
        return new a1(str, y0Var, e2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a1 a1Var = (a1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, a1Var.a);
        y0 y0Var = a1Var.b;
        if (y0Var != null) {
            g0.d(fVar, wVar, y0Var);
        }
        e2 e2Var = a1Var.c;
        if (e2Var != null) {
            f2.d(fVar, wVar, e2Var);
        }
    }
}
