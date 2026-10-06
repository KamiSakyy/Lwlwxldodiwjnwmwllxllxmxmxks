package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ld implements aaShadow.a {
    public static final ld a = new ld();
    public static final List b = sy.d0.n("createGoogleIapSubscription");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.rj rjVar = null;
        while (eVar.r0(b) == 0) {
            rjVar = (jo.rj) aa.c.b(aa.c.c(kd.a, false)).a(eVar, wVar);
        }
        return new jo.sj(rjVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.sj sjVar = (jo.sj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sjVar, "value");
        fVar.z0("createGoogleIapSubscription");
        aa.c.b(aa.c.c(kd.a, false)).b(fVar, wVar, sjVar.a);
    }
}
