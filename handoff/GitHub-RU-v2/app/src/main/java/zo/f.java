package zo;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;
import yo.l;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = d0.n("rerunCheckRunMobile");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        l lVar = null;
        while (eVar.r0(b) == 0) {
            lVar = (l) aa.c.b(aa.c.c(g.a, false)).a(eVar, wVar);
        }
        return new yo.k(lVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        yo.k kVar = (yo.k) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(kVar, "value");
        fVar.z0("rerunCheckRunMobile");
        aa.c.b(aa.c.c(g.a, false)).b(fVar, wVar, kVar.a);
    }
}
