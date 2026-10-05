package ef0;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements aa.a {
    public static final o a = new o();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ud0.a aVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            aVar = ud0.b.c(eVar, wVar);
        }
        return new e(str, aVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        e eVar = (e) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, eVar.a);
        ud0.a aVar = eVar.b;
        if (aVar != null) {
            ud0.b.d(fVar, wVar, aVar);
        }
    }
}
