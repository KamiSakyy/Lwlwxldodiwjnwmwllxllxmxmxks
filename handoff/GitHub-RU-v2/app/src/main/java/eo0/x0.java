package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 implements aaShadow.a {
    public static final x0 a = new x0();
    public static final List b = sy.d0Shadow.n("starrable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.u1 u1Var = null;
        while (eVar.r0(b) == 0) {
            u1Var = (jn0.u1) aa.c.b(aa.c.c(z0.a, true)).a(eVar, wVar);
        }
        return new jn0.r1(u1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.r1 r1Var = (jn0.r1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r1Var, "value");
        fVar.z0("starrable");
        aa.c.b(aa.c.c(z0.a, true)).b(fVar, wVar, r1Var.a);
    }
}
