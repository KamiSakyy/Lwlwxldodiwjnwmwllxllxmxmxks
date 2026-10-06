package eo0;

import java.util.List;
import jn0.ab0;
import jn0.bb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pw implements aaShadow.a {
    public static final pw a = new pw();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ab0 ab0Var = null;
        while (eVar.r0(b) == 0) {
            ab0Var = (ab0) aa.c.b(aa.c.c(ow.a, false)).a(eVar, wVar);
        }
        return new bb0(ab0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        bb0 bb0Var = (bb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bb0Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(ow.a, false)).b(fVar, wVar, bb0Var.a);
    }
}
