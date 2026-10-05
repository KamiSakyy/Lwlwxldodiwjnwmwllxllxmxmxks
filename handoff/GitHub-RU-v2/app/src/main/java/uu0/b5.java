package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b5 implements aa.a {
    public static final List a = x61.l.r(new String[]{"name", "id", "url", "owner", "__typename"});

    public static z4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        y4 y4Var = null;
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
                y4Var = (y4) aa.c.c(a5.a, true).a(eVar, wVar);
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
        if (y4Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str4 != null) {
            return new z4(str, str2, str3, y4Var, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, z4 z4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z4Var, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z4Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, z4Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, z4Var.c);
        fVar.z0("owner");
        aa.c.c(a5.a, true).b(fVar, wVar, z4Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z4Var.e);
    }
}
