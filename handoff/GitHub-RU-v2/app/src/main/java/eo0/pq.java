package eo0;

import java.util.List;
import jn0.g20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pq implements aaShadow.a {
    public static final pq a = new pq();
    public static final List b = sy.d0.o(new String[]{"hasNextPage", "endCursor"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (bool != null) {
            return new g20(str, bool.booleanValue());
        }
        k41.b.B(eVar, "hasNextPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g20 g20Var = (g20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g20Var, "value");
        fVar.z0("hasNextPage");
        jo.f4.C(g20Var.a, aa.c.f, fVar, wVar, "endCursor");
        aa.c.i.b(fVar, wVar, g20Var.b);
    }
}
