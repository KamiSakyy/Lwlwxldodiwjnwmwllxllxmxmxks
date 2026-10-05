package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class gn implements aa.a {
    public static final List a = sy.d0.n("forks");

    public static jo.qx c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.nx nxVar = null;
        while (eVar.r0(a) == 0) {
            nxVar = (jo.nx) aa.c.c(dn.a, false).a(eVar, wVar);
        }
        if (nxVar != null) {
            return new jo.qx(nxVar);
        }
        k41.b.B(eVar, "forks");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.qx qxVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qxVar, "value");
        fVar.z0("forks");
        aa.c.c(dn.a, false).b(fVar, wVar, qxVar.a);
    }
}
