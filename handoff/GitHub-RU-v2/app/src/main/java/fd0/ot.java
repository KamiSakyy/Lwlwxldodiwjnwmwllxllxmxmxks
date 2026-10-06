package fd0;

import java.util.List;
import kc0.a70;
import kc0.b70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ot implements aaShadow.a {
    public static final ot a = new ot();
    public static final List b = sy.d0.n("updateNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b70 b70Var = null;
        while (eVar.r0(b) == 0) {
            b70Var = (b70) aa.c.b(aa.c.c(pt.a, false)).a(eVar, wVar);
        }
        return new a70(b70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a70 a70Var = (a70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a70Var, "value");
        fVar.z0("updateNotificationSettings");
        aa.c.b(aa.c.c(pt.a, false)).b(fVar, wVar, a70Var.a);
    }
}
