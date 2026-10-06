package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ec implements aaShadow.a {
    public static final ec a = new ec();
    public static final List b = sy.d0Shadow.n("markPullRequestReadyForReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ni niVar = null;
        while (eVar.r0(b) == 0) {
            niVar = (u10.ni) aa.c.b(aa.c.c(fc.a, false)).a(eVar, wVar);
        }
        return new u10.mi(niVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.mi miVar = (u10.mi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(miVar, "value");
        fVar.z0("markPullRequestReadyForReview");
        aa.c.b(aa.c.c(fc.a, false)).b(fVar, wVar, miVar.a);
    }
}
