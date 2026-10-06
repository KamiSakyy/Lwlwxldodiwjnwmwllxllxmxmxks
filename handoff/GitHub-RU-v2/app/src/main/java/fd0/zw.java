package fd0;

import java.util.List;
import kc0.ec0;
import kc0.fc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zw implements aaShadow.a {
    public static final zw a = new zw();
    public static final List b = sy.d0Shadow.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fc0 fc0Var = null;
        while (eVar.r0(b) == 0) {
            fc0Var = (fc0) aa.c.c(ax.a, false).a(eVar, wVar);
        }
        if (fc0Var != null) {
            return new ec0(fc0Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ec0 ec0Var = (ec0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ec0Var, "value");
        fVar.z0("viewer");
        aa.c.c(ax.a, false).b(fVar, wVar, ec0Var.a);
    }
}
