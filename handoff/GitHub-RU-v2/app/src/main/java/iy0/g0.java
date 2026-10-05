package iy0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "projectsV2"});

    public static e0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        d0 d0Var = null;
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
                d0Var = (d0) aa.c.c(h0.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (d0Var != null) {
            return new e0(str, str2, d0Var);
        }
        k41.b.B(eVar, "projectsV2");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, e0 e0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, e0Var.b);
        fVar.z0("projectsV2");
        aa.c.c(h0.a, false).b(fVar, wVar, e0Var.c);
    }
}
