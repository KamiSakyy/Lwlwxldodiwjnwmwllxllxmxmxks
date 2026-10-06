package p20;

import java.util.List;
import u10.t10;
import u10.u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yp implements aaShadow.a {
    public static final yp a = new yp();
    public static final List b = sy.d0.n("unblockUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10 u10Var = null;
        while (eVar.r0(b) == 0) {
            u10Var = (u10) aa.c.b(aa.c.c(zp.a, false)).a(eVar, wVar);
        }
        return new t10(u10Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t10 t10Var = (t10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t10Var, "value");
        fVar.z0("unblockUser");
        aa.c.b(aa.c.c(zp.a, false)).b(fVar, wVar, t10Var.a);
    }
}
