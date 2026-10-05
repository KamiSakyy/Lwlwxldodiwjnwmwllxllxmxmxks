package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s4 implements aa.a {
    public static final s4 a = new s4();
    public static final List b = sy.d0.n("edges");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(q4.a, false)))).a(eVar, wVar);
        }
        return new u10.f7(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.f7 f7Var = (u10.f7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f7Var, "value");
        fVar.z0("edges");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(q4.a, false)))).b(fVar, wVar, f7Var.a);
    }
}
