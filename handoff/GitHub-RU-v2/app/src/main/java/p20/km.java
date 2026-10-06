package p20;

import java.util.List;
import u10.tw;
import u10.uw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class km implements aaShadow.a {
    public static final km a = new km();
    public static final List b = sy.d0.n("thread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        uw uwVar = null;
        while (eVar.r0(b) == 0) {
            uwVar = (uw) aa.c.b(aa.c.c(lm.a, true)).a(eVar, wVar);
        }
        return new tw(uwVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        tw twVar = (tw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(twVar, "value");
        fVar.z0("thread");
        aa.c.b(aa.c.c(lm.a, true)).b(fVar, wVar, twVar.a);
    }
}
