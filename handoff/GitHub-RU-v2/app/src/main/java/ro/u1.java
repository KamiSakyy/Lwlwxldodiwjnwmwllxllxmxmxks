package ro;

import java.util.List;
import qo.t2;
import vo.m2;
import vo.p2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u1 implements aa.a {
    public static final u1 a = new u1();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        m2 c = p2.c(eVar, wVar);
        if (str != null) {
            return new t2(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t2 t2Var = (t2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t2Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, t2Var.a);
        List list = p2.a;
        p2.d(fVar, wVar, t2Var.b);
    }
}
