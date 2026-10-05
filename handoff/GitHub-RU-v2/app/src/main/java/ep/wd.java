package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wd implements aa.a {
    public static final wd a = new wd();
    public static final List b = sy.d0.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.gk gkVar = null;
        while (eVar.r0(b) == 0) {
            gkVar = (jo.gk) aa.c.b(aa.c.c(vd.a, false)).a(eVar, wVar);
        }
        return new jo.hk(gkVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.hk hkVar = (jo.hk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hkVar, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(vd.a, false)).b(fVar, wVar, hkVar.a);
    }
}
