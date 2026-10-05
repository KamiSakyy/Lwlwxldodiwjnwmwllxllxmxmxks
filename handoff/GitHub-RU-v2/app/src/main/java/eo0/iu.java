package eo0;

import java.util.List;
import jn0.o70;
import jn0.p70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iu implements aa.a {
    public static final iu a = new iu();
    public static final List b = sy.d0.n("undoUserDisinterest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p70 p70Var = null;
        while (eVar.r0(b) == 0) {
            p70Var = (p70) aa.c.b(aa.c.c(ju.a, false)).a(eVar, wVar);
        }
        return new o70(p70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o70 o70Var = (o70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o70Var, "value");
        fVar.z0("undoUserDisinterest");
        aa.c.b(aa.c.c(ju.a, false)).b(fVar, wVar, o70Var.a);
    }
}
