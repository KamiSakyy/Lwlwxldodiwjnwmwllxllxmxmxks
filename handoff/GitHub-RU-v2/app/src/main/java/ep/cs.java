package ep;

import java.util.List;
import jo.k40;
import jo.t40;
import jo.u40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cs implements aa.a {
    public static final cs a = new cs();
    public static final List b = sy.d0.o("repository", "search", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t40 t40Var = null;
        u40 u40Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                t40Var = (t40) aa.c.b(aa.c.c(ls.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                u40Var = (u40) aa.c.c(ms.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (u40Var == null) {
            k41.b.B(eVar, "search");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new k40(t40Var, u40Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k40 k40Var = (k40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k40Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(ls.a, false)).b(fVar, wVar, k40Var.a);
        fVar.z0("search");
        aa.c.c(ms.a, false).b(fVar, wVar, k40Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k40Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k40Var.d);
    }
}
