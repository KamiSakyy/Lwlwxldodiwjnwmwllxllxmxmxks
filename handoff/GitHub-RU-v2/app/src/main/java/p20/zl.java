package p20;

import java.util.List;
import u10.cw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zl implements aaShadow.a {
    public static final zl a = new zl();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        cw cwVar = null;
        while (eVar.r0(b) == 0) {
            cwVar = (cw) aa.c.b(aa.c.c(bm.a, false)).a(eVar, wVar);
        }
        return new u10.aw(cwVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.aw awVar = (u10.aw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(awVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(bm.a, false)).b(fVar, wVar, awVar.a);
    }
}
