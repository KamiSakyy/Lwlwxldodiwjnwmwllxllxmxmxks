package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 implements aa.a {
    public static final a0 a = new a0();
    public static final List b = sy.d0.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j00.r0 r0Var = null;
        while (eVar.r0(b) == 0) {
            r0Var = (j00.r0) aa.c.b(aa.c.c(c0.a, false)).a(eVar, wVar);
        }
        return new j00.p0(r0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.p0 p0Var = (j00.p0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p0Var, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(c0.a, false)).b(fVar, wVar, p0Var.a);
    }
}
