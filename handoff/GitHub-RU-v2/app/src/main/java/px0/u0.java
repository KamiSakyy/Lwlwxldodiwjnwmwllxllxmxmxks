package px0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "nameWithOwner", "owner"});

    public static ox0.x0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        ox0.y0 y0Var = null;
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
                y0Var = (ox0.y0) aa.c.c(v0.a, true).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "nameWithOwner");
            throw null;
        }
        if (y0Var != null) {
            return new ox0.x0(str, str2, y0Var);
        }
        k41.b.B(eVar, "owner");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, ox0.x0 x0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x0Var.a);
        fVar.z0("nameWithOwner");
        bVar.b(fVar, wVar, x0Var.b);
        fVar.z0("owner");
        aa.c.c(v0.a, true).b(fVar, wVar, x0Var.c);
    }
}
