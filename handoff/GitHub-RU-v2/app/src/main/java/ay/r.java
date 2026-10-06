package ay;

import gv.e2;
import gv.f2;
import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        ct.q0 q0Var;
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
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            q0Var = ct.r0.c(eVar, wVar);
        } else {
            q0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            e2Var = f2.c(eVar, wVar);
        }
        return new zx.c0(str, q0Var, e2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zx.c0 c0Var = (zx.c0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, c0Var.a);
        ct.q0 q0Var = c0Var.b;
        if (q0Var != null) {
            ct.r0.d(fVar, wVar, q0Var);
        }
        e2 e2Var = c0Var.c;
        if (e2Var != null) {
            f2.d(fVar, wVar, e2Var);
        }
    }
}
