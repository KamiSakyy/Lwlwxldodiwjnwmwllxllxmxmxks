package ro;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v implements aa.a {
    public static final v a = new v();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        vo.a c = vo.b.c(eVar, wVar);
        if (str != null) {
            return new qo.a0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qo.a0 a0Var = (qo.a0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, a0Var.a);
        List list = vo.b.a;
        vo.b.d(fVar, wVar, a0Var.b);
    }
}
