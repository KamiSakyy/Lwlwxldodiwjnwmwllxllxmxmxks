package jm0;

import im0.w0;
import im0.y0;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 implements aa.a {
    public static final f0 a = new f0();
    public static final List b = sy.d0Shadow.n("updateMobilePushNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y0 y0Var = null;
        while (eVar.r0(b) == 0) {
            y0Var = (y0) aa.c.b(aa.c.c(h0.a, false)).a(eVar, wVar);
        }
        return new w0(y0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w0 w0Var = (w0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w0Var, "value");
        fVar.z0("updateMobilePushNotificationSettings");
        aa.c.b(aa.c.c(h0.a, false)).b(fVar, wVar, w0Var.a);
    }
}
