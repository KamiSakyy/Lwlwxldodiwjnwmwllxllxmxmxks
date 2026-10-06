package k00;

import j00.n1;
import j00.p1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 implements aa.a {
    public static final q0 a = new q0();
    public static final List b = sy.d0Shadow.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p1 p1Var = null;
        while (eVar.r0(b) == 0) {
            p1Var = (p1) aa.c.b(aa.c.c(s0.a, false)).a(eVar, wVar);
        }
        return new n1(p1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n1 n1Var = (n1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n1Var, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(s0.a, false)).b(fVar, wVar, n1Var.a);
    }
}
