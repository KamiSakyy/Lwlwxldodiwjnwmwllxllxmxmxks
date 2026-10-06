package fd0;

import java.util.List;
import kc0.f50;
import kc0.g50;
import kc0.i50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class is implements aaShadow.a {
    public static final is a = new is();
    public static final List b = sy.d0.o(new String[]{"updateSubscription", "markNotificationAsDone"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i50 i50Var = null;
        g50 g50Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                i50Var = (i50) aa.c.b(aa.c.c(ls.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new f50(i50Var, g50Var);
                }
                g50Var = (g50) aa.c.b(aa.c.c(js.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f50 f50Var = (f50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f50Var, "value");
        fVar.z0("updateSubscription");
        aa.c.b(aa.c.c(ls.a, false)).b(fVar, wVar, f50Var.a);
        fVar.z0("markNotificationAsDone");
        aa.c.b(aa.c.c(js.a, false)).b(fVar, wVar, f50Var.b);
    }
}
