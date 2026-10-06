package p20;

import java.util.List;
import u10.i00;
import u10.j00;
import u10.l00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xo implements aaShadow.a {
    public static final xo a = new xo();
    public static final List b = sy.d0Shadow.o("updateSubscription", "markNotificationAsUndone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l00 l00Var = null;
        j00 j00Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l00Var = (l00) aa.c.b(aa.c.c(ap.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new i00(l00Var, j00Var);
                }
                j00Var = (j00) aa.c.b(aa.c.c(yo.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i00 i00Var = (i00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i00Var, "value");
        fVar.z0("updateSubscription");
        aa.c.b(aa.c.c(ap.a, false)).b(fVar, wVar, i00Var.a);
        fVar.z0("markNotificationAsUndone");
        aa.c.b(aa.c.c(yo.a, false)).b(fVar, wVar, i00Var.b);
    }
}
