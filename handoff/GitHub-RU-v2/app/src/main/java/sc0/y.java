package sc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y implements aa.a {
    public static final y a = new y();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(v.a, true)))).a(eVar, wVar);
        }
        return new rc0.d0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rc0.d0 d0Var = (rc0.d0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(v.a, true)))).b(fVar, wVar, d0Var.a);
    }
}
