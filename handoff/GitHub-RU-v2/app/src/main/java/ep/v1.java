package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v1 implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "displayName", "isCopilot", "login", "isAgent"});

    public static jo.e3 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 4) {
                bool = bool2;
                str4 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                bool3 = (Boolean) aa.c.f.a(eVar, wVar);
            }
            bool2 = bool;
        }
        eVar.s0();
        Boolean bool4 = bool3;
        eq.g c = eq.h.c(eVar, wVar);
        Boolean bool5 = bool2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "displayName");
            throw null;
        }
        if (bool5 == null) {
            k41.b.B(eVar, "isCopilot");
            throw null;
        }
        boolean booleanValue = bool5.booleanValue();
        if (str4 == null) {
            k41.b.B(eVar, "login");
            throw null;
        }
        if (bool4 != null) {
            return new jo.e3(c, str, str2, str3, str4, booleanValue, bool4.booleanValue());
        }
        k41.b.B(eVar, "isAgent");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.e3 e3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e3Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e3Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, e3Var.b);
        fVar.z0("displayName");
        bVar.b(fVar, wVar, e3Var.c);
        fVar.z0("isCopilot");
        aa.b bVar2 = aa.c.f;
        jo.f4Shadow.C(e3Var.d, bVar2, fVar, wVar, "login");
        bVar.b(fVar, wVar, e3Var.e);
        fVar.z0("isAgent");
        bVar2.b(fVar, wVar, Boolean.valueOf(e3Var.f));
        List list = eq.h.a;
        eq.h.d(fVar, wVar, e3Var.g);
    }
}
