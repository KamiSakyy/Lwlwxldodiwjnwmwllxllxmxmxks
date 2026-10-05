package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j2 implements aa.a {
    public static final j2 a = new j2();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(q2.a, true)))).a(eVar, wVar);
        }
        return new b0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b0 b0Var = (b0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(q2.a, true)))).b(fVar, wVar, b0Var.a);
    }
}
