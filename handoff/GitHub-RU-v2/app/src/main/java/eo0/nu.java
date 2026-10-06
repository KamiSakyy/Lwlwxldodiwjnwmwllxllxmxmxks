package eo0;

import java.util.List;
import jn0.x70;
import jn0.y70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nu implements aaShadow.a {
    public static final nu a = new nu();
    public static final List b = sy.d0Shadow.n("unfollowUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y70 y70Var = null;
        while (eVar.r0(b) == 0) {
            y70Var = (y70) aa.c.b(aa.c.c(ou.a, false)).a(eVar, wVar);
        }
        return new x70(y70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x70 x70Var = (x70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x70Var, "value");
        fVar.z0("unfollowUser");
        aa.c.b(aa.c.c(ou.a, false)).b(fVar, wVar, x70Var.a);
    }
}
