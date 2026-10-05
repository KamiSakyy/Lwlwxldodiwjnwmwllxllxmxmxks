package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kf implements aa.a {
    public static final kf a = new kf();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.en enVar = null;
        while (eVar.r0(b) == 0) {
            enVar = (u10.en) aa.c.b(aa.c.c(pf.a, true)).a(eVar, wVar);
        }
        return new u10.zm(enVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.zm zmVar = (u10.zm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zmVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(pf.a, true)).b(fVar, wVar, zmVar.a);
    }
}
