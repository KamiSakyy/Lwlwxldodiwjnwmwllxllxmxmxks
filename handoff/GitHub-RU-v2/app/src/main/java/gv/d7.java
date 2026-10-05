package gv;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d7 implements aa.a {
    public static final d7 a = new d7();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        u5 u5Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        t5 t5Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"StatusContext"}), set2, str, set)) {
            eVar.s0();
            u5Var = h7.c(eVar, wVar);
        } else {
            u5Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckRun"}), set2, str, set)) {
            eVar.s0();
            t5Var = g7.c(eVar, wVar);
        }
        return new q5(str, u5Var, t5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q5 q5Var = (q5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q5Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, q5Var.a);
        u5 u5Var = q5Var.b;
        if (u5Var != null) {
            h7.d(fVar, wVar, u5Var);
        }
        t5 t5Var = q5Var.c;
        if (t5Var != null) {
            g7.d(fVar, wVar, t5Var);
        }
    }
}
