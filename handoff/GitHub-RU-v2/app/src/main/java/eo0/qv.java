package eo0;

import java.util.List;
import jn0.o90;
import jn0.p90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qv implements aaShadow.a {
    public static final qv a = new qv();
    public static final List b = sy.d0.n("updateDiscussionComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p90 p90Var = null;
        while (eVar.r0(b) == 0) {
            p90Var = (p90) aa.c.b(aa.c.c(rv.a, false)).a(eVar, wVar);
        }
        return new o90(p90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o90 o90Var = (o90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o90Var, "value");
        fVar.z0("updateDiscussionComment");
        aa.c.b(aa.c.c(rv.a, false)).b(fVar, wVar, o90Var.a);
    }
}
