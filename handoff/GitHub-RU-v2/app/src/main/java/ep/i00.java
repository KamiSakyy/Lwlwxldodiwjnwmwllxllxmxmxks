package ep;

import java.util.List;
import jo.ig0;
import jo.kg0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i00 implements aaShadow.a {
    public static final i00 a = new i00();
    public static final List b = sy.d0Shadow.n("updateDashboardSearchShortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kg0 kg0Var = null;
        while (eVar.r0(b) == 0) {
            kg0Var = (kg0) aa.c.b(aa.c.c(k00.a, false)).a(eVar, wVar);
        }
        return new ig0(kg0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ig0 ig0Var = (ig0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ig0Var, "value");
        fVar.z0("updateDashboardSearchShortcut");
        aa.c.b(aa.c.c(k00.a, false)).b(fVar, wVar, ig0Var.a);
    }
}
