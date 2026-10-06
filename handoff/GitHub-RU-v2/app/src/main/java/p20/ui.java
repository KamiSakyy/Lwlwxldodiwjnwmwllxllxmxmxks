package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class ui implements aaShadow.a {
    public static final List a = sy.d0.n("contributors");

    public static u10.kr c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.gr grVar = null;
        while (eVar.r0(a) == 0) {
            grVar = (u10.gr) aa.c.c(qi.a, false).a(eVar, wVar);
        }
        if (grVar != null) {
            return new u10.kr(grVar);
        }
        k41.b.B(eVar, "contributors");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.kr krVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(krVar, "value");
        fVar.z0("contributors");
        aa.c.c(qi.a, false).b(fVar, wVar, krVar.a);
    }
}
