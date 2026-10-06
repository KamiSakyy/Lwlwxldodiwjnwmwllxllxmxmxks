package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gh implements aaShadow.a {
    public static final gh a = new gh();
    public static final List b = sy.d0Shadow.n("rejectDeployments");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.mp mpVar = null;
        while (eVar.r0(b) == 0) {
            mpVar = (kc0.mp) aa.c.b(aa.c.c(ih.a, false)).a(eVar, wVar);
        }
        return new kc0.kp(mpVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.kp kpVar = (kc0.kp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kpVar, "value");
        fVar.z0("rejectDeployments");
        aa.c.b(aa.c.c(ih.a, false)).b(fVar, wVar, kpVar.a);
    }
}
