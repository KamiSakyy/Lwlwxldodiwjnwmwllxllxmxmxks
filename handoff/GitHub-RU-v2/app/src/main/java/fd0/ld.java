package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class ld implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("mentionableItems");

    public static kc0.dk c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.uj ujVar = null;
        while (eVar.r0(a) == 0) {
            ujVar = (kc0.uj) aa.c.b(aa.c.c(cd.a, false)).a(eVar, wVar);
        }
        return new kc0.dk(ujVar);
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.dk dkVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dkVar, "value");
        fVar.z0("mentionableItems");
        aa.c.b(aa.c.c(cd.a, false)).b(fVar, wVar, dkVar.a);
    }
}
