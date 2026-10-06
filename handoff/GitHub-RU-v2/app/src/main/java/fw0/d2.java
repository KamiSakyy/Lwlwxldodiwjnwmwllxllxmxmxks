package fw0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d2 implements aa.a {
    public static final d2 a = new d2();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(y1.a, false)))).a(eVar, wVar);
        }
        return new o1(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o1 o1Var = (o1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o1Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(y1.a, false)))).b(fVar, wVar, o1Var.a);
    }
}
