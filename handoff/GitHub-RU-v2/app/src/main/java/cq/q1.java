package cq;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q1 implements aa.a {
    public static final q1 a = new q1();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        u3 u3Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        q3 q3Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            u3Var = w3.c(eVar, wVar);
        } else {
            u3Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            q3Var = r3.c(eVar, wVar);
        }
        return new m1(str, u3Var, q3Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m1 m1Var = (m1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, m1Var.a);
        u3 u3Var = m1Var.b;
        if (u3Var != null) {
            w3.d(fVar, wVar, u3Var);
        }
        q3 q3Var = m1Var.c;
        if (q3Var != null) {
            r3.d(fVar, wVar, q3Var);
        }
    }
}
