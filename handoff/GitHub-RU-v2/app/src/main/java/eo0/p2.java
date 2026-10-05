package eo0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p2 implements aa.a {
    public static final p2 a = new p2();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        jn0.k4 k4Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        jn0.i4 i4Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"StatusContext"}), set2, str, set)) {
            eVar.s0();
            k4Var = t2.c(eVar, wVar);
        } else {
            k4Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckRun"}), set2, str, set)) {
            eVar.s0();
            i4Var = r2.c(eVar, wVar);
        }
        return new jn0.g4(str, k4Var, i4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.g4 g4Var = (jn0.g4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g4Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, g4Var.a);
        jn0.k4 k4Var = g4Var.b;
        if (k4Var != null) {
            t2.d(fVar, wVar, k4Var);
        }
        jn0.i4 i4Var = g4Var.c;
        if (i4Var != null) {
            r2.d(fVar, wVar, i4Var);
        }
    }
}
