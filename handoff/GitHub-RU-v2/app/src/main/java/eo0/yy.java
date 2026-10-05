package eo0;

import java.util.List;
import jn0.le0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yy implements aa.a {
    public static final yy a = new yy();
    public static final List b = sy.d0.n("navLinks");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(xy.a, false))).a(eVar, wVar);
        }
        return new le0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        le0 le0Var = (le0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(le0Var, "value");
        fVar.z0("navLinks");
        aa.c.b(aa.c.a(aa.c.c(xy.a, false))).b(fVar, wVar, le0Var.a);
    }
}
