package p20;

import java.util.List;
import u10.sw;
import u10.tw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jm implements aaShadow.a {
    public static final jm a = new jm();
    public static final List b = sy.d0.n("resolveReviewThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        tw twVar = null;
        while (eVar.r0(b) == 0) {
            twVar = (tw) aa.c.b(aa.c.c(km.a, false)).a(eVar, wVar);
        }
        return new sw(twVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        sw swVar = (sw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(swVar, "value");
        fVar.z0("resolveReviewThread");
        aa.c.b(aa.c.c(km.a, false)).b(fVar, wVar, swVar.a);
    }
}
