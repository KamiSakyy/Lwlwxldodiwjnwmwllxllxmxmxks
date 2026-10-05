package k00;

import j00.h1;
import j00.j1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 implements aa.a {
    public static final m0 a = new m0();
    public static final List b = sy.d0.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j1 j1Var = null;
        while (eVar.r0(b) == 0) {
            j1Var = (j1) aa.c.b(aa.c.c(o0.a, false)).a(eVar, wVar);
        }
        return new h1(j1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h1 h1Var = (h1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h1Var, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(o0.a, false)).b(fVar, wVar, h1Var.a);
    }
}
