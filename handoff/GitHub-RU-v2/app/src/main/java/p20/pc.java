package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class pc implements aa.a {
    public static final List a = sy.d0.n("mentionableItems");

    public static u10.zi c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ti tiVar = null;
        while (eVar.r0(a) == 0) {
            tiVar = (u10.ti) aa.c.b(aa.c.c(jc.a, false)).a(eVar, wVar);
        }
        return new u10.zi(tiVar);
    }

    public static void d(ea.f fVar, aa.w wVar, u10.zi ziVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ziVar, "value");
        fVar.z0("mentionableItems");
        aa.c.b(aa.c.c(jc.a, false)).b(fVar, wVar, ziVar.a);
    }
}
