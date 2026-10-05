package fd0;

import java.util.List;
import kc0.t20;
import kc0.x20;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class sq implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "timelineItem"});

    public static t20 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        x20 x20Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                x20Var = (x20) aa.c.b(aa.c.c(wq.a, true)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new t20(str, x20Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, t20 t20Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t20Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, t20Var.a);
        fVar.z0("timelineItem");
        aa.c.b(aa.c.c(wq.a, true)).b(fVar, wVar, t20Var.b);
    }
}
