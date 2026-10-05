package eo0;

import java.util.List;
import jn0.k70;
import jn0.l70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gu implements aa.a {
    public static final gu a = new gu();
    public static final List b = sy.d0.n("unblockUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l70 l70Var = null;
        while (eVar.r0(b) == 0) {
            l70Var = (l70) aa.c.b(aa.c.c(hu.a, false)).a(eVar, wVar);
        }
        return new k70(l70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k70 k70Var = (k70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k70Var, "value");
        fVar.z0("unblockUser");
        aa.c.b(aa.c.c(hu.a, false)).b(fVar, wVar, k70Var.a);
    }
}
