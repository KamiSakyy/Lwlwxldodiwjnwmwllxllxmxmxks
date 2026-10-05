package p20;

import java.util.List;
import u10.dz;
import u10.ez;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bo implements aa.a {
    public static final bo a = new bo();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ez ezVar = null;
        while (eVar.r0(b) == 0) {
            ezVar = (ez) aa.c.b(aa.c.c(co.a, true)).a(eVar, wVar);
        }
        return new dz(ezVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        dz dzVar = (dz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dzVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(co.a, true)).b(fVar, wVar, dzVar.a);
    }
}
