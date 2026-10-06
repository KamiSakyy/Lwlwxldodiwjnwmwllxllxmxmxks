package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vg implements aaShadow.a {
    public static final vg a = new vg();
    public static final List b = sy.d0Shadow.n("mobileEventsUpdate");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.zo zoVar = null;
        while (eVar.r0(b) == 0) {
            zoVar = (jo.zo) aa.c.b(aa.c.c(wg.a, false)).a(eVar, wVar);
        }
        return new jo.yo(zoVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.yo yoVar = (jo.yo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yoVar, "value");
        fVar.z0("mobileEventsUpdate");
        aa.c.b(aa.c.c(wg.a, false)).b(fVar, wVar, yoVar.a);
    }
}
