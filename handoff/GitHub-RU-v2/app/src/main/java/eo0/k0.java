package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 implements aaShadow.a {
    public static final k0 a = new k0();
    public static final List b = sy.d0Shadow.n("comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.d1 d1Var = null;
        while (eVar.r0(b) == 0) {
            d1Var = (jn0.d1) aa.c.b(aa.c.c(l0.a, true)).a(eVar, wVar);
        }
        return new jn0.c1(d1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.c1 c1Var = (jn0.c1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c1Var, "value");
        fVar.z0("comment");
        aa.c.b(aa.c.c(l0.a, true)).b(fVar, wVar, c1Var.a);
    }
}
