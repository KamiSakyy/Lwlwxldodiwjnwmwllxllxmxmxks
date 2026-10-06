package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w5 implements aaShadow.a {
    public static final w5 a = new w5();
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
        return new u10.x8(str, aVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.x8 x8Var = (u10.x8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x8Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, x8Var.a);
        e30.a aVar = x8Var.b;
        if (aVar != null) {
            e30.b.d(fVar, wVar, aVar);
        }
    }
}
