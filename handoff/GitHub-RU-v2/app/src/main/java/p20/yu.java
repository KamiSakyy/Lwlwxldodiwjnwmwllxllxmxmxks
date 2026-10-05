package p20;

import java.util.List;
import u10.e90;
import u10.i90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yu implements aa.a {
    public static final yu a = new yu();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i90 i90Var = null;
        while (eVar.r0(b) == 0) {
            i90Var = (i90) aa.c.b(aa.c.c(cv.a, false)).a(eVar, wVar);
        }
        return new e90(i90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e90 e90Var = (e90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e90Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(cv.a, false)).b(fVar, wVar, e90Var.a);
    }
}
