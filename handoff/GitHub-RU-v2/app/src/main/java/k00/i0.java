package k00;

import j00.b1;
import j00.d1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 implements aa.a {
    public static final i0 a = new i0();
    public static final List b = sy.d0Shadow.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d1 d1Var = null;
        while (eVar.r0(b) == 0) {
            d1Var = (d1) aa.c.b(aa.c.c(k0.a, false)).a(eVar, wVar);
        }
        return new b1(d1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b1 b1Var = (b1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b1Var, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(k0.a, false)).b(fVar, wVar, b1Var.a);
    }
}
