package c20;

import b20.q2;
import g20.w1;
import g20.x1;
import g20.y1;
import g20.z1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t1 implements aa.a {
    public static final t1 a = new t1();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        w1 c = z1.c(eVar, wVar);
        if (str != null) {
            return new q2(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q2 q2Var = (q2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q2Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, q2Var.a);
        List list = z1.a;
        w1 w1Var = q2Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w1Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(x1.a, true)))).b(fVar, wVar, w1Var.a);
        fVar.z0("pageInfo");
        aa.c.c(y1.a, false).b(fVar, wVar, w1Var.b);
    }
}
