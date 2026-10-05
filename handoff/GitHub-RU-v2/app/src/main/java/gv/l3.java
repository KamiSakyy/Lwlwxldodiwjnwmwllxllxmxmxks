package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l3 implements aa.a {
    public static final l3 a = new l3();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        eq.c cVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            cVar = eq.d.c(eVar, wVar);
        }
        return new v2(str, cVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v2 v2Var = (v2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v2Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, v2Var.a);
        eq.c cVar = v2Var.b;
        if (cVar != null) {
            eq.d.d(fVar, wVar, cVar);
        }
    }
}
