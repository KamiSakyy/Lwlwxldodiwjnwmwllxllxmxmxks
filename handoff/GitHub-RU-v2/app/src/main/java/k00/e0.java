package k00;

import j00.v0;
import j00.x0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 implements aa.a {
    public static final e0 a = new e0();
    public static final List b = sy.d0Shadow.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        x0 x0Var = null;
        while (eVar.r0(b) == 0) {
            x0Var = (x0) aa.c.b(aa.c.c(g0.a, false)).a(eVar, wVar);
        }
        return new v0(x0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v0 v0Var = (v0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v0Var, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(g0.a, false)).b(fVar, wVar, v0Var.a);
    }
}
