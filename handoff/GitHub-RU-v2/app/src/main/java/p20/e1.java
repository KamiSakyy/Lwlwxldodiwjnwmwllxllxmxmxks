package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e1 implements aaShadow.a {
    public static final e1 a = new e1();
    public static final List b = sy.d0Shadow.n("applyMobileSuggestedChanges");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.b2 b2Var = null;
        while (eVar.r0(b) == 0) {
            b2Var = (u10.b2) aa.c.b(aa.c.c(d1.a, false)).a(eVar, wVar);
        }
        return new u10.d2(b2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.d2 d2Var = (u10.d2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d2Var, "value");
        fVar.z0("applyMobileSuggestedChanges");
        aa.c.b(aa.c.c(d1.a, false)).b(fVar, wVar, d2Var.a);
    }
}
