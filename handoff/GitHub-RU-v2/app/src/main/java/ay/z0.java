package ay;

import java.util.List;
import java.util.Set;
import zx.u1;
import zx.v1;
import zx.w1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z0 implements aa.a {
    public static final z0 a = new z0();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        v1 v1Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        w1 w1Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            v1Var = a1.c(eVar, wVar);
        } else {
            v1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            w1Var = b1.c(eVar, wVar);
        }
        return new u1(str, v1Var, w1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u1 u1Var = (u1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, u1Var.a);
        v1 v1Var = u1Var.b;
        if (v1Var != null) {
            a1.d(fVar, wVar, v1Var);
        }
        w1 w1Var = u1Var.c;
        if (w1Var != null) {
            b1.d(fVar, wVar, w1Var);
        }
    }
}
