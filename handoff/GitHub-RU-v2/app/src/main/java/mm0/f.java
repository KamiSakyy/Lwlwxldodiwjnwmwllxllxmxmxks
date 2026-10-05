package mm0;

import aa.w;
import java.util.List;
import k71.k;
import lm0.l;
import lm0.m;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = d0.n("repository");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        l lVar = null;
        while (eVar.r0(b) == 0) {
            lVar = (l) aa.c.b(aa.c.c(e.a, false)).a(eVar, wVar);
        }
        return new m(lVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        m mVar = (m) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(mVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(e.a, false)).b(fVar, wVar, mVar.a);
    }
}
