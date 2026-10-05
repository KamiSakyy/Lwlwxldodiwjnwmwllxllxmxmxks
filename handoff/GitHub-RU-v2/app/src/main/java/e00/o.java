package e00;

import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o implements aa.a {
    public static final List a = d0.n("projectV2");

    public static d00.t c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d00.u uVar = null;
        while (eVar.r0(a) == 0) {
            uVar = (d00.u) aa.c.b(aa.c.c(p.a, true)).a(eVar, wVar);
        }
        return new d00.t(uVar);
    }

    public static void d(ea.f fVar, aa.w wVar, d00.t tVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tVar, "value");
        fVar.z0("projectV2");
        aa.c.b(aa.c.c(p.a, true)).b(fVar, wVar, tVar.a);
    }
}
