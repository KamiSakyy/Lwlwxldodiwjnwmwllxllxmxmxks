package eo0;

import java.util.List;
import jn0.c90;
import jn0.d90;
import jn0.f90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iv implements aaShadow.a {
    public static final iv a = new iv();
    public static final List b = sy.d0Shadow.o(new String[]{"updateSubscription", "markNotificationAsDone"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f90 f90Var = null;
        d90 d90Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                f90Var = (f90) aa.c.b(aa.c.c(lv.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new c90(f90Var, d90Var);
                }
                d90Var = (d90) aa.c.b(aa.c.c(jv.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c90 c90Var = (c90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c90Var, "value");
        fVar.z0("updateSubscription");
        aa.c.b(aa.c.c(lv.a, false)).b(fVar, wVar, c90Var.a);
        fVar.z0("markNotificationAsDone");
        aa.c.b(aa.c.c(jv.a, false)).b(fVar, wVar, c90Var.b);
    }
}
