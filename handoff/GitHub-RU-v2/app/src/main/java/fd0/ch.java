package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class ch implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("reactions");

    public static kc0.ep c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.gp gpVar = null;
        while (eVar.r0(a) == 0) {
            gpVar = (kc0.gp) aa.c.c(eh.a, false).a(eVar, wVar);
        }
        if (gpVar != null) {
            return new kc0.ep(gpVar);
        }
        k41.b.B(eVar, "reactions");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.ep epVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(epVar, "value");
        fVar.z0("reactions");
        aa.c.c(eh.a, false).b(fVar, wVar, epVar.a);
    }
}
