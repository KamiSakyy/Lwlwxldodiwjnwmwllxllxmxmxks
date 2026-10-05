package w10;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e implements aa.a {
    public static final List a = d0.n("achievements");

    public static v10.f c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        v10.b bVar = null;
        while (eVar.r0(a) == 0) {
            bVar = (v10.b) aa.c.c(b.a, false).a(eVar, wVar);
        }
        if (bVar != null) {
            return new v10.f(bVar);
        }
        k41.b.B(eVar, "achievements");
        throw null;
    }
}
