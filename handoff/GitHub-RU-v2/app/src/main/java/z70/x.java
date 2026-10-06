package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xShadow implements aa.a {
    public static final xShadow a = new xShadow();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(z.a, true)))).a(eVar, wVar);
        }
        return new q(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q qVar = (q) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(z.a, true)))).b(fVar, wVar, qVar.a);
    }
    public static Object values() { return null; }
}
