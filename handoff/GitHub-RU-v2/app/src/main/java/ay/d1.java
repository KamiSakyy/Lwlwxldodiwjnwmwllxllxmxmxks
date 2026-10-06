package ay;

import java.util.List;
import zx.a2;
import zx.c2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 implements aa.a {
    public static final d1 a = new d1();
    public static final List b = sy.d0Shadow.n("unpinIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c2 c2Var = null;
        while (eVar.r0(b) == 0) {
            c2Var = (c2) aa.c.b(aa.c.c(f1.a, false)).a(eVar, wVar);
        }
        return new a2(c2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a2 a2Var = (a2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a2Var, "value");
        fVar.z0("unpinIssue");
        aa.c.b(aa.c.c(f1.a, false)).b(fVar, wVar, a2Var.a);
    }
}
