package eo0;

import java.util.List;
import jn0.x60;
import jn0.y60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class au implements aa.a {
    public static final au a = new au();
    public static final List b = sy.d0.o(new String[]{"topRepositories", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        x60 x60Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                x60Var = (x60) aa.c.c(zt.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (x60Var == null) {
            k41.b.B(eVar, "topRepositories");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new y60(x60Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y60 y60Var = (y60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y60Var, "value");
        fVar.z0("topRepositories");
        aa.c.c(zt.a, false).b(fVar, wVar, y60Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y60Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, y60Var.c);
    }
}
