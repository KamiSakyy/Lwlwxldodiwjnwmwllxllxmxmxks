package ln0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e implements aa.a {
    public static final List a = d0.n("achievements");

    public static kn0.f c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        kn0.b bVar = null;
        while (eVar.r0(a) == 0) {
            bVar = (kn0.b) aa.c.c(b.a, false).a(eVar, wVar);
        }
        if (bVar != null) {
            return new kn0.f(bVar);
        }
        k41.b.B(eVar, "achievements");
        throw null;
    }
}
