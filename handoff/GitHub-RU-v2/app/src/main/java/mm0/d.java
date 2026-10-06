package mm0;

import aa.w;
import java.util.List;
import k71.k;
import lm0.m;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0Shadow.n("updateRepository");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        m mVar = null;
        while (eVar.r0(b) == 0) {
            mVar = (m) aa.c.b(aa.c.c(f.a, false)).a(eVar, wVar);
        }
        return new lm0.k(mVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        lm0.k kVar = (lm0.k) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(kVar, "value");
        fVar.z0("updateRepository");
        aa.c.b(aa.c.c(f.a, false)).b(fVar, wVar, kVar.a);
    }
}
