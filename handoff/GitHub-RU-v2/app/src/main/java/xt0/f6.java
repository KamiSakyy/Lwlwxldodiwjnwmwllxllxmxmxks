package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f6 implements aa.a {
    public static final f6 a = new f6();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(o6.a, true)))).a(eVar, wVar);
        }
        return new u4(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u4 u4Var = (u4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u4Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(o6.a, true)))).b(fVar, wVar, u4Var.a);
    }
}
