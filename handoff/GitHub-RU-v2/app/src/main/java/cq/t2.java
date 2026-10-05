package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t2 implements aa.a {
    public static final t2 a = new t2();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        j c = k.c(eVar, wVar);
        if (str != null) {
            return new q2(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q2 q2Var = (q2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q2Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, q2Var.a);
        List list = k.a;
        j jVar = q2Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("copilotLicenseType");
        fVar.I(jVar.a.r);
        fVar.z0("title");
        aa.c.a.b(fVar, wVar, jVar.b);
        fVar.z0("models");
        aa.c.a(aa.c.c(l.a, false)).e(fVar, wVar, jVar.c);
    }
}
