package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p4 implements aaShadow.a {
    public static final p4 a = new p4();
    public static final List b = sy.d0.n("createCommitOnBranch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.x6 x6Var = null;
        while (eVar.r0(b) == 0) {
            x6Var = (jn0.x6) aa.c.b(aa.c.c(o4.a, false)).a(eVar, wVar);
        }
        return new jn0.y6(x6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.y6 y6Var = (jn0.y6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y6Var, "value");
        fVar.z0("createCommitOnBranch");
        aa.c.b(aa.c.c(o4.a, false)).b(fVar, wVar, y6Var.a);
    }
}
