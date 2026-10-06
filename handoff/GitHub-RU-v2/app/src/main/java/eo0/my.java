package eo0;

import java.util.List;
import jn0.qd0;
import jn0.rd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class my implements aaShadow.a {
    public static final my a = new my();
    public static final List b = sy.d0.n("pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        qd0 qd0Var = null;
        while (eVar.r0(b) == 0) {
            qd0Var = (qd0) aa.c.b(aa.c.c(ly.a, true)).a(eVar, wVar);
        }
        return new rd0(qd0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rd0 rd0Var = (rd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rd0Var, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(ly.a, true)).b(fVar, wVar, rd0Var.a);
    }
}
