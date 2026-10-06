package mo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l0 implements aa.a {
    public static final List a = sy.d0Shadow.n("repositories");

    public static d c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v vVar = null;
        while (eVar.r0(a) == 0) {
            vVar = (v) aa.c.c(d1.a, false).a(eVar, wVar);
        }
        if (vVar != null) {
            return new d(vVar);
        }
        k41.b.B(eVar, "repositories");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, d dVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("repositories");
        aa.c.c(d1.a, false).b(fVar, wVar, dVar.a);
    }
}
