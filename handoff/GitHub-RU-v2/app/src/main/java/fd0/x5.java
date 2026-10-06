package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x5 implements aaShadow.a {
    public static final x5 a = new x5();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        of0.f c = of0.g.c(eVar, wVar);
        if (str != null) {
            return new kc0.a9(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.a9 a9Var = (kc0.a9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a9Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, a9Var.a);
        List list = of0.g.a;
        of0.f fVar2 = a9Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("currentUserCanApprove");
        jo.f4Shadow.C(fVar2.a, aa.c.f, fVar, wVar, "environment");
        aa.c.c(of0.h.a, false).b(fVar, wVar, fVar2.b);
        fVar.z0("reviewers");
        aa.c.c(of0.l.a, false).b(fVar, wVar, fVar2.c);
    }
}
