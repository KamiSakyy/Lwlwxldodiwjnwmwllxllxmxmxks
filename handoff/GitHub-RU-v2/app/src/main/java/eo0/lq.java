package eo0;

import java.util.List;
import jn0.c20;
import jn0.h20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lq implements aaShadow.a {
    public static final lq a = new lq();
    public static final List b = sy.d0.o(new String[]{"search", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        h20 h20Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                h20Var = (h20) aa.c.c(qq.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (h20Var == null) {
            k41.b.B(eVar, "search");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new c20(h20Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c20 c20Var = (c20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c20Var, "value");
        fVar.z0("search");
        aa.c.c(qq.a, false).b(fVar, wVar, c20Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c20Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, c20Var.c);
    }
}
