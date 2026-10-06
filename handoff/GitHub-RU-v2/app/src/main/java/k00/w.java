package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w implements aa.a {
    public static final w a = new w();
    public static final List b = sy.d0Shadow.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j00.l0 l0Var = null;
        while (eVar.r0(b) == 0) {
            l0Var = (j00.l0) aa.c.b(aa.c.c(y.a, false)).a(eVar, wVar);
        }
        return new j00.j0(l0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.j0 j0Var = (j00.j0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j0Var, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(y.a, false)).b(fVar, wVar, j0Var.a);
    }
}
