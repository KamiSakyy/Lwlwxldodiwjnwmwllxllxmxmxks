package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v2 implements aa.a {
    public static final v2 a = new v2();
    public static final List b = sy.d0.o("__typename", "id", "login");

    public final Object a(ea.e eVar, aa.w wVar) {
        eq.g gVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            gVar = eq.h.c(eVar, wVar);
        } else {
            gVar = null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new a2(str, str2, str3, gVar);
        }
        k41.b.B(eVar, "login");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a2 a2Var = (a2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, a2Var.b);
        fVar.z0("login");
        bVar.b(fVar, wVar, a2Var.c);
        eq.g gVar = a2Var.d;
        if (gVar != null) {
            eq.h.d(fVar, wVar, gVar);
        }
    }
}
