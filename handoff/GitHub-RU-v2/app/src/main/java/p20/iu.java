package p20;

import java.util.List;
import u10.e80;
import u10.f80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class iu implements aaShadow.a {
    public static final iu a = new iu();
    public static final List b = sy.d0Shadow.n("updateUserMobileTimeZone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f80 f80Var = null;
        while (eVar.r0(b) == 0) {
            f80Var = (f80) aa.c.b(aa.c.c(ju.a, false)).a(eVar, wVar);
        }
        return new e80(f80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e80 e80Var = (e80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e80Var, "value");
        fVar.z0("updateUserMobileTimeZone");
        aa.c.b(aa.c.c(ju.a, false)).b(fVar, wVar, e80Var.a);
    }
}
