package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i1 implements aaShadow.a {
    public static final i1 a = new i1();
    public static final List b = sy.d0Shadow.n("applyMobileSuggestedChanges");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.h2 h2Var = null;
        while (eVar.r0(b) == 0) {
            h2Var = (jn0.h2) aa.c.b(aa.c.c(h1.a, false)).a(eVar, wVar);
        }
        return new jn0.j2(h2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.j2 j2Var = (jn0.j2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j2Var, "value");
        fVar.z0("applyMobileSuggestedChanges");
        aa.c.b(aa.c.c(h1.a, false)).b(fVar, wVar, j2Var.a);
    }
}
