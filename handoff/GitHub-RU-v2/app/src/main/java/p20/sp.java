package p20;

import java.util.List;
import u10.g10;
import u10.h10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sp implements aaShadow.a {
    public static final sp a = new sp();
    public static final List b = sy.d0.o("topRepositories", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        g10 g10Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                g10Var = (g10) aa.c.c(rp.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (g10Var == null) {
            k41.b.B(eVar, "topRepositories");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new h10(g10Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h10 h10Var = (h10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h10Var, "value");
        fVar.z0("topRepositories");
        aa.c.c(rp.a, false).b(fVar, wVar, h10Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h10Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h10Var.c);
    }
}
