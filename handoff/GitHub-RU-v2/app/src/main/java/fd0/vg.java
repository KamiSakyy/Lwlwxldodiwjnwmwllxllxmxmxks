package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vg implements aa.a {
    public static final vg a = new vg();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.yo yoVar = null;
        while (eVar.r0(b) == 0) {
            yoVar = (kc0.yo) aa.c.c(yg.a, false).a(eVar, wVar);
        }
        if (yoVar != null) {
            return new kc0.vo(yoVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.vo voVar = (kc0.vo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(voVar, "value");
        fVar.z0("viewer");
        aa.c.c(yg.a, false).b(fVar, wVar, voVar.a);
    }
}
