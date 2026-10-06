package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class qj implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("contributors");

    public static kc0.os c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ks ksVar = null;
        while (eVar.r0(a) == 0) {
            ksVar = (kc0.ks) aa.c.c(mj.a, false).a(eVar, wVar);
        }
        if (ksVar != null) {
            return new kc0.os(ksVar);
        }
        k41.b.B(eVar, "contributors");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.os osVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(osVar, "value");
        fVar.z0("contributors");
        aa.c.c(mj.a, false).b(fVar, wVar, osVar.a);
    }
}
