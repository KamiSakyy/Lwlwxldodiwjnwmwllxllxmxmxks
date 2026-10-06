package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k5 implements aaShadow.a {
    public static final k5 a = new k5();
    public static final List b = sy.d0.n("edges");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(i5.a, false)))).a(eVar, wVar);
        }
        return new jn0.d8(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.d8 d8Var = (jn0.d8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d8Var, "value");
        fVar.z0("edges");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(i5.a, false)))).b(fVar, wVar, d8Var.a);
    }
}
