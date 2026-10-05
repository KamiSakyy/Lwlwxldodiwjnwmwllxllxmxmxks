package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oi implements aa.a {
    public static final oi a = new oi();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.dr drVar = null;
        while (eVar.r0(b) == 0) {
            drVar = (kc0.dr) aa.c.b(aa.c.c(ti.a, false)).a(eVar, wVar);
        }
        return new kc0.yq(drVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.yq yqVar = (kc0.yq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yqVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(ti.a, false)).b(fVar, wVar, yqVar.a);
    }
}
