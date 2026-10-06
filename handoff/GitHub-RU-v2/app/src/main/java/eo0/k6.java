package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k6 implements aaShadow.a {
    public static final k6 a = new k6();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(n6.a, true)))).a(eVar, wVar);
        }
        return new jn0.t9(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.t9 t9Var = (jn0.t9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t9Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(n6.a, true)))).b(fVar, wVar, t9Var.a);
    }
}
