package ep;

import java.util.List;
import jo.pa0;
import jo.ra0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kwShadow implements aaShadow.a {
    public static final kwShadow a = new kwShadow();
    public static final List b = sy.d0Shadow.n("unlockLockable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ra0 ra0Var = null;
        while (eVar.r0(b) == 0) {
            ra0Var = (ra0) aa.c.b(aa.c.c(mw.a, false)).a(eVar, wVar);
        }
        return new pa0(ra0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        pa0 pa0Var = (pa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pa0Var, "value");
        fVar.z0("unlockLockable");
        aa.c.b(aa.c.c(mw.a, false)).b(fVar, wVar, pa0Var.a);
    }
}
