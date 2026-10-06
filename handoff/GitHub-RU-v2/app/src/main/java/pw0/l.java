package pw0;

import java.util.List;
import java.util.Set;
import xt0.u1;
import xt0.v1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements aa.a {
    public static final l a = new l();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        ur0.k0 k0Var;
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
            k0Var = ur0.l0.c(eVar, wVar);
        } else {
            k0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            u1Var = v1.c(eVar, wVar);
        }
        return new ow0.s(str, k0Var, u1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ow0.s sVar = (ow0.s) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, sVar.a);
        ur0.k0 k0Var = sVar.b;
        if (k0Var != null) {
            ur0.l0.d(fVar, wVar, k0Var);
        }
        u1 u1Var = sVar.c;
        if (u1Var != null) {
            v1.d(fVar, wVar, u1Var);
        }
    }
}
