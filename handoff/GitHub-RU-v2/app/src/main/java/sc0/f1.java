package sc0;

import java.util.List;
import rc0.w1;
import rc0.x1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f1 implements aa.a {
    public static final f1 a = new f1();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        x1 x1Var = null;
        while (eVar.r0(b) == 0) {
            x1Var = (x1) aa.c.b(aa.c.c(g1.a, true)).a(eVar, wVar);
        }
        return new w1(x1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w1 w1Var = (w1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w1Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(g1.a, true)).b(fVar, wVar, w1Var.a);
    }
}
