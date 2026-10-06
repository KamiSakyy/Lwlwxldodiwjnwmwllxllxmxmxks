package eo0;

import java.util.List;
import jn0.q40;
import jn0.r40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hs implements aaShadow.a {
    public static final hs a = new hs();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        r40 r40Var = null;
        while (eVar.r0(b) == 0) {
            r40Var = (r40) aa.c.b(aa.c.c(is.a, true)).a(eVar, wVar);
        }
        return new q40(r40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q40 q40Var = (q40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q40Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(is.a, true)).b(fVar, wVar, q40Var.a);
    }
}
