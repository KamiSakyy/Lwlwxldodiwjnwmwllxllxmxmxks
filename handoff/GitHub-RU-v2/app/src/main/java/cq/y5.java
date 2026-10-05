package cq;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y5 implements aa.a {
    public static final y5 a = new y5();
    public static final List b = sy.d0.o("__typename", "id", "login", "url");

    public final Object a(ea.e eVar, aa.w wVar) {
        r5 r5Var;
        q5 q5Var;
        eq.g gVar;
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
            r5Var = x5.c(eVar, wVar);
        } else {
            r5Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            q5Var = w5.c(eVar, wVar);
        } else {
            q5Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), set2, str, set)) {
            eVar.s0();
            gVar = eq.h.c(eVar, wVar);
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
            return new s5(str, str2, str3, str4, r5Var, q5Var, gVar);
        }
        k41.b.B(eVar, "url");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s5 s5Var = (s5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s5Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s5Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, s5Var.b);
        fVar.z0("login");
        bVar.b(fVar, wVar, s5Var.c);
        fVar.z0("url");
        bVar.b(fVar, wVar, s5Var.d);
        r5 r5Var = s5Var.e;
        if (r5Var != null) {
            x5.d(fVar, wVar, r5Var);
        }
        q5 q5Var = s5Var.f;
        if (q5Var != null) {
            w5.d(fVar, wVar, q5Var);
        }
        eq.g gVar = s5Var.g;
        if (gVar != null) {
            eq.h.d(fVar, wVar, gVar);
        }
    }
}
