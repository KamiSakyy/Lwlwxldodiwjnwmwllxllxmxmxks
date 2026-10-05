package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l6 implements aa.a {
    public static final l6 a = new l6();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        uq0.f c = uq0.g.c(eVar, wVar);
        if (str != null) {
            return new jn0.u9(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.u9 u9Var = (jn0.u9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u9Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, u9Var.a);
        List list = uq0.g.a;
        uq0.f fVar2 = u9Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("currentUserCanApprove");
        jo.f4.C(fVar2.a, aa.c.f, fVar, wVar, "environment");
        aa.c.c(uq0.h.a, false).b(fVar, wVar, fVar2.b);
        fVar.z0("reviewers");
        aa.c.c(uq0.l.a, false).b(fVar, wVar, fVar2.c);
    }
}
