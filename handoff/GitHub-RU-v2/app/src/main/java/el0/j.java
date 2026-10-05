package el0;

import java.util.List;
import java.util.Set;
import ri0.u1;
import ri0.v1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements aa.a {
    public static final j a = new j();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        mg0.g0 g0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        u1 u1Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            g0Var = mg0.h0.c(eVar, wVar);
        } else {
            g0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            u1Var = v1.c(eVar, wVar);
        }
        return new dl0.o(str, g0Var, u1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        dl0.o oVar = (dl0.o) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, oVar.a);
        mg0.g0 g0Var = oVar.b;
        if (g0Var != null) {
            mg0.h0.d(fVar, wVar, g0Var);
        }
        u1 u1Var = oVar.c;
        if (u1Var != null) {
            v1.d(fVar, wVar, u1Var);
        }
    }
}
