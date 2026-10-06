package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fa implements aaShadow.a {
    public static final fa a = new fa();
    public static final List b = sy.d0.n("followUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ff ffVar = null;
        while (eVar.r0(b) == 0) {
            ffVar = (kc0.ff) aa.c.b(aa.c.c(ga.a, false)).a(eVar, wVar);
        }
        return new kc0.ef(ffVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ef efVar = (kc0.ef) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(efVar, "value");
        fVar.z0("followUser");
        aa.c.b(aa.c.c(ga.a, false)).b(fVar, wVar, efVar.a);
    }
}
