package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u6 implements aaShadow.a {
    public static final u6 a = new u6();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ia iaVar = null;
        while (eVar.r0(b) == 0) {
            iaVar = (kc0.ia) aa.c.b(aa.c.c(x6.a, false)).a(eVar, wVar);
        }
        return new kc0.fa(iaVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.fa faVar = (kc0.fa) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(faVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(x6.a, false)).b(fVar, wVar, faVar.a);
    }
}
