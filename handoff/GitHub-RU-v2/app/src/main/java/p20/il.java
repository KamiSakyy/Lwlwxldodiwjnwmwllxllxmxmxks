package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class il implements aa.a {
    public static final il a = new il();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.fv fvVar = null;
        while (eVar.r0(b) == 0) {
            fvVar = (u10.fv) aa.c.b(aa.c.c(ml.a, false)).a(eVar, wVar);
        }
        return new u10.bv(fvVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.bv bvVar = (u10.bv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bvVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(ml.a, false)).b(fVar, wVar, bvVar.a);
    }
}
