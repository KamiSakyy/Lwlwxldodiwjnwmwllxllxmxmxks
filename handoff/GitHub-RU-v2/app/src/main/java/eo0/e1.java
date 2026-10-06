package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e1 implements aaShadow.a {
    public static final e1 a = new e1();
    public static final List b = sy.d0Shadow.n("subject");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.f2 f2Var = null;
        while (eVar.r0(b) == 0) {
            f2Var = (jn0.f2) aa.c.b(aa.c.c(g1.a, true)).a(eVar, wVar);
        }
        return new jn0.c2(f2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.c2 c2Var = (jn0.c2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c2Var, "value");
        fVar.z0("subject");
        aa.c.b(aa.c.c(g1.a, true)).b(fVar, wVar, c2Var.a);
    }
}
