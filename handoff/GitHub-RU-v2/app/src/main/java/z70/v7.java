package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v7 implements aa.a {
    public static final v7 a = new v7();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(u7.a, false)))).a(eVar, wVar);
        }
        return new r7(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r7 r7Var = (r7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r7Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(u7.a, false)))).b(fVar, wVar, r7Var.a);
    }
}
