package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nl implements aa.a {
    public static final nl a = new nl();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.mv mvVar = null;
        while (eVar.r0(b) == 0) {
            mvVar = (u10.mv) aa.c.b(aa.c.c(rl.a, false)).a(eVar, wVar);
        }
        return new u10.iv(mvVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.iv ivVar = (u10.iv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ivVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(rl.a, false)).b(fVar, wVar, ivVar.a);
    }
}
