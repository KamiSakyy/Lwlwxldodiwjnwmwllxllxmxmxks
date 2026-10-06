package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gg implements aaShadow.a {
    public static final gg a = new gg();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.joShadow joVar = null;
        while (eVar.r0(b) == 0) {
            joVar = (kc0.joShadow) aa.c.b(aa.c.c(lg.a, true)).a(eVar, wVar);
        }
        return new kc0.eo(joVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.eo eoVar = (kc0.eo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eoVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(lg.a, true)).b(fVar, wVar, eoVar.a);
    }
}
