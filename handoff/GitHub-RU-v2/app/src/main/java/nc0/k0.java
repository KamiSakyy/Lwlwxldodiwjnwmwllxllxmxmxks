package nc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k0 implements aa.a {
    public static final List a = sy.d0.n("repositories");

    public static d c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u uVar = null;
        while (eVar.r0(a) == 0) {
            uVar = (u) aa.c.c(b1.a, false).a(eVar, wVar);
        }
        if (uVar != null) {
            return new d(uVar);
        }
        k41.b.B(eVar, "repositories");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, d dVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("repositories");
        aa.c.c(b1.a, false).b(fVar, wVar, dVar.a);
    }
}
