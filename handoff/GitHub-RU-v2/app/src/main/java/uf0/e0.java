package uf0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e0 implements aa.a {
    public static final e0 a = new e0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
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
        return new y(str, aVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y yVar = (y) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, yVar.a);
        ud0.a aVar = yVar.b;
        if (aVar != null) {
            ud0.b.d(fVar, wVar, aVar);
        }
    }
}
