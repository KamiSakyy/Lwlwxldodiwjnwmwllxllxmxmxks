package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gj implements aaShadow.a {
    public static final gj a = new gj();
    public static final List b = sy.d0Shadow.n("removeUpvote");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.bs bsVar = null;
        while (eVar.r0(b) == 0) {
            bsVar = (kc0.bs) aa.c.b(aa.c.c(hj.a, false)).a(eVar, wVar);
        }
        return new kc0.as(bsVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.as asVar = (kc0.as) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(asVar, "value");
        fVar.z0("removeUpvote");
        aa.c.b(aa.c.c(hj.a, false)).b(fVar, wVar, asVar.a);
    }
}
