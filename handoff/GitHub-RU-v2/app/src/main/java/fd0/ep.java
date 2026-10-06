package fd0;

import java.util.List;
import kc0.p00;
import kc0.r00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ep implements aaShadow.a {
    public static final ep a = new ep();
    public static final List b = sy.d0.n("setLabelsForLabelable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        r00 r00Var = null;
        while (eVar.r0(b) == 0) {
            r00Var = (r00) aa.c.b(aa.c.c(gp.a, false)).a(eVar, wVar);
        }
        return new p00(r00Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p00 p00Var = (p00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p00Var, "value");
        fVar.z0("setLabelsForLabelable");
        aa.c.b(aa.c.c(gp.a, false)).b(fVar, wVar, p00Var.a);
    }
}
