package f00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "projectsV2"});

    public static m0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        l0 l0Var = null;
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
                l0Var = (l0) aa.c.c(p0.a, false).a(eVar, wVar);
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
        if (l0Var != null) {
            return new m0(str, str2, l0Var);
        }
        k41.b.B(eVar, "projectsV2");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, m0 m0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, m0Var.b);
        fVar.z0("projectsV2");
        aa.c.c(p0.a, false).b(fVar, wVar, m0Var.c);
    }
}
