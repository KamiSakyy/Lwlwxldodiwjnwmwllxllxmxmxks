package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x4 implements aa.a {
    public static final x4 a = new x4();
    public static final List b = sy.d0.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.p7 p7Var = null;
        while (eVar.r0(b) == 0) {
            p7Var = (jn0.p7) aa.c.b(aa.c.c(a5.a, false)).a(eVar, wVar);
        }
        return new jn0.m7(p7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.m7 m7Var = (jn0.m7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m7Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(a5.a, false)).b(fVar, wVar, m7Var.a);
    }
}
