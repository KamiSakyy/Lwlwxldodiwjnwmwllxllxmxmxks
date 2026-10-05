package ap0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c5 implements aa.a {
    public static final c5 a = new c5();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "login", "url"});

    public final Object a(ea.e eVar, aa.w wVar) {
        v4 v4Var;
        u4 u4Var;
        cp0.g gVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str4 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            v4Var = b5.c(eVar, wVar);
        } else {
            v4Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            u4Var = a5.c(eVar, wVar);
        } else {
            u4Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), set2, str, set)) {
            eVar.s0();
            gVar = cp0.h.c(eVar, wVar);
        } else {
            gVar = null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "login");
            throw null;
        }
        if (str4 != null) {
            return new w4(str, str2, str3, str4, v4Var, u4Var, gVar);
        }
        k41.b.B(eVar, "url");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w4 w4Var = (w4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w4Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w4Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, w4Var.b);
        fVar.z0("login");
        bVar.b(fVar, wVar, w4Var.c);
        fVar.z0("url");
        bVar.b(fVar, wVar, w4Var.d);
        v4 v4Var = w4Var.e;
        if (v4Var != null) {
            b5.d(fVar, wVar, v4Var);
        }
        u4 u4Var = w4Var.f;
        if (u4Var != null) {
            a5.d(fVar, wVar, u4Var);
        }
        cp0.g gVar = w4Var.g;
        if (gVar != null) {
            cp0.h.d(fVar, wVar, gVar);
        }
    }
}
