package eo0;

import java.util.List;
import jn0.ee0;
import jn0.fe0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ty implements aaShadow.a {
    public static final ty a = new ty();
    public static final List b = sy.d0Shadow.n("updateUserMobileTimeZone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fe0 fe0Var = null;
        while (eVar.r0(b) == 0) {
            fe0Var = (fe0) aa.c.b(aa.c.c(uy.a, false)).a(eVar, wVar);
        }
        return new ee0(fe0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ee0 ee0Var = (ee0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ee0Var, "value");
        fVar.z0("updateUserMobileTimeZone");
        aa.c.b(aa.c.c(uy.a, false)).b(fVar, wVar, ee0Var.a);
    }
}
