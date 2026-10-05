package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l1 implements aa.a {
    public static final l1 a = new l1();
    public static final List b = sy.d0.n("applyMobileSuggestedChanges");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.m2 m2Var = null;
        while (eVar.r0(b) == 0) {
            m2Var = (jo.m2) aa.c.b(aa.c.c(k1.a, false)).a(eVar, wVar);
        }
        return new jo.o2(m2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.o2 o2Var = (jo.o2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o2Var, "value");
        fVar.z0("applyMobileSuggestedChanges");
        aa.c.b(aa.c.c(k1.a, false)).b(fVar, wVar, o2Var.a);
    }
}
