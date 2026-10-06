package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mh implements aaShadow.a {
    public static final mh a = new mh();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.pp ppVar = null;
        while (eVar.r0(b) == 0) {
            ppVar = (u10.pp) aa.c.b(aa.c.c(ph.a, true)).a(eVar, wVar);
        }
        return new u10.mp(ppVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.mp mpVar = (u10.mp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mpVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(ph.a, true)).b(fVar, wVar, mpVar.a);
    }
}
