package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r8 implements aa.a {
    public static final r8 a = new r8();
    public static final List b = sy.d0.n("trendingRepositories");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(s8.a, true)))).a(eVar, wVar);
        }
        return new kc0.ad(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ad adVar = (kc0.ad) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(adVar, "value");
        fVar.z0("trendingRepositories");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(s8.a, true)))).b(fVar, wVar, adVar.a);
    }
}
