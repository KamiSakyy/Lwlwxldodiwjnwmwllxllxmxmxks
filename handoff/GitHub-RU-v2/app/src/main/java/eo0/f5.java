package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f5 implements aa.a {
    public static final f5 a = new f5();
    public static final List b = sy.d0.n("dashboard");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.z7 z7Var = null;
        while (eVar.r0(b) == 0) {
            z7Var = (jn0.z7) aa.c.b(aa.c.c(g5.a, false)).a(eVar, wVar);
        }
        return new jn0.y7(z7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.y7 y7Var = (jn0.y7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y7Var, "value");
        fVar.z0("dashboard");
        aa.c.b(aa.c.c(g5.a, false)).b(fVar, wVar, y7Var.a);
    }
}
