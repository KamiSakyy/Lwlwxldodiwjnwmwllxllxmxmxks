package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ac implements aa.a {
    public static final ac a = new ac();
    public static final List b = sy.d0.n("markNotificationsAsUndone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.fi fiVar = null;
        while (eVar.r0(b) == 0) {
            fiVar = (u10.fi) aa.c.b(aa.c.c(bc.a, false)).a(eVar, wVar);
        }
        return new u10.ei(fiVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ei eiVar = (u10.ei) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eiVar, "value");
        fVar.z0("markNotificationsAsUndone");
        aa.c.b(aa.c.c(bc.a, false)).b(fVar, wVar, eiVar.a);
    }
}
