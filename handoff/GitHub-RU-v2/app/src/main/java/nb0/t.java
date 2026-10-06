package nb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t implements aa.a {
    public static final t a = new t();
    public static final List b = sy.d0Shadow.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        mb0.g0 g0Var = null;
        while (eVar.r0(b) == 0) {
            g0Var = (mb0.g0) aa.c.b(aa.c.c(v.a, false)).a(eVar, wVar);
        }
        return new mb0.e0(g0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        mb0.e0 e0Var = (mb0.e0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e0Var, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(v.a, false)).b(fVar, wVar, e0Var.a);
    }
}
