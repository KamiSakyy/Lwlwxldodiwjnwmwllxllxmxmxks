package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hc implements aa.a {
    public static final hc a = new hc();
    public static final List b = sy.d0.n("createSavedNotificationThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ei eiVar = null;
        while (eVar.r0(b) == 0) {
            eiVar = (kc0.ei) aa.c.b(aa.c.c(gc.a, false)).a(eVar, wVar);
        }
        return new kc0.fi(eiVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.fi fiVar = (kc0.fi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fiVar, "value");
        fVar.z0("createSavedNotificationThread");
        aa.c.b(aa.c.c(gc.a, false)).b(fVar, wVar, fiVar.a);
    }
}
