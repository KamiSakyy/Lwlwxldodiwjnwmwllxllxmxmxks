package nb0;

import java.util.List;
import mb0.q0;
import mb0.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements aa.a {
    public static final b0 a = new b0();
    public static final List b = sy.d0Shadow.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        s0 s0Var = null;
        while (eVar.r0(b) == 0) {
            s0Var = (s0) aa.c.b(aa.c.c(d0.a, false)).a(eVar, wVar);
        }
        return new q0(s0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q0 q0Var = (q0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q0Var, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(d0.a, false)).b(fVar, wVar, q0Var.a);
    }
}
