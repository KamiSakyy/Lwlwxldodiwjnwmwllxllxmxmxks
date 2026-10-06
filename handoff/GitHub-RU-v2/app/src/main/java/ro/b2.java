package ro;

import java.util.List;
import qo.e3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b2 implements aa.a {
    public static final b2 a = new b2();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        vo.w1 c = vo.z1.c(eVar, wVar);
        if (str != null) {
            return new e3(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e3 e3Var = (e3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e3Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, e3Var.a);
        List list = vo.z1.a;
        vo.w1 w1Var = e3Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w1Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(vo.x1.a, true)))).b(fVar, wVar, w1Var.a);
        fVar.z0("pageInfo");
        aa.c.c(vo.y1.a, false).b(fVar, wVar, w1Var.b);
    }
}
