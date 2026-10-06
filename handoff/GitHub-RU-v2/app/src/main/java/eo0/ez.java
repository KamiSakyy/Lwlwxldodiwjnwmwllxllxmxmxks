package eo0;

import java.util.List;
import jn0.ve0;
import jn0.we0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ez implements aaShadow.a {
    public static final ez a = new ez();
    public static final List b = sy.d0.o(new String[]{"viewer", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        we0 we0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                we0Var = (we0) aa.c.c(fz.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (we0Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new ve0(we0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ve0 ve0Var = (ve0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ve0Var, "value");
        fVar.z0("viewer");
        aa.c.c(fz.a, false).b(fVar, wVar, ve0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ve0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ve0Var.c);
    }
}
