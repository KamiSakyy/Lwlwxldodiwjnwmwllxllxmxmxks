package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class al implements aa.a {
    public static final al a = new al();
    public static final List b = sy.d0.n("repositoryOwner");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.wu wuVar = null;
        while (eVar.r0(b) == 0) {
            wuVar = (kc0.wu) aa.c.b(aa.c.c(jl.a, true)).a(eVar, wVar);
        }
        return new kc0.nu(wuVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.nu nuVar = (kc0.nu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nuVar, "value");
        fVar.z0("repositoryOwner");
        aa.c.b(aa.c.c(jl.a, true)).b(fVar, wVar, nuVar.a);
    }
}
