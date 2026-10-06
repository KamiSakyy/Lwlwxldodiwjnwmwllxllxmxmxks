package p20;

import java.util.List;
import u10.b80;
import u10.z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fu implements aaShadow.a {
    public static final fu a = new fu();
    public static final List b = sy.d0.n("updateSubscription");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b80 b80Var = null;
        while (eVar.r0(b) == 0) {
            b80Var = (b80) aa.c.b(aa.c.c(hu.a, false)).a(eVar, wVar);
        }
        return new z70(b80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z70 z70Var = (z70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z70Var, "value");
        fVar.z0("updateSubscription");
        aa.c.b(aa.c.c(hu.a, false)).b(fVar, wVar, z70Var.a);
    }
}
