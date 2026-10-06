package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ob implements aaShadow.a {
    public static final ob a = new ob();
    public static final List b = sy.d0.n("markNotificationAsUndone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.hh hhVar = null;
        while (eVar.r0(b) == 0) {
            hhVar = (u10.hh) aa.c.b(aa.c.c(pb.a, false)).a(eVar, wVar);
        }
        return new u10.gh(hhVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.gh ghVar = (u10.gh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ghVar, "value");
        fVar.z0("markNotificationAsUndone");
        aa.c.b(aa.c.c(pb.a, false)).b(fVar, wVar, ghVar.a);
    }
}
