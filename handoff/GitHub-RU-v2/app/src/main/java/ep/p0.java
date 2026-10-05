package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 implements aa.a {
    public static final p0 a = new p0();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(t0.a, false)))).a(eVar, wVar);
        }
        return new jo.j1(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.j1 j1Var = (jo.j1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j1Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(t0.a, false)))).b(fVar, wVar, j1Var.a);
    }
}
