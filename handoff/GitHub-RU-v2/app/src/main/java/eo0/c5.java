package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c5 implements aaShadow.a {
    public static final c5 a = new c5();
    public static final List b = sy.d0.n("ref");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.v7 v7Var = null;
        while (eVar.r0(b) == 0) {
            v7Var = (jn0.v7) aa.c.b(aa.c.c(e5.a, true)).a(eVar, wVar);
        }
        return new jn0.t7(v7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.t7 t7Var = (jn0.t7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t7Var, "value");
        fVar.z0("ref");
        aa.c.b(aa.c.c(e5.a, true)).b(fVar, wVar, t7Var.a);
    }
}
