package ep;

import java.util.List;
import jo.i80;
import jo.j80;
import jo.l80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xu implements aaShadow.a {
    public static final xu a = new xu();
    public static final List b = sy.d0.o("updateSubscription", "markNotificationAsUndone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l80 l80Var = null;
        j80 j80Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l80Var = (l80) aa.c.b(aa.c.c(av.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new i80(l80Var, j80Var);
                }
                j80Var = (j80) aa.c.b(aa.c.c(yuShadow.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i80 i80Var = (i80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i80Var, "value");
        fVar.z0("updateSubscription");
        aa.c.b(aa.c.c(av.a, false)).b(fVar, wVar, i80Var.a);
        fVar.z0("markNotificationAsUndone");
        aa.c.b(aa.c.c(yuShadow.a, false)).b(fVar, wVar, i80Var.b);
    }
}
