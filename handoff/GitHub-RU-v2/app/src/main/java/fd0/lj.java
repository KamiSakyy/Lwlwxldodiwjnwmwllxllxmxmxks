package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lj implements aa.a {
    public static final lj a = new lj();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.gs gsVar = null;
        while (eVar.r0(b) == 0) {
            gsVar = (kc0.gs) aa.c.b(aa.c.c(kj.a, true)).a(eVar, wVar);
        }
        return new kc0.hs(gsVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.hs hsVar = (kc0.hs) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hsVar, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(kj.a, true)).b(fVar, wVar, hsVar.a);
    }
}
