package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j6 implements aa.a {
    public static final j6 a = new j6();
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
        return new a6(str, cVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a6 a6Var = (a6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a6Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, a6Var.a);
        eq.c cVar = a6Var.b;
        if (cVar != null) {
            eq.d.d(fVar, wVar, cVar);
        }
    }
}
