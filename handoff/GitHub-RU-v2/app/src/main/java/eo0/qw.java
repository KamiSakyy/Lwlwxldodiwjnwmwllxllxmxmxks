package eo0;

import java.util.List;
import jn0.eb0;
import jn0.fb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qw implements aa.a {
    public static final qw a = new qw();
    public static final List b = sy.d0.n("updateNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fb0 fb0Var = null;
        while (eVar.r0(b) == 0) {
            fb0Var = (fb0) aa.c.b(aa.c.c(rw.a, false)).a(eVar, wVar);
        }
        return new eb0(fb0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        eb0 eb0Var = (eb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eb0Var, "value");
        fVar.z0("updateNotificationSettings");
        aa.c.b(aa.c.c(rw.a, false)).b(fVar, wVar, eb0Var.a);
    }
}
