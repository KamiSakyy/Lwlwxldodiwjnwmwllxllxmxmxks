package gp;

import fp.j0;
import fp.k0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements aa.a {
    public static final m a = new m();
    public static final List b = sy.d0.o("viewer", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k0 k0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                k0Var = (k0) aa.c.c(n.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (k0Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new j0(k0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j0 j0Var = (j0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j0Var, "value");
        fVar.z0("viewer");
        aa.c.c(n.a, false).b(fVar, wVar, j0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, j0Var.c);
    }
}
