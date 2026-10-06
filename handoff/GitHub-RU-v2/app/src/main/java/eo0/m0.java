package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m0 implements aaShadow.a {
    public static final m0 a = new m0();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(q0.a, false)))).a(eVar, wVar);
        }
        return new jn0.e1(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.e1 e1Var = (jn0.e1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e1Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(q0.a, false)))).b(fVar, wVar, e1Var.a);
    }
}
