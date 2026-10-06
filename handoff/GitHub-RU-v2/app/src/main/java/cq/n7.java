package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n7 implements aa.a {
    public static final n7 a = new n7();
    public static final List b = sy.d0Shadow.n("edges");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(o7.a, false)))).a(eVar, wVar);
        }
        return new f7(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f7 f7Var = (f7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f7Var, "value");
        fVar.z0("edges");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(o7.a, false)))).b(fVar, wVar, f7Var.a);
    }
}
