package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c3 implements aaShadow.a {
    public static final c3 a = new c3();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.z4 z4Var = null;
        while (eVar.r0(b) == 0) {
            z4Var = (jn0.z4) aa.c.b(aa.c.c(e3.a, true)).a(eVar, wVar);
        }
        return new jn0.w4(z4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.w4 w4Var = (jn0.w4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w4Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(e3.a, true)).b(fVar, wVar, w4Var.a);
    }
}
