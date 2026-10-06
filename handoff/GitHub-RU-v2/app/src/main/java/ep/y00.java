package ep;

import java.util.List;
import jo.gh0;
import jo.ih0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y00 implements aaShadow.a {
    public static final y00 a = new y00();
    public static final List b = sy.d0.n("contributionCalendar");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        gh0 gh0Var = null;
        while (eVar.r0(b) == 0) {
            gh0Var = (gh0) aa.c.c(w00.a, false).a(eVar, wVar);
        }
        if (gh0Var != null) {
            return new ih0(gh0Var);
        }
        k41.b.B(eVar, "contributionCalendar");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ih0 ih0Var = (ih0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ih0Var, "value");
        fVar.z0("contributionCalendar");
        aa.c.c(w00.a, false).b(fVar, wVar, ih0Var.a);
    }
}
