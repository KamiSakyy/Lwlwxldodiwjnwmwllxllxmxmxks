package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ug implements aaShadow.a {
    public static final ug a = new ug();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        cq.x2 c = cq.z2.c(eVar, wVar);
        if (str != null) {
            return new jo.vo(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.vo voVar = (jo.vo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(voVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, voVar.a);
        List list = cq.z2.a;
        cq.x2 x2Var = voVar.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x2Var, "value");
        fVar.z0("copilotLicenseType");
        fVar.I(x2Var.a.r);
        fVar.z0("title");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x2Var.b);
        fVar.z0("subtitle");
        aa.c.i.b(fVar, wVar, x2Var.c);
        fVar.z0("featuresHeader");
        bVar.b(fVar, wVar, x2Var.d);
        fVar.z0("features");
        aa.c.a(aa.c.c(cq.y2.a, false)).e(fVar, wVar, x2Var.e);
    }
}
