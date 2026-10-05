package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w2 implements aa.a {
    public static final w2 a = new w2();
    public static final List b = sy.d0.n("cloneTemplateRepository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.l4 l4Var = null;
        while (eVar.r0(b) == 0) {
            l4Var = (u10.l4) aa.c.b(aa.c.c(v2.a, false)).a(eVar, wVar);
        }
        return new u10.n4(l4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.n4 n4Var = (u10.n4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n4Var, "value");
        fVar.z0("cloneTemplateRepository");
        aa.c.b(aa.c.c(v2.a, false)).b(fVar, wVar, n4Var.a);
    }
}
