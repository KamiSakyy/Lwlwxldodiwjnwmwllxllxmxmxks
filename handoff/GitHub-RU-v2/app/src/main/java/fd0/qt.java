package fd0;

import java.util.List;
import kc0.e70;
import kc0.f70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qt implements aaShadow.a {
    public static final qt a = new qt();
    public static final List b = sy.d0Shadow.n("updateUserDashboardPins");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f70 f70Var = null;
        while (eVar.r0(b) == 0) {
            f70Var = (f70) aa.c.b(aa.c.c(rt.a, false)).a(eVar, wVar);
        }
        return new e70(f70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e70 e70Var = (e70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e70Var, "value");
        fVar.z0("updateUserDashboardPins");
        aa.c.b(aa.c.c(rt.a, false)).b(fVar, wVar, e70Var.a);
    }
}
