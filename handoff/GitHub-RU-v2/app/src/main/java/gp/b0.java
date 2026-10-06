package gp;

import fp.f1Shadow;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements aa.a {
    public static final b0 a = new b0();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        eq.g gVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            gVar = eq.h.c(eVar, wVar);
        }
        return new f1Shadow(str, gVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f1Shadow f1Var = (f1Shadow) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, f1Var.a);
        eq.g gVar = f1Var.b;
        if (gVar != null) {
            eq.h.d(fVar, wVar, gVar);
        }
    }
}
