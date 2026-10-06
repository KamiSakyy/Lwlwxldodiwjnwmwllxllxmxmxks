package eo0;

import java.util.List;
import jn0.k20;
import jn0.t20;
import jn0.u20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rq implements aaShadow.a {
    public static final rq a = new rq();
    public static final List b = sy.d0.o(new String[]{"repository", "search", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t20 t20Var = null;
        u20 u20Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                t20Var = (t20) aa.c.b(aa.c.c(ar.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                u20Var = (u20) aa.c.c(br.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (u20Var == null) {
            k41.b.B(eVar, "search");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new k20(t20Var, u20Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k20 k20Var = (k20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k20Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(ar.a, false)).b(fVar, wVar, k20Var.a);
        fVar.z0("search");
        aa.c.c(br.a, false).b(fVar, wVar, k20Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k20Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k20Var.d);
    }
}
