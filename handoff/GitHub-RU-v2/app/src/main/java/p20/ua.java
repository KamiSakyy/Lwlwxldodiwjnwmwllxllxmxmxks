package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ua implements aa.a {
    public static final ua a = new ua();
    public static final List b = sy.d0.n("lockLockable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.bg bgVar = null;
        while (eVar.r0(b) == 0) {
            bgVar = (u10.bg) aa.c.b(aa.c.c(va.a, false)).a(eVar, wVar);
        }
        return new u10.ag(bgVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ag agVar = (u10.ag) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(agVar, "value");
        fVar.z0("lockLockable");
        aa.c.b(aa.c.c(va.a, false)).b(fVar, wVar, agVar.a);
    }
}
