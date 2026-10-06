package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 implements aaShadow.a {
    public static final y0 a = new y0();
    public static final List b = sy.d0.n("addStar");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.r1 r1Var = null;
        while (eVar.r0(b) == 0) {
            r1Var = (u10.r1) aa.c.b(aa.c.c(x0.a, false)).a(eVar, wVar);
        }
        return new u10.t1(r1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.t1 t1Var = (u10.t1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t1Var, "value");
        fVar.z0("addStar");
        aa.c.b(aa.c.c(x0.a, false)).b(fVar, wVar, t1Var.a);
    }
}
