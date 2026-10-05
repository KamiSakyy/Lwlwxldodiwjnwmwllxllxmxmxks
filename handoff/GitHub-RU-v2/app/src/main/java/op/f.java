package op;

import aa.w;
import java.util.List;
import k71.k;
import np.l;
import np.m;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = d0.n("discussion");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        l lVar = null;
        while (eVar.r0(b) == 0) {
            lVar = (l) aa.c.b(aa.c.c(e.a, true)).a(eVar, wVar);
        }
        return new m(lVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        m mVar = (m) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(mVar, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(e.a, true)).b(fVar, wVar, mVar.a);
    }
}
