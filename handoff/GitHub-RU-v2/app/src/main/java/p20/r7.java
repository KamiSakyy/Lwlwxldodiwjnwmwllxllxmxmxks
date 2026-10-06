package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r7 implements aaShadow.a {
    public static final r7 a = new r7();
    public static final List b = sy.d0Shadow.n("pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.qb qbVar = null;
        while (eVar.r0(b) == 0) {
            qbVar = (u10.qb) aa.c.b(aa.c.c(t7.a, true)).a(eVar, wVar);
        }
        return new u10.ob(qbVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ob obVar = (u10.ob) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(obVar, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(t7.a, true)).b(fVar, wVar, obVar.a);
    }
}
