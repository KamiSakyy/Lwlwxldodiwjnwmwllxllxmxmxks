package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d5 implements aa.a {
    public static final d5 a = new d5();
    public static final List b = sy.d0.n("createRef");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.t7 t7Var = null;
        while (eVar.r0(b) == 0) {
            t7Var = (jn0.t7) aa.c.b(aa.c.c(c5.a, false)).a(eVar, wVar);
        }
        return new jn0.u7(t7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.u7 u7Var = (jn0.u7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u7Var, "value");
        fVar.z0("createRef");
        aa.c.b(aa.c.c(c5.a, false)).b(fVar, wVar, u7Var.a);
    }
}
