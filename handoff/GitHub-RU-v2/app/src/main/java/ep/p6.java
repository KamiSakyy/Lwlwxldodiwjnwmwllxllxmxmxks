package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p6 implements aa.a {
    public static final p6 a = new p6();
    public static final List b = sy.d0.n("deleteMobileDeviceToken");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.aa aaVar = null;
        while (eVar.r0(b) == 0) {
            aaVar = (jo.aa) aa.c.b(aa.c.c(q6.a, false)).a(eVar, wVar);
        }
        return new jo.z9(aaVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.z9 z9Var = (jo.z9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z9Var, "value");
        fVar.z0("deleteMobileDeviceToken");
        aa.c.b(aa.c.c(q6.a, false)).b(fVar, wVar, z9Var.a);
    }
}
