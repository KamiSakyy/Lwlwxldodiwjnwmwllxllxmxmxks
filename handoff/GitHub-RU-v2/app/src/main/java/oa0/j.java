package oa0;

import java.util.List;
import java.util.Set;
import z70.t1;
import z70.u1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements aa.a {
    public static final j a = new j();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        w50.e0 e0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        t1 t1Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            e0Var = w50.f0.c(eVar, wVar);
        } else {
            e0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            t1Var = u1.c(eVar, wVar);
        }
        return new na0.o(str, e0Var, t1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        na0.o oVar = (na0.o) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, oVar.a);
        w50.e0 e0Var = oVar.b;
        if (e0Var != null) {
            w50.f0.d(fVar, wVar, e0Var);
        }
        t1 t1Var = oVar.c;
        if (t1Var != null) {
            u1.d(fVar, wVar, t1Var);
        }
    }
}
