package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"parent", "id", "__typename"});

    public static r0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p0 p0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                p0Var = (p0) aa.c.b(aa.c.c(t0.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new r0(p0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, r0 r0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r0Var, "value");
        fVar.z0("parent");
        aa.c.b(aa.c.c(t0.a, false)).b(fVar, wVar, r0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, r0Var.c);
    }
}
