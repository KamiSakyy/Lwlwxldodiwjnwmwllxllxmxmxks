package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d3 implements aaShadow.a {
    public static final d3 a = new d3();
    public static final List b = sy.d0Shadow.n("closeIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.w4 w4Var = null;
        while (eVar.r0(b) == 0) {
            w4Var = (jn0.w4) aa.c.b(aa.c.c(c3.a, false)).a(eVar, wVar);
        }
        return new jn0.y4(w4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.y4 y4Var = (jn0.y4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y4Var, "value");
        fVar.z0("closeIssue");
        aa.c.b(aa.c.c(c3.a, false)).b(fVar, wVar, y4Var.a);
    }
}
