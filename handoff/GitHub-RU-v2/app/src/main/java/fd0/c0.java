package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 implements aa.a {
    public static final c0 a = new c0();
    public static final List b = sy.d0.n("addPullRequestReviewThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.o0 o0Var = null;
        while (eVar.r0(b) == 0) {
            o0Var = (kc0.o0) aa.c.b(aa.c.c(a0.a, false)).a(eVar, wVar);
        }
        return new kc0.r0(o0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.r0 r0Var = (kc0.r0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r0Var, "value");
        fVar.z0("addPullRequestReviewThread");
        aa.c.b(aa.c.c(a0.a, false)).b(fVar, wVar, r0Var.a);
    }
}
