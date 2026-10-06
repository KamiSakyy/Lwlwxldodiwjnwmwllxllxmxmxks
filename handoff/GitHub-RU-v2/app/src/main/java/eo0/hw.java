package eo0;

import java.util.List;
import jn0.na0;
import jn0.pa0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hw implements aaShadow.a {
    public static final hw a = new hw();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        na0 na0Var = null;
        while (eVar.r0(b) == 0) {
            na0Var = (na0) aa.c.b(aa.c.c(fw.a, false)).a(eVar, wVar);
        }
        return new pa0(na0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        pa0 pa0Var = (pa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pa0Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(fw.a, false)).b(fVar, wVar, pa0Var.a);
    }
}
