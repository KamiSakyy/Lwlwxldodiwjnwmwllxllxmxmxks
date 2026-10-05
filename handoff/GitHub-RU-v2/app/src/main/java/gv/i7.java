package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i7 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "login"});

    public static v5 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
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
        eVar.s0();
        eq.g c = eq.h.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new v5(str, str2, str3, c);
        }
        k41.b.B(eVar, "login");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, v5 v5Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v5Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v5Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, v5Var.b);
        fVar.z0("login");
        bVar.b(fVar, wVar, v5Var.c);
        List list = eq.h.a;
        eq.h.d(fVar, wVar, v5Var.d);
    }
}
