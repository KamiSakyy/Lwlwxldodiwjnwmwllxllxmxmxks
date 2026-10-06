package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class rc implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("mentionableItems");

    public static u10.bj c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.si siVar = null;
        while (eVar.r0(a) == 0) {
            siVar = (u10.si) aa.c.b(aa.c.c(ic.a, false)).a(eVar, wVar);
        }
        return new u10.bj(siVar);
    }

    public static void d(ea.f fVar, aa.w wVar, u10.bj bjVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bjVar, "value");
        fVar.z0("mentionableItems");
        aa.c.b(aa.c.c(ic.a, false)).b(fVar, wVar, bjVar.a);
    }
}
