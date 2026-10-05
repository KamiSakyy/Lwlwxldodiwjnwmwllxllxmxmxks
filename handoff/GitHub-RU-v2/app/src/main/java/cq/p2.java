package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p2 implements aa.a {
    public static final p2 a = new p2();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        a3 c = b3.c(eVar, wVar);
        if (str != null) {
            return new m2(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m2 m2Var = (m2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m2Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, m2Var.a);
        List list = b3.a;
        a3 a3Var = m2Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a3Var, "value");
        fVar.z0("copilotLicenseType");
        fVar.I(a3Var.a.r);
        fVar.z0("icon");
        fVar.I(a3Var.b.r);
        fVar.z0("planTitle");
        aa.c.a.b(fVar, wVar, a3Var.c);
        fVar.z0("subtitle");
        aa.c.i.b(fVar, wVar, a3Var.d);
    }
}
