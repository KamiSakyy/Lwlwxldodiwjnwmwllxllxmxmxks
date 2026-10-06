package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class xk implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("watchers");

    public static kc0.iu c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ku kuVar = null;
        while (eVar.r0(a) == 0) {
            kuVar = (kc0.ku) aa.c.c(zk.a, false).a(eVar, wVar);
        }
        if (kuVar != null) {
            return new kc0.iu(kuVar);
        }
        k41.b.B(eVar, "watchers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.iu iuVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iuVar, "value");
        fVar.z0("watchers");
        aa.c.c(zk.a, false).b(fVar, wVar, iuVar.a);
    }
}
