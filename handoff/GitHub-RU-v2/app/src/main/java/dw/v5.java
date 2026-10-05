package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v5 implements aa.a {
    public static final List a = x61.l.r(new String[]{"name", "id", "url", "owner", "__typename"});

    public static t5 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        s5 s5Var = null;
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
                s5Var = (s5) aa.c.c(u5.a, true).a(eVar, wVar);
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
        if (s5Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str4 != null) {
            return new t5(str, str2, str3, s5Var, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, t5 t5Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t5Var, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t5Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, t5Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, t5Var.c);
        fVar.z0("owner");
        aa.c.c(u5.a, true).b(fVar, wVar, t5Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, t5Var.e);
    }
}
