package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 implements aa.a {
    public static final v0 a = new v0();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(u0.a, false)))).a(eVar, wVar);
        }
        return new jo.q1(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.q1 q1Var = (jo.q1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q1Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(u0.a, false)))).b(fVar, wVar, q1Var.a);
    }
}
