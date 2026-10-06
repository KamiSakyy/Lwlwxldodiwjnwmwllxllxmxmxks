package ny0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements aa.a {
    public static final p a = new p();
    public static final List b = sy.d0Shadow.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        my0.a0 a0Var = null;
        while (eVar.r0(b) == 0) {
            a0Var = (my0.a0) aa.c.b(aa.c.c(r.a, false)).a(eVar, wVar);
        }
        return new my0.y(a0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        my0.y yVar = (my0.y) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yVar, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(r.a, false)).b(fVar, wVar, yVar.a);
    }
}
