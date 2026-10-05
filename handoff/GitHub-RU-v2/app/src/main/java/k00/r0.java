package k00;

import j00.o1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 implements aa.a {
    public static final r0 a = new r0();
    public static final List b = sy.d0.n("scheduledNotifications");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new o1(bool.booleanValue());
        }
        k41.b.B(eVar, "scheduledNotifications");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o1 o1Var = (o1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o1Var, "value");
        fVar.z0("scheduledNotifications");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(o1Var.a));
    }
}
