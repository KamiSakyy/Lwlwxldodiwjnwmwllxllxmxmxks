package p20;

import java.util.List;
import u10.y10;
import u10.z10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bq implements aaShadow.a {
    public static final bq a = new bq();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z10 z10Var = null;
        while (eVar.r0(b) == 0) {
            z10Var = (z10) aa.c.b(aa.c.c(cq.a, true)).a(eVar, wVar);
        }
        return new y10(z10Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y10 y10Var = (y10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y10Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(cq.a, true)).b(fVar, wVar, y10Var.a);
    }
}
