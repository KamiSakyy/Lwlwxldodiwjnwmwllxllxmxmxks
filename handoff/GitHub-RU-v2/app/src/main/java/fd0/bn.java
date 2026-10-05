package fd0;

import java.util.List;
import kc0.ox;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bn implements aa.a {
    public static final bn a = new bn();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ox oxVar = null;
        while (eVar.r0(b) == 0) {
            oxVar = (ox) aa.c.b(aa.c.c(dn.a, false)).a(eVar, wVar);
        }
        return new kc0.mx(oxVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.mx mxVar = (kc0.mx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mxVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(dn.a, false)).b(fVar, wVar, mxVar.a);
    }
}
