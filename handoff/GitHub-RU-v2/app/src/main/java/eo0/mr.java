package eo0;

import java.util.List;
import jn0.l30;
import jn0.p30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mr implements aaShadow.a {
    public static final mr a = new mr();
    public static final List b = sy.d0.o(new String[]{"search", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p30 p30Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                p30Var = (p30) aa.c.c(qr.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (p30Var == null) {
            k41.b.B(eVar, "search");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new l30(p30Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l30 l30Var = (l30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l30Var, "value");
        fVar.z0("search");
        aa.c.c(qr.a, false).b(fVar, wVar, l30Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l30Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, l30Var.c);
    }
}
