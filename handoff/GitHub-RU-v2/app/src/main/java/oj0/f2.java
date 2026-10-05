package oj0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f2 implements aa.a {
    public static final f2 a = new f2();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(g2.a, false)))).a(eVar, wVar);
        }
        return new y1(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y1 y1Var = (y1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y1Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(g2.a, false)))).b(fVar, wVar, y1Var.a);
    }
}
