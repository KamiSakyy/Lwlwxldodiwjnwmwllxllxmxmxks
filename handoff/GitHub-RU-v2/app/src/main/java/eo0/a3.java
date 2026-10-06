package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a3 implements aaShadow.a {
    public static final a3 a = new a3();
    public static final List b = sy.d0.n("cloneTemplateRepository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.r4 r4Var = null;
        while (eVar.r0(b) == 0) {
            r4Var = (jn0.r4) aa.c.b(aa.c.c(z2.a, false)).a(eVar, wVar);
        }
        return new jn0.t4(r4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.t4 t4Var = (jn0.t4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t4Var, "value");
        fVar.z0("cloneTemplateRepository");
        aa.c.b(aa.c.c(z2.a, false)).b(fVar, wVar, t4Var.a);
    }
}
