package ep;

import java.util.List;
import jo.wi0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v10 implements aaShadow.a {
    public static final v10 a = new v10();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        cq.m c = cq.n.c(eVar, wVar);
        if (str != null) {
            return new wi0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wi0 wi0Var = (wi0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wi0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, wi0Var.a);
        List list = cq.n.a;
        cq.m mVar = wi0Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mVar, "value");
        fVar.z0("resetDate");
        m10.qa.Companion.getClass();
        aa.c.b(wVar.e(m10.qa.a)).b(fVar, wVar, mVar.a);
        fVar.z0("freeOverageCount");
        aa.b bVar = aa.c.c;
        bVar.b(fVar, wVar, Double.valueOf(mVar.b));
        fVar.z0("premiumOverageCount");
        bVar.b(fVar, wVar, Double.valueOf(mVar.c));
        fVar.z0("entitlement");
        bVar.b(fVar, wVar, Double.valueOf(mVar.d));
        fVar.z0("isOveragePermitted");
        jo.f4Shadow.C(mVar.e, aa.c.f, fVar, wVar, "freeRemaining");
        aa.o0 o0Var = aa.c.j;
        o0Var.b(fVar, wVar, mVar.f);
        fVar.z0("premiumRemaining");
        o0Var.b(fVar, wVar, mVar.g);
        fVar.z0("quotaId");
        aa.c.a.b(fVar, wVar, mVar.h);
    }
}
