package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h1 implements aa.a {
    public static final h1 a = new h1();
    public static final List b = sy.d0.n("deployments");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(j1.a, false))).a(eVar, wVar);
        }
        return new u10.j2(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.j2 j2Var = (u10.j2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j2Var, "value");
        fVar.z0("deployments");
        aa.c.b(aa.c.a(aa.c.c(j1.a, false))).b(fVar, wVar, j2Var.a);
    }
}
