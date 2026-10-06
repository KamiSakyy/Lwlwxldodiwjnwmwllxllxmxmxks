package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ze implements aaShadow.a {
    public static final ze a = new ze();
    public static final List b = sy.d0Shadow.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.mm mmVar = null;
        while (eVar.r0(b) == 0) {
            mmVar = (u10.mm) aa.c.c(af.a, true).a(eVar, wVar);
        }
        if (mmVar != null) {
            return new u10.lm(mmVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.lm lmVar = (u10.lm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lmVar, "value");
        fVar.z0("viewer");
        aa.c.c(af.a, true).b(fVar, wVar, lmVar.a);
    }
}
