package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class od implements aaShadow.a {
    public static final od a = new od();
    public static final List b = sy.d0.n("mobileEventsUpdate");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.lk lkVar = null;
        while (eVar.r0(b) == 0) {
            lkVar = (u10.lk) aa.c.b(aa.c.c(pd.a, false)).a(eVar, wVar);
        }
        return new u10.kk(lkVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.kk kkVar = (u10.kk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kkVar, "value");
        fVar.z0("mobileEventsUpdate");
        aa.c.b(aa.c.c(pd.a, false)).b(fVar, wVar, kkVar.a);
    }
}
