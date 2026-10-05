package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zc implements aa.a {
    public static final zc a = new zc();
    public static final List b = sy.d0.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.qj qjVar = null;
        while (eVar.r0(b) == 0) {
            qjVar = (kc0.qj) aa.c.b(aa.c.c(ad.a, false)).a(eVar, wVar);
        }
        return new kc0.pj(qjVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.pj pjVar = (kc0.pj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pjVar, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(ad.a, false)).b(fVar, wVar, pjVar.a);
    }
}
