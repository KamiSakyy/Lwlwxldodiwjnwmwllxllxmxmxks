package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class na implements aaShadow.a {
    public static final na a = new na();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.of ofVar = null;
        while (eVar.r0(b) == 0) {
            ofVar = (u10.of) aa.c.c(oa.a, true).a(eVar, wVar);
        }
        if (ofVar != null) {
            return new u10.nf(ofVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.nf nfVar = (u10.nf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nfVar, "value");
        fVar.z0("viewer");
        aa.c.c(oa.a, true).b(fVar, wVar, nfVar.a);
    }
}
