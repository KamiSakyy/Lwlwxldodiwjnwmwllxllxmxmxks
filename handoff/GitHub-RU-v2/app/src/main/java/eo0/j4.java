package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j4 implements aa.a {
    public static final j4 a = new j4();
    public static final List b = sy.d0.n("patch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.s6 s6Var = null;
        while (eVar.r0(b) == 0) {
            s6Var = (jn0.s6) aa.c.b(aa.c.c(l4.a, false)).a(eVar, wVar);
        }
        return new jn0.q6(s6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.q6 q6Var = (jn0.q6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q6Var, "value");
        fVar.z0("patch");
        aa.c.b(aa.c.c(l4.a, false)).b(fVar, wVar, q6Var.a);
    }
}
