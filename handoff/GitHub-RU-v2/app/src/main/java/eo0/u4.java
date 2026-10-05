package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u4 implements aa.a {
    public static final u4 a = new u4();
    public static final List b = sy.d0.n("createIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.g7 g7Var = null;
        while (eVar.r0(b) == 0) {
            g7Var = (jn0.g7) aa.c.b(aa.c.c(t4.a, false)).a(eVar, wVar);
        }
        return new jn0.h7(g7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.h7 h7Var = (jn0.h7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h7Var, "value");
        fVar.z0("createIssue");
        aa.c.b(aa.c.c(t4.a, false)).b(fVar, wVar, h7Var.a);
    }
}
