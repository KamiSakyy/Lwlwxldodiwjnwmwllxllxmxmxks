package dw;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i5 implements aa.a {
    public static final i5 a = new i5();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        f5 f5Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        g5 g5Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            f5Var = j5.c(eVar, wVar);
        } else {
            f5Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            g5Var = k5.c(eVar, wVar);
        }
        return new e5(str, f5Var, g5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e5 e5Var = (e5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e5Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, e5Var.a);
        f5 f5Var = e5Var.b;
        if (f5Var != null) {
            j5.d(fVar, wVar, f5Var);
        }
        g5 g5Var = e5Var.c;
        if (g5Var != null) {
            k5.d(fVar, wVar, g5Var);
        }
    }
}
