package lo;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e implements aa.a {
    public static final List a = d0.n("achievements");

    public static ko.f c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        ko.b bVar = null;
        while (eVar.r0(a) == 0) {
            bVar = (ko.b) aa.c.c(b.a, false).a(eVar, wVar);
        }
        if (bVar != null) {
            return new ko.f(bVar);
        }
        k41.b.B(eVar, "achievements");
        throw null;
    }
}
