package op;

import aa.w;
import java.util.List;
import k71.k;
import np.m;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0.n("reopenDiscussion");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        m mVar = null;
        while (eVar.r0(b) == 0) {
            mVar = (m) aa.c.b(aa.c.c(f.a, false)).a(eVar, wVar);
        }
        return new np.k(mVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        np.k kVar = (np.k) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(kVar, "value");
        fVar.z0("reopenDiscussion");
        aa.c.b(aa.c.c(f.a, false)).b(fVar, wVar, kVar.a);
    }
}
