package eo0;

import java.util.List;
import jn0.c70;
import jn0.d70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class du implements aa.a {
    public static final du a = new du();
    public static final List b = sy.d0.n("thread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c70 c70Var = null;
        while (eVar.r0(b) == 0) {
            c70Var = (c70) aa.c.b(aa.c.c(cu.a, true)).a(eVar, wVar);
        }
        return new d70(c70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d70 d70Var = (d70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d70Var, "value");
        fVar.z0("thread");
        aa.c.b(aa.c.c(cu.a, true)).b(fVar, wVar, d70Var.a);
    }
}
