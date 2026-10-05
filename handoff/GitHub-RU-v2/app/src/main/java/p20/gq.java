package p20;

import java.util.List;
import u10.h20;
import u10.i20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gq implements aa.a {
    public static final gq a = new gq();
    public static final List b = sy.d0.n("unlockLockable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i20 i20Var = null;
        while (eVar.r0(b) == 0) {
            i20Var = (i20) aa.c.b(aa.c.c(hq.a, false)).a(eVar, wVar);
        }
        return new h20(i20Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h20 h20Var = (h20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h20Var, "value");
        fVar.z0("unlockLockable");
        aa.c.b(aa.c.c(hq.a, false)).b(fVar, wVar, h20Var.a);
    }
}
