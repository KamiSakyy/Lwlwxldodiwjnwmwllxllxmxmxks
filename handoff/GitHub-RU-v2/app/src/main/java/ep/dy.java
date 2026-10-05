package ep;

import java.util.List;
import jo.bd0;
import jo.dd0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dy implements aa.a {
    public static final dy a = new dy();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        bd0 bd0Var = null;
        while (eVar.r0(b) == 0) {
            bd0Var = (bd0) aa.c.b(aa.c.c(ay.a, false)).a(eVar, wVar);
        }
        return new dd0(bd0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        dd0 dd0Var = (dd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dd0Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(ay.a, false)).b(fVar, wVar, dd0Var.a);
    }
}
