package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 implements aa.a {
    public static final j0 a = new j0();
    public static final List b = sy.d0.n("pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.f1 f1Var = null;
        while (eVar.r0(b) == 0) {
            f1Var = (jo.f1) aa.c.b(aa.c.c(m0.a, true)).a(eVar, wVar);
        }
        return new jo.b1(f1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.b1 b1Var = (jo.b1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b1Var, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(m0.a, true)).b(fVar, wVar, b1Var.a);
    }
}
