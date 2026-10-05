package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ie implements aa.a {
    public static final ie a = new ie();
    public static final List b = sy.d0.n("organization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ql qlVar = null;
        while (eVar.r0(b) == 0) {
            qlVar = (u10.ql) aa.c.b(aa.c.c(ke.a, false)).a(eVar, wVar);
        }
        return new u10.ol(qlVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ol olVar = (u10.ol) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(olVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(ke.a, false)).b(fVar, wVar, olVar.a);
    }
}
