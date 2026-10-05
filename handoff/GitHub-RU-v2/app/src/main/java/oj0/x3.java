package oj0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"name", "id", "url", "owner", "__typename"});

    public static v3 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        u3 u3Var = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                u3Var = (u3) aa.c.c(w3.a, true).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str4 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (u3Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str4 != null) {
            return new v3(str, str2, str3, u3Var, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, v3 v3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v3Var, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v3Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, v3Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, v3Var.c);
        fVar.z0("owner");
        aa.c.c(w3.a, true).b(fVar, wVar, v3Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, v3Var.e);
    }
}
