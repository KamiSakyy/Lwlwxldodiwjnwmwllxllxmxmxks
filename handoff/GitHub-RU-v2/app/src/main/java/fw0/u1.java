package fw0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u1 implements aa.a {
    public static final u1 a = new u1();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(x1.a, false)))).a(eVar, wVar);
        }
        return new f1Shadow(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f1Shadow f1Var = (f1Shadow) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f1Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(x1.a, false)))).b(fVar, wVar, f1Var.a);
    }
}
