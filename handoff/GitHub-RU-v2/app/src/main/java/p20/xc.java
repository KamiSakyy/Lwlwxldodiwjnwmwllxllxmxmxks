package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xc implements aa.a {
    public static final xc a = new xc();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.mj mjVar = null;
        while (eVar.r0(b) == 0) {
            mjVar = (u10.mj) aa.c.b(aa.c.c(yc.a, true)).a(eVar, wVar);
        }
        return new u10.lj(mjVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.lj ljVar = (u10.lj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ljVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(yc.a, true)).b(fVar, wVar, ljVar.a);
    }
}
