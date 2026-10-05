package ay;

import java.util.List;
import zx.b2;
import zx.c2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1 implements aa.a {
    public static final f1 a = new f1();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b2 b2Var = null;
        while (eVar.r0(b) == 0) {
            b2Var = (b2) aa.c.b(aa.c.c(e1.a, false)).a(eVar, wVar);
        }
        return new c2(b2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c2 c2Var = (c2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c2Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(e1.a, false)).b(fVar, wVar, c2Var.a);
    }
}
