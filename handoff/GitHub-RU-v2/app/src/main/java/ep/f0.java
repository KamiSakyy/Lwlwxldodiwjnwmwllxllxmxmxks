package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 implements aaShadow.a {
    public static final f0 a = new f0();
    public static final List b = sy.d0Shadow.n("addPullRequestReviewThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.t0 t0Var = null;
        while (eVar.r0(b) == 0) {
            t0Var = (jo.t0) aa.c.b(aa.c.c(d0.a, false)).a(eVar, wVar);
        }
        return new jo.w0(t0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.w0 w0Var = (jo.w0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w0Var, "value");
        fVar.z0("addPullRequestReviewThread");
        aa.c.b(aa.c.c(d0.a, false)).b(fVar, wVar, w0Var.a);
    }
}
