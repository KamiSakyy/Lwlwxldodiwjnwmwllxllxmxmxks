package dw;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i4 implements aa.a {
    public static final i4 a = new i4();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        v3 v3Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        w3 w3Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            v3Var = j4.c(eVar, wVar);
        } else {
            v3Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            w3Var = k4.c(eVar, wVar);
        }
        return new u3(str, v3Var, w3Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u3 u3Var = (u3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u3Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, u3Var.a);
        v3 v3Var = u3Var.b;
        if (v3Var != null) {
            j4.d(fVar, wVar, v3Var);
        }
        w3 w3Var = u3Var.c;
        if (w3Var != null) {
            k4.d(fVar, wVar, w3Var);
        }
    }
}
