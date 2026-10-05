package eo0;

import java.util.List;
import jn0.wg0;
import jn0.xg0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l00 implements aa.a {
    public static final l00 a = new l00();
    public static final List b = sy.d0.o(new String[]{"repositories", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        wg0 wg0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                wg0Var = (wg0) aa.c.c(k00.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (wg0Var == null) {
            k41.b.B(eVar, "repositories");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new xg0(wg0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xg0 xg0Var = (xg0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xg0Var, "value");
        fVar.z0("repositories");
        aa.c.c(k00.a, false).b(fVar, wVar, xg0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xg0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, xg0Var.c);
    }
}
