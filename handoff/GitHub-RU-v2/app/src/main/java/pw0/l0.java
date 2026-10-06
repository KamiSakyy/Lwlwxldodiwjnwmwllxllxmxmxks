package pw0;

import java.util.List;
import ow0.a1;
import ow0.c1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l0 implements aa.a {
    public static final l0 a = new l0();
    public static final List b = sy.d0Shadow.n("unpinIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c1 c1Var = null;
        while (eVar.r0(b) == 0) {
            c1Var = (c1) aa.c.b(aa.c.c(n0.a, false)).a(eVar, wVar);
        }
        return new a1(c1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a1 a1Var = (a1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a1Var, "value");
        fVar.z0("unpinIssue");
        aa.c.b(aa.c.c(n0.a, false)).b(fVar, wVar, a1Var.a);
    }
}
