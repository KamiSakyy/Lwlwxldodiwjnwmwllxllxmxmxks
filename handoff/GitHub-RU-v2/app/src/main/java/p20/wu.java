package p20;

import java.util.List;
import u10.a90;
import u10.b90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wu implements aaShadow.a {
    public static final wu a = new wu();
    public static final List b = sy.d0Shadow.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b90 b90Var = null;
        while (eVar.r0(b) == 0) {
            b90Var = (b90) aa.c.c(xu.a, true).a(eVar, wVar);
        }
        if (b90Var != null) {
            return new a90(b90Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a90 a90Var = (a90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a90Var, "value");
        fVar.z0("viewer");
        aa.c.c(xu.a, true).b(fVar, wVar, a90Var.a);
    }
}
