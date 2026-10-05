package fd0;

import java.util.List;
import kc0.pz;
import kc0.tz;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mo implements aa.a {
    public static final mo a = new mo();
    public static final List b = sy.d0.n("search");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        tz tzVar = null;
        while (eVar.r0(b) == 0) {
            tzVar = (tz) aa.c.c(qo.a, false).a(eVar, wVar);
        }
        if (tzVar != null) {
            return new pz(tzVar);
        }
        k41.b.B(eVar, "search");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        pz pzVar = (pz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pzVar, "value");
        fVar.z0("search");
        aa.c.c(qo.a, false).b(fVar, wVar, pzVar.a);
    }
}
