package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q7 implements aaShadow.a {
    public static final q7 a = new q7();
    public static final List b = sy.d0Shadow.n("dismissPullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ob obVar = null;
        while (eVar.r0(b) == 0) {
            obVar = (u10.ob) aa.c.b(aa.c.c(r7.a, false)).a(eVar, wVar);
        }
        return new u10.nb(obVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.nb nbVar = (u10.nb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nbVar, "value");
        fVar.z0("dismissPullRequestReview");
        aa.c.b(aa.c.c(r7.a, false)).b(fVar, wVar, nbVar.a);
    }
}
