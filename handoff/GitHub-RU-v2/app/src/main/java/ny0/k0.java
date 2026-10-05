package ny0;

import java.util.List;
import my0.d1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 implements aa.a {
    public static final k0 a = new k0();
    public static final List b = sy.d0.n("scheduledNotifications");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new d1(bool.booleanValue());
        }
        k41.b.B(eVar, "scheduledNotifications");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d1 d1Var = (d1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d1Var, "value");
        fVar.z0("scheduledNotifications");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(d1Var.a));
    }
}
