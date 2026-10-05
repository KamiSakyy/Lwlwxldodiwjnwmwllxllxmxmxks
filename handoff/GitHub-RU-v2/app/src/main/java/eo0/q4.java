package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q4 implements aa.a {
    public static final q4 a = new q4();
    public static final List b = sy.d0.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.d7 d7Var = null;
        while (eVar.r0(b) == 0) {
            d7Var = (jn0.d7) aa.c.b(aa.c.c(s4.a, true)).a(eVar, wVar);
        }
        return new jn0.b7(d7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.b7 b7Var = (jn0.b7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b7Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(s4.a, true)).b(fVar, wVar, b7Var.a);
    }
}
