package e50;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0Shadow implements aa.a {
    public static final a0Shadow a = new a0Shadow();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e30.a aVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            aVar = e30.b.c(eVar, wVar);
        }
        return new v(str, aVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v vVar = (v) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, vVar.a);
        e30.a aVar = vVar.b;
        if (aVar != null) {
            e30.b.d(fVar, wVar, aVar);
        }
    }
}
