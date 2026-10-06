package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o4 implements aaShadow.a {
    public static final o4 a = new o4();
    public static final List b = sy.d0.n("commit");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.v6 v6Var = null;
        while (eVar.r0(b) == 0) {
            v6Var = (jn0.v6) aa.c.b(aa.c.c(n4.a, true)).a(eVar, wVar);
        }
        return new jn0.x6(v6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.x6 x6Var = (jn0.x6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x6Var, "value");
        fVar.z0("commit");
        aa.c.b(aa.c.c(n4.a, true)).b(fVar, wVar, x6Var.a);
    }
}
