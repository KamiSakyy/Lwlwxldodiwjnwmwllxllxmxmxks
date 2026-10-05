package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 implements aa.a {
    public static final k0 a = new k0();
    public static final List b = sy.d0.n("addPullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.b1 b1Var = null;
        while (eVar.r0(b) == 0) {
            b1Var = (jo.b1) aa.c.b(aa.c.c(j0.a, false)).a(eVar, wVar);
        }
        return new jo.d1(b1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.d1 d1Var = (jo.d1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d1Var, "value");
        fVar.z0("addPullRequestReview");
        aa.c.b(aa.c.c(j0.a, false)).b(fVar, wVar, d1Var.a);
    }
}
