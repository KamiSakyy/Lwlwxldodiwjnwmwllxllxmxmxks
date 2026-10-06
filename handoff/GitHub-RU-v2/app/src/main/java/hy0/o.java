package hy0;

import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o implements aa.a {
    public static final List a = d0Shadow.n("projectV2");

    public static gy0.t c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        gy0.u uVar = null;
        while (eVar.r0(a) == 0) {
            uVar = (gy0.u) aa.c.b(aa.c.c(p.a, true)).a(eVar, wVar);
        }
        return new gy0.t(uVar);
    }

    public static void d(ea.f fVar, aa.w wVar, gy0.t tVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tVar, "value");
        fVar.z0("projectV2");
        aa.c.b(aa.c.c(p.a, true)).b(fVar, wVar, tVar.a);
    }
}
