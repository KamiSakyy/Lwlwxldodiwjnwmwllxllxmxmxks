package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f3 implements aa.a {
    public static final f3 a = new f3();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(k3.a, false)))).a(eVar, wVar);
        }
        return new p2(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p2 p2Var = (p2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p2Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(k3.a, false)))).b(fVar, wVar, p2Var.a);
    }
}
