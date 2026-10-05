package p20;

import java.util.List;
import u10.o80;
import u10.p80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ou implements aa.a {
    public static final ou a = new ou();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p80 p80Var = null;
        while (eVar.r0(b) == 0) {
            p80Var = (p80) aa.c.c(pu.a, true).a(eVar, wVar);
        }
        if (p80Var != null) {
            return new o80(p80Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o80 o80Var = (o80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o80Var, "value");
        fVar.z0("viewer");
        aa.c.c(pu.a, true).b(fVar, wVar, o80Var.a);
    }
}
