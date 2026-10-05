package wx0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p2 implements aa.a {
    public static final p2 a = new p2();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        r1 r1Var;
        q1 q1Var;
        k0 k0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        j0 j0Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            r1Var = z3.c(eVar, wVar);
        } else {
            r1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Team"}), set2, str, set)) {
            eVar.s0();
            q1Var = y3.c(eVar, wVar);
        } else {
            q1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Mannequin"}), set2, str, set)) {
            eVar.s0();
            k0Var = s2.c(eVar, wVar);
        } else {
            k0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Bot"}), set2, str, set)) {
            eVar.s0();
            j0Var = r2.c(eVar, wVar);
        }
        return new h0(str, r1Var, q1Var, k0Var, j0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h0 h0Var = (h0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, h0Var.a);
        r1 r1Var = h0Var.b;
        if (r1Var != null) {
            z3.d(fVar, wVar, r1Var);
        }
        q1 q1Var = h0Var.c;
        if (q1Var != null) {
            y3.d(fVar, wVar, q1Var);
        }
        k0 k0Var = h0Var.d;
        if (k0Var != null) {
            s2.d(fVar, wVar, k0Var);
        }
        j0 j0Var = h0Var.e;
        if (j0Var != null) {
            r2.d(fVar, wVar, j0Var);
        }
    }
}
