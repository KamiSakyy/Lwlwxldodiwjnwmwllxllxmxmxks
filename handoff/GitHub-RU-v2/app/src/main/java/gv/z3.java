package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z3 implements aa.a {
    public static final z3 a = new z3();
    public static final List b = sy.d0Shadow.o("id", "name", "owner", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        u3 u3Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                u3Var = (u3) aa.c.c(x3.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (u3Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new v3(str, str2, u3Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v3 v3Var = (v3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v3Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v3Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, v3Var.b);
        fVar.z0("owner");
        aa.c.c(x3.a, false).b(fVar, wVar, v3Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, v3Var.d);
    }
}
