package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hk implements aa.a {
    public static final hk a = new hk();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.nt ntVar = null;
        while (eVar.r0(b) == 0) {
            ntVar = (u10.nt) aa.c.b(aa.c.c(ik.a, false)).a(eVar, wVar);
        }
        return new u10.mt(ntVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.mt mtVar = (u10.mt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mtVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(ik.a, false)).b(fVar, wVar, mtVar.a);
    }
}
