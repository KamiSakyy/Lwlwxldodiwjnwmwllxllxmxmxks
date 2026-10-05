package ep;

import java.util.List;
import jo.sf0;
import jo.uf0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yz implements aa.a {
    public static final yz a = new yz();
    public static final List b = sy.d0.n("updateMobilePushNotificationSchedules");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        uf0 uf0Var = null;
        while (eVar.r0(b) == 0) {
            uf0Var = (uf0) aa.c.b(aa.c.c(a00.a, false)).a(eVar, wVar);
        }
        return new sf0(uf0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        sf0 sf0Var = (sf0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sf0Var, "value");
        fVar.z0("updateMobilePushNotificationSchedules");
        aa.c.b(aa.c.c(a00.a, false)).b(fVar, wVar, sf0Var.a);
    }
}
