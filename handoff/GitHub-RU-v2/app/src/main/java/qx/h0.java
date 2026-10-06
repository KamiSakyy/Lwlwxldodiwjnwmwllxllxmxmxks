package qx;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 implements aa.a {
    public static final h0 a = new h0();
    public static final List b = sy.d0Shadow.o("__typename", "id", "login");

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
            return new u(str, str2, str3, gVar);
        }
        k41.b.B(eVar, "login");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u uVar = (u) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, uVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, uVar.b);
        fVar.z0("login");
        bVar.b(fVar, wVar, uVar.c);
        eq.g gVar = uVar.d;
        if (gVar != null) {
            eq.h.d(fVar, wVar, gVar);
        }
    }
}
