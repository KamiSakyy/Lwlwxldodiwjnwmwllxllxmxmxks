package eo0;

import java.util.List;
import jn0.b40;
import jn0.y30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yr implements aa.a {
    public static final yr a = new yr();
    public static final List b = sy.d0.n("assignable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y30 y30Var = null;
        while (eVar.r0(b) == 0) {
            y30Var = (y30) aa.c.b(aa.c.c(wr.a, true)).a(eVar, wVar);
        }
        return new b40(y30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b40 b40Var = (b40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b40Var, "value");
        fVar.z0("assignable");
        aa.c.b(aa.c.c(wr.a, true)).b(fVar, wVar, b40Var.a);
    }
}
