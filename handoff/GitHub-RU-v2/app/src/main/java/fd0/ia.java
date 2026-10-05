package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ia implements aa.a {
    public static final ia a = new ia();
    public static final List b = sy.d0.n("followUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.lf lfVar = null;
        while (eVar.r0(b) == 0) {
            lfVar = (kc0.lf) aa.c.b(aa.c.c(ja.a, false)).a(eVar, wVar);
        }
        return new kc0.kf(lfVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.kf kfVar = (kc0.kf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kfVar, "value");
        fVar.z0("followUser");
        aa.c.b(aa.c.c(ja.a, false)).b(fVar, wVar, kfVar.a);
    }
}
