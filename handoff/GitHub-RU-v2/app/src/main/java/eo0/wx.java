package eo0;

import java.util.List;
import jn0.sc0;
import jn0.uc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wx implements aa.a {
    public static final wx a = new wx();
    public static final List b = sy.d0.o(new String[]{"id", "owner", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        sc0 sc0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                sc0Var = (sc0) aa.c.c(ux.a, false).a(eVar, wVar);
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
        if (sc0Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str2 != null) {
            return new uc0(str, sc0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        uc0 uc0Var = (uc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uc0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, uc0Var.a);
        fVar.z0("owner");
        aa.c.c(ux.a, false).b(fVar, wVar, uc0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, uc0Var.c);
    }
}
