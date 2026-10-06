package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k2 implements aaShadow.a {
    public static final k2 a = new k2();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(o2.a, false)))).a(eVar, wVar);
        }
        return new jn0.a4(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.a4 a4Var = (jn0.a4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a4Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(o2.a, false)))).b(fVar, wVar, a4Var.a);
    }
}
