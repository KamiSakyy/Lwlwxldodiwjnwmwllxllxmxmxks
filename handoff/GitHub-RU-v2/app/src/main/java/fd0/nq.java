package fd0;

import java.util.List;
import java.util.Set;
import kc0.o20;
import kc0.q20;
import kc0.t20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nq implements aaShadow.a {
    public static final nq a = new nq();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        q20 q20Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        t20 t20Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            q20Var = pq.c(eVar, wVar);
        } else {
            q20Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            t20Var = sq.c(eVar, wVar);
        }
        return new o20(str, q20Var, t20Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o20 o20Var = (o20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o20Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, o20Var.a);
        q20 q20Var = o20Var.b;
        if (q20Var != null) {
            pq.d(fVar, wVar, q20Var);
        }
        t20 t20Var = o20Var.c;
        if (t20Var != null) {
            sq.d(fVar, wVar, t20Var);
        }
    }
}
