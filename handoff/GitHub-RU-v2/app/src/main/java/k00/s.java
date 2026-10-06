package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public class s implements aa.a {
    public static final s a = new s();
    public static final List b = sy.d0Shadow.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j00.f0 f0Var = null;
        while (eVar.r0(b) == 0) {
            f0Var = (j00.f0) aa.c.b(aa.c.c(u.a, false)).a(eVar, wVar);
        }
        return new j00.d0(f0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.d0 d0Var = (j00.d0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d0Var, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(u.a, false)).b(fVar, wVar, d0Var.a);
    }
}
