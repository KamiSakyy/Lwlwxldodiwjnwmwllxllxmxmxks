package ep;

import java.util.List;
import jo.sg0;
import jo.tg0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o00 implements aa.a {
    public static final o00 a = new o00();
    public static final List b = sy.d0.n("updateUserMobileTimeZone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        tg0 tg0Var = null;
        while (eVar.r0(b) == 0) {
            tg0Var = (tg0) aa.c.b(aa.c.c(p00.a, false)).a(eVar, wVar);
        }
        return new sg0(tg0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        sg0 sg0Var = (sg0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sg0Var, "value");
        fVar.z0("updateUserMobileTimeZone");
        aa.c.b(aa.c.c(p00.a, false)).b(fVar, wVar, sg0Var.a);
    }
}
