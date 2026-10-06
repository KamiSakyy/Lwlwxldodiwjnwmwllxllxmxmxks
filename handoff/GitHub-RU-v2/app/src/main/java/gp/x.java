package gp;

import fp.b1;
import fp.h1;
import fp.j1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x implements aa.a {
    public static final x a = new x();
    public static final List b = sy.d0Shadow.o("repository", "viewer", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        h1 h1Var = null;
        j1 j1Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                h1Var = (h1) aa.c.b(aa.c.c(d0.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                j1Var = (j1) aa.c.c(f0.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (j1Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new b1(h1Var, j1Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b1 b1Var = (b1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b1Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(d0.a, false)).b(fVar, wVar, b1Var.a);
        fVar.z0("viewer");
        aa.c.c(f0.a, false).b(fVar, wVar, b1Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b1Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, b1Var.d);
    }
}
