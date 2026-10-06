package eo0;

import java.util.List;
import jn0.g70;
import jn0.h70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eu implements aaShadow.a {
    public static final eu a = new eu();
    public static final List b = sy.d0Shadow.n("unblockUserFromOrganization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        h70 h70Var = null;
        while (eVar.r0(b) == 0) {
            h70Var = (h70) aa.c.b(aa.c.c(fu.a, false)).a(eVar, wVar);
        }
        return new g70(h70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g70 g70Var = (g70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g70Var, "value");
        fVar.z0("unblockUserFromOrganization");
        aa.c.b(aa.c.c(fu.a, false)).b(fVar, wVar, g70Var.a);
    }
}
