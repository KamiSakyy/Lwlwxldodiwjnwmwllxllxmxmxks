package p20;

import java.util.List;
import u10.ma0;
import u10.qa0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rv implements aaShadow.a {
    public static final rv a = new rv();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        qa0 qa0Var = null;
        while (eVar.r0(b) == 0) {
            qa0Var = (qa0) aa.c.c(vv.a, false).a(eVar, wVar);
        }
        if (qa0Var != null) {
            return new ma0(qa0Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ma0 ma0Var = (ma0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ma0Var, "value");
        fVar.z0("viewer");
        aa.c.c(vv.a, false).b(fVar, wVar, ma0Var.a);
    }
}
