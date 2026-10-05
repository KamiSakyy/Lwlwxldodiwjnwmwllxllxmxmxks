package g20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a3 implements aa.a {
    public static final a3 a = new a3();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(b3.a, false)))).a(eVar, wVar);
        }
        return new q2(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q2 q2Var = (q2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q2Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(b3.a, false)))).b(fVar, wVar, q2Var.a);
    }
}
