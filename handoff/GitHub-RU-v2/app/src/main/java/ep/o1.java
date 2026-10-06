package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o1 implements aaShadow.a {
    public static final o1 a = new o1();
    public static final List b = sy.d0.n("deployments");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(q1.a, false))).a(eVar, wVar);
        }
        return new jo.u2(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.u2 u2Var = (jo.u2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u2Var, "value");
        fVar.z0("deployments");
        aa.c.b(aa.c.a(aa.c.c(q1.a, false))).b(fVar, wVar, u2Var.a);
    }
}
