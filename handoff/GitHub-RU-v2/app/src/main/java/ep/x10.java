package ep;

import java.util.List;
import jo.yi0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x10 implements aaShadow.a {
    public static final x10 a = new x10();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        cq.o c = cq.p.c(eVar, wVar);
        if (str != null) {
            return new yi0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        yi0 yi0Var = (yi0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yi0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, yi0Var.a);
        List list = cq.p.a;
        cq.o oVar = yi0Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("resetDate");
        m10.qa.Companion.getClass();
        aa.c.b(wVar.e(m10.qa.a)).b(fVar, wVar, oVar.a);
        fVar.z0("hasUsageRemaining");
        aa.c.k.b(fVar, wVar, oVar.b);
        fVar.z0("quotaPercentageRemaining");
        aa.c.j.b(fVar, wVar, oVar.c);
    }
}
