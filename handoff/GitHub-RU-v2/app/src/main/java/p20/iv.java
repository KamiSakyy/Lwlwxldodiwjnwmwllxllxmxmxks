package p20;

import java.util.List;
import u10.u90;
import u10.w90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class iv implements aaShadow.a {
    public static final iv a = new iv();
    public static final List b = sy.d0Shadow.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w90 w90Var = null;
        while (eVar.r0(b) == 0) {
            w90Var = (w90) aa.c.c(kv.a, false).a(eVar, wVar);
        }
        if (w90Var != null) {
            return new u90(w90Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u90 u90Var = (u90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u90Var, "value");
        fVar.z0("viewer");
        aa.c.c(kv.a, false).b(fVar, wVar, u90Var.a);
    }
}
