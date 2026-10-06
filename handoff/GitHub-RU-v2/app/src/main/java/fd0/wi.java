package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wi implements aaShadow.a {
    public static final wi a = new wi();
    public static final List b = sy.d0.n("removeReaction");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.nr nrVar = null;
        while (eVar.r0(b) == 0) {
            nrVar = (kc0.nr) aa.c.b(aa.c.c(zi.a, false)).a(eVar, wVar);
        }
        return new kc0.kr(nrVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.kr krVar = (kc0.kr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(krVar, "value");
        fVar.z0("removeReaction");
        aa.c.b(aa.c.c(zi.a, false)).b(fVar, wVar, krVar.a);
    }
}
