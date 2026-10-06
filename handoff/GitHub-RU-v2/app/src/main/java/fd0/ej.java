package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ej implements aaShadow.a {
    public static final ej a = new ej();
    public static final List b = sy.d0Shadow.n("starrable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.xr xrVar = null;
        while (eVar.r0(b) == 0) {
            xrVar = (kc0.xr) aa.c.b(aa.c.c(fj.a, true)).a(eVar, wVar);
        }
        return new kc0.wr(xrVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.wr wrVar = (kc0.wr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wrVar, "value");
        fVar.z0("starrable");
        aa.c.b(aa.c.c(fj.a, true)).b(fVar, wVar, wrVar.a);
    }
}
