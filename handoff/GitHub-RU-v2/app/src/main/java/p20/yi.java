package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yi implements aa.a {
    public static final yi a = new yi();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.wr wrVar = null;
        while (eVar.r0(b) == 0) {
            wrVar = (u10.wr) aa.c.b(aa.c.c(cj.a, false)).a(eVar, wVar);
        }
        return new u10.sr(wrVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.sr srVar = (u10.sr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(srVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(cj.a, false)).b(fVar, wVar, srVar.a);
    }
}
