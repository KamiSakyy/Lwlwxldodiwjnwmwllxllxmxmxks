package el0;

import dl0.l0;
import dl0.m0;
import dl0.n0;
import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 implements aa.a {
    public static final c0 a = new c0();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        m0 m0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        n0 n0Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            m0Var = d0.c(eVar, wVar);
        } else {
            m0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            n0Var = e0.c(eVar, wVar);
        }
        return new l0(str, m0Var, n0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l0 l0Var = (l0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, l0Var.a);
        m0 m0Var = l0Var.b;
        if (m0Var != null) {
            d0.d(fVar, wVar, m0Var);
        }
        n0 n0Var = l0Var.c;
        if (n0Var != null) {
            e0.d(fVar, wVar, n0Var);
        }
    }
}
