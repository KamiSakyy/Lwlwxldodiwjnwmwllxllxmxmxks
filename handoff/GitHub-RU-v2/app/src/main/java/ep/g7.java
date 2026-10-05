package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g7 implements aa.a {
    public static final g7 a = new g7();
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
        return new jo.wa(str, cVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.wa waVar = (jo.wa) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(waVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, waVar.a);
        eq.c cVar = waVar.b;
        if (cVar != null) {
            eq.d.d(fVar, wVar, cVar);
        }
    }
}
