package oa0;

import java.util.List;
import na0.r0;
import na0.t0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 implements aa.a {
    public static final g0 a = new g0();
    public static final List b = sy.d0Shadow.n("unpinIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t0 t0Var = null;
        while (eVar.r0(b) == 0) {
            t0Var = (t0) aa.c.b(aa.c.c(i0.a, false)).a(eVar, wVar);
        }
        return new r0(t0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r0 r0Var = (r0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r0Var, "value");
        fVar.z0("unpinIssue");
        aa.c.b(aa.c.c(i0.a, false)).b(fVar, wVar, r0Var.a);
    }
}
