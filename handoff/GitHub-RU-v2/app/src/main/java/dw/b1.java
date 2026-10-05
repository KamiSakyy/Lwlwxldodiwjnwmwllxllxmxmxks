package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "project", "id"});

    public static z0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        y0 y0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                y0Var = (y0) aa.c.c(a1.a, true).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        f00.g1 c = f00.h1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (y0Var == null) {
            k41.b.B(eVar, "project");
            throw null;
        }
        if (str2 != null) {
            return new z0(str, y0Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, z0 z0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z0Var.a);
        fVar.z0("project");
        aa.c.c(a1.a, true).b(fVar, wVar, z0Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, z0Var.c);
        List list = f00.h1.a;
        f00.h1.d(fVar, wVar, z0Var.d);
    }
}
