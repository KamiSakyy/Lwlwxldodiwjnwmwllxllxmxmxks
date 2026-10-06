package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z2 implements aaShadow.a {
    public static final z2 a = new z2();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.u4 u4Var = null;
        while (eVar.r0(b) == 0) {
            u4Var = (jn0.u4) aa.c.b(aa.c.c(b3.a, false)).a(eVar, wVar);
        }
        return new jn0.r4(u4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.r4 r4Var = (jn0.r4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r4Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(b3.a, false)).b(fVar, wVar, r4Var.a);
    }
}
