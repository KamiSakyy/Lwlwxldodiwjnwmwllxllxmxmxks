package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 implements aaShadow.a {
    public static final c0 a = new c0();
    public static final List b = sy.d0Shadow.n("addPullRequestReviewThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.o0 o0Var = null;
        while (eVar.r0(b) == 0) {
            o0Var = (u10.o0) aa.c.b(aa.c.c(a0.a, false)).a(eVar, wVar);
        }
        return new u10.r0(o0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.r0 r0Var = (u10.r0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r0Var, "value");
        fVar.z0("addPullRequestReviewThread");
        aa.c.b(aa.c.c(a0.a, false)).b(fVar, wVar, r0Var.a);
    }
}
