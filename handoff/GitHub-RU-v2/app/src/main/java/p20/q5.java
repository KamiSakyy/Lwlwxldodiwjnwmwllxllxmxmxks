package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q5 implements aa.a {
    public static final q5 a = new q5();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(t5.a, true)))).a(eVar, wVar);
        }
        return new u10.r8(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.r8 r8Var = (u10.r8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r8Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(t5.a, true)))).b(fVar, wVar, r8Var.a);
    }
}
