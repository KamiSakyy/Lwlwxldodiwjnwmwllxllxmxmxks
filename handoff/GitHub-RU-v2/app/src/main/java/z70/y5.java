package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y5 implements aa.a {
    public static final y5 a = new y5();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(e6.a, true)))).a(eVar, wVar);
        }
        return new l4(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l4 l4Var = (l4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l4Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(e6.a, true)))).b(fVar, wVar, l4Var.a);
    }
}
