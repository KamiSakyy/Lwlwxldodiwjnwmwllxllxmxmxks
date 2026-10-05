package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g8 implements aa.a {
    public static final g8 a = new g8();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.qc qcVar = null;
        while (eVar.r0(b) == 0) {
            qcVar = (kc0.qc) aa.c.b(aa.c.c(l8.a, false)).a(eVar, wVar);
        }
        return new kc0.lc(qcVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.lc lcVar = (kc0.lc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lcVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(l8.a, false)).b(fVar, wVar, lcVar.a);
    }
}
