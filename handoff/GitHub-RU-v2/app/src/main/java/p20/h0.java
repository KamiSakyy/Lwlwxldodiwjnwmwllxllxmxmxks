package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 implements aaShadow.a {
    public static final h0 a = new h0();
    public static final List b = sy.d0Shadow.n("addPullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.w0 w0Var = null;
        while (eVar.r0(b) == 0) {
            w0Var = (u10.w0) aa.c.b(aa.c.c(g0.a, false)).a(eVar, wVar);
        }
        return new u10.y0(w0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.y0 y0Var = (u10.y0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y0Var, "value");
        fVar.z0("addPullRequestReview");
        aa.c.b(aa.c.c(g0.a, false)).b(fVar, wVar, y0Var.a);
    }
}
