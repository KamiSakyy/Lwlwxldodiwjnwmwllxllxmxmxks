package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q6 implements aa.a {
    public static final q6 a = new q6();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        cp0.c cVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            cVar = cp0.d.c(eVar, wVar);
        }
        return new jn0.z9(str, cVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.z9 z9Var = (jn0.z9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z9Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, z9Var.a);
        cp0.c cVar = z9Var.b;
        if (cVar != null) {
            cp0.d.d(fVar, wVar, cVar);
        }
    }
}
