package fd0;

import java.util.List;
import kc0.q20;
import kc0.y20;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class pq implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"timelineItem", "id"});

    public static q20 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y20 y20Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                y20Var = (y20) aa.c.b(aa.c.c(xq.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new q20(y20Var, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, q20 q20Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q20Var, "value");
        fVar.z0("timelineItem");
        aa.c.b(aa.c.c(xq.a, true)).b(fVar, wVar, q20Var.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, q20Var.b);
    }
}
