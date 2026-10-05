package ad0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;
import zc0.p;
import zc0.q;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements aa.a {
    public static final i a = new i();
    public static final List b = d0.n("rerunCheckSuiteMobile");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        q qVar = null;
        while (eVar.r0(b) == 0) {
            qVar = (q) aa.c.b(aa.c.c(j.a, false)).a(eVar, wVar);
        }
        return new p(qVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        p pVar = (p) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(pVar, "value");
        fVar.z0("rerunCheckSuiteMobile");
        aa.c.b(aa.c.c(j.a, false)).b(fVar, wVar, pVar.a);
    }

}
