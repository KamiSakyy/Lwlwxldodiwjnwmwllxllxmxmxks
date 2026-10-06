package fd0;

import java.util.List;
import kc0.v90;
import kc0.w90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qv implements aaShadow.a {
    public static final qv a = new qv();
    public static final List b = sy.d0.n("shortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v90 v90Var = null;
        while (eVar.r0(b) == 0) {
            v90Var = (v90) aa.c.b(aa.c.c(pv.a, true)).a(eVar, wVar);
        }
        return new w90(v90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w90 w90Var = (w90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w90Var, "value");
        fVar.z0("shortcut");
        aa.c.b(aa.c.c(pv.a, true)).b(fVar, wVar, w90Var.a);
    }
}
