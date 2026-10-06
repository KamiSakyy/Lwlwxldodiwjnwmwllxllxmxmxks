package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c8 implements aa.a {
    public static final c8 a = new c8();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(b8.a, false)))).a(eVar, wVar);
        }
        return new y7(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y7 y7Var = (y7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y7Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(b8.a, false)))).b(fVar, wVar, y7Var.a);
    }
}
