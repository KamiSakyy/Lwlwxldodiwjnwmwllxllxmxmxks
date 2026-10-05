package vx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements aa.a {
    public static final q a = new q();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(s.a, false)))).a(eVar, wVar);
        }
        return new ux0.c0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ux0.c0 c0Var = (ux0.c0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(s.a, false)))).b(fVar, wVar, c0Var.a);
    }
}
