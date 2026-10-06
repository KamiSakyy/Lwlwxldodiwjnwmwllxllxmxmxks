package fd0;

import java.util.List;
import kc0.l20;
import kc0.u20;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class tq implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "comments"});

    public static u20 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        l20 l20Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                l20Var = (l20) aa.c.c(lq.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (l20Var != null) {
            return new u20(str, l20Var);
        }
        k41.b.B(eVar, "comments");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u20 u20Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u20Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, u20Var.a);
        fVar.z0("comments");
        aa.c.c(lq.a, false).b(fVar, wVar, u20Var.b);
    }
}
