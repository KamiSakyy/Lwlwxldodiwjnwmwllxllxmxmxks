package iy0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "projectsV2"});

    public static k0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        j0 j0Var = null;
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
                j0Var = (j0) aa.c.c(n0.a, false).a(eVar, wVar);
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
        if (j0Var != null) {
            return new k0(str, str2, j0Var);
        }
        k41.b.B(eVar, "projectsV2");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, k0 k0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, k0Var.b);
        fVar.z0("projectsV2");
        aa.c.c(n0.a, false).b(fVar, wVar, k0Var.c);
    }
    public Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object a(Object p1, Object p2, Object p3) { return null; }
    public Object h(Object p1, Object p2, Object p3) { return null; }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
