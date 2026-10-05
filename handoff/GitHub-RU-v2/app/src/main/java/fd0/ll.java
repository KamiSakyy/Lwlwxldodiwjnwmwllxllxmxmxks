package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ll implements aa.a {
    public static final ll a = new ll();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.bv bvVar = null;
        while (eVar.r0(b) == 0) {
            bvVar = (kc0.bv) aa.c.b(aa.c.c(ml.a, false)).a(eVar, wVar);
        }
        return new kc0.av(bvVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.av avVar = (kc0.av) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(avVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(ml.a, false)).b(fVar, wVar, avVar.a);
    }
}
