package eo0;

import java.util.List;
import jn0.pd0;
import jn0.rd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ky implements aaShadow.a {
    public static final ky a = new ky();
    public static final List b = sy.d0Shadow.n("updatePullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        rd0 rd0Var = null;
        while (eVar.r0(b) == 0) {
            rd0Var = (rd0) aa.c.b(aa.c.c(my.a, false)).a(eVar, wVar);
        }
        return new pd0(rd0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        pd0 pd0Var = (pd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pd0Var, "value");
        fVar.z0("updatePullRequestReview");
        aa.c.b(aa.c.c(my.a, false)).b(fVar, wVar, pd0Var.a);
    }
}
