package p20;

import java.util.List;
import u10.fw;
import u10.gw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cm implements aaShadow.a {
    public static final cm a = new cm();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        gw gwVar = null;
        while (eVar.r0(b) == 0) {
            gwVar = (gw) aa.c.b(aa.c.c(dm.a, true)).a(eVar, wVar);
        }
        return new fw(gwVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fw fwVar = (fw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fwVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(dm.a, true)).b(fVar, wVar, fwVar.a);
    }
}
