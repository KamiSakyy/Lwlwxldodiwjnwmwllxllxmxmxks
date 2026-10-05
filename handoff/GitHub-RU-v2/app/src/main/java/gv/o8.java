package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o8 implements aa.a {
    public static final o8 a = new o8();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(n8.a, false)))).a(eVar, wVar);
        }
        return new k8(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k8 k8Var = (k8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k8Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(n8.a, false)))).b(fVar, wVar, k8Var.a);
    }
}
