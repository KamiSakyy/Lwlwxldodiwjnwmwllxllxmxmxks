package ep;

import java.util.List;
import jo.uf0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a00 implements aaShadow.a {
    public static final a00 a = new a00();
    public static final List b = sy.d0.n("mobilePushNotificationSchedules");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(zz.a, true))).a(eVar, wVar);
        }
        return new uf0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        uf0 uf0Var = (uf0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uf0Var, "value");
        fVar.z0("mobilePushNotificationSchedules");
        aa.c.b(aa.c.a(aa.c.c(zz.a, true))).b(fVar, wVar, uf0Var.a);
    }
}
