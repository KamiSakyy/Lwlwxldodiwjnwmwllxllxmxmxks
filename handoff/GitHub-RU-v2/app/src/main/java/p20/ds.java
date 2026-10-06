package p20;

import java.util.List;
import u10.c50;
import u10.d50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ds implements aaShadow.a {
    public static final ds a = new ds();
    public static final List b = sy.d0.n("updateNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d50 d50Var = null;
        while (eVar.r0(b) == 0) {
            d50Var = (d50) aa.c.b(aa.c.c(es.a, false)).a(eVar, wVar);
        }
        return new c50(d50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c50 c50Var = (c50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c50Var, "value");
        fVar.z0("updateNotificationSettings");
        aa.c.b(aa.c.c(es.a, false)).b(fVar, wVar, c50Var.a);
    }
}
