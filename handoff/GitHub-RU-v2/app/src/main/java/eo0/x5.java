package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x5 implements aaShadow.a {
    public static final x5 a = new x5();
    public static final List b = sy.d0.n("deleteIssueComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.z8 z8Var = null;
        while (eVar.r0(b) == 0) {
            z8Var = (jn0.z8) aa.c.b(aa.c.c(y5.a, false)).a(eVar, wVar);
        }
        return new jn0.y8(z8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.y8 y8Var = (jn0.y8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y8Var, "value");
        fVar.z0("deleteIssueComment");
        aa.c.b(aa.c.c(y5.a, false)).b(fVar, wVar, y8Var.a);
    }
}
