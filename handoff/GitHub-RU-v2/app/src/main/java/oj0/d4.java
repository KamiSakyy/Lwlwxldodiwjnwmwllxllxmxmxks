package oj0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d4 implements aa.a {
    public static final d4 a = new d4();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(e4.a, true)))).a(eVar, wVar);
        }
        return new y3(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y3 y3Var = (y3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y3Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(e4.a, true)))).b(fVar, wVar, y3Var.a);
    }
}
