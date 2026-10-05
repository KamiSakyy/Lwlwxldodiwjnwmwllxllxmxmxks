package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gk implements aa.a {
    public static final gk a = new gk();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ut utVar = null;
        while (eVar.r0(b) == 0) {
            utVar = (kc0.ut) aa.c.b(aa.c.c(nk.a, false)).a(eVar, wVar);
        }
        return new kc0.nt(utVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.nt ntVar = (kc0.nt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ntVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(nk.a, false)).b(fVar, wVar, ntVar.a);
    }
}
