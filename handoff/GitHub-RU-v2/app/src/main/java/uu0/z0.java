package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "project", "id"});

    public static x0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        w0 w0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                w0Var = (w0) aa.c.c(y0.a, true).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        iy0.e1 c = iy0.f1Shadow.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (w0Var == null) {
            k41.b.B(eVar, "project");
            throw null;
        }
        if (str2 != null) {
            return new x0(str, w0Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, x0 x0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x0Var.a);
        fVar.z0("project");
        aa.c.c(y0.a, true).b(fVar, wVar, x0Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, x0Var.c);
        List list = iy0.f1Shadow.a;
        iy0.f1Shadow.d(fVar, wVar, x0Var.d);
    }
}
