package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z3 implements aa.a {
    public static final z3 a = new z3();
    public static final List b = sy.d0.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.g6 g6Var = null;
        while (eVar.r0(b) == 0) {
            g6Var = (u10.g6) aa.c.b(aa.c.c(b4.a, true)).a(eVar, wVar);
        }
        return new u10.e6(g6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.e6 e6Var = (u10.e6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e6Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(b4.a, true)).b(fVar, wVar, e6Var.a);
    }
}
