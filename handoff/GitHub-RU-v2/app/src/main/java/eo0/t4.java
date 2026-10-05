package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t4 implements aa.a {
    public static final t4 a = new t4();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.i7 i7Var = null;
        while (eVar.r0(b) == 0) {
            i7Var = (jn0.i7) aa.c.b(aa.c.c(v4.a, true)).a(eVar, wVar);
        }
        return new jn0.g7(i7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.g7 g7Var = (jn0.g7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g7Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(v4.a, true)).b(fVar, wVar, g7Var.a);
    }
}
