package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r6 implements aa.a {
    public static final r6 a = new r6();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(s6.a, true)))).a(eVar, wVar);
        }
        return new m6(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m6 m6Var = (m6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m6Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(s6.a, true)))).b(fVar, wVar, m6Var.a);
    }
}
