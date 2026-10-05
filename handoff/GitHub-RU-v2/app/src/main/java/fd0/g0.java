package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 implements aa.a {
    public static final g0 a = new g0();
    public static final List b = sy.d0.n("pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.a1 a1Var = null;
        while (eVar.r0(b) == 0) {
            a1Var = (kc0.a1) aa.c.b(aa.c.c(j0.a, true)).a(eVar, wVar);
        }
        return new kc0.w0(a1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.w0 w0Var = (kc0.w0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w0Var, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(j0.a, true)).b(fVar, wVar, w0Var.a);
    }
}
