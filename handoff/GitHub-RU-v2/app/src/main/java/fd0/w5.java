package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w5 implements aaShadow.a {
    public static final w5 a = new w5();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(z5.a, true)))).a(eVar, wVar);
        }
        return new kc0.z8(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.z8 z8Var = (kc0.z8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z8Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(z5.a, true)))).b(fVar, wVar, z8Var.a);
    }
}
