package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f8 implements aa.a {
    public static final f8 a = new f8();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(e8.a, false)))).a(eVar, wVar);
        }
        return new z7(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z7 z7Var = (z7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z7Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(e8.a, false)))).b(fVar, wVar, z7Var.a);
    }
}
