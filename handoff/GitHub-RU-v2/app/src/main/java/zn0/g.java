package zn0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import yn0.l;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = d0Shadow.n("checkSuite");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        yn0.i iVar = null;
        while (eVar.r0(b) == 0) {
            iVar = (yn0.i) aa.c.b(aa.c.c(e.a, false)).a(eVar, wVar);
        }
        return new l(iVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        l lVar = (l) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(lVar, "value");
        fVar.z0("checkSuite");
        aa.c.b(aa.c.c(e.a, false)).b(fVar, wVar, lVar.a);
    }
}
