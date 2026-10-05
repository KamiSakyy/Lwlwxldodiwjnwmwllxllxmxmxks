package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o1 implements aa.a {
    public static final o1 a = new o1();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(h1.a, false)))).a(eVar, wVar);
        }
        return new t0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t0 t0Var = (t0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(h1.a, false)))).b(fVar, wVar, t0Var.a);
    }
}
