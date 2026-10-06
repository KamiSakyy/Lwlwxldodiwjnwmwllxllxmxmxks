package eo0;

import java.util.List;
import jn0.a60;
import jn0.c60;
import jn0.z50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class et implements aaShadow.a {
    public static final et a = new et();
    public static final List b = sy.d0.o(new String[]{"updateSubscription", "markNotificationAsUndone"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c60 c60Var = null;
        a60 a60Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                c60Var = (c60) aa.c.b(aa.c.c(ht.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new z50(c60Var, a60Var);
                }
                a60Var = (a60) aa.c.b(aa.c.c(ft.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z50 z50Var = (z50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z50Var, "value");
        fVar.z0("updateSubscription");
        aa.c.b(aa.c.c(ht.a, false)).b(fVar, wVar, z50Var.a);
        fVar.z0("markNotificationAsUndone");
        aa.c.b(aa.c.c(ft.a, false)).b(fVar, wVar, z50Var.b);
    }
}
